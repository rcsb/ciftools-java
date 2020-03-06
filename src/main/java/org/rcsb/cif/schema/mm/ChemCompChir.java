package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_CHIR category provide details about
 * the chiral centres in a chemical component. The atoms bonded
 * to the chiral atom are specified in the CHEM_COMP_CHIR_ATOM
 * category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompChir extends DelegatingCategory {
    public ChemCompChir(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_id":
                return getAtomId();
            case "atom_config":
                return getAtomConfig();
            case "id":
                return getId();
            case "comp_id":
                return getCompId();
            case "number_atoms_all":
                return getNumberAtomsAll();
            case "number_atoms_nh":
                return getNumberAtomsNh();
            case "volume_flag":
                return getVolumeFlag();
            case "volume_three":
                return getVolumeThree();
            case "volume_three_esd":
                return getVolumeThreeEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ID of the atom that is a chiral centre.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the atom that is a chiral centre.
     * @return StrColumn
     */
    public StrColumn getAtomConfig() {
        return delegate.getColumn("atom_config", DelegatingStrColumn::new);
    }

    /**
     * The value of _chem_comp_chir.id must uniquely identify a record
     * in the CHEM_COMP_CHIR list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The total number of atoms bonded to the atom specified by
     * _chem_comp_chir.atom_id.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsAll() {
        return delegate.getColumn("number_atoms_all", DelegatingIntColumn::new);
    }

    /**
     * The number of non-hydrogen atoms bonded to the atom specified by
     * _chem_comp_chir.atom_id.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return delegate.getColumn("number_atoms_nh", DelegatingIntColumn::new);
    }

    /**
     * A flag to indicate whether a chiral volume should match the
     * standard value in both magnitude and sign, or in magnitude only.
     * @return StrColumn
     */
    public StrColumn getVolumeFlag() {
        return delegate.getColumn("volume_flag", DelegatingStrColumn::new);
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
     * @return FloatColumn
     */
    public FloatColumn getVolumeThree() {
        return delegate.getColumn("volume_three", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_chir.volume_three.
     * @return FloatColumn
     */
    public FloatColumn getVolumeThreeEsd() {
        return delegate.getColumn("volume_three_esd", DelegatingFloatColumn::new);
    }

}