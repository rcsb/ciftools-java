package org.rcsb.cif.model.chemcomptor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
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
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return AtomId4
     */
    public AtomId4 getAtomId4() {
        return (AtomId4) (isText ? textFields.computeIfAbsent("atom_id_4",
                AtomId4::new) : getBinaryColumn("atom_id_4"));
    }

    /**
     * The value of _chem_comp_tor.id must uniquely identify a
     * record in the CHEM_COMP_TOR list.
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
}
