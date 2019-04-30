package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_REVISION_HISTORY category record
 * the revision history for a data entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The type of file that the pdbx_audit_revision_history record refers to.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_content_type", StrColumn::new) :
                getBinaryColumn("data_content_type"));
    }

    /**
     * The major version number of deposition release.
     * @return IntColumn
     */
    public IntColumn getMajorRevision() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("major_revision", IntColumn::new) :
                getBinaryColumn("major_revision"));
    }

    /**
     * The minor version number of deposition release.
     * @return IntColumn
     */
    public IntColumn getMinorRevision() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("minor_revision", IntColumn::new) :
                getBinaryColumn("minor_revision"));
    }

    /**
     * The release date of the revision
     * @return StrColumn
     */
    public StrColumn getRevisionDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("revision_date", StrColumn::new) :
                getBinaryColumn("revision_date"));
    }

    /**
     * An internal version number corresponding to millestone file
     * @return IntColumn
     */
    public IntColumn getInternalVersion() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("internal_version", IntColumn::new) :
                getBinaryColumn("internal_version"));
    }

    /**
     * The deposition id that corresponds to this millestone file
     * @return StrColumn
     */
    public StrColumn getInternalDepositionId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("internal_deposition_id", StrColumn::new) :
                getBinaryColumn("internal_deposition_id"));
    }
}
