package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_CLASS category provides
 * details regarding the structural assembly classes. This
 * category provides a mechanism to identify the classes to which
 * structural assemblies belong.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStructAssemblyClass extends BaseCategory {
    public IhmStructAssemblyClass(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStructAssemblyClass(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStructAssemblyClass(String name) {
        super(name);
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the structural assembly class.
     * This data item is a pointer to _ihm_struct_assembly_class_list.class_id
     * in the IHM_STRUCT_ASSEMBLY_CLASS_LIST category.
     * @return IntColumn
     */
    public IntColumn getClassId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("class_id", IntColumn::new) :
                getBinaryColumn("class_id"));
    }

    /**
     * An identifier for the structural assembly.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assembly_id", IntColumn::new) :
                getBinaryColumn("assembly_id"));
    }
}
