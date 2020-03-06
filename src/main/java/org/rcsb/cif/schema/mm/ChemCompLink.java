package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_LINK category give details about
 * the links between chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompLink extends DelegatingCategory {
    public ChemCompLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "link_id":
                return getLinkId();
            case "details":
                return getDetails();
            case "type_comp_1":
                return getTypeComp1();
            case "type_comp_2":
                return getTypeComp2();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _chem_link.id in the
     * CHEM_LINK category.
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The type of the first of the two components joined by the
     * link.
     * 
     * This data item is a pointer to _chem_comp.type in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getTypeComp1() {
        return delegate.getColumn("type_comp_1", DelegatingStrColumn::new);
    }

    /**
     * The type of the second of the two components joined by the
     * link.
     * 
     * This data item is a pointer to _chem_comp.type in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getTypeComp2() {
        return delegate.getColumn("type_comp_2", DelegatingStrColumn::new);
    }

}