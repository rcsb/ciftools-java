package org.rcsb.cif.model.generated.pdbxentitysrcgenexpresstimepoint;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenExpressTimepoint extends BaseCategory {
    public PdbxEntitySrcGenExpressTimepoint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenExpressTimepoint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenExpressTimepoint(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_express_timepoint.entry_id is a pointer
     * to _pdbx_entity_src_gen_express.entry_id
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_express_timepoint.entity_id is a pointer
     * to _pdbx_entity_src_gen_express.entity_id
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_express.step_id
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * This items uniquely defines a timepoint within a series.
     * @return Serial
     */
    public Serial getSerial() {
        return (Serial) (isText ? textFields.computeIfAbsent("serial",
                Serial::new) : getBinaryColumn("serial"));
    }

    /**
     * The optical density of the expression culture in arbitrary units at the
     * timepoint specified.
     * @return OD
     */
    public OD getOD() {
        return (OD) (isText ? textFields.computeIfAbsent("OD",
                OD::new) : getBinaryColumn("OD"));
    }

    /**
     * The time in hours after induction/transformation/transfection at which
     * the optical density of the culture was measured.
     * @return Time
     */
    public Time getTime() {
        return (Time) (isText ? textFields.computeIfAbsent("time",
                Time::new) : getBinaryColumn("time"));
    }
}
