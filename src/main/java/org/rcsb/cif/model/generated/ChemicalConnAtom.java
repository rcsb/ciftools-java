package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEMICAL_CONN_ATOM category would not, in
 * general, be used in a macromolecular CIF. See instead the
 * ENTITY data items.
 * 
 * Data items in the CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND
 * categories record details about the two-dimensional (2D)
 * chemical structure of the molecular species. They allow
 * a 2D chemical diagram to be reconstructed for use in a
 * publication or in a database search for structural and
 * substructural relationships.
 * 
 * The CHEMICAL_CONN_ATOM data items provide information about the
 * chemical properties of the atoms in the structure. In cases
 * where crystallographic and molecular symmetry elements coincide,
 * they must also contain symmetry-generated atoms, so that the
 * CHEMICAL_CONN_ATOM and CHEMICAL_CONN_BOND data items will always
 * describe a complete chemical entity.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemicalConnAtom extends BaseCategory {
    public ChemicalConnAtom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemicalConnAtom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemicalConnAtom(String name) {
        super(name);
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("charge", IntColumn::new) :
                getBinaryColumn("charge"));
    }

    /**
     * The 2D Cartesian x coordinate of the position of this atom in a
     * recognizable chemical diagram. The coordinate origin is at the
     * lower left corner, the x axis is horizontal and the y axis
     * is vertical. The coordinates must lie in the range 0.0 to 1.0.
     * These coordinates can be obtained from projections of a suitable
     * uncluttered view of the molecular structure.
     * @return FloatColumn
     */
    public FloatColumn getDisplayX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("display_x", FloatColumn::new) :
                getBinaryColumn("display_x"));
    }

    /**
     * The 2D Cartesian y coordinate of the position of this atom in a
     * recognizable chemical diagram. The coordinate origin is at the
     * lower left corner, the x axis is horizontal and the y axis
     * is vertical. The coordinates must lie in the range 0.0 to 1.0.
     * These coordinates can be obtained from projections of a suitable
     * uncluttered view of the molecular structure.
     * @return FloatColumn
     */
    public FloatColumn getDisplayY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("display_y", FloatColumn::new) :
                getBinaryColumn("display_y"));
    }

    /**
     * The number of connected atoms excluding terminal hydrogen atoms.
     * @return IntColumn
     */
    public IntColumn getNCA() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NCA", IntColumn::new) :
                getBinaryColumn("NCA"));
    }

    /**
     * The total number of hydrogen atoms attached to this atom,
     * regardless of whether they are included in the refinement or
     * the ATOM_SITE list. This number is the same as
     * _atom_site.attached_hydrogens only if none of the hydrogen
     * atoms appear in the ATOM_SITE list.
     * @return IntColumn
     */
    public IntColumn getNH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("NH", IntColumn::new) :
                getBinaryColumn("NH"));
    }

    /**
     * The chemical sequence number to be associated with this atom.
     * Within an ATOM_SITE list, this number must match one of
     * the _atom_site.chemical_conn_number values.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number", IntColumn::new) :
                getBinaryColumn("number"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
    }
}
