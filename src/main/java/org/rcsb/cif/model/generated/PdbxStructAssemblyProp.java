package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Properties and features of structural assemblies.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructAssemblyProp extends BaseCategory {
    public PdbxStructAssemblyProp(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyProp(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyProp(String name) {
        super(name);
    }

    /**
     * The identifier for the assembly used in category PDBX_STRUCT_ASSEMBLY.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBiolId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("biol_id", SingleRowStrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * The property type for the assembly.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The value of the assembly property.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getValue() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("value", SingleRowStrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * Additional details about this assembly property.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
