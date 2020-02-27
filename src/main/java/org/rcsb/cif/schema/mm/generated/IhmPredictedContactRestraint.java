package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_PREDICTED_CONTACT_RESTRAINT category records the
 * list of predicted contacts used in the integrative modeling experiment.
 * This has been adapted from the widely used CASP RR format
 * (http://www.predictioncenter.org/casp8/index.cgi?page=format#RR).
 * These contacts may be derived from various computational tools.
 * The software information can be provided in the SOFTWARE category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmPredictedContactRestraint extends BaseCategory {
    public IhmPredictedContactRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmPredictedContactRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmPredictedContactRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the predicted contact restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier to group the predicted contacts.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("group_id", IntColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * A text description of molecular entity 1.
     * @return StrColumn
     */
    public StrColumn getEntityDescription1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description_1", StrColumn::new) :
                getBinaryColumn("entity_description_1"));
    }

    /**
     * A text description of molecular entity 2.
     * @return StrColumn
     */
    public StrColumn getEntityDescription2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description_2", StrColumn::new) :
                getBinaryColumn("entity_description_2"));
    }

    /**
     * The entity identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_1", StrColumn::new) :
                getBinaryColumn("entity_id_1"));
    }

    /**
     * The entity identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id_2", StrColumn::new) :
                getBinaryColumn("entity_id_2"));
    }

    /**
     * An asym/strand identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id_1", StrColumn::new) :
                getBinaryColumn("asym_id_1"));
    }

    /**
     * An asym/strand identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id_2", StrColumn::new) :
                getBinaryColumn("asym_id_2"));
    }

    /**
     * The component identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_1", StrColumn::new) :
                getBinaryColumn("comp_id_1"));
    }

    /**
     * The component identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id_2", StrColumn::new) :
                getBinaryColumn("comp_id_2"));
    }

    /**
     * The sequence index for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_1", IntColumn::new) :
                getBinaryColumn("seq_id_1"));
    }

    /**
     * The sequence index for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_2", IntColumn::new) :
                getBinaryColumn("seq_id_2"));
    }

    /**
     * The atom id of the first partner in the predicted contact.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The atom id of the second partner in the predicted contact.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The lower limit to the distance threshold applied to this predicted contact restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_lower_limit", FloatColumn::new) :
                getBinaryColumn("distance_lower_limit"));
    }

    /**
     * The upper limit to the distance threshold applied to this predicted contact restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_upper_limit", FloatColumn::new) :
                getBinaryColumn("distance_upper_limit"));
    }

    /**
     * The real number that indicates the probability that the predicted distance restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("probability", FloatColumn::new) :
                getBinaryColumn("probability"));
    }

    /**
     * The type of distance restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("restraint_type", StrColumn::new) :
                getBinaryColumn("restraint_type"));
    }

    /**
     * The granularity of the predicted contact as applied to the multi-scale model.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_granularity", StrColumn::new) :
                getBinaryColumn("model_granularity"));
    }

    /**
     * Identifier to the predicted contacts dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * Identifier to the software used to obtain the predicted contacts dataset.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }
}
