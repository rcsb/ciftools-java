package org.rcsb.cif.model.pdbxrefineauxfile;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRefineAuxFile extends BaseCategory {
    public PdbxRefineAuxFile(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRefineAuxFile(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRefineAuxFile(String name) {
        super(name);
    }

    /**
     * Serial number.
     * @return SerialNo
     */
    public SerialNo getSerialNo() {
        return (SerialNo) (isText ? textFields.computeIfAbsent("serial_no",
                SerialNo::new) : getBinaryColumn("serial_no"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_aux_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * Auxilary file name.
     * @return FileName
     */
    public FileName getFileName() {
        return (FileName) (isText ? textFields.computeIfAbsent("file_name",
                FileName::new) : getBinaryColumn("file_name"));
    }

    /**
     * Auxilary file type.
     * @return FileType
     */
    public FileType getFileType() {
        return (FileType) (isText ? textFields.computeIfAbsent("file_type",
                FileType::new) : getBinaryColumn("file_type"));
    }
}
