package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK category give details about
 * the links between chemical components.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ChemLink extends BaseCategory {
    public ChemLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLink(String name) {
        super(name);
    }

    /**
     * The value of _chem_link.id must uniquely identify each
     * item in the CHEM_LINK list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
}
