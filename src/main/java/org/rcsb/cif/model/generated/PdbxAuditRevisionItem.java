package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_AUDIT_REVISION_ITEM category
 * report the data items associated with a PDBX_AUDIT_REVISION_HISTORY record.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxAuditRevisionItem extends BaseCategory {
    public PdbxAuditRevisionItem(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxAuditRevisionItem(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxAuditRevisionItem(String name) {
        super(name);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_item record.
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
     * A high level explanation the author has provided for submitting a revision.
     * @return StrColumn
     */
    public StrColumn getItem() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("item", StrColumn::new) :
                getBinaryColumn("item"));
    }
}
