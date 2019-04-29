package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Auxilary parameter and topology files used in refinement.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSerialNo() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("serial_no", SingleRowStrColumn::new) :
                getBinaryColumn("serial_no"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_aux_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxRefineId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * Auxilary file name.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFileName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("file_name", SingleRowStrColumn::new) :
                getBinaryColumn("file_name"));
    }

    /**
     * Auxilary file type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFileType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("file_type", SingleRowStrColumn::new) :
                getBinaryColumn("file_type"));
    }
}
