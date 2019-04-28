package org.rcsb.cif.model.generated.chemlinktor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLinkTor extends BaseCategory {
    public ChemLinkTor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkTor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkTor(String name) {
        super(name);
    }

    /**
     * This data item indicates whether atom 1 is found in the first
     * or the second of the two components connected by the link.
     * @return Atom1CompId
     */
    public Atom1CompId getAtom1CompId() {
        return (Atom1CompId) (isText ? textFields.computeIfAbsent("atom_1_comp_id",
                Atom1CompId::new) : getBinaryColumn("atom_1_comp_id"));
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two components connected by the link.
     * @return Atom2CompId
     */
    public Atom2CompId getAtom2CompId() {
        return (Atom2CompId) (isText ? textFields.computeIfAbsent("atom_2_comp_id",
                Atom2CompId::new) : getBinaryColumn("atom_2_comp_id"));
    }

    /**
     * This data item indicates whether atom 3 is found in the first
     * or the second of the two components connected by the link.
     * @return Atom3CompId
     */
    public Atom3CompId getAtom3CompId() {
        return (Atom3CompId) (isText ? textFields.computeIfAbsent("atom_3_comp_id",
                Atom3CompId::new) : getBinaryColumn("atom_3_comp_id"));
    }

    /**
     * This data item indicates whether atom 4 is found in the first
     * or the second of the two components connected by the link.
     * @return Atom4CompId
     */
    public Atom4CompId getAtom4CompId() {
        return (Atom4CompId) (isText ? textFields.computeIfAbsent("atom_4_comp_id",
                Atom4CompId::new) : getBinaryColumn("atom_4_comp_id"));
    }

    /**
     * The ID of the first of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
    }

    /**
     * The ID of the third of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return AtomId3
     */
    public AtomId3 getAtomId3() {
        return (AtomId3) (isText ? textFields.computeIfAbsent("atom_id_3",
                AtomId3::new) : getBinaryColumn("atom_id_3"));
    }

    /**
     * The ID of the fourth of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return AtomId4
     */
    public AtomId4 getAtomId4() {
        return (AtomId4) (isText ? textFields.computeIfAbsent("atom_id_4",
                AtomId4::new) : getBinaryColumn("atom_id_4"));
    }

    /**
     * The value of _chem_link_tor.id must uniquely identify a
     * record in the CHEM_LINK_TOR list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }
}
