package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITES_ALT_ENS category record details
 * about the ensemble structure generated from atoms with various
 * alternative conformation IDs.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _atom_sites_alt_ens.id must uniquely identify a
     * record in the ATOM_SITES_ALT_ENS list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }
}
