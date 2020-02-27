package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
 * the structural elements that form macromolecular assemblies.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAssembly extends BaseCategory {
    public PdbxStructAssembly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssembly(String name) {
        super(name);
    }

    /**
     * Provides details of the method used to determine or
     * compute the assembly.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method_details", StrColumn::new) :
                getBinaryColumn("method_details"));
    }

    /**
     * Provides the details of the oligomeric state of the assembly.
     * @return StrColumn
     */
    public StrColumn getOligomericDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("oligomeric_details", StrColumn::new) :
                getBinaryColumn("oligomeric_details"));
    }

    /**
     * The number of polymer molecules in the assembly.
     * @return IntColumn
     */
    public IntColumn getOligomericCount() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("oligomeric_count", IntColumn::new) :
                getBinaryColumn("oligomeric_count"));
    }

    /**
     * A description of special aspects of the macromolecular assembly.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _pdbx_struct_assembly.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
