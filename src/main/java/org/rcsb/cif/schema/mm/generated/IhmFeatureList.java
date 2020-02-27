package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * IHM_FEATURE_LIST is the high level category that provides defintions
 * to select atoms/residues from polymeric and non-polymeric entities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmFeatureList extends BaseCategory {
    public IhmFeatureList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmFeatureList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmFeatureList(String name) {
        super(name);
    }

    /**
     * A unique identifier for the feature.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * The type of feature.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_type", StrColumn::new) :
                getBinaryColumn("feature_type"));
    }

    /**
     * The type of entity.
     * @return StrColumn
     */
    public StrColumn getEntityType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_type", StrColumn::new) :
                getBinaryColumn("entity_type"));
    }
}
