package org.rcsb.cif.model;

import org.rcsb.cif.internal.ModelFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The instance of a parsed CifFile. No difference between binary and text files is exposed. This class does not
 * represent a parsed data model. Rather all source data is neatly wrapped into a type-safe hierarchy of Block,
 * Category, and Column entities. Parsing (for text data) or decoding (for binary data) is only done, when the content
 * of particular categories or columns is requested. Otherwise the goal is to keep interaction with the source data to a
 * bare minimum: just enough to provide this view of the data model.
 *
 * CifFiles have the following hierarchy:
 * <ul>
 *  <li>1 CifFile contains 1...n Blocks</li>
 *  <li>1 Block contains 1...n Categories</li>
 *  <li>1 Category contains 1...n Columns</li>
 *  <li>1 Column contains 1...n rows of raw values (int, double, or String)</li>
 * </ul>
 *
 * Prominent Categories and Columns are provided in a type-safe manner based on the mmCIF dictionary. Missing categories
 * and columns will still be accessible, though the report being undefined and have a row count of 0. Most values in the
 * data structure will be available, but some are missing or unknown. This property of individual values is reported by
 * the ValueKind property of a Column.
 */
public interface CifFile {
    /**
     * Access to all blocks of this file.
     * @return a list of present blocks
     */
    List<Block> getBlocks();

    /**
     * Convenience method to access the first block.
     * @return the first block of this file
     */
    default Block getFirstBlock() {
        return getBlocks().get(0);
    }

    /**
     * Convenience method to access all blocks as Stream.
     * @return a Stream of all blocks
     */
    default Stream<Block> blocks() {
        return getBlocks().stream();
    }

    static CifFileBuilder build() {
        return new CifFileBuilder();
    }

    class CifFileBuilder {
        private final CifFile cifFile;
        private final List<Block> blocks;

        CifFileBuilder() {
            this.blocks = new ArrayList<>();
            this.cifFile = new TextFile(blocks);
        }

        public BlockBuilder enterBlock(String blockName) {
            Map<String, Category> categories = new LinkedHashMap<>();
            Block block = new BaseBlock(categories, blockName);
            blocks.add(block);
            return new BlockBuilder(categories, this);
        }

        public CifFile leaveFile() {
            return cifFile;
        }
    }

    class BlockBuilder {
        private final Map<String, Category> categories;
        private final CifFileBuilder parent;

        BlockBuilder(Map<String, Category> categories, CifFileBuilder parent) {
            this.categories = categories;
            this.parent = parent;
        }

        public CategoryBuilder enterCategory(String categoryName) {
            Map<String, Column> columns = new LinkedHashMap<>();
            return new CategoryBuilder(categoryName, columns, this);
        }

        BlockBuilder digest(CategoryBuilder categoryBuilder) {
            Category category = ModelFactory.createCategoryText(categoryBuilder.categoryName, categoryBuilder.columns);
            categories.put(categoryBuilder.categoryName, category);
            return this;
        }

        public CifFileBuilder leaveBlock() {
            return parent;
        }
    }

    class CategoryBuilder {
        private final String categoryName;
        private final Map<String, Column> columns;
        private final BlockBuilder parent;

        CategoryBuilder(String categoryName, Map<String, Column> columns, BlockBuilder parent) {
            this.categoryName = categoryName;
            this.columns = columns;
            this.parent = parent;
        }

        public GenericColumnBuilder enterColumn(String columnName) {
            return new GenericColumnBuilder(columnName, this);
        }

        CategoryBuilder digest(IntColumnBuilder intColumnBuilder) {
            columns.put(intColumnBuilder.columnName, createColumnText(categoryName, intColumnBuilder.columnName,
                    intColumnBuilder.valueList, intColumnBuilder.mask));
            return this;
        }

        CategoryBuilder digest(FloatColumnBuilder floatColumnBuilder) {
            columns.put(floatColumnBuilder.columnName, createColumnText(categoryName, floatColumnBuilder.columnName,
                    floatColumnBuilder.valueList, floatColumnBuilder.mask));
            return this;
        }

        CategoryBuilder digest(StrColumnBuilder strColumnBuilder) {
            columns.put(strColumnBuilder.columnName, createColumnText(categoryName, strColumnBuilder.columnName,
                    strColumnBuilder.valueList, strColumnBuilder.mask));
            return this;
        }

        private Column createColumnText(String categoryName, String columnName, List<? extends Object> values, List<ValueKind> mask) {
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

            return ModelFactory.createColumnText(categoryName, columnName, builder.toString(), startToken, endToken);
        }

        public BlockBuilder leaveCategory() {
            return parent.digest(this);
        }
    }

    class GenericColumnBuilder {
        final String columnName;
        final CategoryBuilder parent;

        GenericColumnBuilder(String columnName, CategoryBuilder parent) {
            this.columnName = columnName;
            this.parent = parent;
        }

        public IntColumnBuilder intValues(int... values) {
            return new IntColumnBuilder(this, values);
        }

        public FloatColumnBuilder floatValues(double... values) {
            return new FloatColumnBuilder(this, values);
        }

        public StrColumnBuilder stringValues(String... values) {
            return new StrColumnBuilder(this, values);
        }
    }

    class IntColumnBuilder extends GenericColumnBuilder {
        private final List<Integer> valueList;
        private final List<ValueKind> mask;

        IntColumnBuilder(GenericColumnBuilder parent, int... values) {
            super(parent.columnName, parent.parent);
            this.valueList = Arrays.stream(values).boxed().collect(Collectors.toList());
            this.mask = IntStream.range(0, valueList.size())
                    .mapToObj(i -> ValueKind.PRESENT)
                    .collect(Collectors.toList());
        }

        public IntColumnBuilder intValues(int... values) {
            for (int i : values) {
                valueList.add(i);
                mask.add(ValueKind.PRESENT);
            }
            return this;
        }

        public IntColumnBuilder markNextNotPresent() {
            valueList.add(0);
            mask.add(ValueKind.NOT_PRESENT);
            return this;
        }

        public IntColumnBuilder markNextUnknown() {
            valueList.add(0);
            mask.add(ValueKind.UNKNOWN);
            return this;
        }

        public CategoryBuilder leaveColumn() {
            return parent.digest(this);
        }
    }

    class FloatColumnBuilder extends GenericColumnBuilder {
        private final List<Double> valueList;
        private final List<ValueKind> mask;

        FloatColumnBuilder(GenericColumnBuilder parent, double... values) {
            super(parent.columnName, parent.parent);
            this.mask = IntStream.range(0, values.length)
                    .mapToObj(i -> ValueKind.PRESENT)
                    .collect(Collectors.toList());
            this.valueList = Arrays.stream(values).boxed().collect(Collectors.toList());
        }

        public FloatColumnBuilder floatValues(double... values) {
            for (double i : values) {
                valueList.add(i);
                mask.add(ValueKind.PRESENT);
            }
            return this;
        }

        public FloatColumnBuilder markNextNotPresent() {
            valueList.add(0.0);
            mask.add(ValueKind.NOT_PRESENT);
            return this;
        }

        public FloatColumnBuilder markNextUnknown() {
            valueList.add(0.0);
            mask.add(ValueKind.UNKNOWN);
            return this;
        }

        public CategoryBuilder leaveColumn() {
            return parent.digest(this);
        }
    }

    class StrColumnBuilder extends GenericColumnBuilder {
        private final List<String> valueList;
        private final List<ValueKind> mask;

        StrColumnBuilder(GenericColumnBuilder parent, String... values) {
            super(parent.columnName, parent.parent);
            this.valueList = new ArrayList<>();
            this.mask = new ArrayList<>();
            stringValues(values);
        }

        public StrColumnBuilder stringValues(String... values) {
            for (String s : values) {
                if (".".equals(s)) {
                    markNextNotPresent();
                } else if ("?".equals(s)) {
                    markNextUnknown();
                } else {
                    valueList.add(s);
                    mask.add(ValueKind.PRESENT);
                }
            }
            return this;
        }

        public StrColumnBuilder markNextNotPresent() {
            valueList.add(".");
            mask.add(ValueKind.NOT_PRESENT);
            return this;
        }

        public StrColumnBuilder markNextUnknown() {
            valueList.add("?");
            mask.add(ValueKind.UNKNOWN);
            return this;
        }

        public CategoryBuilder leaveColumn() {
            return parent.digest(this);
        }
    }
}
