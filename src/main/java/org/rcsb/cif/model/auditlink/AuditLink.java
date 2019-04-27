package org.rcsb.cif.model.auditlink;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AuditLink extends BaseCategory {
    public AuditLink(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AuditLink(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AuditLink(String name) {
        super(name);
    }

    /**
     * The value of _audit_block.code associated with a data block
     * in the current file related to the current data block. The
     * special value '.' may be used to refer to the current data
     * block for completeness.
     * @return BlockCode
     */
    public BlockCode getBlockCode() {
        return (BlockCode) (isText ? textFields.computeIfAbsent("block_code",
                BlockCode::new) : getBinaryColumn("block_code"));
    }

    /**
     * A textual description of the relationship of the referenced
     * data block to the current one.
     * @return BlockDescription
     */
    public BlockDescription getBlockDescription() {
        return (BlockDescription) (isText ? textFields.computeIfAbsent("block_description",
                BlockDescription::new) : getBinaryColumn("block_description"));
    }
}
