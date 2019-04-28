package org.rcsb.cif.model.generated.atomsitesaltens;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomSitesAltEns extends BaseCategory {
    public AtomSitesAltEns(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSitesAltEns(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSitesAltEns(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the ensemble structure
     * generated from atoms with various alternative IDs.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _atom_sites_alt_ens.id must uniquely identify a
     * record in the ATOM_SITES_ALT_ENS list.
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
