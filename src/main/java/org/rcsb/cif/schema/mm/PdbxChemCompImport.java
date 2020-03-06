package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_IMPORT category identify
 * existing chemical components to be imported into the
 * current component definition.  Components in this list
 * can be edited by instructions in categories
 * pdbx_chem_comp_atom_edit and pdbx_chem_comp_bond_edit.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompImport extends DelegatingCategory {
    public PdbxChemCompImport(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "comp_id":
                return getCompId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

}