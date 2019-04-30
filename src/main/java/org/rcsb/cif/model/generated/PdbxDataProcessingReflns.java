package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Details of reflections used in data processing.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDataProcessingReflns extends BaseCategory {
    public PdbxDataProcessingReflns(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDataProcessingReflns(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDataProcessingReflns(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_data_processing_reflns.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Total number of reflections used in data processing.
     * @return IntColumn
     */
    public IntColumn getNumberAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_all", IntColumn::new) :
                getBinaryColumn("number_all"));
    }

    /**
     * Total number of reflections marked for rejection in data processing.
     * @return IntColumn
     */
    public IntColumn getNumberMarkedReject() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_marked_reject", IntColumn::new) :
                getBinaryColumn("number_marked_reject"));
    }

    /**
     * Percent of reflections marked for rejection in data processing.
     * @return FloatColumn
     */
    public FloatColumn getPercentMarkedReject() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_marked_reject", FloatColumn::new) :
                getBinaryColumn("percent_marked_reject"));
    }

    /**
     * Percent of reflections rejected in data processing.
     * @return FloatColumn
     */
    public FloatColumn getPercentRejected() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("percent_rejected", FloatColumn::new) :
                getBinaryColumn("percent_rejected"));
    }

    /**
     * Total linear R factor in data processing.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAllLinear() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_all_linear", FloatColumn::new) :
                getBinaryColumn("R_factor_all_linear"));
    }
}
