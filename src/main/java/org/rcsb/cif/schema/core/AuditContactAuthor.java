package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used for contact author(s) details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditContactAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_contact_author";

    public AuditContactAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The mailing address of the author of the data block to whom
     * correspondence should be addressed.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_address"));
    }

    /**
     * The electronic mail address of the author of the data block
     * to whom correspondence should be addressed, in a form
     * recognizable to international networks. The format of e-mail
     * addresses is given in Section 3.4, Address Specification, of
     * Internet Message Format, RFC 2822, P. Resnick (Editor),
     * Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_email"));
    }

    /**
     * Facsimile telephone number of the author submitting the manuscript
     * and data block.
     * The recommended style is the international dialing prefix, followed
     * by the area code in parentheses, followed by the local number with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_fax"));
    }

    /**
     * Arbitrary identifier for this author.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_id"));
    }

    /**
     * The name of the author of the data block to whom correspondence
     * should be addressed. The family name(s), followed by a comma and
     * including any dynastic components, precedes the first name(s) or
     * initial(s). For authors with only one name, provide the full name
     * without abbreviation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_name"));
    }

    /**
     * Telephone number of author submitting the manuscript and data block.
     * The recommended style is the international dialing prefix,
     * followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x', with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_phone"));
    }

}