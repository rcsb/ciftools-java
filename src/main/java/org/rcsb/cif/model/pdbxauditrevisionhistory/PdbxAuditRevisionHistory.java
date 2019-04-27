package org.rcsb.cif.model.pdbxauditrevisionhistory;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAuditRevisionHistory extends BaseCategory {
    public PdbxAuditRevisionHistory(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditRevisionHistory(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditRevisionHistory(String name) {
        super(name);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_history record.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The type of file that the pdbx_audit_revision_history record refers to.
     * @return DataContentType
     */
    public DataContentType getDataContentType() {
        return (DataContentType) (isText ? textFields.computeIfAbsent("data_content_type",
                DataContentType::new) : getBinaryColumn("data_content_type"));
    }

    /**
     * The major version number of deposition release.
     * @return MajorRevision
     */
    public MajorRevision getMajorRevision() {
        return (MajorRevision) (isText ? textFields.computeIfAbsent("major_revision",
                MajorRevision::new) : getBinaryColumn("major_revision"));
    }

    /**
     * The minor version number of deposition release.
     * @return MinorRevision
     */
    public MinorRevision getMinorRevision() {
        return (MinorRevision) (isText ? textFields.computeIfAbsent("minor_revision",
                MinorRevision::new) : getBinaryColumn("minor_revision"));
    }

    /**
     * The release date of the revision
     * @return RevisionDate
     */
    public RevisionDate getRevisionDate() {
        return (RevisionDate) (isText ? textFields.computeIfAbsent("revision_date",
                RevisionDate::new) : getBinaryColumn("revision_date"));
    }

    /**
     * An internal version number corresponding to millestone file
     * @return InternalVersion
     */
    public InternalVersion getInternalVersion() {
        return (InternalVersion) (isText ? textFields.computeIfAbsent("internal_version",
                InternalVersion::new) : getBinaryColumn("internal_version"));
    }

    /**
     * The deposition id that corresponds to this millestone file
     * @return InternalDepositionId
     */
    public InternalDepositionId getInternalDepositionId() {
        return (InternalDepositionId) (isText ? textFields.computeIfAbsent("internal_deposition_id",
                InternalDepositionId::new) : getBinaryColumn("internal_deposition_id"));
    }
}
