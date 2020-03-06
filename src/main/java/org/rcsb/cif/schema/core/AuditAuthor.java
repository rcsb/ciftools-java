package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used for author(s) details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_author";

    public AuditAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The address of an author of this data block. If there are
     * multiple authors, _audit_author.address is looped with
     * _audit_author.name.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_address"));
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _audit_author.name is looped with _audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_name"));
    }

}