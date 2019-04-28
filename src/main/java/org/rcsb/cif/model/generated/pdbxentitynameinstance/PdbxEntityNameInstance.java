package org.rcsb.cif.model.generated.pdbxentitynameinstance;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityNameInstance extends BaseCategory {
    public PdbxEntityNameInstance(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityNameInstance(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityNameInstance(String name) {
        super(name);
    }

    /**
     * This data item holds an entity name.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * This data item holds a PDB ID code
     * @return PdbId
     */
    public PdbId getPdbId() {
        return (PdbId) (isText ? textFields.computeIfAbsent("pdb_id",
                PdbId::new) : getBinaryColumn("pdb_id"));
    }

    /**
     * This data item holds a RCSB ID code.
     * @return RcsbId
     */
    public RcsbId getRcsbId() {
        return (RcsbId) (isText ? textFields.computeIfAbsent("rcsb_id",
                RcsbId::new) : getBinaryColumn("rcsb_id"));
    }

    /**
     * This data item holds the entity_id of this
     * entity within the entry.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This data item holds the PDB chain id of this
     * entity within the entry.
     * @return PdbChainId
     */
    public PdbChainId getPdbChainId() {
        return (PdbChainId) (isText ? textFields.computeIfAbsent("pdb_chain_id",
                PdbChainId::new) : getBinaryColumn("pdb_chain_id"));
    }

    /**
     * This data item holds the PDB molecule id of this
     * entity within the entry.
     * @return PdbMolId
     */
    public PdbMolId getPdbMolId() {
        return (PdbMolId) (isText ? textFields.computeIfAbsent("pdb_mol_id",
                PdbMolId::new) : getBinaryColumn("pdb_mol_id"));
    }
}
