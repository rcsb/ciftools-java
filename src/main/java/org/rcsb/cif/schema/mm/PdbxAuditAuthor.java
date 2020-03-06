package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_AUTHOR category record details about
 * the author(s) of the data block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditAuthor extends DelegatingCategory {
    public PdbxAuditAuthor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "address":
                return getAddress();
            case "name":
                return getName();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The address of an author of this data block. If there are
     * multiple authors, _pdbx_audit_author.address is looped with
     * _pdbx_audit_author.name.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return delegate.getColumn("address", DelegatingStrColumn::new);
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _pdbx_audit_author.name is looped with _pdbx_audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic compoents, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * A unique sequential integer identifier for each author.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

}