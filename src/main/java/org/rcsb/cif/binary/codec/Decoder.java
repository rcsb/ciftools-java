package org.rcsb.cif.binary.codec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

public class Decoder {
    private static final boolean LITTLE_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);

    public static Object decode(Map<String, Object> encoded) {
        Object data;
        Object[] encoding;
        if (encoded.get("data") instanceof byte[]) {
            data = encoded.get("data");
            encoding = (Object[]) encoded.get("encoding");
        } else {
            encoded = (Map<String, Object>) encoded.get("data");
            data = encoded.get("data");
            encoding = (Object[]) encoded.get("encoding");
        }

        for (int i = encoding.length - 1; i >= 0; i--) {
            data = decodeStep(data, (Map<String, Object>) encoding[i]);
        }
        return data;
    }

    /**
     * Convert a byte array containing two bytes to integers in an integer array.
     * @param byteArray the input byte array
     * @return the converted integer array
     */
    static int[] convertByteToIntegers(byte[] byteArray) {
        ByteBuffer bb = ByteBuffer.wrap(byteArray);

        int outLength = byteArray.length;
        int[] outArray = new int[outLength];
        for (int i = 0; i < outLength; i++) {
            outArray[i] = bb.get();
        }
        return outArray;
    }

    /**
     * Convert a byte array containing two bytes to integers in an integer array.
     * @param byteArray the input byte array
     * @return the converted integer array
     */
    static int[] convertTwoBytesToIntegers(byte[] byteArray) {
        ByteBuffer bb = ByteBuffer.wrap(byteArray);

        int outLength = byteArray.length / 2;
        int[] outArray = new int[outLength];
        for (int i = 0; i < outLength; i++) {
            outArray[i] = bb.getShort();
        }
        return outArray;
    }

    /**
     * Convert a byte array containing four bytes to integers in an integer array.
     * @param byteArray the input byte array
     * @return the converted integer array
     */
    static int[] convertFourBytesToIntegers(byte[] byteArray) {
        ByteBuffer bb = ByteBuffer.wrap(byteArray);

        int outLength = byteArray.length / 4;
        int[] outArray = new int[outLength];
        for (int i = 0; i < outLength; i++) {
            outArray[i] = bb.getInt();
        }
        return outArray;
    }

    public static byte[] flipByteOrder(byte[] data, int bytes) {
        byte[] ret = new byte[data.length];
        for (int i = 0, n = data.length; i < n; i += bytes) {
            for (int j = 0; j < bytes; j++) {
                ret[i + bytes - j - 1] = data[i + j];
            }
        }
        return ret;
    }

    private static double[] convertDouble(byte[] data, int numberOfBytes) {
        int length = data.length / numberOfBytes;
        double[] out = new double[length];

        for (int i = 0; i < length; i++) {
            byte[] bytes = Arrays.copyOfRange(data, i, i + numberOfBytes);
            out[i] = ByteBuffer.wrap(bytes).getDouble();
        }
        return out;
    }

    private static byte[] respectByteOrder(byte[] data, int numberOfBytes) {
        if (LITTLE_ENDIAN) {
            return flipByteOrder(data, numberOfBytes);
        } else {
            return data;
        }
    }

    private static Object decodeStep(Object data, Map<String, Object> encoding) {
        String kind = (String) encoding.get("kind");
//        System.out.println("encoding: " + kind);

        switch (kind) {
            case "ByteArray":
                int type = (int) encoding.get("type");
                byte[] byteData = (byte[]) data;
                switch (type) {
                    case 1: /* Int8: -> int */ return convertByteToIntegers(byteData);
                    case 2: /* Int16 -> int */ return convertTwoBytesToIntegers(respectByteOrder(byteData, 2));
                    case 3: /* Int32 -> int */ return convertFourBytesToIntegers(respectByteOrder(byteData, 4));
                    case 4: /* Uint8 -> int */ return convertByteToIntegers(respectByteOrder(byteData, 1));
                    case 5: /* Uint16 -> int */ return convertTwoBytesToIntegers(respectByteOrder(byteData, 2));
                    case 6: /* Uint32 -> int */ return convertFourBytesToIntegers(respectByteOrder(byteData, 4));
                    case 32: /* Float32 -> double */ return convertDouble(respectByteOrder(byteData, 4), 4);
                    case 33: /* Float64 -> double */ return convertDouble(respectByteOrder(byteData, 8), 8);
                    default: throw new Error("Unsupported ByteArray type.");
                }
            case "FixedPoint":
                int factor = (int) encoding.get("factor");
                return fixedPoint((int[]) data, factor);
            case "IntervalQuantization":
                int min = (int) encoding.get("min");
                int max = (int) encoding.get("max");
                int numSteps = (int) encoding.get("numSteps");
                return intervalQuantization((int[]) data, min, max, numSteps);
            case "RunLength":
                return runLength((int[]) data);
            case "Delta":
                int origin = (int) encoding.get("origin");
                return delta((int[]) data, origin);
            case "IntegerPacking":
                int byteCount = (int) encoding.get("byteCount");
                int srcSize2 = (int) encoding.get("srcSize");
                return integerPacking((int[]) data, byteCount, /*isUnsigned,*/ srcSize2);
            case "StringArray":
                return stringArray((byte[]) data, encoding);
            default:
                throw new Error("unsupported encoding: " + kind);
        }
    }

    private static String[] stringArray(byte[] data, Map<String, Object> encoding) {
        String encodedStringData = (String) encoding.get("stringData");
        byte[] encodedOffsets = (byte[]) encoding.get("offsets");
        Object[] dataEncodings = (Object[]) encoding.get("dataEncoding");
        Object[] offsetEncodings = (Object[]) encoding.get("offsetEncodings");

        Map<String, Object> offsetTask = new HashMap<>();
        offsetTask.put("data", encodedOffsets);
        offsetTask.put("encoding", offsetEncodings);
        Map<String, Object> dataTask = new HashMap<>();
        dataTask.put("data", data);
        dataTask.put("encoding", dataEncodings);

        int[] offsets = offsetEncodings != null ? (int[]) decode(offsetTask) : convertByteToIntegers(encodedOffsets);
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

    static int[] integerPacking(int[] data, int byteCount, int srcSize) {
        int upperLimit = byteCount == 1 ? 0x7F : 0x7FFF;
        int lowerLimit = -upperLimit - 1;
        int n = data.length;
        int[] output = new int[srcSize];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = data[i];
            while (t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = data[i];
            }
            value += t;
            output[j] = value;
            i++;
            j++;
        }
        return output;
    }

    static int[] delta(int[] data, int origin) {
        int n = data.length;
        int[] output = new int[n];
        if (n == 0) return output;
        output[0] = data[0] + origin;
        for (int i = 1; i < n; ++i) {
            output[i] = data[i] + output[i - 1];
        }
        return output;
    }

    static int[] runLength(int[] data) {
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

    static double[] fixedPoint(int[] data, float factor) {
        int n = data.length;
        double[] output = new double[n];
        double f = 1 / factor;
        for (int i = 0; i < n; i++) {
            output[i] = f * data[i];
        }
        return output;
    }

    static double[] intervalQuantization(int[] data, int min, int max, int numSteps) {
        int n = data.length;
        double[] output = new double[n];
        double delta = (max - min) / ((double) numSteps - 1);
        for (int i = 0; i < n; i++) {
            output[i] = min + delta * data[i];
        }
        return output;
    }
}
