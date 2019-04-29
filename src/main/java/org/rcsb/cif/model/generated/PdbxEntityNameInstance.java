package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_NAME_INSTANCE category
 * list names used to define entities with their
 * associated database, entity, chain, and molecule
 * identifiers.
 */
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
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * This data item holds a PDB ID code
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_id", StrColumn::new) :
                getBinaryColumn("pdb_id"));
    }

    /**
     * This data item holds a RCSB ID code.
     * @return StrColumn
     */
    public StrColumn getRcsbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("rcsb_id", StrColumn::new) :
                getBinaryColumn("rcsb_id"));
    }

    /**
     * This data item holds the entity_id of this
     * entity within the entry.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item holds the PDB chain id of this
     * entity within the entry.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_id", StrColumn::new) :
                getBinaryColumn("pdb_chain_id"));
    }

    /**
     * This data item holds the PDB molecule id of this
     * entity within the entry.
     * @return StrColumn
     */
    public StrColumn getPdbMolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_mol_id", StrColumn::new) :
                getBinaryColumn("pdb_mol_id"));
    }
}
