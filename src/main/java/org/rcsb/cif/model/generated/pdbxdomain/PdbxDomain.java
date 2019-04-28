package org.rcsb.cif.model.generated.pdbxdomain;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDomain extends BaseCategory {
    public PdbxDomain(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDomain(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDomain(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the structural elements that
     * comprise a domain.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _pdbx_domain.id must uniquely identify a
     * record in the PDBX_DOMAIN list.
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
