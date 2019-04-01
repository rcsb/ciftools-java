package org.rcsb.cif.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryDecoder {
    /**
     * Fixed point, delta, RLE, integer packing adopted from https://github.com/rcsb/mmtf-javascript/
     * by Alexander Rose <alexander.rose@weirdbyte.de>, MIT License, Copyright (c) 2016
     */
    @SuppressWarnings("unchecked")
    public static Object decode(Map<String, Object> decodingTask) throws ParsingException {
        Object current = decodingTask.get("data");
        Object[] encodings = (Object[]) decodingTask.get("encoding");

        for (int i = encodings.length - 1; i >= 0; i--) {
            current = decodeStep(current, (Map<String, Object>) encodings[i]);
        }
        return current;
    }

    private static Object decodeStep(Object data, Map<String, Object> encoding) throws ParsingException {
        switch ((String) encoding.get("kind")) {
            case "ByteArray":
                switch ((int) encoding.get("type")) {
                    case 1:
                        return new ByteArray((byte[]) data, 1).parseAsInt8();
                    case 2:
                        return new ByteArray((byte[]) data, 2).parseAsInt16();
                    case 3:
                        return new ByteArray((byte[]) data, 4).parseAsInt32();
                    case 4:
                        return new ByteArray((byte[]) data, 1).parseAsUint8();
                    case 5:
                        return new ByteArray((byte[]) data, 2).parseAsUint16();
                    case 6:
                        return new ByteArray((byte[]) data, 4).parseAsUint32();
                    case 32:
                        return new ByteArray((byte[]) data, 4).parseAsFloat();
                    case 33:
                        return new ByteArray((byte[]) data, 8).parseAsDouble();
                    default:
                        throw new ParsingException("Unsupported ByteArray type: " + encoding.get("type"));
                }
            case "FixedPoint":
                return fixedPoint((int[]) data, encoding);
            case "IntervalQuantization":
                return intervalQuantization((int[]) data, encoding);
            case "RunLength":
                return runLength((int[]) data);
            case "Delta":
                return delta((int[]) data, encoding);
            case "IntegerPacking":
                return integerPacking((int[]) data, encoding);
            case "StringArray":
                return stringArray((byte[]) data, encoding);
        }
        throw new ParsingException("Unsupported Encoding kind: " + encoding.get("kind"));
    }

    static int[] integerPacking(int[] data, Map<String, Object> encoding) {
        if (data.length == (int) encoding.get("srcSize")) {
            return data;
        }

        return (boolean) encoding.get("isUnsigned") ? integerPacking(data, encoding, true) :
                integerPacking(data, encoding, false);
    }

    private static int[] integerPacking(int[] data, Map<String, Object> encoding, boolean isUnsigned) {
        int upperLimit;
        int lowerLimit = 0;
        if (isUnsigned) {
            upperLimit = (int) encoding.get("byteCount") == 1 ? 0xFF : 0xFFFF;
        } else {
            upperLimit = (int) encoding.get("byteCount") == 1 ? 0x7F : 0x7FFF;
            lowerLimit = -upperLimit - 1;
        }
        int n = data.length;
        int[] output = new int[(int) encoding.get("srcSize")];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = data[i];
            while (isUnsigned ? t == upperLimit : t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = data[i];
            }
            value += t;
            System.out.println("assigning " + value + " to " + j);
            output[j] = value;
            i++;
            j++;
        }
        return output;
    }

    static String[] stringArray(byte[] byteData, Map<String, Object> encoding) throws ParsingException {
        String encodedStringData = (String) encoding.get("stringData");
        byte[] encodedOffsets = (byte[]) encoding.get("offsets");
        Object[] dataEncodings = (Object[]) encoding.get("dataEncoding");
        Object[] offsetEncodings = (Object[]) encoding.get("offsetEncodings");

        Map<String, Object> offsetTask = new HashMap<>();
        offsetTask.put("data", encodedOffsets);
        offsetTask.put("encoding", offsetEncodings);
        Map<String, Object> dataTask = new HashMap<>();
        dataTask.put("data", byteData);
        dataTask.put("encoding", dataEncodings);

        int[] offsets = offsetEncodings != null ? (int[]) decode(offsetTask) : new ByteArray(encodedOffsets, 1).parseAsUint8();
        int[] indices = (int[]) decode(dataTask);
        String[] result = new String[indices.length];
        int offset = 0;
        for (int i : indices) {
            if (i < 0) {
                result[offset++] = null;
                continue;
            }
            result[offset++] = encodedStringData.substring(offsets[i], offsets[i + 1]);
        }
        return result;
    }

    static int[] delta(int[] data, Map<String, Object> encoding) {
        int n = data.length;
        int[] output = new int[n];
        if (n == 0) return output;
        output[0] = data[0] + (int) encoding.get("origin");
        for (int i = 1; i < n; ++i) {
            output[i] = data[i] + output[i - 1];
        }
        return output;
    }

    static int[] runLength(int[] data) {
        // determine number of entries in output array
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < data.length; i += 2) {
            int value = data[i];  // value to be repeated
            int length = data[i + 1];  // number of repeats
            for (int j = 0; j < length; ++j) {
                output.add(value);
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }

    static double[] fixedPoint(int[] data, Map<String, Object> encoding) {
        double[] out = new double[data.length];
        double f = 1.0 / (int) encoding.get("factor");
        for (int i = 0; i < data.length; i++) {
            out[i] = f * data[i];
        }
        return out;
    }

    static double[] intervalQuantization(int[] data, Map<String, Object> encoding) {
        double[] out = new double[data.length];
        int min = (int) encoding.get("min");
        double delta = ((int) encoding.get("max") - min) / ((int) encoding.get("numSteps") - 1.0);

        for (int i = 0; i < data.length; i++) {
            out[i] = min + delta * data[i];
        }
        return out;
    }
}
