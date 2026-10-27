package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.ColumnBuilder;
import org.rcsb.cif.model.ValueKind;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class ColumnBuilderImpl<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> implements ColumnBuilder<P, PP, PPP> {
    private static final ValueKind[] VALUE_KINDS = ValueKind.values();
    private final String categoryName;
    private final String columnName;
    // the ValueKind ordinal of each row
    private byte[] mask;
    private int rowCount;
    final P parent;

    ColumnBuilderImpl(String categoryName, String columnName, P parent) {
        this.categoryName = categoryName;
        this.columnName = columnName;
        this.mask = new byte[16];
        this.parent = parent;
        if (parent != null) {
            // make parent aware of its child, so that when parent category is closed, all child information can be collected
            this.parent.registerChild(this);
        }
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    /**
     * A read-only view of the value kinds added so far.
     * @return the value kind of each row
     */
    @Override
    public List<ValueKind> getMask() {
        return new AbstractList<>() {
            @Override
            public ValueKind get(int index) {
                Objects.checkIndex(index, rowCount);
                return VALUE_KINDS[mask[index]];
            }

            @Override
            public int size() {
                return rowCount;
            }
        };
    }

    int rowCount() {
        return rowCount;
    }

    ValueKind valueKind(int row) {
        return VALUE_KINDS[mask[row]];
    }

    /**
     * The capacity to grow storage to.
     * @param length the current capacity
     * @param rows the number of rows to hold
     * @return at least that many rows, and at least double the current capacity
     */
    static int newCapacity(int length, int rows) {
        return Math.max(rows, Math.max(16, 2 * length));
    }

    void appendKind(ValueKind kind) {
        ensureMaskCapacity(rowCount + 1);
        mask[rowCount++] = (byte) kind.ordinal();
    }

    void appendPresent(int count) {
        ensureMaskCapacity(rowCount + count);
        // PRESENT is ordinal 0, and new storage is zeroed
        Arrays.fill(mask, rowCount, rowCount + count, (byte) ValueKind.PRESENT.ordinal());
        rowCount += count;
    }

    private void ensureMaskCapacity(int rows) {
        if (rows > mask.length) {
            mask = Arrays.copyOf(mask, newCapacity(mask.length, rows));
        }
    }

    /**
     * The mask as binary columns keep it.
     * @return the {@link ValueKind} ordinal of each row, or null if every value is present
     */
    int[] maskOrdinals() {
        int[] ordinals = null;
        for (int i = 0; i < rowCount; i++) {
            if (mask[i] != ValueKind.PRESENT.ordinal()) {
                if (ordinals == null) {
                    ordinals = new int[rowCount];
                }
                ordinals[i] = mask[i];
            }
        }
        return ordinals;
    }
}
