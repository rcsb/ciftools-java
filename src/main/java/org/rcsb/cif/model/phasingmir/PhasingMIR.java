package org.rcsb.cif.model.phasingmir;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The lowest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the highest resolution.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value in angstroms for the interplanar spacings
     * for the reflection data used for the native data set. This is
     * called the lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
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
     * @return FOM
     */
    public FOM getFOM() {
        return (FOM) (isText ? textFields.computeIfAbsent("FOM",
                FOM::new) : getBinaryColumn("FOM"));
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
     * @return FOMAcentric
     */
    public FOMAcentric getFOMAcentric() {
        return (FOMAcentric) (isText ? textFields.computeIfAbsent("FOM_acentric",
                FOMAcentric::new) : getBinaryColumn("FOM_acentric"));
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
     * @return FOMCentric
     */
    public FOMCentric getFOMCentric() {
        return (FOMCentric) (isText ? textFields.computeIfAbsent("FOM_centric",
                FOMCentric::new) : getBinaryColumn("FOM_centric"));
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
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The total number of reflections phased in the native data set.
     * @return Reflns
     */
    public Reflns getReflns() {
        return (Reflns) (isText ? textFields.computeIfAbsent("reflns",
                Reflns::new) : getBinaryColumn("reflns"));
    }

    /**
     * The number of acentric reflections phased in the native data
     * set.
     * @return ReflnsAcentric
     */
    public ReflnsAcentric getReflnsAcentric() {
        return (ReflnsAcentric) (isText ? textFields.computeIfAbsent("reflns_acentric",
                ReflnsAcentric::new) : getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of centric reflections phased in the native data
     * set.
     * @return ReflnsCentric
     */
    public ReflnsCentric getReflnsCentric() {
        return (ReflnsCentric) (isText ? textFields.computeIfAbsent("reflns_centric",
                ReflnsCentric::new) : getBinaryColumn("reflns_centric"));
    }

    /**
     * Criterion used to limit the reflections used in the phasing
     * calculations.
     * @return ReflnsCriterion
     */
    public ReflnsCriterion getReflnsCriterion() {
        return (ReflnsCriterion) (isText ? textFields.computeIfAbsent("reflns_criterion",
                ReflnsCriterion::new) : getBinaryColumn("reflns_criterion"));
    }

    /**
     * The number of derivatives used in this phasing experiment.
     * @return PdbxNumberDerivatives
     */
    public PdbxNumberDerivatives getPdbxNumberDerivatives() {
        return (PdbxNumberDerivatives) (isText ? textFields.computeIfAbsent("pdbx_number_derivatives",
                PdbxNumberDerivatives::new) : getBinaryColumn("pdbx_number_derivatives"));
    }
}
