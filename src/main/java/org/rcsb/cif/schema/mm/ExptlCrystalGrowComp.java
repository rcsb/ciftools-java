package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EXPTL_CRYSTAL_GROW_COMP category record
 * details about the components of the solutions that were 'mixed'
 * (by whatever means) to produce the crystal.
 * 
 * In general, solution 1 is the solution that contains the
 * molecule to be crystallized and solution 2 is the solution
 * that contains the precipitant. However, the number of solutions
 * required to describe the crystallization protocol is not limited
 * to 2.
 * 
 * Details of the crystallization protocol should be given in
 * _exptl_crystal_grow_comp.details using the solutions
 * described in EXPTL_CRYSTAL_GROW_COMP.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystalGrowComp extends DelegatingCategory {
    public ExptlCrystalGrowComp(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "conc":
                return getConc();
            case "details":
                return getDetails();
            case "crystal_id":
                return getCrystalId();
            case "id":
                return getId();
            case "name":
                return getName();
            case "sol_id":
                return getSolId();
            case "volume":
                return getVolume();
            case "pdbx_conc_final":
                return getPdbxConcFinal();
            case "pdbx_bath":
                return getPdbxBath();
            case "pdbx_salt":
                return getPdbxSalt();
            case "pdbx_soak_salt":
                return getPdbxSoakSalt();
            case "pdbx_soak_solv":
                return getPdbxSoakSolv();
            case "pdbx_solv":
                return getPdbxSolv();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The concentration of the solution component.
     * @return StrColumn
     */
    public StrColumn getConc() {
        return delegate.getColumn("conc", DelegatingStrColumn::new);
    }

    /**
     * A description of any special aspects of the solution component.
     * When the solution component is the one that contains the
     * macromolecule, this could be the specification of the buffer in
     * which the macromolecule was stored. When the solution component
     * is a buffer component, this could be the methods (or formula)
     * used to achieve a desired pH.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _exptl_crystal_grow_comp.id must uniquely identify
     * each item in the EXPTL_CRYSTAL_GROW_COMP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A common name for the component of the solution.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the solution to which the given solution
     * component belongs.
     * @return StrColumn
     */
    public StrColumn getSolId() {
        return delegate.getColumn("sol_id", DelegatingStrColumn::new);
    }

    /**
     * The volume of the solution component.
     * @return StrColumn
     */
    public StrColumn getVolume() {
        return delegate.getColumn("volume", DelegatingStrColumn::new);
    }

    /**
     * The concentration of this component in the final
     * crystallization solution. This data item should
     * include units of concentration.
     * @return StrColumn
     */
    public StrColumn getPdbxConcFinal() {
        return delegate.getColumn("pdbx_conc_final", DelegatingStrColumn::new);
    }

    /**
     * The identification of the cystallization bath.
     * @return StrColumn
     */
    public StrColumn getPdbxBath() {
        return delegate.getColumn("pdbx_bath", DelegatingStrColumn::new);
    }

    /**
     * The identification of the crystallization salt.
     * @return StrColumn
     */
    public StrColumn getPdbxSalt() {
        return delegate.getColumn("pdbx_salt", DelegatingStrColumn::new);
    }

    /**
     * The identification of the crystallization soaking salt.
     * @return StrColumn
     */
    public StrColumn getPdbxSoakSalt() {
        return delegate.getColumn("pdbx_soak_salt", DelegatingStrColumn::new);
    }

    /**
     * The identification of the crystallization soaking solvent
     * @return StrColumn
     */
    public StrColumn getPdbxSoakSolv() {
        return delegate.getColumn("pdbx_soak_solv", DelegatingStrColumn::new);
    }

    /**
     * The identification of the crystallization solvent.
     * @return StrColumn
     */
    public StrColumn getPdbxSolv() {
        return delegate.getColumn("pdbx_solv", DelegatingStrColumn::new);
    }

}