package org.rcsb.cif.text;

import org.rcsb.cif.TextCifWriterOptions;
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

public class TextCifWriter {
    private final TextCifWriterOptions options;

    public TextCifWriter(TextCifWriterOptions options) {
        this.options = options;
    }

    public String compose(CifFile cifFile) {
        StringBuilder output = new StringBuilder();

        for (Block block : cifFile.getBlocks()) {
            String blockHeader = block.getBlockHeader();
            String header = blockHeader != null ? blockHeader.replaceAll("[ \n\t]", "").toUpperCase() : "UNKNOWN";
            output.append("data_")
                    .append(header)
                    .append("\n#\n");

            for (String categoryName : block.getCategoryNames()) {
                Category cifCategory = block.getCategory(categoryName);
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

        return output.toString();
    }

    public InputStream write(CifFile cifFile) {
        byte[] bytes = compose(cifFile).getBytes(StandardCharsets.UTF_8);
        return new ByteArrayInputStream(bytes);
    }

    private void writeCifSingleRecord(StringBuilder output, Category cifCategory) {
        List<Column> cifFields = cifCategory.getColumnNames()
                .stream()
                .map(cifCategory::getColumn)
                .collect(Collectors.toList());

        OptionalInt optionalWidth = cifFields.stream()
                .map(Column::getColumnName)
                .mapToInt(String::length)
                .max();

        // this means no field from this category is included
        if (!optionalWidth.isPresent()) {
            return;
        }

        int width = optionalWidth.getAsInt() + 6 + cifCategory.getCategoryName().length();

        for (Column cifField : cifFields) {
            writePadRight(output, "_" + cifCategory.getCategoryName() + "." + cifField.getColumnName(), width);

            for (int row = 0; row < cifField.getRowCount(); row++) {
                boolean multiline = writeValue(output, cifField, row);
                if (!multiline) {
                    output.append("\n");
                }
            }
        }
        output.append("#\n");
    }

    private void writeCifLoop(StringBuilder output, Category cifCategory) {
        List<Column> cifFields = cifCategory.getColumnNames()
                .stream()
                .map(cifCategory::getColumn)
                .collect(Collectors.toList());

        if (cifFields.size() == 0) {
            return;
        }

        output.append("loop_")
                .append("\n");
        for (Column cifField : cifFields) {
            output.append("_")
                    .append(cifCategory.getCategoryName())
                    .append(".")
                    .append(cifField.getColumnName())
                    .append("\n");
        }

        for (int row = 0; row < cifFields.get(0).getRowCount(); row++) {
            boolean multiline = false;
            for (Column cifField : cifFields) {
                multiline = writeValue(output, cifField, row);
            }
            if (!multiline) {
                output.append("\n");
            }
        }
        output.append("#\n");
    }

    private boolean writeValue(StringBuilder output, Column cifField, int row) {
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
                writeFloat(output, cifField.getStringData(row));
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

    private void writeFloat(StringBuilder output, String val) {
        output.append(val)
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
