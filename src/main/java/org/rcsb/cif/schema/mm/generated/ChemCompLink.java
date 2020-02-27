package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_LINK category give details about
 * the links between chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getLinkId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_id", StrColumn::new) :
                getBinaryColumn("link_id"));
    }

    /**
     * A description of special aspects of a link between
     * chemical components in the structure.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_comp_1", StrColumn::new) :
                getBinaryColumn("type_comp_1"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_comp_2", StrColumn::new) :
                getBinaryColumn("type_comp_2"));
    }
}
