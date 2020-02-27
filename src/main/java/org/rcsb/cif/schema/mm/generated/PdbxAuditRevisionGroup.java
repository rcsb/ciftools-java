package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_revision_group category
 * report the content groups associated with a PDBX_AUDIT_REVISION_HISTORY
 * record.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxAuditRevisionGroup extends BaseCategory {
    public PdbxAuditRevisionGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditRevisionGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditRevisionGroup(String name) {
        super(name);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_group record.
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
     * The collection of categories updated with this revision.
     * @return StrColumn
     */
    public StrColumn getGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group", StrColumn::new) :
                getBinaryColumn("group"));
    }
}
