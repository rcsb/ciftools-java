package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_ATOM_EDIT category provide
 * atom level editing instructions to be applied to imported
 * chemical components.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompAtomEdit extends BaseCategory {
    public PdbxChemCompAtomEdit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompAtomEdit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompAtomEdit(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies and orders each  atom edit instruction.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_import.comp_id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The operation applied to the named imported component.
     * @return StrColumn
     */
    public StrColumn getEditOp() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("edit_op", StrColumn::new) :
                getBinaryColumn("edit_op"));
    }

    /**
     * The identifier for the target atom in imported component to be edited.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * The identifier for the edited atom in the generated component.
     * @return StrColumn
     */
    public StrColumn getEditAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("edit_atom_id", StrColumn::new) :
                getBinaryColumn("edit_atom_id"));
    }

    /**
     * The value for the edited atomic property value in the generated component.
     * @return StrColumn
     */
    public StrColumn getEditAtomValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("edit_atom_value", StrColumn::new) :
                getBinaryColumn("edit_atom_value"));
    }
}
