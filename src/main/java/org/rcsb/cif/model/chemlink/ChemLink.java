package org.rcsb.cif.model.chemlink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
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
}
