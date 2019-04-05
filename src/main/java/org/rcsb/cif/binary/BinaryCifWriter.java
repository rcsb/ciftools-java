package org.rcsb.cif.binary;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.binary.array.Float64Array;
import org.rcsb.cif.binary.array.FloatArray;
import org.rcsb.cif.binary.array.Int32Array;
import org.rcsb.cif.binary.array.IntArray;
import org.rcsb.cif.binary.codec.Codec;
import org.rcsb.cif.binary.codec.CodecData;
import org.rcsb.cif.binary.codec.MessagePackCodec;
import org.rcsb.cif.model.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import java.util.stream.Collectors;

import static org.rcsb.cif.binary.codec.MessagePackCodec.MESSAGE_PACK_CODEC;

public class BinaryCifWriter implements CifWriter {
    private final MessagePackCodec messagePackCodec;

    public BinaryCifWriter() {
        this.messagePackCodec = MESSAGE_PACK_CODEC;
    }

    @Override
    public OutputStream write(CifFile cifFile) throws IOException {
        // naming: uses cifEntity for original model and entity for the map representation ready for MessagePack
        Map<String, Object> file = new LinkedHashMap<>();
        file.put("encoder", Codec.CODEC_NAME);
        file.put("version", Codec.VERSION);
        Object[] blocks = new Object[cifFile.getBlocks().size()];
        int blockCount = 0;
        file.put("dataBlocks", blocks);

        // TODO filter support
        for (CifBlock cifBlock : cifFile.getBlocks()) {
            Map<String, Object> block = new LinkedHashMap<>();
            block.put("header", cifBlock.getHeader().replaceAll("[ \n\t]", "").toUpperCase());
            Object[] categories = new Object[cifBlock.getCategories().size()];
            int categoryCount = 0;
            block.put("categories", categories);
            blocks[blockCount++] = block;

            for (CifCategory cifCategory : cifBlock.getCategories().values()) {
                Object[] fields = new Object[cifCategory.getFieldNames().size()];
                int fieldCount = 0;
                for (String fieldName : cifCategory.getFieldNames()) {
                    fields[fieldCount++] = classifyField(cifCategory.getField(fieldName), fieldName);
                }

                Map<String, Object> category = new LinkedHashMap<>();
                category.put("name", "_" + cifCategory.getName());
                Object[] columns = new Object[0]; // TODO
                int columnCount = 0;
                category.put("columns", columns);

                categories[categoryCount++] = category;
            }
        }

        byte[] ret = messagePackCodec.encode(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(ret);

        return outputStream;
    }

    private Map<String, Object> classifyField(CifField cifField, String name) {
        DataType type = cifField.getDataType();
        Map<String, Object> field = new LinkedHashMap<>();
        field.put("name", name);

        if (type == DataType.Str) {
            field.put("type", "Str");
            field.put("value", cifField.strings().collect(Collectors.toList()));
            field.put("valueKind", null); // TODO handle value kind
            return field;
        } else if (type == DataType.Float) {
            double[] values = cifField.doubles().toArray();
            field.put("type", "Float");
            field.put("value", values);
            field.put("valueKind", null); // TODO handle value kind
            CodecData<FloatArray> encoder = Codec.classifyArray(new Float64Array(values));
            // TODO
            return field;
        } else {
            int[] values = cifField.ints().toArray();
            field.put("type", "Int");
            field.put("value", values);
            field.put("valueKind", null); // TODO handle value kind
            CodecData<IntArray> encoder = Codec.classifyArray(new Int32Array(values));
            // TODO
            return field;
        }
    }
}
