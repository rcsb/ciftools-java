package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Gives information about what kind of coordinates are available.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxCoord extends BaseCategory {
    public PdbxCoord(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxCoord(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxCoord(String name) {
        super(name);
    }

    /**
     * The entry identifier.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Gives information if the coordinates for the main chain atoms
     * are available.
     * @return StrColumn
     */
    public StrColumn getChainAtomsYP() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chain_atoms_Y_P", StrColumn::new) :
                getBinaryColumn("chain_atoms_Y_P"));
    }

    /**
     * Gives information if the coordinates for hydrogen atoms
     * are available.
     * @return StrColumn
     */
    public StrColumn getHydrogenAtomsYN() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hydrogen_atoms_Y_N", StrColumn::new) :
                getBinaryColumn("hydrogen_atoms_Y_N"));
    }

    /**
     * Gives information if the coordinates for solvent atoms
     * are available.
     * @return StrColumn
     */
    public StrColumn getSolventAtomsYN() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("solvent_atoms_Y_N", StrColumn::new) :
                getBinaryColumn("solvent_atoms_Y_N"));
    }

    /**
     * Gives information if the structure factors for this entry
     * are available.
     * @return StrColumn
     */
    public StrColumn getStructureFactorsYN() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("structure_factors_Y_N", StrColumn::new) :
                getBinaryColumn("structure_factors_Y_N"));
    }
}
