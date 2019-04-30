package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
 * about the generation of virus structures from NCS matrix operators.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructNcsVirusGen extends BaseCategory {
    public PdbxStructNcsVirusGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructNcsVirusGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructNcsVirusGen(String name) {
        super(name);
    }

    /**
     * Unique id for generator.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifies the NCS operation (_struct_ncs_oper.id)
     * @return StrColumn
     */
    public StrColumn getOperId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("oper_id", StrColumn::new) :
                getBinaryColumn("oper_id"));
    }

    /**
     * The NCS operation is applied to the component of
     * the asymmetric unit identified by this id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The NCS operation is applied to the chain identified
     * by this id.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_id", StrColumn::new) :
                getBinaryColumn("pdb_chain_id"));
    }
}
