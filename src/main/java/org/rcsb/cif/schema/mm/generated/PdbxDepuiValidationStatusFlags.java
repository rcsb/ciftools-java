package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DEPUI_VALIDATION_STATUS_FLAGS category record status
 * details that assess the status of selected validation diagnostics.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dep_dataset_id", StrColumn::new) :
                getBinaryColumn("dep_dataset_id"));
    }

    /**
     * A flag to indicate if the uploaded data is contains residual B-values
     * @return StrColumn
     */
    public StrColumn getResidualBFactorsFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("residual_B_factors_flag", StrColumn::new) :
                getBinaryColumn("residual_B_factors_flag"));
    }

    /**
     * Count of atoms with occupancy values less than 0
     * @return IntColumn
     */
    public IntColumn getOccupancyOutliersLow() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("occupancy_outliers_low", IntColumn::new) :
                getBinaryColumn("occupancy_outliers_low"));
    }

    /**
     * Count of atoms with occupancy values greater than 1
     * @return IntColumn
     */
    public IntColumn getOccupancyOutliersHigh() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("occupancy_outliers_high", IntColumn::new) :
                getBinaryColumn("occupancy_outliers_high"));
    }

    /**
     * Count of atoms with ADP (B-values) values less than 0
     * @return IntColumn
     */
    public IntColumn getAdpOutliersLow() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("adp_outliers_low", IntColumn::new) :
                getBinaryColumn("adp_outliers_low"));
    }

    /**
     * Count of solvent atoms with anonalous positions.
     * @return IntColumn
     */
    public IntColumn getSolventOutliers() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("solvent_outliers", IntColumn::new) :
                getBinaryColumn("solvent_outliers"));
    }

    /**
     * A flag to indicate if the uploaded model has TLS records
     * but no anisotropic ones.
     * @return StrColumn
     */
    public StrColumn getTlsNoAniso() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tls_no_aniso", StrColumn::new) :
                getBinaryColumn("tls_no_aniso"));
    }

    /**
     * A flag to indicate if any isotropic B factors are zero.
     * @return StrColumn
     */
    public StrColumn getAdpOutliersZero() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("adp_outliers_zero", StrColumn::new) :
                getBinaryColumn("adp_outliers_zero"));
    }
}
