package org.rcsb.cif.model.pdbxstructncsvirusgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Identifies the NCS operation (_struct_ncs_oper.id)
     * @return OperId
     */
    public OperId getOperId() {
        return (OperId) (isText ? textFields.computeIfAbsent("oper_id",
                OperId::new) : getBinaryColumn("oper_id"));
    }

    /**
     * The NCS operation is applied to the component of
     * the asymmetric unit identified by this id.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * The NCS operation is applied to the chain identified
     * by this id.
     * @return PdbChainId
     */
    public PdbChainId getPdbChainId() {
        return (PdbChainId) (isText ? textFields.computeIfAbsent("pdb_chain_id",
                PdbChainId::new) : getBinaryColumn("pdb_chain_id"));
    }
}
