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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The lowest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFOM() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("FOM", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFOMAcentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("FOM_acentric", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getFOMCentric() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("FOM_centric", FloatColumn::new) :
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
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The total number of reflections phased in the native data set.
     * @return IntColumn
     */
    public IntColumn getReflns() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns", IntColumn::new) :
                getBinaryColumn("reflns"));
    }

    /**
     * The number of acentric reflections phased in the native data
     * set.
     * @return IntColumn
     */
    public IntColumn getReflnsAcentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_acentric", IntColumn::new) :
                getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of centric reflections phased in the native data
     * set.
     * @return IntColumn
     */
    public IntColumn getReflnsCentric() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("reflns_centric", IntColumn::new) :
                getBinaryColumn("reflns_centric"));
    }

    /**
     * Criterion used to limit the reflections used in the phasing
     * calculations.
     * @return StrColumn
     */
    public StrColumn getReflnsCriterion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reflns_criterion", StrColumn::new) :
                getBinaryColumn("reflns_criterion"));
    }

    /**
     * The number of derivatives used in this phasing experiment.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberDerivatives() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_derivatives", IntColumn::new) :
                getBinaryColumn("pdbx_number_derivatives"));
    }
}
