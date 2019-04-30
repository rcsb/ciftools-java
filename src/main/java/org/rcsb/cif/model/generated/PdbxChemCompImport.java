package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_IMPORT category identify
 * existing chemical components to be imported into the
 * current component definition.  Components in this list
 * can be edited by instructions in categories
 * pdbx_chem_comp_atom_edit and pdbx_chem_comp_bond_edit.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompImport extends BaseCategory {
    public PdbxChemCompImport(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompImport(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompImport(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }
}
