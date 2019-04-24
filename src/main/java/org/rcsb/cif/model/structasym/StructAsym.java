package org.rcsb.cif.model.structasym;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructAsym extends BaseCategory {
    public StructAsym(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructAsym(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructAsym(String name) {
        super(name);
    }

    /**
     * A description of special aspects of this portion of the contents
     * of the asymmetric unit.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The value of _struct_asym.id must uniquely identify a record in
     * the STRUCT_ASYM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item indicates whether the structural elements are modified.
     * @return PdbxModified
     */
    public PdbxModified getPdbxModified() {
        return (PdbxModified) (isText ? textFields.computeIfAbsent("pdbx_modified",
                PdbxModified::new) : getBinaryColumn("pdbx_modified"));
    }

    /**
     * A flag indicating that this entity was originally labeled
     * with a blank PDB chain id.
     * @return PdbxBlankPDBChainidFlag
     */
    public PdbxBlankPDBChainidFlag getPdbxBlankPDBChainidFlag() {
        return (PdbxBlankPDBChainidFlag) (isText ? textFields.computeIfAbsent("pdbx_blank_PDB_chainid_flag",
                PdbxBlankPDBChainidFlag::new) : getBinaryColumn("pdbx_blank_PDB_chainid_flag"));
    }
}
