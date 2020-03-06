package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_CENTER category records the center of
 * geometric objects used as restraints in the integrative modeling study.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGeometricObjectCenter extends DelegatingCategory {
    public IhmGeometricObjectCenter(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "xcoord":
                return getXcoord();
            case "ycoord":
                return getYcoord();
            case "zcoord":
                return getZcoord();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the center.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The x-coordinate of the center.
     * @return FloatColumn
     */
    public FloatColumn getXcoord() {
        return delegate.getColumn("xcoord", DelegatingFloatColumn::new);
    }

    /**
     * The y-coordinate of the center.
     * @return FloatColumn
     */
    public FloatColumn getYcoord() {
        return delegate.getColumn("ycoord", DelegatingFloatColumn::new);
    }

    /**
     * The z-coordinate of the center.
     * @return FloatColumn
     */
    public FloatColumn getZcoord() {
        return delegate.getColumn("zcoord", DelegatingFloatColumn::new);
    }

}