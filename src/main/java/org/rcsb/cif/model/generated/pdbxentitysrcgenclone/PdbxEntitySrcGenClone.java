package org.rcsb.cif.model.generated.pdbxentitysrcgenclone;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenClone extends BaseCategory {
    public PdbxEntitySrcGenClone(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenClone(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenClone(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_clone.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_clone.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this cloning step.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step.
     * This allows a workflow to have multiple entry points leading
     * to a single product.
     * @return NextStepId
     */
    public NextStepId getNextStepId() {
        return (NextStepId) (isText ? textFields.computeIfAbsent("next_step_id",
                NextStepId::new) : getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced nucleic acid sequence is that of the
     * cloned product.
     * @return EndConstructId
     */
    public EndConstructId getEndConstructId() {
        return (EndConstructId) (isText ? textFields.computeIfAbsent("end_construct_id",
                EndConstructId::new) : getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category.
     * @return RobotId
     */
    public RobotId getRobotId() {
        return (RobotId) (isText ? textFields.computeIfAbsent("robot_id",
                RobotId::new) : getBinaryColumn("robot_id"));
    }

    /**
     * The date of this production step.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * The method used to insert the gene into the vector. For 'Ligation', an
     * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION entry with matching .step_id is expected. For
     * 'Recombination', an PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION entry with matching
     * .step_id is expected.
     * @return GeneInsertMethod
     */
    public GeneInsertMethod getGeneInsertMethod() {
        return (GeneInsertMethod) (isText ? textFields.computeIfAbsent("gene_insert_method",
                GeneInsertMethod::new) : getBinaryColumn("gene_insert_method"));
    }

    /**
     * The name of the vector used in this cloning step.
     * @return VectorName
     */
    public VectorName getVectorName() {
        return (VectorName) (isText ? textFields.computeIfAbsent("vector_name",
                VectorName::new) : getBinaryColumn("vector_name"));
    }

    /**
     * Details of any modifications made to the named vector.
     * @return VectorDetails
     */
    public VectorDetails getVectorDetails() {
        return (VectorDetails) (isText ? textFields.computeIfAbsent("vector_details",
                VectorDetails::new) : getBinaryColumn("vector_details"));
    }

    /**
     * The method used to transform the expression cell line with the vector
     * @return TransformationMethod
     */
    public TransformationMethod getTransformationMethod() {
        return (TransformationMethod) (isText ? textFields.computeIfAbsent("transformation_method",
                TransformationMethod::new) : getBinaryColumn("transformation_method"));
    }

    /**
     * The type of marker included to allow selection of transformed cells
     * @return Marker
     */
    public Marker getMarker() {
        return (Marker) (isText ? textFields.computeIfAbsent("marker",
                Marker::new) : getBinaryColumn("marker"));
    }

    /**
     * The method used to verify that the incorporated gene is correct
     * @return VerificationMethod
     */
    public VerificationMethod getVerificationMethod() {
        return (VerificationMethod) (isText ? textFields.computeIfAbsent("verification_method",
                VerificationMethod::new) : getBinaryColumn("verification_method"));
    }

    /**
     * Details of any purification of the product.
     * @return PurificationDetails
     */
    public PurificationDetails getPurificationDetails() {
        return (PurificationDetails) (isText ? textFields.computeIfAbsent("purification_details",
                PurificationDetails::new) : getBinaryColumn("purification_details"));
    }

    /**
     * Summary of ligation or recombionation cloning used, the associated
     * verification method and any purification of the product.
     * @return Summary
     */
    public Summary getSummary() {
        return (Summary) (isText ? textFields.computeIfAbsent("summary",
                Summary::new) : getBinaryColumn("summary"));
    }
}
