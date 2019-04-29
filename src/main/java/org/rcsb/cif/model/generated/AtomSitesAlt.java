package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITES_ALT category record details
 * about the structural ensembles that should be generated from
 * atom sites or groups of atom sites that are modelled in
 * alternative conformations in this data block.
 */
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _atom_sites_alt.id must uniquely identify
     * a record in the ATOM_SITES_ALT list.
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
