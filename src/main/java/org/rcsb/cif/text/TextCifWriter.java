package org.rcsb.cif.text;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextCifWriter implements CifWriter {
    @Override
    public InputStream write(CifFile cifFile) {
        StringBuilder output = new StringBuilder();

        for (CifBlock cifBlock : cifFile.getBlocks()) {
            output.append("data_")
                    .append(CifWriter.formatHeader(cifBlock.getHeader()))
                    .append("\n#\n");

            for (CifCategory cifCategory : cifBlock.getCategories().values()) {
                int rowCount = cifCategory.getRowCount();
                if (rowCount == 0) {
                    continue;
                }

                if (rowCount == 1) {
                    writeCifSingleRecord(output, cifCategory);
                } else {
                    writeCifLoop(output, cifCategory);
                }
            }
        }
        output.append("\n");

        return new ByteArrayInputStream(output.toString().getBytes(StandardCharsets.UTF_8));
    }

    private void writeCifSingleRecord(StringBuilder output, CifCategory cifCategory) {
        List<CifField> cifFields = cifCategory.getFieldNames()
                .stream()
                // TODO filter
                .map(cifCategory::getField)
                .collect(Collectors.toList());

        OptionalInt optionalWidth = cifFields.stream()
                .map(CifField::getName)
                .mapToInt(String::length)
                .max();

        // this means no field from this category is included
        if (!optionalWidth.isPresent()) {
            return;
        }

        int width = optionalWidth.getAsInt() + 6 + cifCategory.getName().length();
        int[] floatPrecisions = getFloatPrecisions(cifFields);

        for (int _f = 0; _f < cifFields.size(); _f++) {
            CifField cifField = cifFields.get(_f);

            writePadRight(output, "_" + cifCategory.getName() + "." + cifField.getName(), width);

            // TODO remove loop
            for (int row = 0; row < cifField.getRowCount(); row++) {
                boolean multiline = writeValue(output, cifField, row, floatPrecisions[row]);
                if (!multiline) {
                    output.append("\n");
                }
            }
        }
        output.append("#\n");
    }

    private int[] getFloatPrecisions(List<CifField> cifFields) {
        return cifFields.stream()
                .mapToInt(cifField -> cifField.getDataType() == DataType.Float ? (int) Math.pow(10, 6) : 1)
                // TODO support custom format
                .toArray();
    }

    private void writeCifLoop(StringBuilder output, CifCategory cifCategory) {
        List<CifField> cifFields = cifCategory.getFieldNames()
                .stream()
                // TODO filter
                .map(cifCategory::getField)
                .collect(Collectors.toList());

        if (cifFields.size() == 0) {
            return;
        }

        int[] floatPrecisions = getFloatPrecisions(cifFields);
        output.append("loop_")
                .append("\n");
        for (CifField cifField : cifFields) {
            output.append("_")
                    .append(cifCategory.getName())
                    .append(".")
                    .append(cifField.getName())
                    .append("\n");
        }

        for (int row = 0; row < cifFields.get(0).getRowCount(); row++) {
            boolean multiline = false;
            for (int i = 0; i < cifFields.size(); i++) {
                CifField cifField = cifFields.get(i);
                multiline = writeValue(output, cifField, row, floatPrecisions[i]);
            }
            if (!multiline) {
                output.append("\n");
            }
        }
        output.append("#\n");
    }

    private boolean writeValue(StringBuilder output, CifField cifField, int row, int floatPrecision) {
        ValueKind kind;
        try {
            kind = cifField.getValueKind(row);
        } catch (ArrayIndexOutOfBoundsException e) {
            kind = ValueKind.PRESENT;
        }

        if (kind != ValueKind.PRESENT) {
            if (kind == ValueKind.NOT_PRESENT) {
                writeNotPresent(output);
            } else {
                writeUnknown(output);
            }
        } else {
            DataType dataType = cifField.getDataType();
            if (dataType == DataType.Str) {
                String val = cifField.getString(row);
                if (isMultiline(val)) {
                    writeMultiline(output, val);
                    return true;
                } else {
                    return writeChecked(output, val);
                }
            } else if (dataType == DataType.Int) {
                writeInteger(output, cifField.getInt(row));
            } else {
                writeFloat(output, cifField.getFloat(row), floatPrecision);
            }
        }

        return false;
    }

    private boolean writeChecked(StringBuilder output, String val) {
        if (val == null || val.isEmpty()) {
            output.append(". ");
            return false;
        }

        boolean escape = val.charAt(0) == '_';
        String escapeCharStart = "\\'";
        String escapeCharEnd = "\\' ";
        boolean hasWhitespace = false;
        boolean hasSingle = false;
        boolean hasDouble = false;
        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);

            switch (c) {
                case '\t':
                    hasWhitespace = true;
                    break;
                case '\n':
                    writeMultiline(output, val);
                    return true;
                case ' ':
                    hasWhitespace = true;
                    break;
                case '"':
                    if (hasSingle) {
                        writeMultiline(output, val);
                        return true;
                    }

                    hasDouble = true;
                    escape = true;
                    escapeCharStart = "\\'";
                    escapeCharEnd = "\\' ";
                    break;
                case '\'':
                    if (hasDouble) {
                        writeMultiline(output, val);
                        return true;
                    }
                    escape = true;
                    hasSingle = true;
                    escapeCharStart = "\"";
                    escapeCharEnd = "\" ";
                    break;
            }
        }

        char fst = val.charAt(0);
        if (!escape && (fst == '#' || fst == '$' || fst == ';' || fst == '[' || fst == ']' || hasWhitespace)) {
            escapeCharStart = "'";
            escapeCharEnd = "' ";
            escape = true;
        }

        if (escape) {
            output.append(escapeCharStart)
                    .append(val)
                    .append(escapeCharEnd);
        } else {
            output.append(val)
                    .append(" ");
        }

        return false;
    }

    private void writeMultiline(StringBuilder output, String val) {
        output.append("\n;")
                .append(val)
                .append("\n;\n");
    }

    private boolean isMultiline(String val) {
        return val.contains("\n");
    }

    private void writeInteger(StringBuilder output, int val) {
        output.append(val);
        output.append(" ");
    }

    private void writeFloat(StringBuilder output, double val, int floatPrecision) {
        // TODO change to DecimalFormat or something
        // FIXME honor dynamic precision
        // TODO dirty
        String s;
        if (val == Math.round(val)) {
            s = String.valueOf((int) val);
        } else {
            s = String.valueOf(Math.round(val * 1_000_000) / (1_000_000.0));
        }
        output.append(s)
                .append(" ");
    }

    private void writeNotPresent(StringBuilder output) {
        output.append(". ");
    }

    private void writeUnknown(StringBuilder output) {
        output.append("? ");
    }

    private void writePadRight(StringBuilder output, String val, int width) {
        if (val == null || val.isEmpty()) {
            whitespace(output, width);
            return;
        }

        int padding = width - val.length();
        output.append(val);
        whitespace(output, padding);
    }

    private static final Map<Integer, String> PADDING_SPACES = new HashMap<>();
    private static String getPaddingSpaces(int width) {
        return PADDING_SPACES.computeIfAbsent(width, w -> IntStream.range(0, w).mapToObj(i -> " ").collect(Collectors.joining()));
    }

    private void whitespace(StringBuilder output, int width) {
        if (width > 0) {
            output.append(getPaddingSpaces(width));
        }
    }
}
