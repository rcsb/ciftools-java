package org.rcsb.cif.model.pdbxentityfuncbindmode;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityFuncBindMode extends BaseCategory {
    public PdbxEntityFuncBindMode(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityFuncBindMode(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityFuncBindMode(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_func_bind_mode.id is a unique identifier
     * for a binding mode within a domain within an entity.
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
     * This data item is a pointer to _pdbx_entity_poly_domain.id in the
     * PDBX_ENTITY_POLY_DOMAIN category.
     * @return DomainId
     */
    public DomainId getDomainId() {
        return (DomainId) (isText ? textFields.computeIfAbsent("domain_id",
                DomainId::new) : getBinaryColumn("domain_id"));
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
     * This data item identifies the type of oligonucleotide to which
     * the protein binds.
     * @return ProteinBindsTo
     */
    public ProteinBindsTo getProteinBindsTo() {
        return (ProteinBindsTo) (isText ? textFields.computeIfAbsent("protein_binds_to",
                ProteinBindsTo::new) : getBinaryColumn("protein_binds_to"));
    }

    /**
     * This data item describes the functional type of the
     * protein oligonucleotide binding interaction.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
