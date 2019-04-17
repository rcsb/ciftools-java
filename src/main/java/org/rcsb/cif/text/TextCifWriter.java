package org.rcsb.cif.text;

import org.rcsb.cif.CifWriter;
import org.rcsb.cif.model.*;
import org.rcsb.cif.model.generated.CifBlock;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
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

            for (String categoryName : cifBlock.getCategoryNames()) {
                CifCategory cifCategory = cifBlock.getCategory(categoryName);
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
        List<CifColumn> cifFields = cifCategory.getColumnNames()
                .stream()
                // TODO impl filter here
                .map(cifCategory::getColumn)
                .collect(Collectors.toList());

        OptionalInt optionalWidth = cifFields.stream()
                .map(CifColumn::getName)
                .mapToInt(String::length)
                .max();

        // this means no field from this category is included
        if (!optionalWidth.isPresent()) {
            return;
        }

        int width = optionalWidth.getAsInt() + 6 + cifCategory.getCategoryName().length();
//        int[] floatPrecisions = getFloatPrecisions(cifFields);

        for (CifColumn cifField : cifFields) {
            writePadRight(output, "_" + cifCategory.getCategoryName() + "." + cifField.getName(), width);

            for (int row = 0; row < cifField.getRowCount(); row++) {
                boolean multiline = writeValue(output, cifField, row/*, floatPrecisions[row]*/);
                if (!multiline) {
                    output.append("\n");
                }
            }
        }
        output.append("#\n");
    }

    // TODO support custom format or use float precision at all
//    private int[] getFloatPrecisions(List<CifColumn> cifFields) {
//        return cifFields.stream()
//                .mapToInt(cifField -> cifField instanceof FloatColumn ? (int) Math.pow(10, 6) : 1)
//                .toArray();
//    }

    private void writeCifLoop(StringBuilder output, CifCategory cifCategory) {
        List<CifColumn> cifFields = cifCategory.getColumnNames()
                .stream()
                // TODO impl filter here
                .map(cifCategory::getColumn)
                .collect(Collectors.toList());

        if (cifFields.size() == 0) {
            return;
        }

//        int[] floatPrecisions = getFloatPrecisions(cifFields);
        output.append("loop_")
                .append("\n");
        for (CifColumn cifField : cifFields) {
            output.append("_")
                    .append(cifCategory.getCategoryName())
                    .append(".")
                    .append(cifField.getName())
                    .append("\n");
        }

        for (int row = 0; row < cifFields.get(0).getRowCount(); row++) {
            boolean multiline = false;
            for (int i = 0; i < cifFields.size(); i++) {
                CifColumn cifField = cifFields.get(i);
                multiline = writeValue(output, cifField, row/*, floatPrecisions[i]*/);
            }
            if (!multiline) {
                output.append("\n");
            }
        }
        output.append("#\n");
    }

    private boolean writeValue(StringBuilder output, CifColumn cifField, int row/*, int floatPrecision*/) {
        ValueKind kind = cifField.getValueKind(row);

        if (kind != ValueKind.PRESENT) {
            if (kind == ValueKind.NOT_PRESENT) {
                writeNotPresent(output);
            } else {
                writeUnknown(output);
            }
        } else {
            if (cifField instanceof IntColumn) {
                writeInteger(output, ((IntColumn) cifField).get(row));
            } else if (cifField instanceof FloatColumn) {
                writeFloat(output, ((FloatColumn) cifField).get(row), /*floatPrecision, */cifField);
            } else {
                String val = cifField.getStringData(row);
                if (isMultiline(val)) {
                    writeMultiline(output, val);
                    return true;
                } else {
                    return writeChecked(output, val);
                }
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
        String escapeCharStart = "'";
        String escapeCharEnd = "' ";
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
                    escapeCharStart = "'";
                    escapeCharEnd = "' ";
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

    private void writeFloat(StringBuilder output, double val, /*int floatPrecision, */CifColumn cifColumn) {
        // TODO honor dynamic precision
        output.append(cifColumn.format(val))
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
