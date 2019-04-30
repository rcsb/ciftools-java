package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_BOND category record details about
 * bonds in a link between components in the chemical structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAtom1CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_1_comp_id", StrColumn::new) :
                getBinaryColumn("atom_1_comp_id"));
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two chemical components connected by
     * the link.
     * @return StrColumn
     */
    public StrColumn getAtom2CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_2_comp_id", StrColumn::new) :
                getBinaryColumn("atom_2_comp_id"));
    }

    /**
     * The ID of the first of the two atoms that define the bond.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the
     * linkage sense.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
    }

    /**
     * The ID of the second of the two atoms that define the bond.
     * 
     * As this data item does not point to a specific atom in a
     * specific component, it is not a child in the linkage sense.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
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
     * The value that should be taken as the target for the chemical
     * bond associated with the specified atoms, expressed as a
     * distance.
     * @return FloatColumn
     */
    public FloatColumn getValueDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_dist", FloatColumn::new) :
                getBinaryColumn("value_dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_bond.value_dist.
     * @return FloatColumn
     */
    public FloatColumn getValueDistEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value_dist_esd", FloatColumn::new) :
                getBinaryColumn("value_dist_esd"));
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
}
