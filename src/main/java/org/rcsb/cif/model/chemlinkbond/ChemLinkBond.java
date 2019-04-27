package org.rcsb.cif.model.chemlinkbond;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLinkBond extends BaseCategory {
    public ChemLinkBond(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkBond(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkBond(String name) {
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
     * or the second of the two chemical components connected by
     * the link.
     * @return Atom2CompId
     */
    public Atom2CompId getAtom2CompId() {
        return (Atom2CompId) (isText ? textFields.computeIfAbsent("atom_2_comp_id",
                Atom2CompId::new) : getBinaryColumn("atom_2_comp_id"));
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the
     * linkage sense.
     * @return AtomId1
     */
    public AtomId1 getAtomId1() {
        return (AtomId1) (isText ? textFields.computeIfAbsent("atom_id_1",
                AtomId1::new) : getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * As this data item does not point to a specific atom in a
     * specific component, it is not a child in the linkage sense.
     * @return AtomId2
     */
    public AtomId2 getAtomId2() {
        return (AtomId2) (isText ? textFields.computeIfAbsent("atom_id_2",
                AtomId2::new) : getBinaryColumn("atom_id_2"));
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

    /**
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return ValueDist
     */
    public ValueDist getValueDist() {
        return (ValueDist) (isText ? textFields.computeIfAbsent("value_dist",
                ValueDist::new) : getBinaryColumn("value_dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_bond.value_dist.
     * @return ValueDistEsd
     */
    public ValueDistEsd getValueDistEsd() {
        return (ValueDistEsd) (isText ? textFields.computeIfAbsent("value_dist_esd",
                ValueDistEsd::new) : getBinaryColumn("value_dist_esd"));
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
}
