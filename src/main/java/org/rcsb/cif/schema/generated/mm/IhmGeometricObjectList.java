package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_LIST category records the list of
 * geometric objects used as restraints in the integrative modeling study.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmGeometricObjectList extends DelegatingCategory {
    public IhmGeometricObjectList(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the geometric object.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return delegate.getColumn("object_id", DelegatingIntColumn::new);
    }

    /**
     * The type of geomtric object.
     * @return StrColumn
     */
    public StrColumn getObjectType() {
        return delegate.getColumn("object_type", DelegatingStrColumn::new);
    }

    /**
     * User-provided name for the object.
     * @return StrColumn
     */
    public StrColumn getObjectName() {
        return delegate.getColumn("object_name", DelegatingStrColumn::new);
    }

    /**
     * Brief description of the geometric object.
     * @return StrColumn
     */
    public StrColumn getObjectDescription() {
        return delegate.getColumn("object_description", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the geometric object, especially if
     * _ihm_geometric_object_list.object_type is "other".
     * @return StrColumn
     */
    public StrColumn getOtherDetails() {
        return delegate.getColumn("other_details", DelegatingStrColumn::new);
    }
}
