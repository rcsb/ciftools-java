package org.rcsb.cif.model;

import java.util.List;

/**
 * Defines functionality of column building classes. All builders are aware of their parent instances in order to enforce
 * the schema.
 * @param <P> parent builder type (CategoryBuilder)
 * @param <PP> parent's parent builder type (BlockBuilder)
 * @param <PPP> parent's parent's parent builder type (CifFileBuilder)
 */
public interface ColumnBuilder<P extends CategoryBuilder<PP, PPP>, PP extends BlockBuilder<PPP>, PPP extends CifFileBuilder> {
    /**
     * The name of the parent category.
     * @return a String
     */
    String getCategoryName();

    /**
     * The name of this column
     * @return a String
     */
    String getColumnName();

    /**
     * The registered mask data.
     * @return a List of ValueKind entries
     */
    List<ValueKind> getMask();

    /**
     * Specify that the next value written is not present (aka undefined).
     * @return this builder instance
     */
    ColumnBuilder<P, PP, PPP> markNextNotPresent();

    /**
     * Specify that the next value written is unknown.
     * @return this builder instance
     */
    ColumnBuilder<P, PP, PPP> markNextUnknown();

    /**
     * Retrieve (detached) column describe by this builder.
     * @return this builder instance
     */
    Column<?> build();

    /**
     * Leave this column.
     * @return the parent builder instance
     */
    P leaveColumn();
}
