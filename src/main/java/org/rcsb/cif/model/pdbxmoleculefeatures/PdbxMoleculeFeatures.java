package org.rcsb.cif.model.pdbxmoleculefeatures;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxMoleculeFeatures extends BaseCifCategory {
    public PdbxMoleculeFeatures(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxMoleculeFeatures(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The value of _pdbx_molecule_features.prd_id is the PDB accession code for this
     * reference molecule.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? getTextColumn("prd_id") : getBinaryColumn("prd_id"));
    }

    /**
     * Broadly defines the function of the molecule.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? getTextColumn("class") : getBinaryColumn("class"));
    }

    /**
     * Defines the structural classification of the molecule.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type"));
    }

    /**
     * A name of the molecule.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? getTextColumn("name") : getBinaryColumn("name"));
    }

    /**
     * Additional details describing the molecule.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details"));
    }
}
