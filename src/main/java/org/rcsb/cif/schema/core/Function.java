package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The crystallographic functions the invoked in the definition
 * methods of CORE STRUCTURE data items defined and used within
 * the Crystallographic Information Framework (CIF).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Function extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "function";

    public Function(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The function
     * r  =  AtomType( s )
     * 
     * returns an atom type symbol (element name) from the atom site label.
     * @return StrColumn
     */
    public StrColumn getAtomtype() {
        return new DelegatingStrColumn(parentBlock.getColumn("function_atomtype"));
    }

    /**
     * The function
     * d  =  Closest( v, w )
     * 
     * returns the cell translation vector required to obtain the
     * closest cell-translated occurrence of the vector V to the vector
     * W.
     * @return FloatColumn
     */
    public FloatColumn getClosest() {
        return new DelegatingFloatColumn(parentBlock.getColumn("function_closest"));
    }

    /**
     * The function
     * s  =  SeitzFromJones( j )
     * 
     * returns a 4x4 Seitz matrix from the Jones faithful representation of
     * the equivalent position which is a character string e.g. 1/2+x,-x,z.
     * @return FloatColumn
     */
    public FloatColumn getSeitzfromjones() {
        return new DelegatingFloatColumn(parentBlock.getColumn("function_seitzfromjones"));
    }

    /**
     * The function
     * xyz' =  SymEquiv( symop, xyz )
     * 
     * returns a fractional coordinate vector xyz' which is input vector
     * xyz transformed by the input symop 'n_pqr' applied to the symmetry
     * equivalent matrix extracted from the category SPACE_GROUP_SYMOP.
     * @return FloatColumn
     */
    public FloatColumn getSymequiv() {
        return new DelegatingFloatColumn(parentBlock.getColumn("function_symequiv"));
    }

    /**
     * The function
     * m  =  SymKey( s )
     * 
     * returns an integer index to the Seitz matrices from the character
     * string of the form 'n_pqr'.
     * @return IntColumn
     */
    public IntColumn getSymkey() {
        return new DelegatingIntColumn(parentBlock.getColumn("function_symkey"));
    }

    /**
     * The function
     * v  =  SymLat( s )
     * 
     * returns a vector of the cell translations applied to the coordinates
     * from the character string of the form 'n_pqr'. i.e. p-5, q-5, r-5.
     * @return IntColumn
     */
    public IntColumn getSymlat() {
        return new DelegatingIntColumn(parentBlock.getColumn("function_symlat"));
    }

    /**
     * The function
     * s  =  Symop( n, t )
     * 
     * returns a character string of the form 'n_pqr' where n is the
     * symmetry equivalent site number and [p,q,r] is the cell translation
     * vector PLUS [5,5,5].
     * @return StrColumn
     */
    public StrColumn getSymop() {
        return new DelegatingStrColumn(parentBlock.getColumn("function_symop"));
    }

}