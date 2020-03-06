package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the DIGEST steps used in
 * the overall protein production process. The digestion is assumed
 * to be applied to the result of the previous production step, or the
 * gene source if this is the first production step.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenProdDigest extends DelegatingCategory {
    public PdbxEntitySrcGenProdDigest(Category delegate) {
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
            case "restriction_enzyme_1":
                return getRestrictionEnzyme1();
            case "restriction_enzyme_2":
                return getRestrictionEnzyme2();
            case "purification_details":
                return getPurificationDetails();
            case "summary":
                return getSummary();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_digest.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_digest.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category. This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this digestion step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return delegate.getColumn("next_step_id", DelegatingIntColumn::new);
    }

    /**
     * This item is a pointer to pdbx_construct.id in the
     * PDBX_CONSTRUCT category. The referenced nucleic acid sequence
     * is that of the digest product
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return delegate.getColumn("end_construct_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
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
     * The first enzyme used in the restriction digestion. The sites at
     * which this cuts can be derived from the sequence.
     * @return StrColumn
     */
    public StrColumn getRestrictionEnzyme1() {
        return delegate.getColumn("restriction_enzyme_1", DelegatingStrColumn::new);
    }

    /**
     * The second enzyme used in the restriction digestion. The sites at
     * which this cuts can be derived from the sequence.
     * @return StrColumn
     */
    public StrColumn getRestrictionEnzyme2() {
        return delegate.getColumn("restriction_enzyme_2", DelegatingStrColumn::new);
    }

    /**
     * String value containing details of any purification of the
     * product of the digestion.
     * @return StrColumn
     */
    public StrColumn getPurificationDetails() {
        return delegate.getColumn("purification_details", DelegatingStrColumn::new);
    }

    /**
     * Summary of the details of restriction digestion any purification of the
     * product of the digestion.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return delegate.getColumn("summary", DelegatingStrColumn::new);
    }

}