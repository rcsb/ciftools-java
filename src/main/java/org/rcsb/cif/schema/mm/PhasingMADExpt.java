package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PHASING_MAD_EXPT category record details about
 * a MAD phasing experiment, such as the number of experiments that
 * were clustered together to produce a set of phases or the
 * statistics for those phases.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PhasingMADExpt extends DelegatingCategory {
    public PhasingMADExpt(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "delta_delta_phi":
                return getDeltaDeltaPhi();
            case "delta_phi":
                return getDeltaPhi();
            case "delta_phi_sigma":
                return getDeltaPhiSigma();
            case "id":
                return getId();
            case "mean_fom":
                return getMeanFom();
            case "number_clust":
                return getNumberClust();
            case "R_normal_all":
                return getRNormalAll();
            case "R_normal_anom_scat":
                return getRNormalAnomScat();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The difference between two independent determinations of
     * _phasing_MAD_expt.delta_phi.
     * @return FloatColumn
     */
    public FloatColumn getDeltaDeltaPhi() {
        return delegate.getColumn("delta_delta_phi", DelegatingFloatColumn::new);
    }

    /**
     * The phase difference between F~t~(h), the structure factor due
     * to normal scattering from all atoms, and F~a~(h), the structure
     * factor due to normal scattering from only the anomalous
     * scatterers.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhi() {
        return delegate.getColumn("delta_phi", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MAD_expt.delta_phi.
     * @return FloatColumn
     */
    public FloatColumn getDeltaPhiSigma() {
        return delegate.getColumn("delta_phi_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The value of _phasing_MAD_expt.id must uniquely identify each
     * record in the PHASING_MAD_EXPT list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The mean figure of merit.
     * @return FloatColumn
     */
    public FloatColumn getMeanFom() {
        return delegate.getColumn("mean_fom", DelegatingFloatColumn::new);
    }

    /**
     * The number of clusters of data sets in this phasing experiment.
     * @return IntColumn
     */
    public IntColumn getNumberClust() {
        return delegate.getColumn("number_clust", DelegatingIntColumn::new);
    }

    /**
     * Definition...
     * @return FloatColumn
     */
    public FloatColumn getRNormalAll() {
        return delegate.getColumn("R_normal_all", DelegatingFloatColumn::new);
    }

    /**
     * Definition...
     * @return FloatColumn
     */
    public FloatColumn getRNormalAnomScat() {
        return delegate.getColumn("R_normal_anom_scat", DelegatingFloatColumn::new);
    }

}