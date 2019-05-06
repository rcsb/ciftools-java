package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Some internal items to power the deposition interface
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmDepui extends BaseCategory {
    public EmDepui(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDepui(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDepui(String name) {
        super(name);
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("depositor_hold_instructions", StrColumn::new) :
                getBinaryColumn("depositor_hold_instructions"));
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Indicates whether the authors are providing a macromolecule level description of their sample
     * @return StrColumn
     */
    public StrColumn getMacromoleculeDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("macromolecule_description", StrColumn::new) :
                getBinaryColumn("macromolecule_description"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("obsolete_instructions", StrColumn::new) :
                getBinaryColumn("obsolete_instructions"));
    }

    /**
     * Indicates whether the authors for the EMDB entry are the same as for the PDB entry
     * in a joint map + model deposition
     * @return StrColumn
     */
    public StrColumn getSameAuthorsAsPdb() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("same_authors_as_pdb", StrColumn::new) :
                getBinaryColumn("same_authors_as_pdb"));
    }

    /**
     * Indicates whether the title for the EMDB entry is the same as for the PDB entry
     * in a joint map + model deposition
     * @return StrColumn
     */
    public StrColumn getSameTitleAsPdb() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("same_title_as_pdb", StrColumn::new) :
                getBinaryColumn("same_title_as_pdb"));
    }
}
