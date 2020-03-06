package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_B_ISO category record details about
 * the treatment of isotropic B factors (displacement parameters)
 * during refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineBIso extends DelegatingCategory {
    public RefineBIso(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "class":
                return getClazz();
            case "details":
                return getDetails();
            case "treatment":
                return getTreatment();
            case "value":
                return getValue();
            case "pdbx_residue_name":
                return getPdbxResidueName();
            case "pdbx_strand":
                return getPdbxStrand();
            case "pdbx_residue_num":
                return getPdbxResidueNum();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_B_iso.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * A class of atoms treated similarly for isotropic B-factor
     * (displacement-parameter) refinement.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return delegate.getColumn("class", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the isotropic B-factor
     * (displacement-parameter) refinement for the class of atoms
     * described in _refine_B_iso.class.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The treatment of isotropic B-factor (displacement-parameter)
     * refinement for a class of atoms defined in _refine_B_iso.class.
     * @return StrColumn
     */
    public StrColumn getTreatment() {
        return delegate.getColumn("treatment", DelegatingStrColumn::new);
    }

    /**
     * The value of the isotropic B factor (displacement parameter)
     * assigned to a class of atoms defined in _refine_B_iso.class.
     * Meaningful only for atoms with fixed isotropic B factors.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * Residue name of those residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxResidueName() {
        return delegate.getColumn("pdbx_residue_name", DelegatingStrColumn::new);
    }

    /**
     * Asym chain id of residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxStrand() {
        return delegate.getColumn("pdbx_strand", DelegatingStrColumn::new);
    }

    /**
     * Resiude number of residues treated similarly for
     * isotropic B (temperature) factor refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxResidueNum() {
        return delegate.getColumn("pdbx_residue_num", DelegatingStrColumn::new);
    }

}