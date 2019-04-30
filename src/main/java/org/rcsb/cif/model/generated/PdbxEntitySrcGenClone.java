package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the cloning steps used in
 * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
 * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
 * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is
 * provided data in the later two categories may be omitted.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_clone.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this cloning step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step.
     * This allows a workflow to have multiple entry points leading
     * to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("next_step_id", IntColumn::new) :
                getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced nucleic acid sequence is that of the
     * cloned product.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_construct_id", StrColumn::new) :
                getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("robot_id", StrColumn::new) :
                getBinaryColumn("robot_id"));
    }

    /**
     * The date of this production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * The method used to insert the gene into the vector. For 'Ligation', an
     * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION entry with matching .step_id is expected. For
     * 'Recombination', an PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION entry with matching
     * .step_id is expected.
     * @return StrColumn
     */
    public StrColumn getGeneInsertMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_insert_method", StrColumn::new) :
                getBinaryColumn("gene_insert_method"));
    }

    /**
     * The name of the vector used in this cloning step.
     * @return StrColumn
     */
    public StrColumn getVectorName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("vector_name", StrColumn::new) :
                getBinaryColumn("vector_name"));
    }

    /**
     * Details of any modifications made to the named vector.
     * @return StrColumn
     */
    public StrColumn getVectorDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("vector_details", StrColumn::new) :
                getBinaryColumn("vector_details"));
    }

    /**
     * The method used to transform the expression cell line with the vector
     * @return StrColumn
     */
    public StrColumn getTransformationMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("transformation_method", StrColumn::new) :
                getBinaryColumn("transformation_method"));
    }

    /**
     * The type of marker included to allow selection of transformed cells
     * @return StrColumn
     */
    public StrColumn getMarker() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("marker", StrColumn::new) :
                getBinaryColumn("marker"));
    }

    /**
     * The method used to verify that the incorporated gene is correct
     * @return StrColumn
     */
    public StrColumn getVerificationMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("verification_method", StrColumn::new) :
                getBinaryColumn("verification_method"));
    }

    /**
     * Details of any purification of the product.
     * @return StrColumn
     */
    public StrColumn getPurificationDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("purification_details", StrColumn::new) :
                getBinaryColumn("purification_details"));
    }

    /**
     * Summary of ligation or recombionation cloning used, the associated
     * verification method and any purification of the product.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("summary", StrColumn::new) :
                getBinaryColumn("summary"));
    }
}
