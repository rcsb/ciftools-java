package org.rcsb.cif.model.phasingmadset;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PhasingMADSet extends BaseCategory {
    public PhasingMADSet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMADSet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMADSet(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _phasing_MAD_clust.id in
     * the PHASING_MAD_CLUST category.
     * @return ClustId
     */
    public ClustId getClustId() {
        return (ClustId) (isText ? textFields.computeIfAbsent("clust_id",
                ClustId::new) : getBinaryColumn("clust_id"));
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for this set of data. This is called
     * the highest resolution.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data used for this set of data. This is called
     * the lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return ExptId
     */
    public ExptId getExptId() {
        return (ExptId) (isText ? textFields.computeIfAbsent("expt_id",
                ExptId::new) : getBinaryColumn("expt_id"));
    }

    /**
     * The f'' component of the anomalous scattering factor for this
     * wavelength.
     * @return FDoublePrime
     */
    public FDoublePrime getFDoublePrime() {
        return (FDoublePrime) (isText ? textFields.computeIfAbsent("f_double_prime",
                FDoublePrime::new) : getBinaryColumn("f_double_prime"));
    }

    /**
     * The f' component of the anomalous scattering factor for this
     * wavelength.
     * @return FPrime
     */
    public FPrime getFPrime() {
        return (FPrime) (isText ? textFields.computeIfAbsent("f_prime",
                FPrime::new) : getBinaryColumn("f_prime"));
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return SetId
     */
    public SetId getSetId() {
        return (SetId) (isText ? textFields.computeIfAbsent("set_id",
                SetId::new) : getBinaryColumn("set_id"));
    }

    /**
     * The wavelength at which this data set was measured.
     * @return Wavelength
     */
    public Wavelength getWavelength() {
        return (Wavelength) (isText ? textFields.computeIfAbsent("wavelength",
                Wavelength::new) : getBinaryColumn("wavelength"));
    }

    /**
     * A descriptor for this wavelength in this cluster of data sets.
     * @return WavelengthDetails
     */
    public WavelengthDetails getWavelengthDetails() {
        return (WavelengthDetails) (isText ? textFields.computeIfAbsent("wavelength_details",
                WavelengthDetails::new) : getBinaryColumn("wavelength_details"));
    }

    /**
     * record the type of heavy atoms which produce anomolous singal.
     * @return PdbxAtomType
     */
    public PdbxAtomType getPdbxAtomType() {
        return (PdbxAtomType) (isText ? textFields.computeIfAbsent("pdbx_atom_type",
                PdbxAtomType::new) : getBinaryColumn("pdbx_atom_type"));
    }

    /**
     * record the refined f_prime (not from experiment).
     * @return PdbxFPrimeRefined
     */
    public PdbxFPrimeRefined getPdbxFPrimeRefined() {
        return (PdbxFPrimeRefined) (isText ? textFields.computeIfAbsent("pdbx_f_prime_refined",
                PdbxFPrimeRefined::new) : getBinaryColumn("pdbx_f_prime_refined"));
    }

    /**
     * record the refined f_double_prime (not from experiment).
     * @return PdbxFDoublePrimeRefined
     */
    public PdbxFDoublePrimeRefined getPdbxFDoublePrimeRefined() {
        return (PdbxFDoublePrimeRefined) (isText ? textFields.computeIfAbsent("pdbx_f_double_prime_refined",
                PdbxFDoublePrimeRefined::new) : getBinaryColumn("pdbx_f_double_prime_refined"));
    }
}
