package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_BOND_EDIT category provide
 * bond level editing instructions to be applied to imported
 * chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * The operation or assignment applied to the named imported component.
     * @return StrColumn
     */
    public StrColumn getEditOp() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("edit_op", StrColumn::new) :
                getBinaryColumn("edit_op"));
    }

    /**
     * The identifier for the first atom in the target bond
     * in imported component.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The identifier for the second atom in the target bond
     * in imported component.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * The value for the edited bond property value in the generated component.
     * @return StrColumn
     */
    public StrColumn getEditBondValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("edit_bond_value", StrColumn::new) :
                getBinaryColumn("edit_bond_value"));
    }
}
