package org.rcsb.cif.binary.codec;

import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.IntArray;

import java.util.Map;
import java.util.function.Function;

public abstract class Codec<PLAIN, ENCODED> {
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

    public Function<CodecData<ENCODED>, PLAIN> decode() {
        return this::decodeInternally;
    }

    @SuppressWarnings("unchecked")
    public static Object decode(Map<String, Object> map) {
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
            case "IntegerPackingCodec":
                return IntegerPackingCodec.decode((CodecData<IntArray>) codecData);
            case "StringArray":
                return StringArrayCodec.decode((CodecData<byte[]>) codecData);
        }
        throw new IllegalArgumentException("Unsupported Encoding kind: " + codecData.getParameters().get("kind"));
    }

    /* encoding */

    protected abstract CodecData<ENCODED> encodeInternally(CodecData<PLAIN> data);

    public Function<CodecData<PLAIN>, CodecData<ENCODED>> encode() {
        return this::encodeInternally;
    }

    // TODO encoding functions here
}
