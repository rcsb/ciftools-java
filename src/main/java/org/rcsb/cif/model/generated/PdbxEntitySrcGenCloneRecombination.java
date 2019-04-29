package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the recombination-based cloning steps
 * used in the overall protein production process. It is assumed that these
 * reactions will use commercially available kits.
 * _pdbx_entity_src_gen_clone_recombination.clone_step_id in this category
 * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
 * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
 * to cover recombination dependent cloning steps.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entity_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.step_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * The name of the recombination system.
     * @return StrColumn
     */
    public StrColumn getSystem() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("system", StrColumn::new) :
                getBinaryColumn("system"));
    }

    /**
     * The names of the enzymes used for this recombination step.
     * @return StrColumn
     */
    public StrColumn getRecombinationEnzymes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("recombination_enzymes", StrColumn::new) :
                getBinaryColumn("recombination_enzymes"));
    }

    /**
     * Any details to be associated with this recombination step, e.g. the protocol
     * or differences from the manufacturer's specified protocol.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
