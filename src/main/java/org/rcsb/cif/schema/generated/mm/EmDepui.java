package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Some internal items to power the deposition interface
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDepui extends DelegatingCategory {
    public EmDepui(Category delegate) {
        super(delegate);
    }

    /**
     * Choose the manner in which you would like the map and associated files (half
     * maps, additional maps, masks, FSC curves, structure factors, layer lines, and
     * images) to be released.  Release of these files can be delayed either until
     * publication of the associated primary citation or until one year after completion
     * of the deposition. It is the responsibility of the depositor to notify the EMDB when
     * the primary citation has been published. Please note that map-associated
     * experimental information and metadata (header data) are made available to the
     * public when an entry is placed on hold.
     * @return StrColumn
     */
    public StrColumn getDepositorHoldInstructions() {
        return delegate.getColumn("depositor_hold_instructions", DelegatingStrColumn::new);
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Indicates whether the authors are providing a macromolecule level description of their sample
     * @return StrColumn
     */
    public StrColumn getMacromoleculeDescription() {
        return delegate.getColumn("macromolecule_description", DelegatingStrColumn::new);
    }

    /**
     * Instruction for annotators on why a previous released entry should be obsoleted.
     * Example of valid request:
     * * Author wants to replace a map that has already been released, following discovery of a processing error
     * Examples of invalid requests:
     * * Someone other than the author wants to obsolete a map.
     * * Legal conflict of interest
     * Obsoletion is not required for the following actions:
     * * to change released metadata info.
     * * to update the map of an HPUB entry.
     * * to change the hand of a released map.
     * * to deposit an improved version of a released map.
     * @return StrColumn
     */
    public StrColumn getObsoleteInstructions() {
        return delegate.getColumn("obsolete_instructions", DelegatingStrColumn::new);
    }

    /**
     * Indicates whether the authors for the EMDB entry are the same as for the PDB entry
     * in a joint map + model deposition
     * @return StrColumn
     */
    public StrColumn getSameAuthorsAsPdb() {
        return delegate.getColumn("same_authors_as_pdb", DelegatingStrColumn::new);
    }

    /**
     * Indicates whether the title for the EMDB entry is the same as for the PDB entry
     * in a joint map + model deposition
     * @return StrColumn
     */
    public StrColumn getSameTitleAsPdb() {
        return delegate.getColumn("same_title_as_pdb", DelegatingStrColumn::new);
    }
}
