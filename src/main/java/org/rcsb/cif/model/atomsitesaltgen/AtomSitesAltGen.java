package org.rcsb.cif.model.atomsitesaltgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return AltId
     */
    public AltId getAltId() {
        return (AltId) (isText ? textFields.computeIfAbsent("alt_id",
                AltId::new) : getBinaryColumn("alt_id"));
    }

    /**
     * This data item is a pointer to _atom_sites_alt_ens.id in the
     * ATOM_SITES_ALT_ENS category.
     * @return EnsId
     */
    public EnsId getEnsId() {
        return (EnsId) (isText ? textFields.computeIfAbsent("ens_id",
                EnsId::new) : getBinaryColumn("ens_id"));
    }
}
