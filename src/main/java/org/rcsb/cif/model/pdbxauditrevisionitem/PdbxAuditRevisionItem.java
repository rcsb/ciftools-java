package org.rcsb.cif.model.pdbxauditrevisionitem;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * A pointer to  _pdbx_audit_revision_history.ordinal
     * @return RevisionOrdinal
     */
    public RevisionOrdinal getRevisionOrdinal() {
        return (RevisionOrdinal) (isText ? textFields.computeIfAbsent("revision_ordinal",
                RevisionOrdinal::new) : getBinaryColumn("revision_ordinal"));
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
     * A high level explanation the author has provided for submitting a revision.
     * @return Item
     */
    public Item getItem() {
        return (Item) (isText ? textFields.computeIfAbsent("item",
                Item::new) : getBinaryColumn("item"));
    }
}
