package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the AUDIT_LINK category record details about the
 * relationships between data blocks in the current CIF.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditLink extends DelegatingCategory {
    public AuditLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "block_code":
                return getBlockCode();
            case "block_description":
                return getBlockDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _audit_block.code associated with a data block
     * in the current file related to the current data block. The
     * special value '.' may be used to refer to the current data
     * block for completeness.
     * @return StrColumn
     */
    public StrColumn getBlockCode() {
        return delegate.getColumn("block_code", DelegatingStrColumn::new);
    }

    /**
     * A textual description of the relationship of the referenced
     * data block to the current one.
     * @return StrColumn
     */
    public StrColumn getBlockDescription() {
        return delegate.getColumn("block_description", DelegatingStrColumn::new);
    }

}