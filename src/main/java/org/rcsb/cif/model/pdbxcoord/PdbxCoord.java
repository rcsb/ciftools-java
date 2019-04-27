package org.rcsb.cif.model.pdbxcoord;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Gives information if the coordinates for the main chain atoms
     * are available.
     * @return ChainAtomsYP
     */
    public ChainAtomsYP getChainAtomsYP() {
        return (ChainAtomsYP) (isText ? textFields.computeIfAbsent("chain_atoms_Y_P",
                ChainAtomsYP::new) : getBinaryColumn("chain_atoms_Y_P"));
    }

    /**
     * Gives information if the coordinates for hydrogen atoms
     * are available.
     * @return HydrogenAtomsYN
     */
    public HydrogenAtomsYN getHydrogenAtomsYN() {
        return (HydrogenAtomsYN) (isText ? textFields.computeIfAbsent("hydrogen_atoms_Y_N",
                HydrogenAtomsYN::new) : getBinaryColumn("hydrogen_atoms_Y_N"));
    }

    /**
     * Gives information if the coordinates for solvent atoms
     * are available.
     * @return SolventAtomsYN
     */
    public SolventAtomsYN getSolventAtomsYN() {
        return (SolventAtomsYN) (isText ? textFields.computeIfAbsent("solvent_atoms_Y_N",
                SolventAtomsYN::new) : getBinaryColumn("solvent_atoms_Y_N"));
    }

    /**
     * Gives information if the structure factors for this entry
     * are available.
     * @return StructureFactorsYN
     */
    public StructureFactorsYN getStructureFactorsYN() {
        return (StructureFactorsYN) (isText ? textFields.computeIfAbsent("structure_factors_Y_N",
                StructureFactorsYN::new) : getBinaryColumn("structure_factors_Y_N"));
    }
}
