package org.rcsb.cif.model.chemcompchiratom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompChirAtom extends BaseCategory {
    public ChemCompChirAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompChirAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompChirAtom(String name) {
        super(name);
    }

    /**
     * The ID of an atom bonded to the chiral atom.
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
     * This data item is a pointer to _chem_comp_chir.id in the
     * CHEM_COMP_CHIR category.
     * @return ChirId
     */
    public ChirId getChirId() {
        return (ChirId) (isText ? textFields.computeIfAbsent("chir_id",
                ChirId::new) : getBinaryColumn("chir_id"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the
     * CHEM_COMP category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of the position of this atom from the plane defined by
     * all of the atoms in the plane.
     * @return Dev
     */
    public Dev getDev() {
        return (Dev) (isText ? textFields.computeIfAbsent("dev",
                Dev::new) : getBinaryColumn("dev"));
    }
}
