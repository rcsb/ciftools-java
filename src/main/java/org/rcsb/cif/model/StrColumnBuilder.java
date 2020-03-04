package org.rcsb.cif.model;

import java.util.List;

/**
 * A builder instance for {@link StrColumn} instances.
 * @param <P> parent builder type (CategoryBuilder)
 * @param <PP> parent's parent builder type (BlockBuilder)
 * @param <PPP> parent's parent's parent builder type (CifFileBuilder)
 */
public interface StrColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> extends ColumnBuilder<P, PP, PPP> {
    /**
     * Access to all stored values.
     * @return String values
     */
    List<String> getValues();

    StrColumn build();

    StrColumnBuilder<P, PP, PPP> markNextNotPresent();

    StrColumnBuilder<P, PP, PPP> markNextUnknown();

    /**
     * Add new values to this column.
     * @param values String values
     * @return this builder instance
     */
    StrColumnBuilder<P, PP, PPP> add(String... values);
}
