package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the cloning steps used in
 * the overall protein production process. Each row in PDBX_ENTITY_SRC_GEN_CLONE
 * should have an equivalent row in either PDBX_ENTITY_SRC_GEN_CLONE_LIGATION or
 * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION.  If only summary information is
 * provided data in the later two categories may be omitted.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenClone extends DelegatingCategory {
    public PdbxEntitySrcGenClone(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "step_id":
                return getStepId();
            case "next_step_id":
                return getNextStepId();
            case "end_construct_id":
                return getEndConstructId();
            case "robot_id":
                return getRobotId();
            case "date":
                return getDate();
            case "gene_insert_method":
                return getGeneInsertMethod();
            case "vector_name":
                return getVectorName();
            case "vector_details":
                return getVectorDetails();
            case "transformation_method":
                return getTransformationMethod();
            case "marker":
                return getMarker();
            case "verification_method":
                return getVerificationMethod();
            case "purification_details":
                return getPurificationDetails();
            case "summary":
                return getSummary();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_clone.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_clone.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this cloning step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * This item unique identifier for the next production step.
     * This allows a workflow to have multiple entry points leading
     * to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return delegate.getColumn("next_step_id", DelegatingIntColumn::new);
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced nucleic acid sequence is that of the
     * cloned product.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return delegate.getColumn("end_construct_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return delegate.getColumn("robot_id", DelegatingStrColumn::new);
    }

    /**
     * The date of this production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * The method used to insert the gene into the vector. For 'Ligation', an
     * PDBX_ENTITY_SRC_GEN_CLONE_LIGATION entry with matching .step_id is expected. For
     * 'Recombination', an PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION entry with matching
     * .step_id is expected.
     * @return StrColumn
     */
    public StrColumn getGeneInsertMethod() {
        return delegate.getColumn("gene_insert_method", DelegatingStrColumn::new);
    }

    /**
     * The name of the vector used in this cloning step.
     * @return StrColumn
     */
    public StrColumn getVectorName() {
        return delegate.getColumn("vector_name", DelegatingStrColumn::new);
    }

    /**
     * Details of any modifications made to the named vector.
     * @return StrColumn
     */
    public StrColumn getVectorDetails() {
        return delegate.getColumn("vector_details", DelegatingStrColumn::new);
    }

    /**
     * The method used to transform the expression cell line with the vector
     * @return StrColumn
     */
    public StrColumn getTransformationMethod() {
        return delegate.getColumn("transformation_method", DelegatingStrColumn::new);
    }

    /**
     * The type of marker included to allow selection of transformed cells
     * @return StrColumn
     */
    public StrColumn getMarker() {
        return delegate.getColumn("marker", DelegatingStrColumn::new);
    }

    /**
     * The method used to verify that the incorporated gene is correct
     * @return StrColumn
     */
    public StrColumn getVerificationMethod() {
        return delegate.getColumn("verification_method", DelegatingStrColumn::new);
    }

    /**
     * Details of any purification of the product.
     * @return StrColumn
     */
    public StrColumn getPurificationDetails() {
        return delegate.getColumn("purification_details", DelegatingStrColumn::new);
    }

    /**
     * Summary of ligation or recombionation cloning used, the associated
     * verification method and any purification of the product.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return delegate.getColumn("summary", DelegatingStrColumn::new);
    }

}