package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the VALENCE_PARAM category define the
 * parameters used for calculating bond valences from bond
 * lengths.  In addition to the parameters, a pointer
 * is given to the reference (in VALENCE_REF) from which
 * the bond-valence parameters were taken.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ValenceParam extends DelegatingCategory {
    public ValenceParam(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "atom_1":
                return getAtom1();
            case "atom_1_valence":
                return getAtom1Valence();
            case "atom_2":
                return getAtom2();
            case "atom_2_valence":
                return getAtom2Valence();
            case "B":
                return getB();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "ref_id":
                return getRefId();
            case "Ro":
                return getRo();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The element symbol of the first atom forming the bond whose
     * bond-valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom1() {
        return delegate.getColumn("atom_1", DelegatingStrColumn::new);
    }

    /**
     * The valence (formal charge) of the first atom whose
     * bond-valence parameters are given in this category.
     * @return IntColumn
     */
    public IntColumn getAtom1Valence() {
        return delegate.getColumn("atom_1_valence", DelegatingIntColumn::new);
    }

    /**
     * The element symbol of the second atom forming the bond whose
     * bond-valence parameters are given in this category.
     * @return StrColumn
     */
    public StrColumn getAtom2() {
        return delegate.getColumn("atom_2", DelegatingStrColumn::new);
    }

    /**
     * The valence (formal charge) of the second atom whose
     * bond-valence parameters are given in this category.
     * @return IntColumn
     */
    public IntColumn getAtom2Valence() {
        return delegate.getColumn("atom_2_valence", DelegatingIntColumn::new);
    }

    /**
     * The bond-valence parameter B used in the expression
     * 
     * s = exp[(Ro - R)/B]
     * 
     * where s is the valence of a bond of length R.
     * @return FloatColumn
     */
    public FloatColumn getB() {
        return delegate.getColumn("B", DelegatingFloatColumn::new);
    }

    /**
     * Details of or comments on the bond-valence parameters.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the valence parameters of a bond between
     * the given atoms.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * An identifier which links to the reference to the source
     * from which the bond-valence parameters are taken. A child
     * of _valence_ref.id which it must match.
     * @return StrColumn
     */
    public StrColumn getRefId() {
        return delegate.getColumn("ref_id", DelegatingStrColumn::new);
    }

    /**
     * The bond-valence parameter Ro used in the expression
     * 
     * s = exp[(Ro - R)/B]
     * 
     * where s is the valence of a bond of length R.
     * @return FloatColumn
     */
    public FloatColumn getRo() {
        return delegate.getColumn("Ro", DelegatingFloatColumn::new);
    }

}