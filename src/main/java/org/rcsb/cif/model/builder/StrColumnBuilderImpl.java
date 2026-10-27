package org.rcsb.cif.model.builder;

import org.rcsb.cif.model.BlockBuilder;
import org.rcsb.cif.model.CategoryBuilder;
import org.rcsb.cif.model.CifFileBuilder;
import org.rcsb.cif.model.StrColumn;
import org.rcsb.cif.model.StrColumnBuilder;
import org.rcsb.cif.model.ValueKind;
import org.rcsb.cif.model.binary.BinaryStrColumn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StrColumnBuilderImpl<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder>
        extends ColumnBuilderImpl<P, PP, PPP> implements StrColumnBuilder<P, PP, PPP> {
    private final ArrayList<String> values;

    public StrColumnBuilderImpl(String categoryName, String columnName, P parent) {
        super(categoryName, columnName, parent);
        this.values = new ArrayList<>();
    }

    @Override
    public List<String> getValues() {
        return values;
    }

    private void append(String value, ValueKind kind) {
        values.add(kind == ValueKind.PRESENT ? value : null);
        appendKind(kind);
    }

    @Override
    public StrColumnBuilder<P, PP, PPP> markNextNotPresent() {
        append(null, ValueKind.NOT_PRESENT);
        return this;
    }

    @Override
    public StrColumnBuilder<P, PP, PPP> markNextUnknown() {
        append(null, ValueKind.UNKNOWN);
        return this;
    }

    @Override
    public StrColumn build() {
        // rows without a value read as empty strings, like text columns
        String[] data = new String[values.size()];
        for (int i = 0; i < data.length; i++) {
            String value = values.get(i);
            data[i] = value != null ? value : "";
        }
        return new BinaryStrColumn(getColumnName(), data.length, data, maskOrdinals());
    }

    /**
     * Add one or more string values to this column.
     * <p>
     * CIF has two special tokens for missing data: {@code "."} (not present) and {@code "?"}
     * (unknown). This method treats those tokens (and {@code null}) as missingness indicators
     * rather than literal payload:
     * <ul>
     *   <li>{@code "."} -> {@link ValueKind#NOT_PRESENT}</li>
     *   <li>{@code "?"} or {@code null} -> {@link ValueKind#UNKNOWN}</li>
     *   <li>anything else -> {@link ValueKind#PRESENT} (stored verbatim)</li>
     * </ul>
     * <p>
     * Note: this means you cannot write a literal value that is exactly {@code "."} or {@code "?"}
     * via this overload. If you need explicit control over missingness vs. payload, prefer the
     * forthcoming masked overload that accepts {@link ValueKind} alongside values (e.g. {@code addMasked(...)}).
     *
     * @param values string values to append; {@code null}, {@code "."}, and {@code "?"} are treated specially
     * @return this builder instance
     */
    @Override
    public StrColumnBuilder<P, PP, PPP> add(String... values) {
        this.values.ensureCapacity(this.values.size() + values.length);
        for (String s : values) {
            append(s, ValueKind.fromCifToken(s));
        }
        return this;
    }

    @Override
    public StrColumnBuilder<P, PP, PPP> addNullable(Iterable<String> values) {
        Objects.requireNonNull(values, "values");
        for (String s : values) {
            append(s, ValueKind.fromCifToken(s));
        }
        return this;
    }

    @Override
    public P leaveColumn() {
        if (parent == null) {
            throw new IllegalStateException("cannot leave column with undefined parent category");
        }
        parent.digest(this);
        return parent;
    }
}
