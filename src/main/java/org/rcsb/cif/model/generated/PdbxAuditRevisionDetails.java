package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_audit_revision_details category
 * record descriptions of changes associated with
 * PDBX_AUDIT_REVISION_HISTORY records.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAuditRevisionDetails extends BaseCategory {
    public PdbxAuditRevisionDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditRevisionDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditRevisionDetails(String name) {
        super(name);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_details record.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * A pointer to  _pdbx_audit_revision_history.ordinal
     * @return IntColumn
     */
    public IntColumn getRevisionOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("revision_ordinal", IntColumn::new) :
                getBinaryColumn("revision_ordinal"));
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
     * The provider of the revision.
     * @return StrColumn
     */
    public StrColumn getProvider() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("provider", StrColumn::new) :
                getBinaryColumn("provider"));
    }

    /**
     * A type classification of the revision
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Additional details describing the revision.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }
}
