package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_PSEUDO_SITE_FEATURE category records the details
 * of pseudo sites that may be used in the restraints or model representation.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPseudoSite extends DelegatingCategory {
    public IhmPseudoSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_z":
                return getCartnZ();
            case "radius":
                return getRadius();
            case "description":
                return getDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier to the pseudo site.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The Cartesian X component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Y component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Z component corresponding to this pseudo site.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The radius associated with the pseudo site, if applicable.
     * @return FloatColumn
     */
    public FloatColumn getRadius() {
        return delegate.getColumn("radius", DelegatingFloatColumn::new);
    }

    /**
     * Textual description of the pseudo site.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

}