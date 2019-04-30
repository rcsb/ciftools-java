package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Parameter and topology files used in X-PLOR/CNS refinement.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxXplorFile extends BaseCategory {
    public PdbxXplorFile(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxXplorFile(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxXplorFile(String name) {
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
     * _pdbx_xplor_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxRefineId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * Parameter file name in X-PLOR/CNS refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getParamFile() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("param_file", SingleRowStrColumn::new) :
                getBinaryColumn("param_file"));
    }

    /**
     * Topology file name in X-PLOR/CNS refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getTopolFile() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("topol_file", SingleRowStrColumn::new) :
                getBinaryColumn("topol_file"));
    }
}
