package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Auxilary parameter and topology files used in refinement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getSerialNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("serial_no", StrColumn::new) :
                getBinaryColumn("serial_no"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_aux_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * Auxilary file name.
     * @return StrColumn
     */
    public StrColumn getFileName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_name", StrColumn::new) :
                getBinaryColumn("file_name"));
    }

    /**
     * Auxilary file type.
     * @return StrColumn
     */
    public StrColumn getFileType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("file_type", StrColumn::new) :
                getBinaryColumn("file_type"));
    }
}
