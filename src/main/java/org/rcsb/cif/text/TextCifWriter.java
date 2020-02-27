package org.rcsb.cif.text;

import org.rcsb.cif.CifOptions;
import org.rcsb.cif.model.Block;
import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.IntColumn;
import org.rcsb.cif.model.ValueKind;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextCifWriter {
    private final CifOptions options;

    public TextCifWriter(CifOptions options) {
        this.options = options;
    }

    public byte[] write(CifFile<Block> cifFile) {
        StringBuilder output = new StringBuilder();

        for (Block block : cifFile.getBlocks()) {
            String blockHeader = block.getBlockHeader();
            String header = blockHeader != null ? blockHeader.replaceAll("[ \n\t]", "").toUpperCase() : "UNKNOWN";
            output.append("data_")
                    .append(header)
                    .append("\n#\n");

            for (String categoryName : block.getCategoryNames()) {
                if (!options.filterCategory(categoryName)) {
                    continue;
                }

                Category cifCategory = block.getCategory(categoryName);
                int rowCount = cifCategory.getRowCount();
                if (rowCount == 0) {
                    continue;
                }

                List<Column> columns = cifCategory.getColumnNames()
                        .stream()
                        .filter(columnName -> options.filterColumn(categoryName, columnName))
                        .map(cifCategory::getColumn)
                        .collect(Collectors.toList());

                if (columns.isEmpty()) {
                    continue;
                }

                if (rowCount == 1) {
                    writeCifSingleRecord(output, cifCategory, columns);
                } else {
                    writeCifLoop(output, cifCategory, columns);
                }
            }
        }
        output.append("\n");

        return output.toString().getBytes(StandardCharsets.UTF_8);
    }

    private void writeCifSingleRecord(StringBuilder output, Category cifCategory, List<Column> columns) {
        int width = columns.stream()
                .map(Column::getColumnName)
                .mapToInt(String::length)
                .max()
                .orElseThrow(() -> new NoSuchElementException("not able to determine column width"))
                + 6 + cifCategory.getCategoryName().length();

        for (Column cifField : columns) {
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

    private void writeCifLoop(StringBuilder output, Category cifCategory, List<Column> columns) {
        output.append("loop_")
                .append("\n");
        for (Column cifField : columns) {
            output.append("_")
                    .append(cifCategory.getCategoryName())
                    .append(".")
                    .append(cifField.getColumnName())
                    .append("\n");
        }

        for (int row = 0; row < columns.get(0).getRowCount(); row++) {
            boolean multiline = false;
            for (Column cifField : columns) {
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
                case ' ':
                    hasWhitespace = true;
                    break;
                case '\n':
                    writeMultiline(output, val);
                    return true;
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

    private static final List<String> PADDING_SPACES = IntStream.range(0, 80)
        .mapToObj(TextCifWriter::whitespaceString)
        .collect(Collectors.toList());

    private static String whitespaceString(int width) {
        return IntStream.range(0, width).mapToObj(i -> " ").collect(Collectors.joining());
    }

    private static String getPaddingSpaces(int width) {
        try {
            return PADDING_SPACES.get(width);
        } catch (ArrayIndexOutOfBoundsException e) {
            return whitespaceString(width);
        }
    }

    private void whitespace(StringBuilder output, int width) {
        if (width > 0) {
            output.append(getPaddingSpaces(width));
        }
    }
}
