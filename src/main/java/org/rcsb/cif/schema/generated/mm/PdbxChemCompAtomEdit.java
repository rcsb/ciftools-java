package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
 * atom level editing instructions to be applied to imported
 * chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompAtomEdit extends DelegatingCategory {
    public PdbxChemCompAtomEdit(Category delegate) {
        super(delegate);
    }

    /**
     * This data item uniquely identifies and orders each  atom edit instruction.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_import.comp_id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The operation applied to the named imported component.
     * @return StrColumn
     */
    public StrColumn getEditOp() {
        return delegate.getColumn("edit_op", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the target atom in imported component to be edited.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the edited atom in the generated component.
     * @return StrColumn
     */
    public StrColumn getEditAtomId() {
        return delegate.getColumn("edit_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The value for the edited atomic property value in the generated component.
     * @return StrColumn
     */
    public StrColumn getEditAtomValue() {
        return delegate.getColumn("edit_atom_value", DelegatingStrColumn::new);
    }
}
