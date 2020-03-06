package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SEQUENCE_PATTERN category record
 * the number of occurences of common step sequence patterns
 * (e.g. AA, CG, AT).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSequencePattern extends DelegatingCategory {
    public PdbxSequencePattern(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "label_asym_id":
                return getLabelAsymId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "pattern_count":
                return getPatternCount();
            case "sequence_pattern":
                return getSequencePattern();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The identifier of the asym_id of the strand containing
     * the sequence pattern.
     * 
     * This data item is a pointer to _atom_site.label_asym_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the author asym_id of the strand containing
     * the sequence pattern.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id
     * in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Number of occurences of the sequence pattern within the
     * named strand.
     * @return IntColumn
     */
    public IntColumn getPatternCount() {
        return delegate.getColumn("pattern_count", DelegatingIntColumn::new);
    }

    /**
     * Sequence singlet or doublet.
     * @return StrColumn
     */
    public StrColumn getSequencePattern() {
        return delegate.getColumn("sequence_pattern", DelegatingStrColumn::new);
    }

}