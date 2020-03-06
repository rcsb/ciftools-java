package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_LINK_TOR category record details about
 * the torsion angles in a link between two chemical components.
 * As torsion angles can have more than one target value, the
 * target values are specified in the CHEM_LINK_TOR_VALUE category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemLinkTor extends DelegatingCategory {
    public ChemLinkTor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_1_comp_id":
                return getAtom1CompId();
            case "atom_2_comp_id":
                return getAtom2CompId();
            case "atom_3_comp_id":
                return getAtom3CompId();
            case "atom_4_comp_id":
                return getAtom4CompId();
            case "atom_id_1":
                return getAtomId1();
            case "atom_id_2":
                return getAtomId2();
            case "atom_id_3":
                return getAtomId3();
            case "atom_id_4":
                return getAtomId4();
            case "id":
                return getId();
            case "link_id":
                return getLinkId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item indicates whether atom 1 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom1CompId() {
        return delegate.getColumn("atom_1_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom2CompId() {
        return delegate.getColumn("atom_2_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether atom 3 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom3CompId() {
        return delegate.getColumn("atom_3_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item indicates whether atom 4 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom4CompId() {
        return delegate.getColumn("atom_4_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The ID of the first of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The ID of the second of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The ID of the third of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return StrColumn
     */
    public StrColumn getAtomId3() {
        return delegate.getColumn("atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * The ID of the fourth of the four atoms that define the torsion
     * angle.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return StrColumn
     */
    public StrColumn getAtomId4() {
        return delegate.getColumn("atom_id_4", DelegatingStrColumn::new);
    }

    /**
     * The value of _chem_link_tor.id must uniquely identify a
     * record in the CHEM_LINK_TOR list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_link.id in the CHEM_LINK
     * category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingStrColumn::new);
    }

}