package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_POLY_RESIDUE_FEATURE category provides the defintions
 * required to select a specific residue or a set of residues that may or may not be
 * in a contiguous range.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmPolyResidueFeature extends BaseCategory {
    public IhmPolyResidueFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmPolyResidueFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmPolyResidueFeature(String name) {
        super(name);
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the selected residue / residue range feature.
     * This data item is a pointer to _ihm_feature_list.feature_id in the
     * IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * The entity identifier for residue / residue range.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * An asym/strand identifier for the residue / residue range, if applicable.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The component identifier of the beginning residue / residue range.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompIdBegin() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_begin", StrColumn::new) :
                getBinaryColumn("comp_id_begin"));
    }

    /**
     * The component identifier of the ending residue / residue range.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompIdEnd() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_end", StrColumn::new) :
                getBinaryColumn("comp_id_end"));
    }

    /**
     * The sequence index of the beginning residue / residue range.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The sequence index of the ending residue / residue range.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }

    /**
     * The coarse-graining information, if the feature is a residue range.
     * @return StrColumn
     */
    public StrColumn getResidueRangeGranularity() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("residue_range_granularity", StrColumn::new) :
                getBinaryColumn("residue_range_granularity"));
    }

    /**
     * If _ihm_poly_residue_feature.granularity is by-residue, then indicate the atom used to represent
     * the residue in three-dimension. Default is the C-alpha atom.
     * @return StrColumn
     */
    public StrColumn getRepAtom() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("rep_atom", StrColumn::new) :
                getBinaryColumn("rep_atom"));
    }

    /**
     * A flag to indicate if the feature is an interface residue, identified by experiments and
     * therefore, used to build spatial restraints during modeling.
     * @return StrColumn
     */
    public StrColumn getInterfaceResidueFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("interface_residue_flag", StrColumn::new) :
                getBinaryColumn("interface_residue_flag"));
    }
}
