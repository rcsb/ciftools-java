package org.rcsb.cif.model.generated.pdbxchemcompbondedit;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompBondEdit extends BaseCategory {
    public PdbxChemCompBondEdit(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompBondEdit(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompBondEdit(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies and orders each bond edit instruction.
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
     * The operation or assignment applied to the named imported component.
     * @return EditOp
     */
    public EditOp getEditOp() {
        return (EditOp) (isText ? textFields.computeIfAbsent("edit_op",
                EditOp::new) : getBinaryColumn("edit_op"));
    }

    /**
     * The identifier for the first atom in the target bond
     * in imported component.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The identifier for the second atom in the target bond
     * in imported component.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The value for the edited bond property value in the generated component.
     * @return EditBondValue
     */
    public EditBondValue getEditBondValue() {
        return (EditBondValue) (isText ? textFields.computeIfAbsent("edit_bond_value",
                EditBondValue::new) : getBinaryColumn("edit_bond_value"));
    }
}
