package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getSerialNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("serial_no", StrColumn::new) :
                getBinaryColumn("serial_no"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_xplor_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * Parameter file name in X-PLOR/CNS refinement.
     * @return StrColumn
     */
    public StrColumn getParamFile() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("param_file", StrColumn::new) :
                getBinaryColumn("param_file"));
    }

    /**
     * Topology file name in X-PLOR/CNS refinement.
     * @return StrColumn
     */
    public StrColumn getTopolFile() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("topol_file", StrColumn::new) :
                getBinaryColumn("topol_file"));
    }
}
