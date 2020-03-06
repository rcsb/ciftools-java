package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_NAME_INSTANCE category
 * list names used to define entities with their
 * associated database, entity, chain, and molecule
 * identifiers.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityNameInstance extends DelegatingCategory {
    public PdbxEntityNameInstance(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "name":
                return getName();
            case "pdb_id":
                return getPdbId();
            case "rcsb_id":
                return getRcsbId();
            case "entity_id":
                return getEntityId();
            case "pdb_chain_id":
                return getPdbChainId();
            case "pdb_mol_id":
                return getPdbMolId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item holds an entity name.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * This data item holds a PDB ID code
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return delegate.getColumn("pdb_id", DelegatingStrColumn::new);
    }

    /**
     * This data item holds a RCSB ID code.
     * @return StrColumn
     */
    public StrColumn getRcsbId() {
        return delegate.getColumn("rcsb_id", DelegatingStrColumn::new);
    }

    /**
     * This data item holds the entity_id of this
     * entity within the entry.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item holds the PDB chain id of this
     * entity within the entry.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return delegate.getColumn("pdb_chain_id", DelegatingStrColumn::new);
    }

    /**
     * This data item holds the PDB molecule id of this
     * entity within the entry.
     * @return StrColumn
     */
    public StrColumn getPdbMolId() {
        return delegate.getColumn("pdb_mol_id", DelegatingStrColumn::new);
    }

}