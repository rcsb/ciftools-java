package org.rcsb.cif.model.pdbxstructassemblydepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructAssemblyDepositorInfo extends BaseCategory {
    public PdbxStructAssemblyDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyDepositorInfo(String name) {
        super(name);
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
     * The value of _pdbx_struct_assembly_depositor_info.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO list.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
     * A flag to indicate that the depositor has provided matrix records
     * @return MatrixFlag
     */
    public MatrixFlag getMatrixFlag() {
        return (MatrixFlag) (isText ? textFields.computeIfAbsent("matrix_flag",
                MatrixFlag::new) : getBinaryColumn("matrix_flag"));
    }

    /**
     * The name of a file containing matrix records.
     * @return UploadFileName
     */
    public UploadFileName getUploadFileName() {
        return (UploadFileName) (isText ? textFields.computeIfAbsent("upload_file_name",
                UploadFileName::new) : getBinaryColumn("upload_file_name"));
    }
}
