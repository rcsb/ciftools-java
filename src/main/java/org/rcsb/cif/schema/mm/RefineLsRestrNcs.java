package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_LS_RESTR_NCS category record details
 * about the restraints applied to atom positions in domains
 * related by noncrystallographic symmetry during least-squares
 * refinement, and also about the deviation of the restrained
 * atomic parameters at the end of the refinement.  It is
 * expected that these values will only be reported once for each
 * set of restrained domains.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineLsRestrNcs extends DelegatingCategory {
    public RefineLsRestrNcs(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "dom_id":
                return getDomId();
            case "ncs_model_details":
                return getNcsModelDetails();
            case "rms_dev_B_iso":
                return getRmsDevBIso();
            case "rms_dev_position":
                return getRmsDevPosition();
            case "weight_B_iso":
                return getWeightBIso();
            case "weight_position":
                return getWeightPosition();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            case "pdbx_type":
                return getPdbxType();
            case "pdbx_asym_id":
                return getPdbxAsymId();
            case "pdbx_auth_asym_id":
                return getPdbxAuthAsymId();
            case "pdbx_number":
                return getPdbxNumber();
            case "pdbx_rms":
                return getPdbxRms();
            case "pdbx_weight":
                return getPdbxWeight();
            case "pdbx_ens_id":
                return getPdbxEnsId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_ls_restr_ncs.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_ncs_dom.id in the
     * STRUCT_NCS_DOM category.
     * @return StrColumn
     */
    public StrColumn getDomId() {
        return delegate.getColumn("dom_id", DelegatingStrColumn::new);
    }

    /**
     * Special aspects of the manner in which noncrystallographic
     * restraints were applied to atomic parameters in the domain
     * specified by _refine_ls_restr_ncs.dom_id and equivalent
     * atomic parameters in the domains against which it was restrained.
     * @return StrColumn
     */
    public StrColumn getNcsModelDetails() {
        return delegate.getColumn("ncs_model_details", DelegatingStrColumn::new);
    }

    /**
     * The root-mean-square deviation in equivalent isotropic
     * displacement parameters in the domain specified by
     * _refine_ls_restr_ncs.dom_id
     * and in the domains against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getRmsDevBIso() {
        return delegate.getColumn("rms_dev_B_iso", DelegatingFloatColumn::new);
    }

    /**
     * The root-mean-square deviation in equivalent atom positions in
     * the domain specified by _refine_ls_restr_ncs.dom_id and in the
     * domains against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getRmsDevPosition() {
        return delegate.getColumn("rms_dev_position", DelegatingFloatColumn::new);
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of isotropic displacement
     * parameters in  the domain specified by
     * _refine_ls_restr_ncs.dom_id to equivalent isotropic
     * displacement parameters in the domains against
     * which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getWeightBIso() {
        return delegate.getColumn("weight_B_iso", DelegatingFloatColumn::new);
    }

    /**
     * The value of the weighting coefficient used in
     * noncrystallographic symmetry restraint of atom positions in the
     * domain specified by _refine_ls_restr_ncs.dom_id to equivalent
     * atom positions in the domains against which it was restrained.
     * @return FloatColumn
     */
    public FloatColumn getWeightPosition() {
        return delegate.getColumn("weight_position", DelegatingFloatColumn::new);
    }

    /**
     * An ordinal index for the list of NCS restraints.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The type of NCS restraint. (for example: tight positional)
     * @return StrColumn
     */
    public StrColumn getPdbxType() {
        return delegate.getColumn("pdbx_type", DelegatingStrColumn::new);
    }

    /**
     * A reference to  _struct_asym.id.
     * @return StrColumn
     */
    public StrColumn getPdbxAsymId() {
        return delegate.getColumn("pdbx_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A reference to the PDB Chain ID
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return delegate.getColumn("pdbx_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Records the number restraints in the contributing to the RMS statistic.
     * @return IntColumn
     */
    public IntColumn getPdbxNumber() {
        return delegate.getColumn("pdbx_number", DelegatingIntColumn::new);
    }

    /**
     * Records the standard deviation in the restraint between NCS related domains.
     * @return FloatColumn
     */
    public FloatColumn getPdbxRms() {
        return delegate.getColumn("pdbx_rms", DelegatingFloatColumn::new);
    }

    /**
     * Records the weight used for NCS restraint.
     * @return FloatColumn
     */
    public FloatColumn getPdbxWeight() {
        return delegate.getColumn("pdbx_weight", DelegatingFloatColumn::new);
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_dom.pdbx_ens_id'.
     * @return StrColumn
     */
    public StrColumn getPdbxEnsId() {
        return delegate.getColumn("pdbx_ens_id", DelegatingStrColumn::new);
    }

}