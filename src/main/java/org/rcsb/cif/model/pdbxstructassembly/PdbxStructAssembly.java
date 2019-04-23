package org.rcsb.cif.model.pdbxstructassembly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
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
     * @return MethodDetails
     */
    public MethodDetails getMethodDetails() {
        return (MethodDetails) (isText ? textFields.computeIfAbsent("method_details",
                MethodDetails::new) : getBinaryColumn("method_details"));
    }

    /**
     * Provides the details of the oligomeric state of the assembly.
     * @return OligomericDetails
     */
    public OligomericDetails getOligomericDetails() {
        return (OligomericDetails) (isText ? textFields.computeIfAbsent("oligomeric_details",
                OligomericDetails::new) : getBinaryColumn("oligomeric_details"));
    }

    /**
     * The number of polymer molecules in the assembly.
     * @return OligomericCount
     */
    public OligomericCount getOligomericCount() {
        return (OligomericCount) (isText ? textFields.computeIfAbsent("oligomeric_count",
                OligomericCount::new) : getBinaryColumn("oligomeric_count"));
    }

    /**
     * A description of special aspects of the macromolecular assembly.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _pdbx_struct_assembly.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
