package org.rcsb.cif.model.generated.pdbxdepuivalidationstatusflags;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDepuiValidationStatusFlags extends BaseCategory {
    public PdbxDepuiValidationStatusFlags(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDepuiValidationStatusFlags(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDepuiValidationStatusFlags(String name) {
        super(name);
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return DepDatasetId
     */
    public DepDatasetId getDepDatasetId() {
        return (DepDatasetId) (isText ? textFields.computeIfAbsent("dep_dataset_id",
                DepDatasetId::new) : getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A flag to indicate if the uploaded data is contains residual B-values
     * @return ResidualBFactorsFlag
     */
    public ResidualBFactorsFlag getResidualBFactorsFlag() {
        return (ResidualBFactorsFlag) (isText ? textFields.computeIfAbsent("residual_B_factors_flag",
                ResidualBFactorsFlag::new) : getBinaryColumn("residual_B_factors_flag"));
    }

    /**
     * Count of atoms with occupancy values less than 0
     * @return OccupancyOutliersLow
     */
    public OccupancyOutliersLow getOccupancyOutliersLow() {
        return (OccupancyOutliersLow) (isText ? textFields.computeIfAbsent("occupancy_outliers_low",
                OccupancyOutliersLow::new) : getBinaryColumn("occupancy_outliers_low"));
    }

    /**
     * Count of atoms with occupancy values greater than 1
     * @return OccupancyOutliersHigh
     */
    public OccupancyOutliersHigh getOccupancyOutliersHigh() {
        return (OccupancyOutliersHigh) (isText ? textFields.computeIfAbsent("occupancy_outliers_high",
                OccupancyOutliersHigh::new) : getBinaryColumn("occupancy_outliers_high"));
    }

    /**
     * Count of atoms with ADP (B-values) values less than 0
     * @return AdpOutliersLow
     */
    public AdpOutliersLow getAdpOutliersLow() {
        return (AdpOutliersLow) (isText ? textFields.computeIfAbsent("adp_outliers_low",
                AdpOutliersLow::new) : getBinaryColumn("adp_outliers_low"));
    }

    /**
     * Count of solvent atoms with anonalous positions.
     * @return SolventOutliers
     */
    public SolventOutliers getSolventOutliers() {
        return (SolventOutliers) (isText ? textFields.computeIfAbsent("solvent_outliers",
                SolventOutliers::new) : getBinaryColumn("solvent_outliers"));
    }

    /**
     * A flag to indicate if the uploaded model has TLS records
     * but no anisotropic ones.
     * @return TlsNoAniso
     */
    public TlsNoAniso getTlsNoAniso() {
        return (TlsNoAniso) (isText ? textFields.computeIfAbsent("tls_no_aniso",
                TlsNoAniso::new) : getBinaryColumn("tls_no_aniso"));
    }

    /**
     * A flag to indicate if any isotropic B factors are zero.
     * @return AdpOutliersZero
     */
    public AdpOutliersZero getAdpOutliersZero() {
        return (AdpOutliersZero) (isText ? textFields.computeIfAbsent("adp_outliers_zero",
                AdpOutliersZero::new) : getBinaryColumn("adp_outliers_zero"));
    }
}
