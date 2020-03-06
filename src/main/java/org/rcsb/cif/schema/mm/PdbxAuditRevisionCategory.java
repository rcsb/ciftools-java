package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_REVISION_CATEGORY category
 * report the data categories associated with a PDBX_AUDIT_REVISION_HISTORY record.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditRevisionCategory extends DelegatingCategory {
    public PdbxAuditRevisionCategory(Category delegate) {
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
            case "category":
                return getCategory();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the pdbx_audit_revision_category record.
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
     * The category updated in the pdbx_audit_revision_category record.
     * @return StrColumn
     */
    public StrColumn getCategory() {
        return delegate.getColumn("category", DelegatingStrColumn::new);
    }

}