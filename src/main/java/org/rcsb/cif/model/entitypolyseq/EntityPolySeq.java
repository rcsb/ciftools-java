package org.rcsb.cif.model.entitypolyseq;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class EntityPolySeq extends BaseCategory {
    public EntityPolySeq(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityPolySeq(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? getTextColumn("entity_id") : getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate whether this monomer in the polymer is
     * heterogeneous in sequence.
     * @return Hetero
     */
    public Hetero getHetero() {
        return (Hetero) (isText ? getTextColumn("hetero") : getBinaryColumn("hetero"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return MonId
     */
    public MonId getMonId() {
        return (MonId) (isText ? getTextColumn("mon_id") : getBinaryColumn("mon_id"));
    }

    /**
     * The value of _entity_poly_seq.num must uniquely and sequentially
     * identify a record in the ENTITY_POLY_SEQ list.
     * 
     * Note that this item must be a number and that the sequence
     * numbers must progress in increasing numerical order.
     * @return Num
     */
    public Num getNum() {
        return (Num) (isText ? getTextColumn("num") : getBinaryColumn("num"));
    }
}
