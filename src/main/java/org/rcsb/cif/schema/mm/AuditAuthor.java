package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the AUDIT_AUTHOR category record details about
 * the author(s) of the data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditAuthor extends DelegatingCategory {
    public AuditAuthor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "address":
                return getAddress();
            case "name":
                return getName();
            case "pdbx_ordinal":
                return getPdbxOrdinal();
            case "identifier_ORCID":
                return getIdentifierORCID();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The address of an author of this data block. If there are
     * multiple authors, _audit_author.address is looped with
     * _audit_author.name.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return delegate.getColumn("address", DelegatingStrColumn::new);
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _audit_author.name is looped with _audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * This data item defines the order of the author's name in the
     * list of audit authors.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getIdentifierORCID() {
        return delegate.getColumn("identifier_ORCID", DelegatingStrColumn::new);
    }

}