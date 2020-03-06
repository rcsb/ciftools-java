package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_HALF_TORUS category records the parameters of
 * half-torus that represents a membrane.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGeometricObjectHalfTorus extends DelegatingCategory {
    public IhmGeometricObjectHalfTorus(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "object_id":
                return getObjectId();
            case "thickness_th":
                return getThicknessTh();
            case "section":
                return getSection();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Identifier to the geometric object.
     * This data item is a pointer to the _ihm_geometric_object_torus.object_id in the
     * IHM_GEOMETRIC_OBJECT_TORUS category.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return delegate.getColumn("object_id", DelegatingIntColumn::new);
    }

    /**
     * Thickness "th" of the half-torus.
     * @return FloatColumn
     */
    public FloatColumn getThicknessTh() {
        return delegate.getColumn("thickness_th", DelegatingFloatColumn::new);
    }

    /**
     * The section of the torus representing the half-torus.
     * @return StrColumn
     */
    public StrColumn getSection() {
        return delegate.getColumn("section", DelegatingStrColumn::new);
    }

}