package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to describe the role that
 * authors took in the production of the dataset.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditAuthorRole extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_author_role";

    public AuditAuthorRole(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Unique identifier for the author for whom a role is identified.
     * This may be repeated where an author took on multiple roles.
     * The identifier for the author is drawn from the list of authors
     * given in the AUDIT_AUTHOR category.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_role_id"));
    }

    /**
     * The role taken by the author identified by _audit_author_role.id,
     * drawn from a predefined list. Additional details can be provided
     * in _audit_author_role.special_details
     * @return StrColumn
     */
    public StrColumn getRole() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_role_role"));
    }

    /**
     * Description of the contribution of the author identified by
     * _audit_author_role.id.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_role_special_details"));
    }

}