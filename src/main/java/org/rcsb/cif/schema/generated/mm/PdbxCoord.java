package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Gives information about what kind of coordinates are available.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxCoord extends DelegatingCategory {
    public PdbxCoord(Category delegate) {
        super(delegate);
    }

    /**
     * The entry identifier.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Gives information if the coordinates for the main chain atoms
     * are available.
     * @return StrColumn
     */
    public StrColumn getChainAtomsYP() {
        return delegate.getColumn("chain_atoms_Y_P", DelegatingStrColumn::new);
    }

    /**
     * Gives information if the coordinates for hydrogen atoms
     * are available.
     * @return StrColumn
     */
    public StrColumn getHydrogenAtomsYN() {
        return delegate.getColumn("hydrogen_atoms_Y_N", DelegatingStrColumn::new);
    }

    /**
     * Gives information if the coordinates for solvent atoms
     * are available.
     * @return StrColumn
     */
    public StrColumn getSolventAtomsYN() {
        return delegate.getColumn("solvent_atoms_Y_N", DelegatingStrColumn::new);
    }

    /**
     * Gives information if the structure factors for this entry
     * are available.
     * @return StrColumn
     */
    public StrColumn getStructureFactorsYN() {
        return delegate.getColumn("structure_factors_Y_N", DelegatingStrColumn::new);
    }
}
