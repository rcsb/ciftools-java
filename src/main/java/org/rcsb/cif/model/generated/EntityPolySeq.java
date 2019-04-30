package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_POLY_SEQ category specify the sequence
 * of monomers in a polymer. Allowance is made for the possibility
 * of microheterogeneity in a sample by allowing a given sequence
 * number to be correlated with more than one monomer ID. The
 * corresponding ATOM_SITE entries should reflect this
 * heterogeneity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EntityPolySeq extends BaseCategory {
    public EntityPolySeq(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityPolySeq(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntityPolySeq(String name) {
        super(name);
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
     * A flag to indicate whether this monomer in the polymer is
     * heterogeneous in sequence.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("hetero", StrColumn::new) :
                getBinaryColumn("hetero"));
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("mon_id", StrColumn::new) :
                getBinaryColumn("mon_id"));
    }

    /**
     * The value of _entity_poly_seq.num must uniquely and sequentially
     * identify a record in the ENTITY_POLY_SEQ list.
     * 
     * Note that this item must be a number and that the sequence
     * numbers must progress in increasing numerical order.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num", IntColumn::new) :
                getBinaryColumn("num"));
    }
}
