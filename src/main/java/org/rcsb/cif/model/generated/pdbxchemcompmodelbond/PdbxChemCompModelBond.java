package org.rcsb.cif.model.generated.pdbxchemcompmodelbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _pdbx_chem_comp_model_atom.atom_id in the
     * PDBX_CHEM_COMP_MODEL_ATOM category.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a bond
     * order.
     * @return ValueOrder
     */
    public ValueOrder getValueOrder() {
        return (ValueOrder) (isText ? textFields.computeIfAbsent("value_order",
                ValueOrder::new) : getBinaryColumn("value_order"));
    }

    /**
     * The value of _pdbx_chem_comp_model_bond.ordinal_id is an
     * ordinal identifer for each atom in the PDBX_CHEM_COMP_MODEL_BOND list.
     * @return OrdinalId
     */
    public OrdinalId getOrdinalId() {
        return (OrdinalId) (isText ? textFields.computeIfAbsent("ordinal_id",
                OrdinalId::new) : getBinaryColumn("ordinal_id"));
    }
}
