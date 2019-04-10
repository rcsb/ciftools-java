package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.data.EncodedDataFactory;
import org.rcsb.cif.binary.data.Int32Array;
import org.rcsb.cif.binary.data.IntArray;
import org.rcsb.cif.binary.encoding.Encoding;
import org.rcsb.cif.binary.encoding.IntegerPackingEncoding;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class IntegerPackingCodec {
    public IntArray encode(Int32Array data, IntegerPackingEncoding encoding) {
        int[] input = data.getData();

        Packing packing = determinePacking(input);
        if (packing.bytesPerElement == 4) {
            LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
            encoding.setByteCount(4);
            encoding.setUnsigned(false);
            encoding.setSrcSize(input.length);
            enc.add(encoding);
            return EncodedDataFactory.int32Array(input, enc);
        }

        int upperLimit = packing.signed ? packing.bytesPerElement == 1 ? 0x7F : 0x7FFF :
                packing.bytesPerElement == 1 ? 0xFF : 0xFFFF;

        int lowerLimit = -upperLimit - 1;
        int[] outputArray = new int[packing.size];
        int j = 0;

        for (int i1 : input) {
            int value = i1;
            if (value >= 0) {
                while (value >= upperLimit) {
                    outputArray[j] = upperLimit;
                    ++j;
                    value -= upperLimit;
                }
            } else {
                while (value <= lowerLimit) {
                    outputArray[j] = lowerLimit;
                    ++j;
                    value -= lowerLimit;
                }
            }
            outputArray[j] = value;
            ++j;
        }

        IntArray output;
        if (packing.signed) {
            if (packing.bytesPerElement == 1) {
                output = EncodedDataFactory.int8Array(outputArray);
            } else {
                output = EncodedDataFactory.int16Array(outputArray);
            }
        } else {
            if (packing.bytesPerElement == 1) {
                output = EncodedDataFactory.uint8Array(outputArray);
            } else {
                output = EncodedDataFactory.uint16Array(outputArray);
            }
        }

        LinkedList<Encoding> enc = new LinkedList<>(data.getEncoding());
        encoding.setByteCount(packing.bytesPerElement);
        encoding.setUnsigned(!packing.signed);
        encoding.setSrcSize(packing.size);
        enc.add(encoding);
        output.setEncoding(enc);

        return output;
    }

    class Packing {
        final boolean signed;
        final int size;
        final int bytesPerElement;

        Packing(boolean signed, int size, int bytesPerElement) {
            this.signed = signed;
            this.size = size;
            this.bytesPerElement = bytesPerElement;
        }
    }

    private Packing determinePacking(int[] input) {
        boolean signed = IntStream.of(input).anyMatch(i -> i < 0);
        int size8 = packingSize(input, signed ? 0x7F : 0xFF);
        int size16 = packingSize(input, signed ? 0x7FFF : 0xFFFF);

        if (input.length * 4 < size16 * 2) {
            // 4 byte packing is the most effective
            return new Packing(signed, input.length, 4);
        } else if (size16 * 2 < size8) {
            // 2 byte packing is the most effective
            return new Packing(signed, size16, 2);
        } else {
            return new Packing(signed, size8, 1);
        }
    }

    private int packingSize(int[] input, int upperLimit) {
        int lowerLimit = -upperLimit - 1;
        int size = 0;
        for (int value : input) {
            if (value == 0) {
                size += 1;
            } else if (value > 0) {
                size += Math.ceil(value / (double) upperLimit);
                if (value % upperLimit == 0) {
                    size += 1;
                }
            } else {
                size += Math.ceil(value / (double) lowerLimit);
                if (value % lowerLimit == 0) {
                    size += 1;
                }
            }
        }
        return size;
    }

    public Int32Array decode(IntArray data, IntegerPackingEncoding encoding) {
        int[] input = data.getData();

        int byteCount = encoding.getByteCount();
        boolean unsigned = encoding.isUnsigned();
        int srcSize = encoding.getSrcSize();

        if (input.length == srcSize && byteCount == 4) {
            Int32Array output = EncodedDataFactory.int32Array(input, data.getEncoding());
            output.setEncoding(data.getEncoding());
            return output;
        }

        int upperLimit;
        int lowerLimit = 0;
        if (unsigned) {
            upperLimit = byteCount == 1 ? 0xFF : 0xFFFF;
        } else {
            upperLimit = byteCount == 1 ? 0x7F : 0x7FFF;
            lowerLimit = -upperLimit - 1;
        }

        int n = input.length;
        int[] output = new int[srcSize];
        int i = 0;
        int j = 0;
        while (i < n) {
            int value = 0;
            int t = input[i];
            while (unsigned ? t == upperLimit : t == upperLimit || t == lowerLimit) {
                value += t;
                i++;
                t = input[i];
            }
            value += t;
            output[j] = value;
            i++;
            j++;
        }

        return EncodedDataFactory.int32Array(output, data.getEncoding());
    }
}
