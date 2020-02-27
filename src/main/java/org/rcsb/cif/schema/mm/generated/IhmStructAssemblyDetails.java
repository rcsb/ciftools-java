package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_DETAILS category provides
 * additional details regarding the structure assembly.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStructAssemblyDetails extends BaseCategory {
    public IhmStructAssemblyDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStructAssemblyDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStructAssemblyDetails(String name) {
        super(name);
    }

    /**
     * A unique identifier for the structural assembly.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assembly_id", IntColumn::new) :
                getBinaryColumn("assembly_id"));
    }

    /**
     * A name for the structural assembly.
     * @return StrColumn
     */
    public StrColumn getAssemblyName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_name", StrColumn::new) :
                getBinaryColumn("assembly_name"));
    }

    /**
     * Description of the structural assembly.
     * @return StrColumn
     */
    public StrColumn getAssemblyDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_description", StrColumn::new) :
                getBinaryColumn("assembly_description"));
    }
}
