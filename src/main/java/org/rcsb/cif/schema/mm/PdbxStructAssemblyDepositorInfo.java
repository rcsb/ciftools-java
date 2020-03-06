package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_ASSEMBLY.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyDepositorInfo extends DelegatingCategory {
    public PdbxStructAssemblyDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "method_details":
                return getMethodDetails();
            case "oligomeric_details":
                return getOligomericDetails();
            case "oligomeric_count":
                return getOligomericCount();
            case "matrix_flag":
                return getMatrixFlag();
            case "upload_file_name":
                return getUploadFileName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the macromolecular assembly.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_struct_assembly_depositor_info.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY_DEPOSITOR_INFO list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Provides details of the method used to determine or
     * compute the assembly.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return delegate.getColumn("method_details", DelegatingStrColumn::new);
    }

    /**
     * Provides the details of the oligomeric state of the assembly.
     * @return StrColumn
     */
    public StrColumn getOligomericDetails() {
        return delegate.getColumn("oligomeric_details", DelegatingStrColumn::new);
    }

    /**
     * The number of polymer molecules in the assembly.
     * @return StrColumn
     */
    public StrColumn getOligomericCount() {
        return delegate.getColumn("oligomeric_count", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that the depositor has provided matrix records
     * @return StrColumn
     */
    public StrColumn getMatrixFlag() {
        return delegate.getColumn("matrix_flag", DelegatingStrColumn::new);
    }

    /**
     * The name of a file containing matrix records.
     * @return StrColumn
     */
    public StrColumn getUploadFileName() {
        return delegate.getColumn("upload_file_name", DelegatingStrColumn::new);
    }

}