package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_CHIR category provide details about
 * the chiral centres in a link between two chemical components.
 * The atoms bonded to the chiral atom are specified in the
 * CHEM_LINK_CHIR_ATOM category.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLinkChir extends BaseCategory {
    public ChemLinkChir(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkChir(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkChir(String name) {
        super(name);
    }

    /**
     * This data item indicates whether the chiral atom is found in the
     * first or the second of the two components connected by the
     * link.
     * @return StrColumn
     */
    public StrColumn getAtomCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_comp_id", StrColumn::new) :
                getBinaryColumn("atom_comp_id"));
    }

    /**
     * The ID of the atom that is a chiral centre.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * The chiral configuration of the atom that is a chiral centre.
     * @return StrColumn
     */
    public StrColumn getAtomConfig() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_config", StrColumn::new) :
                getBinaryColumn("atom_config"));
    }

    /**
     * The value of _chem_link_chir.id must uniquely identify a record
     * in the CHEM_LINK_CHIR list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_id", StrColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * The total number of atoms bonded to the atom specified by
     * _chem_link_chir.atom_id.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_all", IntColumn::new) :
                getBinaryColumn("number_atoms_all"));
    }

    /**
     * The number of non-hydrogen atoms bonded to the atom specified by
     * _chem_link_chir.atom_id.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_nh", IntColumn::new) :
                getBinaryColumn("number_atoms_nh"));
    }

    /**
     * A flag to indicate whether a chiral volume should match the
     * standard value in both magnitude and sign, or in magnitude only.
     * @return StrColumn
     */
    public StrColumn getVolumeFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("volume_flag", StrColumn::new) :
                getBinaryColumn("volume_flag"));
    }

    /**
     * The chiral volume, V(c), for chiral centres that involve a chiral
     * atom bonded to three non-hydrogen atoms and one hydrogen atom.
     * 
     * V~c~ = V1 * (V2 X V3)
     * 
     * V1 = the vector distance from the atom specified by
     * _chem_link_chir.atom_id to the first atom in the
     * CHEM_LINK_CHIR_ATOM list
     * V2 = the vector distance from the atom specified by
     * _chem_link_chir.atom_id to the second atom in the
     * CHEM_LINK_CHIR_ATOM list
     * V3 = the vector distance from the atom specified by
     * _chem_link_chir.atom_id to the third atom in the
     * CHEM_LINK_CHIR_ATOM list
     * *  = the vector dot product
     * X  = the vector cross product
     * @return FloatColumn
     */
    public FloatColumn getVolumeThree() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume_three", FloatColumn::new) :
                getBinaryColumn("volume_three"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_chir.volume_three.
     * @return FloatColumn
     */
    public FloatColumn getVolumeThreeEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume_three_esd", FloatColumn::new) :
                getBinaryColumn("volume_three_esd"));
    }
}
