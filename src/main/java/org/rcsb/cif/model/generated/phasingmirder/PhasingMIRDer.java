package org.rcsb.cif.model.generated.phasingmirder;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhasingMIRDer extends BaseCategory {
    public PhasingMIRDer(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMIRDer(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMIRDer(String name) {
        super(name);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for this derivative. This is called the
     * highest resolution.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for  the interplanar spacings for the
     * reflection data used for this derivative. This is called the
     * lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * The data set that was treated as the derivative in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return DerSetId
     */
    public DerSetId getDerSetId() {
        return (DerSetId) (isText ? textFields.computeIfAbsent("der_set_id",
                DerSetId::new) : getBinaryColumn("der_set_id"));
    }

    /**
     * A description of special aspects of this derivative, its data,
     * its solution or its use in phasing.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _phasing_MIR_der.id must uniquely identify
     * a record in the PHASING_MIR_DER list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The data set that was treated as the native in this
     * experiment.
     * 
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return NativeSetId
     */
    public NativeSetId getNativeSetId() {
        return (NativeSetId) (isText ? textFields.computeIfAbsent("native_set_id",
                NativeSetId::new) : getBinaryColumn("native_set_id"));
    }

    /**
     * The number of heavy-atom sites in this derivative.
     * @return NumberOfSites
     */
    public NumberOfSites getNumberOfSites() {
        return (NumberOfSites) (isText ? textFields.computeIfAbsent("number_of_sites",
                NumberOfSites::new) : getBinaryColumn("number_of_sites"));
    }

    /**
     * The mean phasing power P for acentric reflections for this
     * derivative.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of this
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of this
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return PowerAcentric
     */
    public PowerAcentric getPowerAcentric() {
        return (PowerAcentric) (isText ? textFields.computeIfAbsent("power_acentric",
                PowerAcentric::new) : getBinaryColumn("power_acentric"));
    }

    /**
     * The mean phasing power P for centric reflections for this
     * derivative.
     * 
     * sum|Fh~calc~^2^|
     * P = (----------------------------)^1/2^
     * sum|Fph~obs~ - Fph~calc~|^2^
     * 
     * Fph~obs~  = the observed structure-factor amplitude of the
     * derivative
     * Fph~calc~ = the calculated structure-factor amplitude of the
     * derivative
     * Fh~calc~  = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * @return PowerCentric
     */
    public PowerCentric getPowerCentric() {
        return (PowerCentric) (isText ? textFields.computeIfAbsent("power_centric",
                PowerCentric::new) : getBinaryColumn("power_centric"));
    }

    /**
     * Residual factor R~cullis,acen~ for acentric reflections for this
     * derivative.
     * 
     * The Cullis R factor was originally defined only for centric
     * reflections.  It is, however, also a useful statistical
     * measure for acentric reflections, which is how it is used in
     * this data item.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis,acen~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * & North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return RCullisAcentric
     */
    public RCullisAcentric getRCullisAcentric() {
        return (RCullisAcentric) (isText ? textFields.computeIfAbsent("R_cullis_acentric",
                RCullisAcentric::new) : getBinaryColumn("R_cullis_acentric"));
    }

    /**
     * Residual factor R~cullis,ano~ for anomalous reflections for this
     * derivative.
     * 
     * The Cullis R factor was originally defined only for centric
     * reflections.  It is, however, also a useful statistical
     * measure for anomalous  reflections, which is how it is used in
     * this data item.
     * 
     * This is tabulated for acentric terms.  A value less than 1.0
     * means there is some contribution to the phasing from the
     * anomalous data.
     * 
     * sum |Fph+~obs~Fph-~obs~ - Fh+~calc~ - Fh-~calc~|
     * R~cullis,ano~ = ------------------------------------------------
     * sum|Fph+~obs~ - Fph-~obs~|
     * 
     * Fph+~obs~  = the observed positive Friedel structure-factor
     * amplitude for the derivative
     * Fph-~obs~  = the observed negative Friedel structure-factor
     * amplitude for the derivative
     * 
     * Fh+~calc~  = the calculated positive Friedel structure-factor
     * amplitude from the heavy-atom model
     * Fh-~calc~  = the calculated negative Friedel structure-factor
     * amplitude from the heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * & North, A. C. T. (1961). Proc. R. Soc.  London Ser. A,
     * 265, 15-38.
     * @return RCullisAnomalous
     */
    public RCullisAnomalous getRCullisAnomalous() {
        return (RCullisAnomalous) (isText ? textFields.computeIfAbsent("R_cullis_anomalous",
                RCullisAnomalous::new) : getBinaryColumn("R_cullis_anomalous"));
    }

    /**
     * Residual factor R~cullis~ for centric reflections for this
     * derivative.
     * 
     * sum| |Fph~obs~ +/- Fp~obs~| - Fh~calc~ |
     * R~cullis~ = ----------------------------------------
     * sum|Fph~obs~ - Fp~obs~|
     * 
     * Fp~obs~  = the observed structure-factor amplitude of the native
     * Fph~obs~ = the observed structure-factor amplitude of the
     * derivative
     * Fh~calc~ = the calculated structure-factor amplitude from the
     * heavy-atom model
     * 
     * sum is taken over the specified reflections
     * 
     * Ref: Cullis, A. F., Muirhead, H., Perutz, M. F., Rossmann, M. G.
     * & North, A. C. T. (1961). Proc. R. Soc. London Ser. A,
     * 265, 15-38.
     * @return RCullisCentric
     */
    public RCullisCentric getRCullisCentric() {
        return (RCullisCentric) (isText ? textFields.computeIfAbsent("R_cullis_centric",
                RCullisCentric::new) : getBinaryColumn("R_cullis_centric"));
    }

    /**
     * The number of acentric reflections used in phasing for this
     * derivative.
     * @return ReflnsAcentric
     */
    public ReflnsAcentric getReflnsAcentric() {
        return (ReflnsAcentric) (isText ? textFields.computeIfAbsent("reflns_acentric",
                ReflnsAcentric::new) : getBinaryColumn("reflns_acentric"));
    }

    /**
     * The number of anomalous reflections used in phasing for this
     * derivative.
     * @return ReflnsAnomalous
     */
    public ReflnsAnomalous getReflnsAnomalous() {
        return (ReflnsAnomalous) (isText ? textFields.computeIfAbsent("reflns_anomalous",
                ReflnsAnomalous::new) : getBinaryColumn("reflns_anomalous"));
    }

    /**
     * The number of centric reflections used in phasing for this
     * derivative.
     * @return ReflnsCentric
     */
    public ReflnsCentric getReflnsCentric() {
        return (ReflnsCentric) (isText ? textFields.computeIfAbsent("reflns_centric",
                ReflnsCentric::new) : getBinaryColumn("reflns_centric"));
    }

    /**
     * Criteria used to limit the reflections used in the phasing
     * calculations.
     * @return ReflnsCriteria
     */
    public ReflnsCriteria getReflnsCriteria() {
        return (ReflnsCriteria) (isText ? textFields.computeIfAbsent("reflns_criteria",
                ReflnsCriteria::new) : getBinaryColumn("reflns_criteria"));
    }

    /**
     * record R_kraut obtained from centric data for each derivative.
     * @return PdbxRKrautCentric
     */
    public PdbxRKrautCentric getPdbxRKrautCentric() {
        return (PdbxRKrautCentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_centric",
                PdbxRKrautCentric::new) : getBinaryColumn("pdbx_R_kraut_centric"));
    }

    /**
     * record R_kraut obtained from acentric data for each derivative.
     * @return PdbxRKrautAcentric
     */
    public PdbxRKrautAcentric getPdbxRKrautAcentric() {
        return (PdbxRKrautAcentric) (isText ? textFields.computeIfAbsent("pdbx_R_kraut_acentric",
                PdbxRKrautAcentric::new) : getBinaryColumn("pdbx_R_kraut_acentric"));
    }

    /**
     * record R_kraut obtained from all data data for each derivative.
     * @return PdbxRKraut
     */
    public PdbxRKraut getPdbxRKraut() {
        return (PdbxRKraut) (isText ? textFields.computeIfAbsent("pdbx_R_kraut",
                PdbxRKraut::new) : getBinaryColumn("pdbx_R_kraut"));
    }

    /**
     * record lack of closure obtained from centric data for
     * each derivative.
     * @return PdbxLocCentric
     */
    public PdbxLocCentric getPdbxLocCentric() {
        return (PdbxLocCentric) (isText ? textFields.computeIfAbsent("pdbx_loc_centric",
                PdbxLocCentric::new) : getBinaryColumn("pdbx_loc_centric"));
    }

    /**
     * record lack of closure obtained from acentric data for
     * each derivative.
     * @return PdbxLocAcentric
     */
    public PdbxLocAcentric getPdbxLocAcentric() {
        return (PdbxLocAcentric) (isText ? textFields.computeIfAbsent("pdbx_loc_acentric",
                PdbxLocAcentric::new) : getBinaryColumn("pdbx_loc_acentric"));
    }

    /**
     * record lack of closure obtained from all data for
     * each derivative.
     * @return PdbxLoc
     */
    public PdbxLoc getPdbxLoc() {
        return (PdbxLoc) (isText ? textFields.computeIfAbsent("pdbx_loc",
                PdbxLoc::new) : getBinaryColumn("pdbx_loc"));
    }

    /**
     * record figure of merit obtained from centric data for
     * each derivative.
     * @return PdbxFomCentric
     */
    public PdbxFomCentric getPdbxFomCentric() {
        return (PdbxFomCentric) (isText ? textFields.computeIfAbsent("pdbx_fom_centric",
                PdbxFomCentric::new) : getBinaryColumn("pdbx_fom_centric"));
    }

    /**
     * record figure of merit obtained from acentric data for
     * each derivative.
     * @return PdbxFomAcentric
     */
    public PdbxFomAcentric getPdbxFomAcentric() {
        return (PdbxFomAcentric) (isText ? textFields.computeIfAbsent("pdbx_fom_acentric",
                PdbxFomAcentric::new) : getBinaryColumn("pdbx_fom_acentric"));
    }

    /**
     * record figure of merit obtained from all data for
     * each derivative.
     * @return PdbxFom
     */
    public PdbxFom getPdbxFom() {
        return (PdbxFom) (isText ? textFields.computeIfAbsent("pdbx_fom",
                PdbxFom::new) : getBinaryColumn("pdbx_fom"));
    }

    /**
     * record phasing power for each derivative.
     * @return PdbxPower
     */
    public PdbxPower getPdbxPower() {
        return (PdbxPower) (isText ? textFields.computeIfAbsent("pdbx_power",
                PdbxPower::new) : getBinaryColumn("pdbx_power"));
    }

    /**
     * record R_cullis for each derivative.
     * @return PdbxRCullis
     */
    public PdbxRCullis getPdbxRCullis() {
        return (PdbxRCullis) (isText ? textFields.computeIfAbsent("pdbx_R_cullis",
                PdbxRCullis::new) : getBinaryColumn("pdbx_R_cullis"));
    }

    /**
     * record number of reflections used for each derivative.
     * @return PdbxReflns
     */
    public PdbxReflns getPdbxReflns() {
        return (PdbxReflns) (isText ? textFields.computeIfAbsent("pdbx_reflns",
                PdbxReflns::new) : getBinaryColumn("pdbx_reflns"));
    }
}
