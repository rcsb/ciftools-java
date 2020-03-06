package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_PREDICTED_CONTACT_RESTRAINT category records the
 * list of predicted contacts used in the integrative modeling experiment.
 * This has been adapted from the widely used CASP RR format
 * (http://www.predictioncenter.org/casp8/index.cgi?page=format#RR).
 * These contacts may be derived from various computational tools.
 * The software information can be provided in the SOFTWARE category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPredictedContactRestraint extends DelegatingCategory {
    public IhmPredictedContactRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "group_id":
                return getGroupId();
            case "entity_description_1":
                return getEntityDescription1();
            case "entity_description_2":
                return getEntityDescription2();
            case "entity_id_1":
                return getEntityId1();
            case "entity_id_2":
                return getEntityId2();
            case "asym_id_1":
                return getAsymId1();
            case "asym_id_2":
                return getAsymId2();
            case "comp_id_1":
                return getCompId1();
            case "comp_id_2":
                return getCompId2();
            case "seq_id_1":
                return getSeqId1();
            case "seq_id_2":
                return getSeqId2();
            case "rep_atom_1":
                return getRepAtom1();
            case "rep_atom_2":
                return getRepAtom2();
            case "distance_lower_limit":
                return getDistanceLowerLimit();
            case "distance_upper_limit":
                return getDistanceUpperLimit();
            case "probability":
                return getProbability();
            case "restraint_type":
                return getRestraintType();
            case "model_granularity":
                return getModelGranularity();
            case "dataset_list_id":
                return getDatasetListId();
            case "software_id":
                return getSoftwareId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the predicted contact restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to group the predicted contacts.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * A text description of molecular entity 1.
     * @return StrColumn
     */
    public StrColumn getEntityDescription1() {
        return delegate.getColumn("entity_description_1", DelegatingStrColumn::new);
    }

    /**
     * A text description of molecular entity 2.
     * @return StrColumn
     */
    public StrColumn getEntityDescription2() {
        return delegate.getColumn("entity_description_2", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return delegate.getColumn("asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return delegate.getColumn("asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * If _ihm_predicted_contact_restraint.model_granularity is by-residue, then indicate the atom
     * used to represent the first monomer partner in three-dimension. Default is the C-alpha atom.
     * @return StrColumn
     */
    public StrColumn getRepAtom1() {
        return delegate.getColumn("rep_atom_1", DelegatingStrColumn::new);
    }

    /**
     * If _ihm_predicted_contact_restraint.model_granularity is by-residue, then indicate the atom
     * used to represent the second monomer partner in three-dimension. Default is the C-alpha atom.
     * @return StrColumn
     */
    public StrColumn getRepAtom2() {
        return delegate.getColumn("rep_atom_2", DelegatingStrColumn::new);
    }

    /**
     * The lower limit to the distance threshold applied to this predicted contact restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return delegate.getColumn("distance_lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit to the distance threshold applied to this predicted contact restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return delegate.getColumn("distance_upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The real number that indicates the probability that the predicted distance restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return delegate.getColumn("probability", DelegatingFloatColumn::new);
    }

    /**
     * The type of distance restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The granularity of the predicted contact as applied to the multi-scale model.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return delegate.getColumn("model_granularity", DelegatingStrColumn::new);
    }

    /**
     * Identifier to the predicted contacts dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the software used to obtain the predicted contacts dataset.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

}