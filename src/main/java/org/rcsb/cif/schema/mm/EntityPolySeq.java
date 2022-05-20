package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_POLY_SEQ category specify the sequence
 * of monomers in a polymer. Allowance is made for the possibility
 * of microheterogeneity in a sample by allowing a given sequence
 * number to be correlated with more than one monomer ID. The
 * corresponding ATOM_SITE entries should reflect this
 * heterogeneity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntityPolySeq extends DelegatingCategory {
    public EntityPolySeq(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "hetero":
                return getHetero();
            case "mon_id":
                return getMonId();
            case "num":
                return getNum();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether this monomer in the polymer is
     * heterogeneous in sequence.
     * @return StrColumn
     */
    public StrColumn getHetero() {
        return delegate.getColumn("hetero", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return delegate.getColumn("mon_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("num", DelegatingIntColumn::new);
    }

}