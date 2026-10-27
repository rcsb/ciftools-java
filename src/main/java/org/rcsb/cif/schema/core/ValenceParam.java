package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of items that specify bond-valence parameters
 * used to calculate bond valences from bond lengths using the
 * model of Brown (2002).
 * 
 * Ref: Brown, I. D. (2002). The Chemical Bond in Inorganic Chemistry:
 * the Bond-Valence Model, eq. (3.1). Oxford: Oxford University Press.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ValenceParam extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "valence_param";

    public ValenceParam(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The atom type symbol for atom 1 forming a bond whose
     * valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom1() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_atom_1"));
    }

    /**
     * The formal charge of the atom 1 whose bond-valence parameters
     * are given in this category.
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
     * The formal charge of the atom 2 whose bond-valence parameters
     * are given in this category.
     * @return FloatColumn
     */
    public FloatColumn getAtom2Valence() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_atom_2_valence"));
    }

    /**
     * The bond-valence parameter B used in the expression
     * s = exp[(Ro - R)/B], where s is the valence of bond length R.
     * @return FloatColumn
     */
    public FloatColumn getB() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_b"));
    }

    /**
     * Code linking parameters to the key _citation.id in the reference
     * list in category CITATION. This may be used when the source of the
     * bond valence parameters is included in an article reference list,
     * instead of in a separate VALENCE_REF list. Use of this item does not
     * preclude the use also of _valence_param.ref_id.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_citation_id"));
    }

    /**
     * Details of or comments on the bond-valence parameters of the stated bond.
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
     * Code linking parameters to the key _valence_ref.id in the list of
     * standard literature references for bond-valence parameters tabulated
     * in category VALENCE_REF. Use of this item does not preclude links to
     * references in the article citation list using _valence_param.citation_id.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_param_ref_id"));
    }

    /**
     * The bond-valence parameter Ro used in the expression
     * s = exp[(Ro - R)/B], where s is the valence of bond length R.
     * @return FloatColumn
     */
    public FloatColumn getRo() {
        return new DelegatingFloatColumn(parentBlock.getColumn("valence_param_ro"));
    }

}