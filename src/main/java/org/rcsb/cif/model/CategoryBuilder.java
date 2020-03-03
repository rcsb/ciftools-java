package org.rcsb.cif.model;

import org.rcsb.cif.model.text.TextColumn;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.DelegatingIntColumn;
import org.rcsb.cif.schema.DelegatingStrColumn;

import java.util.List;
import java.util.Map;

public interface CategoryBuilder<P extends BlockBuilder<PP>, PP extends CifFileBuilder> {
    String getCategoryName();

    Map<String, Column> getColumns();

    P leaveCategory();

    Category build();

    CategoryBuilder<P, PP> addColumn(Column column);

    CategoryBuilder<P, PP> digest(IntColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    CategoryBuilder<P, PP> digest(FloatColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    CategoryBuilder<P, PP> digest(StrColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    IntColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterIntColumn(String columnName);

    FloatColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterFloatColumn(String columnName);

    StrColumnBuilder<CategoryBuilder<P, PP>, P, PP> enterStrColumn(String columnName);

    void registerChild(ColumnBuilder<? extends CategoryBuilder<P, PP>, P, PP> columnBuilder);

    @SuppressWarnings("unchecked")
    static <C extends Column> C createColumnText(String columnName, List<?> values, List<ValueKind> mask, Class<C> hint) {
        int length = values.size();
        int[] startToken = new int[length];
        int[] endToken = new int[length];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            startToken[i] = builder.length();
            String value = String.valueOf(values.get(i));
            if (mask.get(i) == ValueKind.NOT_PRESENT) {
                value = ".";
            } else if (mask.get(i) == ValueKind.UNKNOWN) {
                value = "?";
            }
            builder.append(value);
            endToken[i] = builder.length();
        }

        String data = builder.toString();
        int rowCount = startToken.length;
        TextColumn column = new TextColumn(columnName, rowCount, data, startToken, endToken);
        if (hint.equals(IntColumn.class)) {
            return (C) new DelegatingIntColumn(column);
        } else if (hint.equals(FloatColumn.class)) {
            return (C) new DelegatingFloatColumn(column);
        } else {
            return (C) new DelegatingStrColumn(column);
        }
    }
}
