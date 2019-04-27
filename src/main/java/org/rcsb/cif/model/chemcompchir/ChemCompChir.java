package org.rcsb.cif.model.chemcompchir;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompChir extends BaseCategory {
    public ChemCompChir(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompChir(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompChir(String name) {
        super(name);
    }

    /**
     * The ID of the atom that is a chiral centre.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * The chiral configuration of the atom that is a chiral centre.
     * @return AtomConfig
     */
    public AtomConfig getAtomConfig() {
        return (AtomConfig) (isText ? textFields.computeIfAbsent("atom_config",
                AtomConfig::new) : getBinaryColumn("atom_config"));
    }

    /**
     * The value of _chem_comp_chir.id must uniquely identify a record
     * in the CHEM_COMP_CHIR list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * The total number of atoms bonded to the atom specified by
     * _chem_comp_chir.atom_id.
     * @return NumberAtomsAll
     */
    public NumberAtomsAll getNumberAtomsAll() {
        return (NumberAtomsAll) (isText ? textFields.computeIfAbsent("number_atoms_all",
                NumberAtomsAll::new) : getBinaryColumn("number_atoms_all"));
    }

    /**
     * The number of non-hydrogen atoms bonded to the atom specified by
     * _chem_comp_chir.atom_id.
     * @return NumberAtomsNh
     */
    public NumberAtomsNh getNumberAtomsNh() {
        return (NumberAtomsNh) (isText ? textFields.computeIfAbsent("number_atoms_nh",
                NumberAtomsNh::new) : getBinaryColumn("number_atoms_nh"));
    }

    /**
     * A flag to indicate whether a chiral volume should match the
     * standard value in both magnitude and sign, or in magnitude only.
     * @return VolumeFlag
     */
    public VolumeFlag getVolumeFlag() {
        return (VolumeFlag) (isText ? textFields.computeIfAbsent("volume_flag",
                VolumeFlag::new) : getBinaryColumn("volume_flag"));
    }

    /**
     * The chiral volume, V~c~, for chiral centres that involve a chiral
     * atom bonded to three non-hydrogen atoms and one hydrogen atom.
     * 
     * V~c~ = V1 * (V2 X V3)
     * 
     * V1 = the vector distance from the atom specified by
     * _chem_comp_chir.atom_id to the first atom in the
     * CHEM_COMP_CHIR_ATOM list
     * V2 = the vector distance from the atom specified by
     * _chem_comp_chir.atom_id to the second atom in the
     * CHEM_COMP_CHIR_ATOM list
     * V3 = the vector distance from the atom specified by
     * _chem_comp_chir.atom_id to the third atom in the
     * CHEM_COMP_CHIR_ATOM list
     * *  = the vector dot product
     * X  = the vector cross product
     * @return VolumeThree
     */
    public VolumeThree getVolumeThree() {
        return (VolumeThree) (isText ? textFields.computeIfAbsent("volume_three",
                VolumeThree::new) : getBinaryColumn("volume_three"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_chir.volume_three.
     * @return VolumeThreeEsd
     */
    public VolumeThreeEsd getVolumeThreeEsd() {
        return (VolumeThreeEsd) (isText ? textFields.computeIfAbsent("volume_three_esd",
                VolumeThreeEsd::new) : getBinaryColumn("volume_three_esd"));
    }
}
