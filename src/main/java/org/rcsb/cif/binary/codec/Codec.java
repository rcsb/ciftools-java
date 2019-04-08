package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;

public abstract class Codec<PLAIN, ENCODED> {
    public static final String CODEC_NAME = /*"ciftools-java"*/ "mol*";
    public static final String VERSION = "0.3.0";
    public static final String MIN_VERSION = "0.3";

    protected final String kind;

    protected Codec(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    /* decoding */

    protected abstract PLAIN decodeInternally(CodecData<ENCODED> data);

    // TODO type-safe chains of encoding/decoding steps

    @SuppressWarnings("unchecked")
    public static Object decodeMap(Map<String, Object> map) {
        Object current = map.get("data");
        Object[] encodings = (Object[]) map.get("encoding");

        for (int i = encodings.length - 1; i >= 0; i--) {
            current = decodeInternal(CodecData.of(current, (Map<String, Object>) encodings[i]));
        }
        return current;
    }

    @SuppressWarnings("unchecked")
    private static Object decodeInternal(CodecData<?> codecData) {
        String kind = (String) codecData.getParameters().get("kind");
        switch (kind) {
            case "ByteArray":
                return ByteArrayCodec.decode((CodecData<byte[]>) codecData);
            case "FixedPoint":
                return FixedPointCodec.decode((CodecData<Int32Array>) codecData);
            case "IntervalQuantization":
                return IntervalQuantizationCodec.decode((CodecData<Int32Array>) codecData);
            case "RunLength":
                return RunLengthCodec.decode((CodecData<Int32Array>) codecData);
            case "Delta":
                return DeltaCodec.decode((CodecData<IntArray>) codecData);
            case "IntegerPacking":
                return IntegerPackingCodec.decode((CodecData<IntArray>) codecData);
            case "StringArray":
                return StringArrayCodec.decode((CodecData<byte[]>) codecData);
        }
        throw new IllegalArgumentException("Unsupported Encoding kind: " + codecData.getParameters().get("kind"));
    }

    /* encoding */

    @SuppressWarnings("unchecked")
    public static CodecData<byte[]> encodeMap(CodecData<?> codecData) {
        Object current = codecData.getData();
        Object[] encodings = codecData.getEncoding();

        for (int i = 0; i < encodings.length; i++) {
            Map<String, Object> encoding = (Map<String, Object>) encodings[i];
            // unwrap data
            if (current instanceof CodecData) {
                current = codecData.getData();
            }
            // pair with current coding
            current = CodecData.of(current, encoding);
            current = encodeInternal((CodecData<?>) current);
            Map<String, Object> e2 = ((CodecData<?>) current).getParameters();
            encodings[i] = e2;
            current = ((CodecData<?>) current).getData();
        }

        return CodecData.of((byte[]) current, encodings);
    }

    @SuppressWarnings("unchecked")
    private static Object encodeInternal(CodecData<?> codecData) {
        String kind = (String) codecData.getParameters().get("kind");
        switch (kind) {
            case "ByteArray":
                return ByteArrayCodec.encode((CodecData<NumberArray>) codecData);
            case "FixedPoint":
                return FixedPointCodec.encode((CodecData<FloatArray>) codecData);
            case "IntervalQuantization":
                return IntervalQuantizationCodec.encode((CodecData<FloatArray>) codecData);
            case "RunLength":
                return RunLengthCodec.encode((CodecData<IntArray>) codecData);
            case "Delta":
                return DeltaCodec.encode((CodecData<IntArray>) codecData);
            case "IntegerPacking":
                return IntegerPackingCodec.encode((CodecData<Int32Array>) codecData);
            case "StringArray":
                return StringArrayCodec.encode((CodecData<String[]>) codecData);
        }
        throw new IllegalArgumentException("Unsupported Encoding kind: " + codecData.getParameters().get("kind"));
    }

    protected abstract CodecData<ENCODED> encodeInternally(CodecData<PLAIN> data);

    public static CodecData<IntArray> classifyArray(IntArray data) {
        if (data.getData().length < 2) {
            return CodecData.of(data)
                    .startEncoding(ByteArrayCodec.KIND)
                    .addParameter("type", data.getType())
                    .build();
        }

        List<EncodingSize> sizes = getSize(data);
        EncodingSize size = sizes.get(0);
        if (size.length == sizes.get(1).length) {
            // TODO fix potential problems with wrong order of encodings
            System.out.println("tie - packing size ambiguous");
            sizes.stream().map(s -> s.kind + " " + s.length + " " + s.elem).forEach(System.out::println);
        }

        switch (size.kind) {
            case "pack":
                return CodecData.of(data)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            case "rle":
                return CodecData.of(data)
                        .startEncoding(RunLengthCodec.KIND)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            case "delta":
                return CodecData.of(data)
                        .startEncoding(DeltaCodec.KIND)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            case "delta-rle":
                return CodecData.of(data)
                        .startEncoding(DeltaCodec.KIND)
                        .startEncoding(RunLengthCodec.KIND)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            default:
                throw new IllegalArgumentException("Determined encoding type is unknown. " + size.kind);
        }
    }

    private static int packSize(int value, int upperLimit) {
        return (int) Math.ceil((value + 1) / (double) (value >= 0 ? upperLimit : -upperLimit - 1));
    }

    private static IntColumnInfo getInfo(IntArray data) {
        boolean unsigned = data instanceof Uint8Array || data instanceof Uint16Array || data instanceof Uint32Array;
        return !unsigned ? new IntColumnInfo(true, 0x7F, 0x7FFF) : new IntColumnInfo(false, 0xFF, 0xFFFF);
    }

    static class IntColumnInfo {
        boolean signed;
        int limit8;
        int limit16;

        IntColumnInfo(boolean signed, int limit8, int limit16) {
            this.signed = signed;
            this.limit8 = limit8;
            this.limit16 = limit16;
        }
    }

    static class SizeInfo {
        int pack8;
        int pack16;
        int count;
    }

    private static void incSize(IntColumnInfo intColumnInfo, SizeInfo sizeInfo, int value) {
        sizeInfo.pack8 += packSize(value, intColumnInfo.limit8);
        sizeInfo.pack16 += packSize(value, intColumnInfo.limit16);
        sizeInfo.count += 1;
    }

    private static void incSizeSigned(SizeInfo sizeInfo, int value) {
        sizeInfo.pack8 += packSize(value, 0x7F);
        sizeInfo.pack16 += packSize(value, 0x7FFF);
        sizeInfo.count += 1;
    }

    static class ByteSize {
        int length;
        int elem;

        ByteSize(int length, int elem) {
            this.length = length;
            this.elem = elem;
        }
    }

    private static ByteSize byteSize(SizeInfo sizeInfo) {
        if (sizeInfo.count * 4 < sizeInfo.pack16 * 2) {
            return new ByteSize(sizeInfo.count * 4, 4);
        } else if (sizeInfo.pack16 * 2 < sizeInfo.pack8) {
            return new ByteSize(sizeInfo.pack16 * 2, 2);
        } else {
            return new ByteSize(sizeInfo.pack8, 1);
        }
    }

    static class EncodingSize extends ByteSize {
        String kind;

        EncodingSize(ByteSize byteSize, String kind) {
            super(byteSize.length, byteSize.elem);
            this.kind = kind;
        }
    }

    private static EncodingSize packingSize(int[] data, IntColumnInfo info) {
        SizeInfo size = new SizeInfo();
        for (int datum : data) {
            incSize(info, size, datum);
        }
        return new EncodingSize(byteSize(size), "pack");
    }

    private static EncodingSize deltaSize(int[] data) {
        SizeInfo size = new SizeInfo();
        int prev = data[0];
        for (int i = 1; i < data.length; i++) {
            incSizeSigned(size, data[i] - prev);
            prev = data[i];
        }
        return new EncodingSize(byteSize(size), "delta");
    }

    private static EncodingSize rleSize(int[] data, IntColumnInfo info) {
        SizeInfo size = new SizeInfo();
        int run = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] != data[i]) {
                incSize(info, size, data[i - 1]);
                incSize(info, size, run);
                run = 1;
            } else {
                run++;
            }
        }
        incSize(info, size, data[data.length - 1]);
        incSize(info, size, run);

        return new EncodingSize(byteSize(size), "rle");
    }

    private static EncodingSize deltaRleSize(int[] data) {
        SizeInfo size = new SizeInfo();
        int run = 1;
        int prev = 0;
        int prevValue = 0;
        for (int i = 1; i < data.length; i++) {
            int v = data[i] - prev;
            if (prev != v) {
                incSizeSigned(size, prevValue);
                incSizeSigned(size, run);
                run = 1;
            } else {
                run++;
            }
            prevValue = v;
            prev = data[i];
        }
        incSizeSigned(size, prevValue);
        incSizeSigned(size, run);

        return new EncodingSize(byteSize(size), "delta-rle");
    }

    private static List<EncodingSize> getSize(IntArray data) {
        IntColumnInfo info = getInfo(data);
        int[] array = data.getData();
        List<EncodingSize> sizes = new ArrayList<>();
        sizes.add(packingSize(array, info));
        sizes.add(rleSize(array, info));
        sizes.add(deltaSize(array));
        sizes.add(deltaRleSize(array));
        sizes.sort(Comparator.comparingInt(e -> e.length));
        return sizes;
    }

    private static final double DELTA = 1e-6;

    void ensureParametersPresent(CodecData<?> codecData, String... types) {
        Map<String, Object> parameters = codecData.getParameters();
        for (String s : types) {
            if (!parameters.containsKey(s)) {
                throw new IllegalArgumentException("parameter '" + s + "' is missing for codec '" + parameters.get("kind") + "'");
            }
        }
    }

    public static CodecData<FloatArray> classifyArray(FloatArray data) {
        int maxDigits = 4;

        int[] arrayDigitCount = getArrayDigitCount(data.getData(), maxDigits);
        int mantissaDigits = arrayDigitCount[0];
        int integerDigits = arrayDigitCount[1];

        if (mantissaDigits < 0 || mantissaDigits + integerDigits > 10) {
            return CodecData.of(data)
                    .startEncoding(ByteArrayCodec.KIND)
                    .build();
        }

        if (mantissaDigits == 0) {
            throw new UnsupportedOperationException("cannot handle yet, impl me");
        }

        int multiplier = getMultiplier(mantissaDigits);
        int[] intArray = DoubleStream.of(data.getData())
                .mapToInt(d -> (int) Math.round(multiplier * d))
                .toArray();

        List<EncodingSize> sizes = getSize(ArrayFactory.int32Array(intArray));
        EncodingSize size = sizes.get(0);

        switch (size.kind) {
            case "pack":
                return stub(data, multiplier)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            case "rle":
                return stub(data, multiplier)
                        .startEncoding(RunLengthCodec.KIND)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            case "delta":
                return stub(data, multiplier)
                        .startEncoding(DeltaCodec.KIND)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            case "delta-rle":
                return stub(data, multiplier)
                        .startEncoding(DeltaCodec.KIND)
                        .startEncoding(RunLengthCodec.KIND)
                        .startEncoding(IntegerPackingCodec.KIND)
                        .startEncoding(ByteArrayCodec.KIND)
                        .build();
            default:
                throw new IllegalArgumentException("Determined encoding type is unknown. " + size.kind);
        }
    }

    private static CodecData.EncodingBuilder<FloatArray> stub(FloatArray data, int multiplier) {
        return CodecData.of(data)
                .startEncoding(FixedPointCodec.KIND)
                .addParameter("factor", multiplier);
    }

    private static int getMultiplier(int mantissaDigits) {
        int m = 1;
        for (int i = 0; i < mantissaDigits; i++) {
            m *= 10;
        }
        return m;
    }

    /**
     * Determine the maximum number of digits in a floating point data.
     * Find a number M such that round(M * v) - M * v <= delta.
     * If no such M exists, return -1.
     */
    private static int[] getArrayDigitCount(double[] xs, int maxDigits) {
        int mantissaDigits = 1;
        int integerDigits = 0;
        for (double x : xs) {
            if (mantissaDigits >= 0) {
                final int t = getMantissaMultiplier(x, maxDigits);
                if (t < 0) {
                    mantissaDigits = -1;
                } else if (t > mantissaDigits) {
                    mantissaDigits = t;
                }
            }
            double abs = Math.abs(x);
            if (abs > DELTA) {
                int d = (int) (Math.floor(Math.log10(Math.abs(abs))) + 1);
                if (d > integerDigits) {
                    integerDigits = d;
                }
            }
        }
        return new int[] { mantissaDigits, integerDigits };
    }

    /**
     * Determine the number of digits in a floating point number
     * Find a number M such that round(M * v) - M * v <= delta.
     * If no such M exists, return -1.
     */
    private static int getMantissaMultiplier(double v, int maxDigits) {
        int m = 1, i;
        for (i = 0; i < maxDigits; i++) {
            double mv = m * v;
            if (Math.abs(Math.round(mv) - mv) <= DELTA) {
                return i;
            }
            m *= 10;
        }
        return -1;
    }
}
