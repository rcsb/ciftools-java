package org.rcsb.cif.model.generated.pdbxchemcompatomedit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_import.comp_id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The operation applied to the named imported component.
     * @return EditOp
     */
    public EditOp getEditOp() {
        return (EditOp) (isText ? textFields.computeIfAbsent("edit_op",
                EditOp::new) : getBinaryColumn("edit_op"));
    }

    /**
     * The identifier for the target atom in imported component to be edited.
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * The identifier for the edited atom in the generated component.
     * @return EditAtomId
     */
    public EditAtomId getEditAtomId() {
        return (EditAtomId) (isText ? textFields.computeIfAbsent("edit_atom_id",
                EditAtomId::new) : getBinaryColumn("edit_atom_id"));
    }

    /**
     * The value for the edited atomic property value in the generated component.
     * @return EditAtomValue
     */
    public EditAtomValue getEditAtomValue() {
        return (EditAtomValue) (isText ? textFields.computeIfAbsent("edit_atom_value",
                EditAtomValue::new) : getBinaryColumn("edit_atom_value"));
    }
}
