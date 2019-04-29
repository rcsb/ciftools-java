package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITES_ALT_GEN category record details
 * about the interpretation of multiple conformations in the
 * structure.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomSitesAltGen extends BaseCategory {
    public AtomSitesAltGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSitesAltGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSitesAltGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("alt_id", StrColumn::new) :
                getBinaryColumn("alt_id"));
    }

    /**
     * This data item is a pointer to _atom_sites_alt_ens.id in the
     * ATOM_SITES_ALT_ENS category.
     * @return StrColumn
     */
    public StrColumn getEnsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ens_id", StrColumn::new) :
                getBinaryColumn("ens_id"));
    }
}
