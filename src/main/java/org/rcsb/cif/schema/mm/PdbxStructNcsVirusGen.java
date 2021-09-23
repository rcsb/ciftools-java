package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
 * about the generation of virus structures from NCS matrix operators.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructNcsVirusGen extends DelegatingCategory {
    public PdbxStructNcsVirusGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "oper_id":
                return getOperId();
            case "asym_id":
                return getAsymId();
            case "pdb_chain_id":
                return getPdbChainId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Unique id for generator.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Identifies the NCS operation (_struct_ncs_oper.id)
     * @return IntColumn
     */
    public IntColumn getOperId() {
        return delegate.getColumn("oper_id", DelegatingIntColumn::new);
    }

    /**
     * The NCS operation is applied to the component of
     * the asymmetric unit identified by this id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The NCS operation is applied to the chain identified
     * by this id.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return delegate.getColumn("pdb_chain_id", DelegatingStrColumn::new);
    }

}