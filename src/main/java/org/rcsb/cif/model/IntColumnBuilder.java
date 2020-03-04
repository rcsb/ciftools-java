package org.rcsb.cif.model;

import java.util.List;

/**
 * A builder instance for {@link IntColumn} instances.
 * @param <P> parent builder type (CategoryBuilder)
 * @param <PP> parent's parent builder type (BlockBuilder)
 * @param <PPP> parent's parent's parent builder type (CifFileBuilder)
 */
public interface IntColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    /**
     * Access to all stored values.
     * @return int values
     */
    List<Integer> getValues();

    IntColumn build();

    IntColumnBuilder<P, PP, PPP> markNextNotPresent();

    IntColumnBuilder<P, PP, PPP> markNextUnknown();

    /**
     * Add new values to this column.
     * @param values int values
     * @return this builder instance
     */
    IntColumnBuilder<P, PP, PPP> add(int... values);
}
