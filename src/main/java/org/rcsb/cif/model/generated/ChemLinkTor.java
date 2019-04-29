package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_TOR category record details about
 * the torsion angles in a link between two chemical components.
 * As torsion angles can have more than one target value, the
 * target values are specified in the CHEM_LINK_TOR_VALUE category.
 */
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
     * @return StrColumn
     */
    public StrColumn getAtom1CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_1_comp_id", StrColumn::new) :
                getBinaryColumn("atom_1_comp_id"));
    }

    /**
     * This data item indicates whether atom 2 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom2CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_2_comp_id", StrColumn::new) :
                getBinaryColumn("atom_2_comp_id"));
    }

    /**
     * This data item indicates whether atom 3 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom3CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_3_comp_id", StrColumn::new) :
                getBinaryColumn("atom_3_comp_id"));
    }

    /**
     * This data item indicates whether atom 4 is found in the first
     * or the second of the two components connected by the link.
     * @return StrColumn
     */
    public StrColumn getAtom4CompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_4_comp_id", StrColumn::new) :
                getBinaryColumn("atom_4_comp_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_1", StrColumn::new) :
                getBinaryColumn("atom_id_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_2", StrColumn::new) :
                getBinaryColumn("atom_id_2"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_3", StrColumn::new) :
                getBinaryColumn("atom_id_3"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_4", StrColumn::new) :
                getBinaryColumn("atom_id_4"));
    }

    /**
     * The value of _chem_link_tor.id must uniquely identify a
     * record in the CHEM_LINK_TOR list.
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
}
