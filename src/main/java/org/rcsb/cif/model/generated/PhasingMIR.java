package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MIR category record details about
 * the phasing of the structure where methods involving isomorphous
 * replacement are involved.
 * 
 * All isomorphous-replacement-based techniques are covered
 * by this category, including single isomorphous replacement (SIR),
 * multiple isomorphous replacement (MIR) and single or multiple
 * isomorphous replacement plus anomalous scattering (SIRAS, MIRAS).
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhasingMIR extends BaseCategory {
    public PhasingMIR(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIR(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIR(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the isomorphous-replacement
     * phasing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The lowest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the highest resolution.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDResHigh() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", SingleRowFloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the lowest resolution.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDResLow() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", SingleRowFloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The mean value of the figure of merit m for all reflections
     * phased in the native data set.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFOM() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("FOM", SingleRowFloatColumn::new) :
                getBinaryColumn("FOM"));
    }

    /**
     * The mean value of the figure of merit m for the acentric
     * reflections phased in the native data set.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFOMAcentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("FOM_acentric", SingleRowFloatColumn::new) :
                getBinaryColumn("FOM_acentric"));
    }

    /**
     * The mean value of the figure of merit m for the centric
     * reflections phased in the native data set.
     * 
     * int P~alpha~ exp(i*alpha) dalpha
     * m = --------------------------------
     * int P~alpha~ dalpha
     * 
     * P~a~ = the probability that the phase angle a is correct
     * 
     * the integral is taken over the range alpha = 0 to 2 pi.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getFOMCentric() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("FOM_centric", SingleRowFloatColumn::new) :
                getBinaryColumn("FOM_centric"));
    }

    /**
     * A description of the MIR phasing method applied to phase this
     * structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the MIR phasing program.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The total number of reflections phased in the native data set.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflns() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns", SingleRowIntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * The number of acentric reflections phased in the native data
     * set.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflnsAcentric() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", SingleRowIntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of centric reflections phased in the native data
     * set.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getReflnsCentric() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", SingleRowIntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * Criterion used to limit the reflections used in the phasing
     * calculations.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReflnsCriterion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("reflns_criterion", SingleRowStrColumn::new) :
                getBinaryColumn("reflns_criterion"));
    }

    /**
     * The number of derivatives used in this phasing experiment.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberDerivatives() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_derivatives", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_derivatives"));
    }
}
