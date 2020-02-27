package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_TOR category record details about
 * the torsion angles in a chemical component. As torsion angles
 * can have more than one target value, the target values are
 * specified in the CHEM_COMP_TOR_VALUE category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class ChemCompTor extends BaseCategory {
    public ChemCompTor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompTor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompTor(String name) {
        super(name);
    }

    /**
     * The ID of the first of the four atoms that define the torsion
     * angle.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId4() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id_4", StrColumn::new) :
                getBinaryColumn("atom_id_4"));
    }

    /**
     * The value of _chem_comp_tor.id must uniquely identify a
     * record in the CHEM_COMP_TOR list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }
}
