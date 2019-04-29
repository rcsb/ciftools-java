package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains descriptive protocols for the production
 * of this entity.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityProdProtocol extends BaseCategory {
    public PdbxEntityProdProtocol(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityProdProtocol(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityProdProtocol(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_prod_protocol.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_prod_protocol.entity_id uniquely identifies
     * each protein contained in the project target protein complex whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The protocol description associated with the protocol_type employed
     * in the production of this entity.
     * @return StrColumn
     */
    public StrColumn getProtocol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protocol", StrColumn::new) :
                getBinaryColumn("protocol"));
    }

    /**
     * The one of a set of protocol types associated with the production
     * of this entity.
     * @return StrColumn
     */
    public StrColumn getProtocolType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("protocol_type", StrColumn::new) :
                getBinaryColumn("protocol_type"));
    }
}
