package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category to collect the authors of this entry
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmAuthorList extends DelegatingCategory {
    public EmAuthorList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "author":
                return getAuthor();
            case "identifier_ORCID":
                return getIdentifierORCID();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Author of the EMDB entry in PDB format: Taylor, T.J.
     * @return StrColumn
     */
    public StrColumn getAuthor() {
        return delegate.getColumn("author", DelegatingStrColumn::new);
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getIdentifierORCID() {
        return delegate.getColumn("identifier_ORCID", DelegatingStrColumn::new);
    }

    /**
     * ID 1 corresponds to the main author of the entry
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

}