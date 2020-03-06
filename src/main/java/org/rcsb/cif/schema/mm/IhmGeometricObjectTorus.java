package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_TORUS category records the parameters of
 * a torus. By definition, the base plane of the torus is the XY plane. The
 * `ihm_geometric_object_transformation` category can be used to generate
 * transformations to any other plane.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGeometricObjectTorus extends DelegatingCategory {
    public IhmGeometricObjectTorus(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "object_id":
                return getObjectId();
            case "center_id":
                return getCenterId();
            case "transformation_id":
                return getTransformationId();
            case "major_radius_R":
                return getMajorRadiusR();
            case "minor_radius_r":
                return getMinorRadiusR();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Identifier to the geometric object.
     * This data item is a pointer to the _ihm_geometric_object_list.object_id in the
     * IHM_GEOMETRIC_OBJECT_LIST category.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return delegate.getColumn("object_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the description of the center.
     * This data item is a pointer to the _ihm_geometric_object_center.id in the
     * IHM_GEOMETRIC_OBJECT_CENTER category.
     * @return IntColumn
     */
    public IntColumn getCenterId() {
        return delegate.getColumn("center_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the description of the transformation.
     * This data item is a pointer to the _ihm_geometric_object_transformation.id in the
     * IHM_GEOMETRIC_OBJECT_TRANSFORMATION category.
     * If no transformation is provide, identity transformation is assumed.
     * @return IntColumn
     */
    public IntColumn getTransformationId() {
        return delegate.getColumn("transformation_id", DelegatingIntColumn::new);
    }

    /**
     * Major radius "R" of the torus.
     * @return FloatColumn
     */
    public FloatColumn getMajorRadiusR() {
        return delegate.getColumn("major_radius_R", DelegatingFloatColumn::new);
    }

    /**
     * Minor radius "r" of the torus.
     * @return FloatColumn
     */
    public FloatColumn getMinorRadiusR() {
        return delegate.getColumn("minor_radius_r", DelegatingFloatColumn::new);
    }

}