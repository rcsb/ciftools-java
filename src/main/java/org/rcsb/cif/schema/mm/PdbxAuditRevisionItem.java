package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_REVISION_ITEM category
 * report the data items associated with a PDBX_AUDIT_REVISION_HISTORY record.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditRevisionItem extends DelegatingCategory {
    public PdbxAuditRevisionItem(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "revision_ordinal":
                return getRevisionOrdinal();
            case "data_content_type":
                return getDataContentType();
            case "item":
                return getItem();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the pdbx_audit_revision_item record.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A pointer to  _pdbx_audit_revision_history.ordinal
     * @return IntColumn
     */
    public IntColumn getRevisionOrdinal() {
        return delegate.getColumn("revision_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The type of file that the pdbx_audit_revision_history record refers to.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return delegate.getColumn("data_content_type", DelegatingStrColumn::new);
    }

    /**
     * A high level explanation the author has provided for submitting a revision.
     * @return StrColumn
     */
    public StrColumn getItem() {
        return delegate.getColumn("item", DelegatingStrColumn::new);
    }

}