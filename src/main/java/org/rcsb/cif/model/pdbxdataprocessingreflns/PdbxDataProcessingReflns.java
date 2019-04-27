package org.rcsb.cif.model.pdbxdataprocessingreflns;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Total number of reflections used in data processing.
     * @return NumberAll
     */
    public NumberAll getNumberAll() {
        return (NumberAll) (isText ? textFields.computeIfAbsent("number_all",
                NumberAll::new) : getBinaryColumn("number_all"));
    }

    /**
     * Total number of reflections marked for rejection in data processing.
     * @return NumberMarkedReject
     */
    public NumberMarkedReject getNumberMarkedReject() {
        return (NumberMarkedReject) (isText ? textFields.computeIfAbsent("number_marked_reject",
                NumberMarkedReject::new) : getBinaryColumn("number_marked_reject"));
    }

    /**
     * Percent of reflections marked for rejection in data processing.
     * @return PercentMarkedReject
     */
    public PercentMarkedReject getPercentMarkedReject() {
        return (PercentMarkedReject) (isText ? textFields.computeIfAbsent("percent_marked_reject",
                PercentMarkedReject::new) : getBinaryColumn("percent_marked_reject"));
    }

    /**
     * Percent of reflections rejected in data processing.
     * @return PercentRejected
     */
    public PercentRejected getPercentRejected() {
        return (PercentRejected) (isText ? textFields.computeIfAbsent("percent_rejected",
                PercentRejected::new) : getBinaryColumn("percent_rejected"));
    }

    /**
     * Total linear R factor in data processing.
     * @return RFactorAllLinear
     */
    public RFactorAllLinear getRFactorAllLinear() {
        return (RFactorAllLinear) (isText ? textFields.computeIfAbsent("R_factor_all_linear",
                RFactorAllLinear::new) : getBinaryColumn("R_factor_all_linear"));
    }
}
