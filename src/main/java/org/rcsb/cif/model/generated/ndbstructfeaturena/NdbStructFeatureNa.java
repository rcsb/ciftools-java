package org.rcsb.cif.model.generated.ndbstructfeaturena;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class NdbStructFeatureNa extends BaseCategory {
    public NdbStructFeatureNa(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public NdbStructFeatureNa(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public NdbStructFeatureNa(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the
     * ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * This data item identifies a structural
     * feature of this entry.
     * @return Feature
     */
    public Feature getFeature() {
        return (Feature) (isText ? textFields.computeIfAbsent("feature",
                Feature::new) : getBinaryColumn("feature"));
    }

    /**
     * This data item counts the number of occurences of
     * this feature in this entry.
     * @return FeatureCount
     */
    public FeatureCount getFeatureCount() {
        return (FeatureCount) (isText ? textFields.computeIfAbsent("feature_count",
                FeatureCount::new) : getBinaryColumn("feature_count"));
    }
}
