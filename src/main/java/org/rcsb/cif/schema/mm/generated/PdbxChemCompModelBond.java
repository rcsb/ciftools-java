package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CHEM_COMP_MODEL_BOND category record details about
 * the bonds between atoms in a chemical component model instance.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompModelBond extends BaseCategory {
    public PdbxChemCompModelBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModelBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModelBond(String name) {
        super(name);
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * This data item is a pointer to _pdbx_chem_comp_model_atom.atom_id in the
     * PDBX_CHEM_COMP_MODEL_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _pdbx_chem_comp_model_atom.atom_id in the
     * PDBX_CHEM_COMP_MODEL_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a bond
     * order.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value_order", StrColumn::new) :
                getBinaryColumn("value_order"));
    }

    /**
     * The value of _pdbx_chem_comp_model_bond.ordinal_id is an
     * ordinal identifer for each atom in the PDBX_CHEM_COMP_MODEL_BOND list.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }
}
