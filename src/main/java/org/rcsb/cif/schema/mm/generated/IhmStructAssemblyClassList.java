package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_CLASS_LIST category lists
 * all the structural assembly classes relevant to the entry. This
 * category provides a mechanism to define classes of the
 * structural assemblies.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStructAssemblyClassList extends BaseCategory {
    public IhmStructAssemblyClassList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStructAssemblyClassList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStructAssemblyClassList(String name) {
        super(name);
    }

    /**
     * A unique identifier for the structural assembly class.
     * @return IntColumn
     */
    public IntColumn getClassId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("class_id", IntColumn::new) :
                getBinaryColumn("class_id"));
    }

    /**
     * A user provided name for the class.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The type of classifier.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Additional description regarding the class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }
}
