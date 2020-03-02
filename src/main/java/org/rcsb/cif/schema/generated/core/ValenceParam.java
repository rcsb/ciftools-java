package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of items for listing bond valences.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ValenceParam extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "valence_param";

    public ValenceParam(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Atom type symbol for atom 1 forming a bond whose
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom1() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_1"));
    }

    /**
     * 
     * The formal charge of the atom 1 whose bond
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom1Valence() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_1_valence"));
    }

    /**
     * 
     * Atom type symbol for atom 2 forming a bond whose
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom2() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_2"));
    }

    /**
     * 
     * The formal charge of the atom 2 whose bond
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom2Valence() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_atom_2_valence"));
    }

    /**
     * 
     * The bond valence parameter B used in the expression
     * s = exp[(Ro - R)/B] where s is the valence of bond length R.
     * @return StrColumn
     */
    public StrColumn getB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_B"));
    }

    /**
     * 
     * Details of valence parameters of stated bond.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_details"));
    }

    /**
     * 
     * Unique index loop number of the valence parameter loop.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * Code linking parameters to the key _valence_ref.id key
     * in the reference list in category VALENCE_REF.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_ref_id"));
    }

    /**
     * 
     * The bond valence parameter Ro used in the expression
     * s = exp[(Ro - R)/B] where s is the valence of bond length R.
     * @return StrColumn
     */
    public StrColumn getRo() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_Ro"));
    }
}
