package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_ASSEMBLY.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _pdbx_struct_assembly_depositor_info.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
     * @return StrColumn
     */
    public StrColumn getOligomericCount() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("oligomeric_count", StrColumn::new) :
                getBinaryColumn("oligomeric_count"));
    }

    /**
     * A flag to indicate that the depositor has provided matrix records
     * @return StrColumn
     */
    public StrColumn getMatrixFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("matrix_flag", StrColumn::new) :
                getBinaryColumn("matrix_flag"));
    }

    /**
     * The name of a file containing matrix records.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("upload_file_name", StrColumn::new) :
                getBinaryColumn("upload_file_name"));
    }
}
