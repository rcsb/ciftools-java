package org.rcsb.cif.model.generated.pdbxxplorfile;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SerialNo
     */
    public SerialNo getSerialNo() {
        return (SerialNo) (isText ? textFields.computeIfAbsent("serial_no",
                SerialNo::new) : getBinaryColumn("serial_no"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_xplor_file.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * Parameter file name in X-PLOR/CNS refinement.
     * @return ParamFile
     */
    public ParamFile getParamFile() {
        return (ParamFile) (isText ? textFields.computeIfAbsent("param_file",
                ParamFile::new) : getBinaryColumn("param_file"));
    }

    /**
     * Topology file name in X-PLOR/CNS refinement.
     * @return TopolFile
     */
    public TopolFile getTopolFile() {
        return (TopolFile) (isText ? textFields.computeIfAbsent("topol_file",
                TopolFile::new) : getBinaryColumn("topol_file"));
    }
}
