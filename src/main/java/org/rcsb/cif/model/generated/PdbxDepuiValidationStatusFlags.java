package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
 * details that assess the status of selected validation diagnostics.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDepDatasetId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", SingleRowStrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A flag to indicate if the uploaded data is contains residual B-values
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getResidualBFactorsFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("residual_B_factors_flag", SingleRowStrColumn::new) :
                getBinaryColumn("residual_B_factors_flag"));
    }

    /**
     * Count of atoms with occupancy values less than 0
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOccupancyOutliersLow() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("occupancy_outliers_low", SingleRowIntColumn::new) :
                getBinaryColumn("occupancy_outliers_low"));
    }

    /**
     * Count of atoms with occupancy values greater than 1
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOccupancyOutliersHigh() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("occupancy_outliers_high", SingleRowIntColumn::new) :
                getBinaryColumn("occupancy_outliers_high"));
    }

    /**
     * Count of atoms with ADP (B-values) values less than 0
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getAdpOutliersLow() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("adp_outliers_low", SingleRowIntColumn::new) :
                getBinaryColumn("adp_outliers_low"));
    }

    /**
     * Count of solvent atoms with anonalous positions.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getSolventOutliers() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("solvent_outliers", SingleRowIntColumn::new) :
                getBinaryColumn("solvent_outliers"));
    }

    /**
     * A flag to indicate if the uploaded model has TLS records
     * but no anisotropic ones.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTlsNoAniso() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("tls_no_aniso", SingleRowStrColumn::new) :
                getBinaryColumn("tls_no_aniso"));
    }

    /**
     * A flag to indicate if any isotropic B factors are zero.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAdpOutliersZero() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("adp_outliers_zero", SingleRowStrColumn::new) :
                getBinaryColumn("adp_outliers_zero"));
    }
}
