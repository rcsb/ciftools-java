package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the PCR steps used in
 * the overall protein production process. The PCR is assumed
 * to be applied to the result of the previous production step, or the
 * gene source if this is the first production step.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntitySrcGenProdPcr extends BaseCategory {
    public PdbxEntitySrcGenProdPcr(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenProdPcr(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenProdPcr(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_pcr.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_prod_pcr.entity_id uniquely identifies
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
     * This item is the unique identifier for this PCR step.
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
     * PCR product.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_construct_id", StrColumn::new) :
                getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category. The referenced robot is the
     * robot responsible for the PCR reaction (normally the heat
     * cycler).
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
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The referenced nucleic acid sequence is that of the forward primer.
     * @return StrColumn
     */
    public StrColumn getForwardPrimerId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("forward_primer_id", StrColumn::new) :
                getBinaryColumn("forward_primer_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The referenced nucleic acid sequence is that of the reverse primer.
     * @return StrColumn
     */
    public StrColumn getReversePrimerId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reverse_primer_id", StrColumn::new) :
                getBinaryColumn("reverse_primer_id"));
    }

    /**
     * String value containing details of the PCR reaction.
     * @return StrColumn
     */
    public StrColumn getReactionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reaction_details", StrColumn::new) :
                getBinaryColumn("reaction_details"));
    }

    /**
     * String value containing details of any purification of the
     * product of the PCR reaction.
     * @return StrColumn
     */
    public StrColumn getPurificationDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("purification_details", StrColumn::new) :
                getBinaryColumn("purification_details"));
    }

    /**
     * Summary of the details of the PCR reaction any purification of the
     * product of the PCR reaction.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("summary", StrColumn::new) :
                getBinaryColumn("summary"));
    }
}
