package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_CHIR_ATOM category enumerate the
 * atoms bonded to a chiral atom in a link between two
 * chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAtomCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_comp_id", StrColumn::new) :
                getBinaryColumn("atom_comp_id"));
    }

    /**
     * The ID of an atom bonded to the chiral atom.
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
     * This data item is a pointer to _chem_link_chir.id in the
     * CHEM_LINK_CHIR category.
     * @return StrColumn
     */
    public StrColumn getChirId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chir_id", StrColumn::new) :
                getBinaryColumn("chir_id"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of the position of this atom from the plane defined by
     * all of the atoms in the plane.
     * @return FloatColumn
     */
    public FloatColumn getDev() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dev", FloatColumn::new) :
                getBinaryColumn("dev"));
    }
}
