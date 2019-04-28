package org.rcsb.cif.model.generated.phasingmadexpt;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return DeltaDeltaPhi
     */
    public DeltaDeltaPhi getDeltaDeltaPhi() {
        return (DeltaDeltaPhi) (isText ? textFields.computeIfAbsent("delta_delta_phi",
                DeltaDeltaPhi::new) : getBinaryColumn("delta_delta_phi"));
    }

    /**
     * The phase difference between F~t~(h), the structure factor due
     * to normal scattering from all atoms, and F~a~(h), the structure
     * factor due to normal scattering from only the anomalous
     * scatterers.
     * @return DeltaPhi
     */
    public DeltaPhi getDeltaPhi() {
        return (DeltaPhi) (isText ? textFields.computeIfAbsent("delta_phi",
                DeltaPhi::new) : getBinaryColumn("delta_phi"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _phasing_MAD_expt.delta_phi.
     * @return DeltaPhiSigma
     */
    public DeltaPhiSigma getDeltaPhiSigma() {
        return (DeltaPhiSigma) (isText ? textFields.computeIfAbsent("delta_phi_sigma",
                DeltaPhiSigma::new) : getBinaryColumn("delta_phi_sigma"));
    }

    /**
     * The value of _phasing_MAD_expt.id must uniquely identify each
     * record in the PHASING_MAD_EXPT list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The mean figure of merit.
     * @return MeanFom
     */
    public MeanFom getMeanFom() {
        return (MeanFom) (isText ? textFields.computeIfAbsent("mean_fom",
                MeanFom::new) : getBinaryColumn("mean_fom"));
    }

    /**
     * The number of clusters of data sets in this phasing experiment.
     * @return NumberClust
     */
    public NumberClust getNumberClust() {
        return (NumberClust) (isText ? textFields.computeIfAbsent("number_clust",
                NumberClust::new) : getBinaryColumn("number_clust"));
    }

    /**
     * Definition...
     * @return RNormalAll
     */
    public RNormalAll getRNormalAll() {
        return (RNormalAll) (isText ? textFields.computeIfAbsent("R_normal_all",
                RNormalAll::new) : getBinaryColumn("R_normal_all"));
    }

    /**
     * Definition...
     * @return RNormalAnomScat
     */
    public RNormalAnomScat getRNormalAnomScat() {
        return (RNormalAnomScat) (isText ? textFields.computeIfAbsent("R_normal_anom_scat",
                RNormalAnomScat::new) : getBinaryColumn("R_normal_anom_scat"));
    }
}
