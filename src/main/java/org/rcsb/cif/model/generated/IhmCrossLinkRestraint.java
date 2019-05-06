package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_CROSS_LINK_RESTRAINT category enumerates the
 * implementation details of the chemical crosslinking restraints in
 * the integrative modeling. This category holds the details of how
 * the experimentally derived crosslinks are applied in the modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmCrossLinkRestraint extends BaseCategory {
    public IhmCrossLinkRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmCrossLinkRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmCrossLinkRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the cross link record.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier for a set of ambiguous cross-links.
     * Handles implementation uncertainties related to multiple copies of subunit.
     * This data item is a pointer to _ihm_cross_link_list.id in the
     * IHM_CROSS_LINK_LIST category.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("group_id", IntColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * The entity identifier for the first monomer partner in the cross link
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.entity_id_1 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_1", StrColumn::new) :
                getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity identifier for the second monomer partner in the cross link
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.entity_id_2 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_2", StrColumn::new) :
                getBinaryColumn("entity_id_2"));
    }

    /**
     * An asym/strand identifier for the first monomer partner in the cross-link.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id_1", StrColumn::new) :
                getBinaryColumn("asym_id_1"));
    }

    /**
     * An asym/strand identifier for the second monomer partner in the cross-link.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id_2", StrColumn::new) :
                getBinaryColumn("asym_id_2"));
    }

    /**
     * The component identifier for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.comp_id_1 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.comp_id_2 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The sequence index for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.seq_id_1 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_1", IntColumn::new) :
                getBinaryColumn("seq_id_1"));
    }

    /**
     * The sequence index for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category
     * and the _ihm_cross_link_restraint.seq_id_2 in the IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_2", IntColumn::new) :
                getBinaryColumn("seq_id_2"));
    }

    /**
     * The atom identifier for the first monomer partner in the cross link.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom identifier for the second monomer partner in the cross link.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The type of the cross link restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("restraint_type", StrColumn::new) :
                getBinaryColumn("restraint_type"));
    }

    /**
     * The cross link conditionality.
     * @return StrColumn
     */
    public StrColumn getConditionalCrosslinkFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conditional_crosslink_flag", StrColumn::new) :
                getBinaryColumn("conditional_crosslink_flag"));
    }

    /**
     * The coarse-graining information for the crosslink implementation.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_granularity", StrColumn::new) :
                getBinaryColumn("model_granularity"));
    }

    /**
     * The distance threshold applied to this crosslink in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceThreshold() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_threshold", FloatColumn::new) :
                getBinaryColumn("distance_threshold"));
    }

    /**
     * The uncertainty in the crosslinking experimental data;
     * may be approximated to the false positive rate.
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("psi", FloatColumn::new) :
                getBinaryColumn("psi"));
    }

    /**
     * The uncertainty in the position of residue 1 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_1", FloatColumn::new) :
                getBinaryColumn("sigma_1"));
    }

    /**
     * The uncertainty in the position of residue 2 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sigma_2", FloatColumn::new) :
                getBinaryColumn("sigma_2"));
    }
}
