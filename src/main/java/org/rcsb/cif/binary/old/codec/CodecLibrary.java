package org.rcsb.cif.binary.old.codec;

import org.rcsb.cif.binary.old.codec.encoding.*;
import org.rcsb.cif.binary.old.codec.primitive.ByteCodec;

public class CodecLibrary {
    // TODO these should be a builder-esque thing which allows to set optional parameters and allows to call #getEncoding and #getDecoding to obtain the actual function for chaining
    public static final ByteCodec BYTE_ARRAY = null; // TODO impl
    public static final FixedPointCodec FIXED_POINT = new FixedPointCodec();
    public static final RunLengthCodec RUN_LENGTH = new RunLengthCodec();
    public static final DeltaCodec DELTA = new DeltaCodec();
    public static final IntervalQuantizationCodec INTERVAL_QUANTIZATION = new IntervalQuantizationCodec();
    public static final IntegerPackingCodec INTEGER_PACKING = new IntegerPackingCodec();
    public static final StringArrayCodec STRING_ARRAY = new StringArrayCodec();
}
