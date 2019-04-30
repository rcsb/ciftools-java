package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_LS_RESTR category record details about
 * the restraints applied to various classes of parameters during
 * the least-squares refinement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * A criterion used to define a parameter value that deviates
     * significantly from its ideal value in the model obtained by
     * restrained least-squares refinement.
     * @return StrColumn
     */
    public StrColumn getCriterion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("criterion", StrColumn::new) :
                getBinaryColumn("criterion"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dev_ideal", FloatColumn::new) :
                getBinaryColumn("dev_ideal"));
    }

    /**
     * For the given parameter type, the target root-mean-square
     * deviation between the ideal values used as restraints in the
     * least-squares refinement and the values obtained by refinement.
     * @return FloatColumn
     */
    public FloatColumn getDevIdealTarget() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dev_ideal_target", FloatColumn::new) :
                getBinaryColumn("dev_ideal_target"));
    }

    /**
     * The number of parameters of this type subjected to restraint in
     * least-squares refinement.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number", IntColumn::new) :
                getBinaryColumn("number"));
    }

    /**
     * The number of parameters of this type that deviate from ideal
     * values by more than the amount defined in
     * _refine_ls_restr.criterion in the model obtained by restrained
     * least-squares refinement.
     * @return IntColumn
     */
    public IntColumn getRejects() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("rejects", IntColumn::new) :
                getBinaryColumn("rejects"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The weighting value applied to this type of restraint in
     * the least-squares refinement.
     * @return FloatColumn
     */
    public FloatColumn getWeight() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weight", FloatColumn::new) :
                getBinaryColumn("weight"));
    }

    /**
     * The functional form of the restraint function used in the least-squares
     * refinement.
     * @return StrColumn
     */
    public StrColumn getPdbxRestraintFunction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_restraint_function", StrColumn::new) :
                getBinaryColumn("pdbx_restraint_function"));
    }
}
