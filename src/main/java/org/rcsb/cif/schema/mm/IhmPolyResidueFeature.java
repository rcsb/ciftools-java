package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_POLY_RESIDUE_FEATURE category provides the defintions
 * required to select a specific residue or a set of residues that may or may not be
 * in a contiguous range.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPolyResidueFeature extends DelegatingCategory {
    public IhmPolyResidueFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "feature_id":
                return getFeatureId();
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "comp_id_begin":
                return getCompIdBegin();
            case "comp_id_end":
                return getCompIdEnd();
            case "seq_id_begin":
                return getSeqIdBegin();
            case "seq_id_end":
                return getSeqIdEnd();
            case "residue_range_granularity":
                return getResidueRangeGranularity();
            case "rep_atom":
                return getRepAtom();
            case "interface_residue_flag":
                return getInterfaceResidueFlag();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the selected residue / residue range feature.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier for residue / residue range.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the residue / residue range, if applicable.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The component identifier of the beginning residue / residue range.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompIdBegin() {
        return delegate.getColumn("comp_id_begin", DelegatingStrColumn::new);
    }

    /**
     * The component identifier of the ending residue / residue range.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompIdEnd() {
        return delegate.getColumn("comp_id_end", DelegatingStrColumn::new);
    }

    /**
     * The sequence index of the beginning residue / residue range.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The sequence index of the ending residue / residue range.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * The coarse-graining information, if the feature is a residue range.
     * @return StrColumn
     */
    public StrColumn getResidueRangeGranularity() {
        return delegate.getColumn("residue_range_granularity", DelegatingStrColumn::new);
    }

    /**
     * If _ihm_poly_residue_feature.granularity is by-residue, then indicate the atom used to represent
     * the residue in three-dimension. Default is the C-alpha atom.
     * @return StrColumn
     */
    public StrColumn getRepAtom() {
        return delegate.getColumn("rep_atom", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the feature is an interface residue, identified by experiments and
     * therefore, used to build spatial restraints during modeling.
     * @return StrColumn
     */
    public StrColumn getInterfaceResidueFlag() {
        return delegate.getColumn("interface_residue_flag", DelegatingStrColumn::new);
    }

}