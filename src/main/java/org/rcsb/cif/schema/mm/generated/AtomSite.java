package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.Category;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.schema.DelegatingCategory;
import org.rcsb.cif.schema.DelegatingFloatColumn;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITE category record details about
 * the atom sites in a macromolecular crystal structure, such as
 * the positional coordinates, atomic displacement parameters,
 * magnetic moments and directions.
 * 
 * The data items for describing anisotropic atomic
 * displacement factors are only used if the corresponding items
 * are not given in the ATOM_SITE_ANISOTROP category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class AtomSite extends DelegatingCategory {
    public AtomSite(Category delegate) {
        super(delegate);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return getColumn("Cartn_x", DelegatingFloatColumn::new);
    }
}
