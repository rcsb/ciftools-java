package org.rcsb.cif.text;

import org.rcsb.cif.api.Category;
import org.rcsb.cif.api.Column;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TextCategory implements Category {
    private final String data;
    private final Map<String, Integer> columnIndices;
    private final String name;
    private final int columnCount;
    private final int rowCount;
    private final int[] tokens;
    private final int startIndex;
    private final int endIndex;

    public TextCategory(String data,
                        String name,
                        int startIndex,
                        int endIndex,
                        List<String> columns,
                        int[] tokens,
                        int tokenCount) {
        this.name = name;
        this.tokens = tokens;
        this.data = data;

        this.startIndex = startIndex;
        this.endIndex = endIndex;

        this.columnCount = columns.size();
        this.rowCount = columnCount == 0 ? 0 : (int) (tokenCount / (double) columnCount);

        this.columnIndices = IntStream.range(0, columns.size())
                .boxed()
                .collect(Collectors.toMap(i -> columns.get(i).substring(name.length() + 1), Function.identity()));

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Column getColumn(String name) {
        if (columnIndices.containsKey(name)) {
            int i = columnIndices.get(name);
            return new TextColumn(this, data, name, i);
        }
        return Column.UNDEFINED_COLUMN;
    }

    public int[] getTokens() {
        return tokens;
    }
}
