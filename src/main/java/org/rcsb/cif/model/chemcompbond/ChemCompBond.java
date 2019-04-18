package org.rcsb.cif.model.chemcompbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class ChemCompBond extends BaseCategory {
    public ChemCompBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompBond(String name) {
        super(name);
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
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
     * Ordinal index for the component bond list.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? textFields.computeIfAbsent("pdbx_ordinal",
                PdbxOrdinal::new) : getBinaryColumn("pdbx_ordinal"));
    }

    /**
     * Stereochemical configuration across a double bond.
     * @return PdbxStereoConfig
     */
    public PdbxStereoConfig getPdbxStereoConfig() {
        return (PdbxStereoConfig) (isText ? textFields.computeIfAbsent("pdbx_stereo_config",
                PdbxStereoConfig::new) : getBinaryColumn("pdbx_stereo_config"));
    }

    /**
     * A flag indicating an aromatic bond.
     * @return PdbxAromaticFlag
     */
    public PdbxAromaticFlag getPdbxAromaticFlag() {
        return (PdbxAromaticFlag) (isText ? textFields.computeIfAbsent("pdbx_aromatic_flag",
                PdbxAromaticFlag::new) : getBinaryColumn("pdbx_aromatic_flag"));
    }
}
