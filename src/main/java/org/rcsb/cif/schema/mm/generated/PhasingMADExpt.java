package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_MAD_EXPT category record details about
 * a MAD phasing experiment, such as the number of experiments that
 * were clustered together to produce a set of phases or the
 * statistics for those phases.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingMADExpt extends BaseCategory {
    public PhasingMADExpt(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingMADExpt(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingMADExpt(String name) {
        super(name);
    }

    /**
     * The difference between two independent determinations of
     * _phasing_MAD_expt.delta_phi.
     * @return FloatColumn
     */
    public FloatColumn getDeltaDeltaPhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_delta_phi", FloatColumn::new) :
                getBinaryColumn("delta_delta_phi"));
    }

    /**
     * The phase difference between F~t~(h), the structure factor due
     * to normal scattering from all atoms, and F~a~(h), the structure
     * factor due to normal scattering from only the anomalous
     * scatterers.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_phi", FloatColumn::new) :
                getBinaryColumn("delta_phi"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MAD_expt.delta_phi.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiSigma() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("delta_phi_sigma", FloatColumn::new) :
                getBinaryColumn("delta_phi_sigma"));
    }

    /**
     * The value of _phasing_MAD_expt.id must uniquely identify each
     * record in the PHASING_MAD_EXPT list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The mean figure of merit.
     * @return FloatColumn
     */
    public FloatColumn getMeanFom() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("mean_fom", FloatColumn::new) :
                getBinaryColumn("mean_fom"));
    }

    /**
     * The number of clusters of data sets in this phasing experiment.
     * @return IntColumn
     */
    public IntColumn getNumberClust() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_clust", IntColumn::new) :
                getBinaryColumn("number_clust"));
    }

    /**
     * Definition...
     * @return FloatColumn
     */
    public FloatColumn getRNormalAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_normal_all", FloatColumn::new) :
                getBinaryColumn("R_normal_all"));
    }

    /**
     * Definition...
     * @return FloatColumn
     */
    public FloatColumn getRNormalAnomScat() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_normal_anom_scat", FloatColumn::new) :
                getBinaryColumn("R_normal_anom_scat"));
    }
}
