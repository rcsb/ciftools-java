package org.rcsb.cif.model.generated.pdbxchemcompmodelfeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * The component model feature type.
     * @return FeatureName
     */
    public FeatureName getFeatureName() {
        return (FeatureName) (isText ? textFields.computeIfAbsent("feature_name",
                FeatureName::new) : getBinaryColumn("feature_name"));
    }

    /**
     * The component feature value.
     * @return FeatureValue
     */
    public FeatureValue getFeatureValue() {
        return (FeatureValue) (isText ? textFields.computeIfAbsent("feature_value",
                FeatureValue::new) : getBinaryColumn("feature_value"));
    }
}
