package org.rcsb.cif.model.refinelsrestr;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefineLsRestr extends BaseCategory {
    public RefineLsRestr(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineLsRestr(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineLsRestr(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_ls_restr.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * A criterion used to define a parameter value that deviates
     * significantly from its ideal value in the model obtained by
     * restrained least-squares refinement.
     * @return Criterion
     */
    public Criterion getCriterion() {
        return (Criterion) (isText ? textFields.computeIfAbsent("criterion",
                Criterion::new) : getBinaryColumn("criterion"));
    }

    /**
     * For the given parameter type, the root-mean-square deviation
     * between the ideal values used as restraints in the least-squares
     * refinement and the values obtained by refinement. For instance,
     * bond distances may deviate by 0.018 \%A (r.m.s.) from ideal
     * values in the current model.
     * @return DevIdeal
     */
    public DevIdeal getDevIdeal() {
        return (DevIdeal) (isText ? textFields.computeIfAbsent("dev_ideal",
                DevIdeal::new) : getBinaryColumn("dev_ideal"));
    }

    /**
     * For the given parameter type, the target root-mean-square
     * deviation between the ideal values used as restraints in the
     * least-squares refinement and the values obtained by refinement.
     * @return DevIdealTarget
     */
    public DevIdealTarget getDevIdealTarget() {
        return (DevIdealTarget) (isText ? textFields.computeIfAbsent("dev_ideal_target",
                DevIdealTarget::new) : getBinaryColumn("dev_ideal_target"));
    }

    /**
     * The number of parameters of this type subjected to restraint in
     * least-squares refinement.
     * @return Number
     */
    public Number getNumber() {
        return (Number) (isText ? textFields.computeIfAbsent("number",
                Number::new) : getBinaryColumn("number"));
    }

    /**
     * The number of parameters of this type that deviate from ideal
     * values by more than the amount defined in
     * _refine_ls_restr.criterion in the model obtained by restrained
     * least-squares refinement.
     * @return Rejects
     */
    public Rejects getRejects() {
        return (Rejects) (isText ? textFields.computeIfAbsent("rejects",
                Rejects::new) : getBinaryColumn("rejects"));
    }

    /**
     * The type of the parameter being restrained.
     * Explicit sets of data values are provided for the programs
     * PROTIN/PROLSQ (beginning with p_) and RESTRAIN (beginning with
     * RESTRAIN_). As computer programs change, these data values
     * are given as examples, not as an enumeration list. Computer
     * programs that convert a data block to a refinement table will
     * expect the exact form of the data values given here to be used.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The weighting value applied to this type of restraint in
     * the least-squares refinement.
     * @return Weight
     */
    public Weight getWeight() {
        return (Weight) (isText ? textFields.computeIfAbsent("weight",
                Weight::new) : getBinaryColumn("weight"));
    }

    /**
     * The functional form of the restraint function used in the least-squares
     * refinement.
     * @return PdbxRestraintFunction
     */
    public PdbxRestraintFunction getPdbxRestraintFunction() {
        return (PdbxRestraintFunction) (isText ? textFields.computeIfAbsent("pdbx_restraint_function",
                PdbxRestraintFunction::new) : getBinaryColumn("pdbx_restraint_function"));
    }
}
