package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to record details about the
 * relationships between data blocks in the current CIF.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditLink extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_link";

    public AuditLink(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The value of _audit.block_code associated with a data block
     * in the current file related to the current data block. The
     * special value '.' may be used to refer to the current data
     * block for completeness.
     * @return StrColumn
     */
    public StrColumn getBlockCode() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_link_block_code"));
    }

    /**
     * Description of the relationship of the referenced data block
     * to the current one.
     * @return StrColumn
     */
    public StrColumn getBlockDescription() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_link_block_description"));
    }

}