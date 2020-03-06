package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_BRANCH_LIST category specify the list
 * of monomers in a branched entity.  Allowance is made for the possibility
 * of microheterogeneity in a sample by allowing a given sequence
 * number to be correlated with more than one monomer ID. The
 * corresponding ATOM_SITE entries should reflect this
 * heterogeneity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityBranchList extends DelegatingCategory {
    public PdbxEntityBranchList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "hetero":
                return getHetero();
            case "comp_id":
                return getCompId();
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
     * A flag to indicate whether this monomer in the entity is
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
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The value pair  _pdbx_entity_branch_list.num and _pdbx_entity_branch_list.comp_id
     * must uniquely identify a record in the PDBX_ENTITY_BRANCH_LIST list.
     * @return IntColumn
     */
    public IntColumn getNum() {
        return delegate.getColumn("num", DelegatingIntColumn::new);
    }

}