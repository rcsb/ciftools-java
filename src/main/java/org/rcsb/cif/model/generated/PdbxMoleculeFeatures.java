package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_MOLECULE_FEATURES category record features of molecules
 * within a PDB entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxMoleculeFeatures extends BaseCategory {
    public PdbxMoleculeFeatures(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxMoleculeFeatures(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxMoleculeFeatures(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_molecule_features.prd_id is the PDB accession code for this
     * reference molecule.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * Broadly defines the function of the molecule.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * Defines the structural classification of the molecule.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A name of the molecule.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Additional details describing the molecule.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
