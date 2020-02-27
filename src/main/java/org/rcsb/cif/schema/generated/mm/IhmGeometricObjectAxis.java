package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_AXIS category records the details of
 * an axis used in a spatial restraint.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGeometricObjectAxis extends DelegatingCategory {
    public IhmGeometricObjectAxis(Category delegate) {
        super(delegate);
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
     * The type of axis.
     * @return StrColumn
     */
    public StrColumn getAxisType() {
        return delegate.getColumn("axis_type", DelegatingStrColumn::new);
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
}
