package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_PSEUDO_SITE_FEATURE category records the details
 * of pseudo positions for the features listed in IHM_FEATURE_LIST.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmPseudoSiteFeature extends BaseCategory {
    public IhmPseudoSiteFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmPseudoSiteFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmPseudoSiteFeature(String name) {
        super(name);
    }

    /**
     * The feature identifier corresponding to this pseudo site.
     * This data item is a pointer to _ihm_feature_list.feature_id
     * in the IHM_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * The Cartesian X component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * The Cartesian Y component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * The Cartesian Z component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * The radius associated with the feature at this position, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getRadius() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("radius", FloatColumn::new) :
                getBinaryColumn("radius"));
    }

    /**
     * Textual description of the pseudo site representing the specific feature.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }
}
