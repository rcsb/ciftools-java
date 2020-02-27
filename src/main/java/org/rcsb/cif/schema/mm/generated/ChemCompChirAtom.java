package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_CHIR_ATOM category enumerate the
 * atoms bonded to a chiral atom within a chemical component.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_id", StrColumn::new) :
                getBinaryColumn("atom_id"));
    }

    /**
     * This data item is a pointer to _chem_comp_chir.id in the
     * CHEM_COMP_CHIR category.
     * @return StrColumn
     */
    public StrColumn getChirId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chir_id", StrColumn::new) :
                getBinaryColumn("chir_id"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the
     * CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
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
