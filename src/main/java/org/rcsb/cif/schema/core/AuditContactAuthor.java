package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used for details of the author(s) of the
 * dataset to whom correspondence about crystallographic details
 * should be addressed.
 * This audit contact author list may include authors from
 * the PUBL_CONTACT_AUTHOR category, i.e. author(s) submitting
 * and responsible for the manuscript associated with the dataset.
 * Authors associated with individual data blocks within
 * this dataset can be declared using the AUDIT_AUTHOR category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AuditContactAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "audit_contact_author";

    public AuditContactAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The mailing address of the author of the dataset to whom
     * correspondence about crystallographic details should be addressed.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_address"));
    }

    /**
     * The electronic mail (e-mail) address of the author of the dataset
     * to whom correspondence about crystallographic details should be
     * addressed.
     * The email address should be given in a form recognizable to
     * international networks. The format of e-mail addresses is given
     * in Section 3.4, Address Specification, of Internet Message
     * Format, RFC 2822, P. Resnick (Editor), Network Standards Group,
     * April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_email"));
    }

    /**
     * Facsimile telephone number of the author of the dataset to whom
     * correspondence about crystallographic details should be addressed.
     * The recommended style is the international dialing prefix,
     * followed by the area code in parentheses, followed by the local
     * number with no spaces. The earlier convention of including the
     * international dialing prefix in parentheses is no longer
     * recommended.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_fax"));
    }

    /**
     * Arbitrary identifier for the author of the dataset to whom
     * correspondence about crystallographic details should be addressed.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_id"));
    }

    /**
     * Identifier in the IUCr contact database of the author of the
     * dataset to whom correspondence about crystallographic details
     * should be addressed.
     * This is the person contacted by the journal editorial staff.
     * This identifier may be available from the World Directory of
     * Crystallographers (https://wdc.iucr.org/).
     * @return StrColumn
     */
    public StrColumn getIdIucr() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_id_iucr"));
    }

    /**
     * Identifier in the ORCID registry of the author of the dataset
     * to whom correspondence about crystallographic details should be
     * addressed.
     * ORCID is an open, non-profit, community-driven service to provide
     * a registry of unique researcher identifiers (https://orcid.org/).
     * @return StrColumn
     */
    public StrColumn getIdOrcid() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_id_orcid"));
    }

    /**
     * The name of the author of the dataset to whom correspondence
     * about crystallographic details should be addressed.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * For authors with only one name, provide the full name without
     * abbreviation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("audit_contact_author_name"));
    }

    /**
     * Telephone number of the author of the dataset to whom
     * correspondence about crystallographic details should be addressed.
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