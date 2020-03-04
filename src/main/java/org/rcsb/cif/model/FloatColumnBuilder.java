package org.rcsb.cif.model;

import java.util.List;

/**
 * A builder instance for {@link FloatColumn} instances.
 * @param <P> parent builder type (CategoryBuilder)
 * @param <PP> parent's parent builder type (BlockBuilder)
 * @param <PPP> parent's parent's parent builder type (CifFileBuilder)
 */
public interface FloatColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    /**
     * Access to all stored values.
     * @return double values
     */
    List<Double> getValues();

    FloatColumn build();

    FloatColumnBuilder<P, PP, PPP> markNextNotPresent();

    FloatColumnBuilder<P, PP, PPP> markNextUnknown();

    /**
     * Add new values to this column.
     * @param values double values
     * @return this builder instance
     */
    FloatColumnBuilder<P, PP, PPP> add(double... values);
}
