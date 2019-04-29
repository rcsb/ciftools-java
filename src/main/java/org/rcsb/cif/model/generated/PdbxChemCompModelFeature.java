package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompModelFeature extends BaseCategory {
    public PdbxChemCompModelFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModelFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModelFeature(String name) {
        super(name);
    }

    /**
     * The component model identifier for this feature.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The component model feature type.
     * @return StrColumn
     */
    public StrColumn getFeatureName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_name", StrColumn::new) :
                getBinaryColumn("feature_name"));
    }

    /**
     * The component feature value.
     * @return StrColumn
     */
    public StrColumn getFeatureValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("feature_value", StrColumn::new) :
                getBinaryColumn("feature_value"));
    }
}
