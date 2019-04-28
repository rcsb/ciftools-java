package org.rcsb.cif.model.generated.atomsitesalt;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomSitesAlt extends BaseCategory {
    public AtomSitesAlt(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSitesAlt(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSitesAlt(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the modelling of atoms in
     * alternative conformations.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _atom_sites_alt.id must uniquely identify
     * a record in the ATOM_SITES_ALT list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
