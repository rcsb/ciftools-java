package org.rcsb.cif.model.chemlinkchiratom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLinkChirAtom extends BaseCategory {
    public ChemLinkChirAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkChirAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkChirAtom(String name) {
        super(name);
    }

    /**
     * This data item indicates whether the atom bonded to a chiral
     * atom is found in the first or the second of the two components
     * connected by the link.
     * @return AtomCompId
     */
    public AtomCompId getAtomCompId() {
        return (AtomCompId) (isText ? textFields.computeIfAbsent("atom_comp_id",
                AtomCompId::new) : getBinaryColumn("atom_comp_id"));
    }

    /**
     * The ID of an atom bonded to the chiral atom.
     * 
     * As this data item does not point to a specific atom in a
     * specific chemical component, it is not a child in the linkage
     * sense.
     * @return AtomId
     */
    public AtomId getAtomId() {
        return (AtomId) (isText ? textFields.computeIfAbsent("atom_id",
                AtomId::new) : getBinaryColumn("atom_id"));
    }

    /**
     * This data item is a pointer to _chem_link_chir.id in the
     * CHEM_LINK_CHIR category.
     * @return ChirId
     */
    public ChirId getChirId() {
        return (ChirId) (isText ? textFields.computeIfAbsent("chir_id",
                ChirId::new) : getBinaryColumn("chir_id"));
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
