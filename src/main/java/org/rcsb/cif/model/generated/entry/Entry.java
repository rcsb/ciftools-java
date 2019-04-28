package org.rcsb.cif.model.generated.entry;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Entry extends BaseCategory {
    public Entry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Entry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Entry(String name) {
        super(name);
    }

    /**
     * The value of _entry.id identifies the data block.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Document Object Identifier (DOI) for this entry registered
     * with http://crossref.org.
     * @return PdbxDOI
     */
    public PdbxDOI getPdbxDOI() {
        return (PdbxDOI) (isText ? textFields.computeIfAbsent("pdbx_DOI",
                PdbxDOI::new) : getBinaryColumn("pdbx_DOI"));
    }

    public EntryBuilder enterCategory() {
        return enterCategory(new LinkedHashMap<>(), null);
    }

    public EntryBuilder enterCategory(Map<String, Column> columns, Block.BlockBuilder parent) {
        return new EntryBuilder("entry", columns, parent);
    }

    public static class EntryBuilder {
        private final String categoryName;
        private final Map<String, Column> columns;
        private final Block.BlockBuilder parent;

        EntryBuilder(String categoryName, Map<String, Column> columns, Block.BlockBuilder parent) {
            this.categoryName = categoryName;
            this.columns = columns;
            this.parent = parent;
        }

//        public Column.IntColumnBuilder enterIntColumn(String columnName) {
//            return Column.enterIntColumn(columnName, this);
//        }
//
//        public Column.FloatColumnBuilder enterFloatColumn(String columnName) {
//            return Column.enterFloatColumn(columnName, this);
//        }
//
//        public Column.StrColumnBuilder enterStrColumn(String columnName) {
//            return Column.enterStrColumn(columnName, this);
//        }
//
//        CategoryBuilder digest(Column.IntColumnBuilder intColumnBuilder) {
//            columns.put(intColumnBuilder.getColumnName(), createColumnText(categoryName, intColumnBuilder.getColumnName(),
//                    intColumnBuilder.getValueList(), intColumnBuilder.getMask()));
//            return this;
//        }
//
//        CategoryBuilder digest(Column.FloatColumnBuilder floatColumnBuilder) {
//            columns.put(floatColumnBuilder.getColumnName(), createColumnText(categoryName, floatColumnBuilder.getColumnName(),
//                    floatColumnBuilder.getValueList(), floatColumnBuilder.getMask()));
//            return this;
//        }
//
//        CategoryBuilder digest(Column.StrColumnBuilder strColumnBuilder) {
//            columns.put(strColumnBuilder.getColumnName(), createColumnText(categoryName, strColumnBuilder.getColumnName(),
//                    strColumnBuilder.getValueList(), strColumnBuilder.getMask()));
//            return this;
//        }
//
//        static Column createColumnText(String categoryName, String columnName, List<?> values, List<ValueKind> mask) {
//            int length = values.size();
//            int[] startToken = new int[length];
//            int[] endToken = new int[length];
//            StringBuilder builder = new StringBuilder();
//
//            for (int i = 0; i < length; i++) {
//                startToken[i] = builder.length();
//                String value = String.valueOf(values.get(i));
//                if (mask.get(i) == ValueKind.NOT_PRESENT) {
//                    value = ".";
//                } else if (mask.get(i) == ValueKind.UNKNOWN) {
//                    value = "?";
//                }
//                builder.append(value);
//                endToken[i] = builder.length();
//            }
//
//            return ModelFactory.createColumnText(categoryName, columnName, builder.toString(), startToken, endToken);
//        }
//
//        public Block.BlockBuilder leaveCategory() {
//            if (parent == null) {
//                throw new IllegalStateException("cannot leave category with undefined parent block");
//            }
//            return parent.digest(this);
//        }
//
//        String getCategoryName() {
//            return categoryName;
//        }
//
//        Map<String, Column> getColumns() {
//            return columns;
//        }
//
//        public Category build() {
//            return ModelFactory.createCategoryText(categoryName, columns);
//        }
//
//        public CategoryBuilder addColumn(Column column) {
//            columns.put(column.getColumnName(), column);
//            return this;
//        }
    }
}
