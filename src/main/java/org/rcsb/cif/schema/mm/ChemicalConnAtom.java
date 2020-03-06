package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

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
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalConnAtom extends DelegatingCategory {
    public ChemicalConnAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "charge":
                return getCharge();
            case "display_x":
                return getDisplayX();
            case "display_y":
                return getDisplayY();
            case "NCA":
                return getNCA();
            case "NH":
                return getNH();
            case "number":
                return getNumber();
            case "type_symbol":
                return getTypeSymbol();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return delegate.getColumn("charge", DelegatingIntColumn::new);
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
        return delegate.getColumn("display_x", DelegatingFloatColumn::new);
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
        return delegate.getColumn("display_y", DelegatingFloatColumn::new);
    }

    /**
     * The number of connected atoms excluding terminal hydrogen atoms.
     * @return IntColumn
     */
    public IntColumn getNCA() {
        return delegate.getColumn("NCA", DelegatingIntColumn::new);
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
        return delegate.getColumn("NH", DelegatingIntColumn::new);
    }

    /**
     * The chemical sequence number to be associated with this atom.
     * Within an ATOM_SITE list, this number must match one of
     * the _atom_site.chemical_conn_number values.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

}