package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the AUDIT_LINK category record details about the
 * relationships between data blocks in the current CIF.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getBlockCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("block_code", StrColumn::new) :
                getBinaryColumn("block_code"));
    }

    /**
     * A textual description of the relationship of the referenced
     * data block to the current one.
     * @return StrColumn
     */
    public StrColumn getBlockDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("block_description", StrColumn::new) :
                getBinaryColumn("block_description"));
    }
}
