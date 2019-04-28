package org.rcsb.cif.model.generated.chemcomplink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemCompLink extends BaseCategory {
    public ChemCompLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemCompLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemCompLink(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_link.id in the
     * CHEM_LINK category.
     * @return LinkId
     */
    public LinkId getLinkId() {
        return (LinkId) (isText ? textFields.computeIfAbsent("link_id",
                LinkId::new) : getBinaryColumn("link_id"));
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The type of the first of the two components joined by the
     * link.
     * 
     * This data item is a pointer to _chem_comp.type in the CHEM_COMP
     * category.
     * @return TypeComp1
     */
    public TypeComp1 getTypeComp1() {
        return (TypeComp1) (isText ? textFields.computeIfAbsent("type_comp_1",
                TypeComp1::new) : getBinaryColumn("type_comp_1"));
    }

    /**
     * The type of the second of the two components joined by the
     * link.
     * 
     * This data item is a pointer to _chem_comp.type in the CHEM_COMP
     * category.
     * @return TypeComp2
     */
    public TypeComp2 getTypeComp2() {
        return (TypeComp2) (isText ? textFields.computeIfAbsent("type_comp_2",
                TypeComp2::new) : getBinaryColumn("type_comp_2"));
    }
}
