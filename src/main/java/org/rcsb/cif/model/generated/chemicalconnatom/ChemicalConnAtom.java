package org.rcsb.cif.model.generated.chemicalconnatom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Charge
     */
    public Charge getCharge() {
        return (Charge) (isText ? textFields.computeIfAbsent("charge",
                Charge::new) : getBinaryColumn("charge"));
    }

    /**
     * The 2D Cartesian x coordinate of the position of this atom in a
     * recognizable chemical diagram. The coordinate origin is at the
     * lower left corner, the x axis is horizontal and the y axis
     * is vertical. The coordinates must lie in the range 0.0 to 1.0.
     * These coordinates can be obtained from projections of a suitable
     * uncluttered view of the molecular structure.
     * @return DisplayX
     */
    public DisplayX getDisplayX() {
        return (DisplayX) (isText ? textFields.computeIfAbsent("display_x",
                DisplayX::new) : getBinaryColumn("display_x"));
    }

    /**
     * The 2D Cartesian y coordinate of the position of this atom in a
     * recognizable chemical diagram. The coordinate origin is at the
     * lower left corner, the x axis is horizontal and the y axis
     * is vertical. The coordinates must lie in the range 0.0 to 1.0.
     * These coordinates can be obtained from projections of a suitable
     * uncluttered view of the molecular structure.
     * @return DisplayY
     */
    public DisplayY getDisplayY() {
        return (DisplayY) (isText ? textFields.computeIfAbsent("display_y",
                DisplayY::new) : getBinaryColumn("display_y"));
    }

    /**
     * The number of connected atoms excluding terminal hydrogen atoms.
     * @return NCA
     */
    public NCA getNCA() {
        return (NCA) (isText ? textFields.computeIfAbsent("NCA",
                NCA::new) : getBinaryColumn("NCA"));
    }

    /**
     * The total number of hydrogen atoms attached to this atom,
     * regardless of whether they are included in the refinement or
     * the ATOM_SITE list. This number is the same as
     * _atom_site.attached_hydrogens only if none of the hydrogen
     * atoms appear in the ATOM_SITE list.
     * @return NH
     */
    public NH getNH() {
        return (NH) (isText ? textFields.computeIfAbsent("NH",
                NH::new) : getBinaryColumn("NH"));
    }

    /**
     * The chemical sequence number to be associated with this atom.
     * Within an ATOM_SITE list, this number must match one of
     * the _atom_site.chemical_conn_number values.
     * @return Number
     */
    public Number getNumber() {
        return (Number) (isText ? textFields.computeIfAbsent("number",
                Number::new) : getBinaryColumn("number"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
    }
}
