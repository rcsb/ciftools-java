package org.rcsb.cif.model.generated.pdbxmolecule;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import java.util.Map;

public class PdbxMolecule extends BaseCifCategory {
    public PdbxMolecule(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxMolecule(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The value of _pdbx_molecule.prd_id is the PDB accession code for this
     * reference molecule.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? getTextColumn("prd_id") : getBinaryColumn("prd_id", "PrdId"));
    }

    /**
     * The value of _pdbx_molecule.instance_id is identifies a particular molecule
     * in the molecule list.
     * @return InstanceId
     */
    public InstanceId getInstanceId() {
        return (InstanceId) (isText ? getTextColumn("instance_id") : getBinaryColumn("instance_id", "InstanceId"));
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? getTextColumn("asym_id") : getBinaryColumn("asym_id", "AsymId"));
    }
}
