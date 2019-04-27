package org.rcsb.cif.model.pdbxentitypolydomain;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityPolyDomain extends BaseCategory {
    public PdbxEntityPolyDomain(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityPolyDomain(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityPolyDomain(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_poly_domain.id must uniquely identify a
     * domain within an entity.
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
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_mon_id identifies
     * the monomer at the beginning of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return BeginMonId
     */
    public BeginMonId getBeginMonId() {
        return (BeginMonId) (isText ? textFields.computeIfAbsent("begin_mon_id",
                BeginMonId::new) : getBinaryColumn("begin_mon_id"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_seq_num identifies
     * the sequence position of the beginning of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return BeginSeqNum
     */
    public BeginSeqNum getBeginSeqNum() {
        return (BeginSeqNum) (isText ? textFields.computeIfAbsent("begin_seq_num",
                BeginSeqNum::new) : getBinaryColumn("begin_seq_num"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_mon_id identifies
     * the monomer at the end of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return EndMonId
     */
    public EndMonId getEndMonId() {
        return (EndMonId) (isText ? textFields.computeIfAbsent("end_mon_id",
                EndMonId::new) : getBinaryColumn("end_mon_id"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_seq_num identifies
     * the sequence position of the end of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return EndSeqNum
     */
    public EndSeqNum getEndSeqNum() {
        return (EndSeqNum) (isText ? textFields.computeIfAbsent("end_seq_num",
                EndSeqNum::new) : getBinaryColumn("end_seq_num"));
    }
}
