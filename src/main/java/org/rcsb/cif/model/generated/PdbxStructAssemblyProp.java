package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Properties and features of structural assemblies.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getBiolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("biol_id", StrColumn::new) :
                getBinaryColumn("biol_id"));
    }

    /**
     * The property type for the assembly.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The value of the assembly property.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value", StrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * Additional details about this assembly property.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
