package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MAD_SET category record
 * details about the individual data sets used in a MAD phasing
 * experiment.
 */
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
     * @return StrColumn
     */
    public StrColumn getClustId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("clust_id", StrColumn::new) :
                getBinaryColumn("clust_id"));
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data used for this set of data. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data used for this set of data. This is called
     * the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * This data item is a pointer to _phasing_MAD_expt.id in the
     * PHASING_MAD_EXPT category.
     * @return StrColumn
     */
    public StrColumn getExptId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("expt_id", StrColumn::new) :
                getBinaryColumn("expt_id"));
    }

    /**
     * The f'' component of the anomalous scattering factor for this
     * wavelength.
     * @return FloatColumn
     */
    public FloatColumn getFDoublePrime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("f_double_prime", FloatColumn::new) :
                getBinaryColumn("f_double_prime"));
    }

    /**
     * The f' component of the anomalous scattering factor for this
     * wavelength.
     * @return FloatColumn
     */
    public FloatColumn getFPrime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("f_prime", FloatColumn::new) :
                getBinaryColumn("f_prime"));
    }

    /**
     * This data item is a pointer to _phasing_set.id in the
     * PHASING_SET category.
     * @return StrColumn
     */
    public StrColumn getSetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("set_id", StrColumn::new) :
                getBinaryColumn("set_id"));
    }

    /**
     * The wavelength at which this data set was measured.
     * @return FloatColumn
     */
    public FloatColumn getWavelength() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wavelength", FloatColumn::new) :
                getBinaryColumn("wavelength"));
    }

    /**
     * A descriptor for this wavelength in this cluster of data sets.
     * @return StrColumn
     */
    public StrColumn getWavelengthDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("wavelength_details", StrColumn::new) :
                getBinaryColumn("wavelength_details"));
    }

    /**
     * record the type of heavy atoms which produce anomolous singal.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atom_type", StrColumn::new) :
                getBinaryColumn("pdbx_atom_type"));
    }

    /**
     * record the refined f_prime (not from experiment).
     * @return FloatColumn
     */
    public FloatColumn getPdbxFPrimeRefined() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_f_prime_refined", FloatColumn::new) :
                getBinaryColumn("pdbx_f_prime_refined"));
    }

    /**
     * record the refined f_double_prime (not from experiment).
     * @return FloatColumn
     */
    public FloatColumn getPdbxFDoublePrimeRefined() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_f_double_prime_refined", FloatColumn::new) :
                getBinaryColumn("pdbx_f_double_prime_refined"));
    }
}
