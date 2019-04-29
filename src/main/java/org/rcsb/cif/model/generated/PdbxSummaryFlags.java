package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Container category for a list of feature flags associated
 * with each structure entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSummaryFlags extends BaseCategory {
    public PdbxSummaryFlags(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSummaryFlags(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSummaryFlags(String name) {
        super(name);
    }

    /**
     * Entry ID.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A feature flag name.
     * @return StrColumn
     */
    public StrColumn getFlagId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("flag_id", StrColumn::new) :
                getBinaryColumn("flag_id"));
    }

    /**
     * A feature flag value
     * @return StrColumn
     */
    public StrColumn getFlagValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("flag_value", StrColumn::new) :
                getBinaryColumn("flag_value"));
    }
}
