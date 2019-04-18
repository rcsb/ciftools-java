package org.rcsb.cif.model.pdbxstructassembly;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxStructAssembly extends BaseCifCategory {
    public PdbxStructAssembly(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxStructAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * Provides details of the method used to determine or
     * compute the assembly.
     * @return MethodDetails
     */
    public MethodDetails getMethodDetails() {
        return (MethodDetails) (isText ? getTextColumn("method_details") : getBinaryColumn("method_details"));
    }

    /**
     * Provides the details of the oligomeric state of the assembly.
     * @return OligomericDetails
     */
    public OligomericDetails getOligomericDetails() {
        return (OligomericDetails) (isText ? getTextColumn("oligomeric_details") : getBinaryColumn("oligomeric_details"));
    }

    /**
     * The number of polymer molecules in the assembly.
     * @return OligomericCount
     */
    public OligomericCount getOligomericCount() {
        return (OligomericCount) (isText ? getTextColumn("oligomeric_count") : getBinaryColumn("oligomeric_count"));
    }

    /**
     * A description of special aspects of the macromolecular assembly.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? getTextColumn("details") : getBinaryColumn("details"));
    }

    /**
     * The value of _pdbx_struct_assembly.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }
}
