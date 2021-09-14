package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of items for listing bond valences.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ValenceParam extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "valence_param";

    public ValenceParam(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Atom type symbol for atom 1 forming a bond whose
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom1() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_atom_1"));
    }

    /**
     * The formal charge of the atom 1 whose bond
     * valence parameters are given in this category.
     * @return FloatColumn
     */
    public FloatColumn getAtom1Valence() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_atom_1_valence"));
    }

    /**
     * Atom type symbol for atom 2 forming a bond whose
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom2() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_atom_2"));
    }

    /**
     * The formal charge of the atom 2 whose bond
     * valence parameters are given in this category.
     * @return FloatColumn
     */
    public FloatColumn getAtom2Valence() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_atom_2_valence"));
    }

    /**
     * The bond valence parameter B used in the expression
     * s = exp[(Ro - R)/B] where s is the valence of bond length R.
     * @return FloatColumn
     */
    public FloatColumn getB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_b"));
    }

    /**
     * Details of valence parameters of stated bond.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_details"));
    }

    /**
     * Unique index loop number of the valence parameter loop.
     * @return IntColumn
     */
    public IntColumn getId() {
        return new DelegatingIntColumn(parentBlock.getColumn("valence_param_id"));
    }

    /**
     * Code linking parameters to the key _valence_ref.id key
     * in the reference list in category VALENCE_REF.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_ref_id"));
    }

    /**
     * The bond valence parameter Ro used in the expression
     * s = exp[(Ro - R)/B] where s is the valence of bond length R.
     * @return FloatColumn
     */
    public FloatColumn getRo() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_ro"));
    }

}