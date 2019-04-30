package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_FUNC_BIND_MODE category describe
 * characteristics of protein oligonucleotide binding.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item is a pointer to _pdbx_entity_poly_domain.id in the
     * PDBX_ENTITY_POLY_DOMAIN category.
     * @return StrColumn
     */
    public StrColumn getDomainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("domain_id", StrColumn::new) :
                getBinaryColumn("domain_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item identifies the type of oligonucleotide to which
     * the protein binds.
     * @return StrColumn
     */
    public StrColumn getProteinBindsTo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protein_binds_to", StrColumn::new) :
                getBinaryColumn("protein_binds_to"));
    }

    /**
     * This data item describes the functional type of the
     * protein oligonucleotide binding interaction.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
