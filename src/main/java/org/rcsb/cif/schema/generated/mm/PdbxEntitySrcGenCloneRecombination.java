package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the recombination-based cloning steps
 * used in the overall protein production process. It is assumed that these
 * reactions will use commercially available kits.
 * _pdbx_entity_src_gen_clone_recombination.clone_step_id in this category
 * must point at a defined _pdbx_entity_src_gen_clone.step_id. The details in
 * PDBX_ENTITY_SRC_GEN_CLONE_RECOMBINATION extend the details in PDBX_ENTITY_SRC_GEN_CLONE
 * to cover recombination dependent cloning steps.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenCloneRecombination extends DelegatingCategory {
    public PdbxEntitySrcGenCloneRecombination(Category delegate) {
        super(delegate);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entry_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.entity_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_clone.step_id in the
     * PDBX_ENTITY_SRC_GEN_CLONE category.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the recombination system.
     * @return StrColumn
     */
    public StrColumn getSystem() {
        return delegate.getColumn("system", DelegatingStrColumn::new);
    }

    /**
     * The names of the enzymes used for this recombination step.
     * @return StrColumn
     */
    public StrColumn getRecombinationEnzymes() {
        return delegate.getColumn("recombination_enzymes", DelegatingStrColumn::new);
    }

    /**
     * Any details to be associated with this recombination step, e.g. the protocol
     * or differences from the manufacturer's specified protocol.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
