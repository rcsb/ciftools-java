package org.rcsb.cif.model.generated.chemcompbond;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class ChemCompBond extends BaseCifCategory {
    public ChemCompBond(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public ChemCompBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? getTextColumn("atom_id_1") : getBinaryColumn("atom_id_1", "AtomId1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? getTextColumn("atom_id_2") : getBinaryColumn("atom_id_2", "AtomId2"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? getTextColumn("comp_id") : getBinaryColumn("comp_id", "CompId"));
    }

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a bond
     * order.
     * @return ValueOrder
     */
    public ValueOrder getValueOrder() {
        return (ValueOrder) (isText ? getTextColumn("value_order") : getBinaryColumn("value_order", "ValueOrder"));
    }

    /**
     * Ordinal index for the component bond list.
     * @return PdbxOrdinal
     */
    public PdbxOrdinal getPdbxOrdinal() {
        return (PdbxOrdinal) (isText ? getTextColumn("pdbx_ordinal") : getBinaryColumn("pdbx_ordinal", "PdbxOrdinal"));
    }

    /**
     * Stereochemical configuration across a double bond.
     * @return PdbxStereoConfig
     */
    public PdbxStereoConfig getPdbxStereoConfig() {
        return (PdbxStereoConfig) (isText ? getTextColumn("pdbx_stereo_config") : getBinaryColumn("pdbx_stereo_config", "PdbxStereoConfig"));
    }

    /**
     * A flag indicating an aromatic bond.
     * @return PdbxAromaticFlag
     */
    public PdbxAromaticFlag getPdbxAromaticFlag() {
        return (PdbxAromaticFlag) (isText ? getTextColumn("pdbx_aromatic_flag") : getBinaryColumn("pdbx_aromatic_flag", "PdbxAromaticFlag"));
    }
}
