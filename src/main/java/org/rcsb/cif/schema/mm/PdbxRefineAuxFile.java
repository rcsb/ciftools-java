package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Auxilary parameter and topology files used in refinement.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRefineAuxFile extends DelegatingCategory {
    public PdbxRefineAuxFile(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "serial_no":
                return getSerialNo();
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "file_name":
                return getFileName();
            case "file_type":
                return getFileType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getSerialNo() {
        return delegate.getColumn("serial_no", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_aux_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * Auxilary file name.
     * @return StrColumn
     */
    public StrColumn getFileName() {
        return delegate.getColumn("file_name", DelegatingStrColumn::new);
    }

    /**
     * Auxilary file type.
     * @return StrColumn
     */
    public StrColumn getFileType() {
        return delegate.getColumn("file_type", DelegatingStrColumn::new);
    }

}