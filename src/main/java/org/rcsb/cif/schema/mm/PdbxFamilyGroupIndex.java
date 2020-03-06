package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_FAMILY_GROUP_INDEX category record
 * the family membership in family groups.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxFamilyGroupIndex extends DelegatingCategory {
    public PdbxFamilyGroupIndex(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "family_prd_id":
                return getFamilyPrdId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is the identifier for the a group of related BIRD families.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a reference to the BIRD identifier for families.
     * 
     * This data item is a pointer to _pdbx_reference_molecule_family.family_prd_id in the
     * pdbx_reference_molecule category.
     * @return StrColumn
     */
    public StrColumn getFamilyPrdId() {
        return delegate.getColumn("family_prd_id", DelegatingStrColumn::new);
    }

}