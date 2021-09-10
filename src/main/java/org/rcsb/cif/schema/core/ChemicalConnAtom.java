package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items which describe the 2D chemical structure of
 * the molecular species. They allow a 2D chemical diagram to be
 * reconstructed for use in a publication or in a database search
 * for structural and substructural relationships. In particular,
 * the chemical_conn_atom data items provide information about the
 * chemical properties of the atoms in the structure. In cases
 * where crystallographic and molecular symmetry elements coincide
 * they must also contain symmetry-generated atoms, so as to describe
 * a complete chemical entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemicalConnAtom extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "chemical_conn_atom";

    public ChemicalConnAtom(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return new DelegatingIntColumn(parentBlock.getColumn("chemical_conn_atom_charge"));
    }

    /**
     * Cartesian coordinate (x) of the atom site in a chemical diagram. The
     * coordinate origin is at the lower left corner, the x axis is horizontal.
     * @return FloatColumn
     */
    public FloatColumn getDisplayX() {
        return new DelegatingFloatColumn(parentBlock.getColumn("chemical_conn_atom_display_x"));
    }

    /**
     * Cartesian coordinate (y) of the atom site in a chemical diagram. The
     * coordinate origin is at the lower left corner, the y axis is vertical.
     * @return FloatColumn
     */
    public FloatColumn getDisplayY() {
        return new DelegatingFloatColumn(parentBlock.getColumn("chemical_conn_atom_display_y"));
    }

    /**
     * Total number of connected atoms excluding terminal hydrogen atoms.
     * @return IntColumn
     */
    public IntColumn getNca() {
        return new DelegatingIntColumn(parentBlock.getColumn("chemical_conn_atom_nca"));
    }

    /**
     * Total number of hydrogen atoms attached to this atom,
     * regardless of whether they are included in the refinement or
     * the atom_site list. This number will be the same as
     * _atom_site.attached_hydrogens only if none of the hydrogen
     * atoms appear in the atom_site list.
     * @return IntColumn
     */
    public IntColumn getNh() {
        return new DelegatingIntColumn(parentBlock.getColumn("chemical_conn_atom_nh"));
    }

    /**
     * The chemical sequence number to be associated with this atom.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return new DelegatingIntColumn(parentBlock.getColumn("chemical_conn_atom_number"));
    }

    /**
     * A code identifying the atom type.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn("chemical_conn_atom_type_symbol"));
    }

}