package org.rcsb.cif.reader.binary.codec.encoding;

import org.rcsb.cif.reader.binary.codec.AbstractCodec;
import org.rcsb.cif.reader.binary.codec.CodecFactory;

import java.util.HashMap;
import java.util.Map;

public class StringArrayCodec extends AbstractCodec<String[], byte[], StringArrayParameters> {
    public StringArrayCodec(StringArrayParameters parameters) {
        super(parameters);
    }

    @Override
    public byte[] encode(String[] input) {
        // TODO impl
        return new byte[0];
    }

    @Override
    public String[] decode(byte[] input) {
        Map<String, Object> offsetTask = new HashMap<>();
        offsetTask.put("data", getParameters().getEncodedOffsets());
        offsetTask.put("encoding", getParameters().getOffsetEncodings());
        Map<String, Object> dataTask = new HashMap<>();
        dataTask.put("data", input);
        dataTask.put("encoding", getParameters().getDataEncodings());

        int[] offsets = getParameters().getOffsetEncodings() != null ? (int[]) CodecFactory.decode(offsetTask) :
                CodecFactory.getUint8().decode(getParameters().getEncodedOffsets());
        int[] indices = (int[]) CodecFactory.decode(dataTask);

        String[] result = new String[indices.length];
        int offset = 0;
        for (int i : indices) {
            if (i < 0) {
                result[offset++] = null;
                continue;
            }
            result[offset++] = getParameters().getEncodedStringData().substring(offsets[i], offsets[i + 1]);
        }
        return result;
    }
}
