package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_LS_RESTR category record details about
 * the restraints applied to various classes of parameters during
 * the least-squares refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineLsRestr extends DelegatingCategory {
    public RefineLsRestr(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "criterion":
                return getCriterion();
            case "dev_ideal":
                return getDevIdeal();
            case "dev_ideal_target":
                return getDevIdealTarget();
            case "number":
                return getNumber();
            case "rejects":
                return getRejects();
            case "type":
                return getType();
            case "weight":
                return getWeight();
            case "pdbx_restraint_function":
                return getPdbxRestraintFunction();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_ls_restr.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * A criterion used to define a parameter value that deviates
     * significantly from its ideal value in the model obtained by
     * restrained least-squares refinement.
     * @return StrColumn
     */
    public StrColumn getCriterion() {
        return delegate.getColumn("criterion", DelegatingStrColumn::new);
    }

    /**
     * For the given parameter type, the root-mean-square deviation
     * between the ideal values used as restraints in the least-squares
     * refinement and the values obtained by refinement. For instance,
     * bond distances may deviate by 0.018 \%A (r.m.s.) from ideal
     * values in the current model.
     * @return FloatColumn
     */
    public FloatColumn getDevIdeal() {
        return delegate.getColumn("dev_ideal", DelegatingFloatColumn::new);
    }

    /**
     * For the given parameter type, the target root-mean-square
     * deviation between the ideal values used as restraints in the
     * least-squares refinement and the values obtained by refinement.
     * @return FloatColumn
     */
    public FloatColumn getDevIdealTarget() {
        return delegate.getColumn("dev_ideal_target", DelegatingFloatColumn::new);
    }

    /**
     * The number of parameters of this type subjected to restraint in
     * least-squares refinement.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * The number of parameters of this type that deviate from ideal
     * values by more than the amount defined in
     * _refine_ls_restr.criterion in the model obtained by restrained
     * least-squares refinement.
     * @return IntColumn
     */
    public IntColumn getRejects() {
        return delegate.getColumn("rejects", DelegatingIntColumn::new);
    }

    /**
     * The type of the parameter being restrained.
     * Explicit sets of data values are provided for the programs
     * PROTIN/PROLSQ (beginning with p_) and RESTRAIN (beginning with
     * RESTRAIN_). As computer programs change, these data values
     * are given as examples, not as an enumeration list. Computer
     * programs that convert a data block to a refinement table will
     * expect the exact form of the data values given here to be used.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The weighting value applied to this type of restraint in
     * the least-squares refinement.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return delegate.getColumn("weight", DelegatingFloatColumn::new);
    }

    /**
     * The functional form of the restraint function used in the least-squares
     * refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxRestraintFunction() {
        return delegate.getColumn("pdbx_restraint_function", DelegatingStrColumn::new);
    }

}