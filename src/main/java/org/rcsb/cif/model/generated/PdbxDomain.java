package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DOMAIN category record information
 * about domain definitions.
 * 
 * A domain need not correspond to a completely polypeptide chain;
 * it can be composed of one or more segments in a single chain,
 * or by segments from more than one chain.
 */
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _pdbx_domain.id must uniquely identify a
     * record in the PDBX_DOMAIN list.
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
