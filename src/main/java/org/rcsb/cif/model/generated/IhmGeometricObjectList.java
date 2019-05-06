package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_GEOMETRIC_OBJECT_LIST category records the list of
 * geometric objects used as restraints in the integrative modeling study.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmGeometricObjectList extends BaseCategory {
    public IhmGeometricObjectList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmGeometricObjectList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmGeometricObjectList(String name) {
        super(name);
    }

    /**
     * A unique identifier for the geometric object.
     * @return IntColumn
     */
    public IntColumn getObjectId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("object_id", IntColumn::new) :
                getBinaryColumn("object_id"));
    }

    /**
     * The type of geomtric object.
     * @return StrColumn
     */
    public StrColumn getObjectType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("object_type", StrColumn::new) :
                getBinaryColumn("object_type"));
    }

    /**
     * User-provided name for the object.
     * @return StrColumn
     */
    public StrColumn getObjectName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("object_name", StrColumn::new) :
                getBinaryColumn("object_name"));
    }

    /**
     * Brief description of the geometric object.
     * @return StrColumn
     */
    public StrColumn getObjectDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("object_description", StrColumn::new) :
                getBinaryColumn("object_description"));
    }

    /**
     * Additional details about the geometric object, especially if
     * _ihm_geometric_object_list.object_type is "other".
     * @return StrColumn
     */
    public StrColumn getOtherDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("other_details", StrColumn::new) :
                getBinaryColumn("other_details"));
    }
}
