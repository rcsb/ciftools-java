package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_REFERENCE_MOLECULE_LIST category record
 * reference information about small polymer molecules.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferenceMoleculeList extends BaseCategory {
    public PdbxReferenceMoleculeList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceMoleculeList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceMoleculeList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_molecule_list.prd_id is the unique identifier
     * for the reference molecule in this family.
     * 
     * By convention this ID uniquely identifies the reference molecule in
     * in the PDB reference dictionary.
     * 
     * The ID has the template form PRD_dddddd (e.g. PRD_000001)
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_molecule_list.family_prd_id is a reference to
     * _pdbx_reference_molecule_family.family_prd_id' in category PDBX_REFERENCE_MOLECULE_FAMILY.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("family_prd_id", StrColumn::new) :
                getBinaryColumn("family_prd_id"));
    }
}
