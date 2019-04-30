package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the NDB_STRUCT_CONF_NA category
 * describes secondary structure features in this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class NdbStructConfNa extends BaseCategory {
    public NdbStructConfNa(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public NdbStructConfNa(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public NdbStructConfNa(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the
     * ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * This data item identifies a secondary structure
     * feature of this entry.
     * @return StrColumn
     */
    public StrColumn getFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature", StrColumn::new) :
                getBinaryColumn("feature"));
    }

    /**
     * This data item counts the number of occurences of
     * this feature in this entry.
     * @return IntColumn
     */
    public IntColumn getFeatureCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_count", IntColumn::new) :
                getBinaryColumn("feature_count"));
    }
}
