package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
 * details that assess the status of selected validation diagnostics.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepuiValidationStatusFlags extends DelegatingCategory {
    public PdbxDepuiValidationStatusFlags(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dep_dataset_id":
                return getDepDatasetId();
            case "residual_B_factors_flag":
                return getResidualBFactorsFlag();
            case "occupancy_outliers_low":
                return getOccupancyOutliersLow();
            case "occupancy_outliers_high":
                return getOccupancyOutliersHigh();
            case "adp_outliers_low":
                return getAdpOutliersLow();
            case "solvent_outliers":
                return getSolventOutliers();
            case "tls_no_aniso":
                return getTlsNoAniso();
            case "adp_outliers_zero":
                return getAdpOutliersZero();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return delegate.getColumn("dep_dataset_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if the uploaded data is contains residual B-values
     * @return StrColumn
     */
    public StrColumn getResidualBFactorsFlag() {
        return delegate.getColumn("residual_B_factors_flag", DelegatingStrColumn::new);
    }

    /**
     * Count of atoms with occupancy values less than 0
     * @return IntColumn
     */
    public IntColumn getOccupancyOutliersLow() {
        return delegate.getColumn("occupancy_outliers_low", DelegatingIntColumn::new);
    }

    /**
     * Count of atoms with occupancy values greater than 1
     * @return IntColumn
     */
    public IntColumn getOccupancyOutliersHigh() {
        return delegate.getColumn("occupancy_outliers_high", DelegatingIntColumn::new);
    }

    /**
     * Count of atoms with ADP (B-values) values less than 0
     * @return IntColumn
     */
    public IntColumn getAdpOutliersLow() {
        return delegate.getColumn("adp_outliers_low", DelegatingIntColumn::new);
    }

    /**
     * Count of solvent atoms with anonalous positions.
     * @return IntColumn
     */
    public IntColumn getSolventOutliers() {
        return delegate.getColumn("solvent_outliers", DelegatingIntColumn::new);
    }

    /**
     * A flag to indicate if the uploaded model has TLS records
     * but no anisotropic ones.
     * @return StrColumn
     */
    public StrColumn getTlsNoAniso() {
        return delegate.getColumn("tls_no_aniso", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate if any isotropic B factors are zero.
     * @return StrColumn
     */
    public StrColumn getAdpOutliersZero() {
        return delegate.getColumn("adp_outliers_zero", DelegatingStrColumn::new);
    }

}