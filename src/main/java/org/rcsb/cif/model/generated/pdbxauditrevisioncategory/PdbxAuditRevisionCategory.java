package org.rcsb.cif.model.generated.pdbxauditrevisioncategory;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * The category updated in the pdbx_audit_revision_category record.
     * @return Category
     */
    public Category getCategory() {
        return (Category) (isText ? textFields.computeIfAbsent("category",
                Category::new) : getBinaryColumn("category"));
    }
}
