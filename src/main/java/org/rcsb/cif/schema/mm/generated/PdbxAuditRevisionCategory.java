package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_REVISION_CATEGORY category
 * report the data categories associated with a PDBX_AUDIT_REVISION_HISTORY record.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxAuditRevisionCategory extends BaseCategory {
    public PdbxAuditRevisionCategory(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditRevisionCategory(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditRevisionCategory(String name) {
        super(name);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_category record.
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
     * The category updated in the pdbx_audit_revision_category record.
     * @return StrColumn
     */
    public StrColumn getCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("category", StrColumn::new) :
                getBinaryColumn("category"));
    }
}
