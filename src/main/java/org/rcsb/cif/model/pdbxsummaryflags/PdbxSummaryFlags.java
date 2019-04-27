package org.rcsb.cif.model.pdbxsummaryflags;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A feature flag name.
     * @return FlagId
     */
    public FlagId getFlagId() {
        return (FlagId) (isText ? textFields.computeIfAbsent("flag_id",
                FlagId::new) : getBinaryColumn("flag_id"));
    }

    /**
     * A feature flag value
     * @return FlagValue
     */
    public FlagValue getFlagValue() {
        return (FlagValue) (isText ? textFields.computeIfAbsent("flag_value",
                FlagValue::new) : getBinaryColumn("flag_value"));
    }
}
