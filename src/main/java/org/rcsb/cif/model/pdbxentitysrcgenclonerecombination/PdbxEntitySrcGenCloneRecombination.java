package org.rcsb.cif.model.pdbxentitysrcgenclonerecombination;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenCloneRecombination extends BaseCategory {
    public PdbxEntitySrcGenCloneRecombination(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenCloneRecombination(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenCloneRecombination(String name) {
        super(name);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entry_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entity_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.step_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * The name of the recombination system.
     * @return System
     */
    public System getSystem() {
        return (System) (isText ? textFields.computeIfAbsent("system",
                System::new) : getBinaryColumn("system"));
    }

    /**
     * The names of the enzymes used for this recombination step.
     * @return RecombinationEnzymes
     */
    public RecombinationEnzymes getRecombinationEnzymes() {
        return (RecombinationEnzymes) (isText ? textFields.computeIfAbsent("recombination_enzymes",
                RecombinationEnzymes::new) : getBinaryColumn("recombination_enzymes"));
    }

    /**
     * Any details to be associated with this recombination step, e.g. the protocol
     * or differences from the manufacturer's specified protocol.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
