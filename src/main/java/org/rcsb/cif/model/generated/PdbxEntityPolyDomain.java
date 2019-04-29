package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_POLY_DOMAIN category specify domains
 * of monomers within a polymer.
 */
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
     * The value of _pdbx_entity_poly_domain.begin_mon_id identifies
     * the monomer at the beginning of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return StrColumn
     */
    public StrColumn getBeginMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("begin_mon_id", StrColumn::new) :
                getBinaryColumn("begin_mon_id"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_seq_num identifies
     * the sequence position of the beginning of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return IntColumn
     */
    public IntColumn getBeginSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("begin_seq_num", IntColumn::new) :
                getBinaryColumn("begin_seq_num"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_mon_id identifies
     * the monomer at the end of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return StrColumn
     */
    public StrColumn getEndMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_mon_id", StrColumn::new) :
                getBinaryColumn("end_mon_id"));
    }

    /**
     * The value of _pdbx_entity_poly_domain.begin_seq_num identifies
     * the sequence position of the end of the domain.  This must
     * correspond to a record in the ENTITY_POLY_SEQ list.
     * @return IntColumn
     */
    public IntColumn getEndSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_seq_num", IntColumn::new) :
                getBinaryColumn("end_seq_num"));
    }
}
