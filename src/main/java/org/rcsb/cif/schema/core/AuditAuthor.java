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
     * The electronic mail address of an author of the data block, in a form
     * recognizable to international networks. The format of e-mail addresses is
     * given in Section 3.4, Address Specification, of Internet Message Format,
     * RFC 2822, P. Resnick (Editor), Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_email"));
    }

    /**
     * Facsimile telephone number of an author of the data block.
     * The recommended style is the international dialing prefix, followed
     * by the area code in parentheses, followed by the local number with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_fax"));
    }

    /**
     * Arbitrary identifier for this author.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_id"));
    }

    /**
     * Identifier in the ORCID Registry of a publication
     * author. ORCID is an open, non-profit, community-driven
     * service to provide a registry of unique researcher
     * identifiers (https://orcid.org/).
     * @return StrColumn
     */
    public StrColumn getIdOrcid() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_id_orcid"));
    }

    /**
     * The name of an author of this data block. If there are multiple
     * authors, _audit_author.name is looped with _audit_author.address.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * For authors with only one name, provide the full name without
     * abbreviation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_name"));
    }

    /**
     * Telephone number of an author of the data block.
     * The recommended style is the international dialing prefix,
     * followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x', with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_author_phone"));
    }

}