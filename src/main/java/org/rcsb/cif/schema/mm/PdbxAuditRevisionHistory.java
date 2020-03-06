package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_REVISION_HISTORY category record
 * the revision history for a data entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditRevisionHistory extends DelegatingCategory {
    public PdbxAuditRevisionHistory(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal":
                return getOrdinal();
            case "data_content_type":
                return getDataContentType();
            case "major_revision":
                return getMajorRevision();
            case "minor_revision":
                return getMinorRevision();
            case "revision_date":
                return getRevisionDate();
            case "internal_version":
                return getInternalVersion();
            case "internal_deposition_id":
                return getInternalDepositionId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the pdbx_audit_revision_history record.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * The type of file that the pdbx_audit_revision_history record refers to.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return delegate.getColumn("data_content_type", DelegatingStrColumn::new);
    }

    /**
     * The major version number of deposition release.
     * @return IntColumn
     */
    public IntColumn getMajorRevision() {
        return delegate.getColumn("major_revision", DelegatingIntColumn::new);
    }

    /**
     * The minor version number of deposition release.
     * @return IntColumn
     */
    public IntColumn getMinorRevision() {
        return delegate.getColumn("minor_revision", DelegatingIntColumn::new);
    }

    /**
     * The release date of the revision
     * @return StrColumn
     */
    public StrColumn getRevisionDate() {
        return delegate.getColumn("revision_date", DelegatingStrColumn::new);
    }

    /**
     * An internal version number corresponding to millestone file
     * @return IntColumn
     */
    public IntColumn getInternalVersion() {
        return delegate.getColumn("internal_version", DelegatingIntColumn::new);
    }

    /**
     * The deposition id that corresponds to this millestone file
     * @return StrColumn
     */
    public StrColumn getInternalDepositionId() {
        return delegate.getColumn("internal_deposition_id", DelegatingStrColumn::new);
    }

}