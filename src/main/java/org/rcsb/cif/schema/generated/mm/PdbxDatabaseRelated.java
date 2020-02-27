package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in PDBX_DATABASE_RELATED contain references to entries
 * that are related to the this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDatabaseRelated extends DelegatingCategory {
    public PdbxDatabaseRelated(Category delegate) {
        super(delegate);
    }

    /**
     * The name of the database containing the related entry.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * A description of the related entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The identifying code in the related database.
     * @return StrColumn
     */
    public StrColumn getDbId() {
        return delegate.getColumn("db_id", DelegatingStrColumn::new);
    }

    /**
     * The identifying content type of the related entry.
     * @return StrColumn
     */
    public StrColumn getContentType() {
        return delegate.getColumn("content_type", DelegatingStrColumn::new);
    }
}
