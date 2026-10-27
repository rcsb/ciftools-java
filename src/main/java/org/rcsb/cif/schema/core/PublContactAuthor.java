package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of data items used for details of the contact author(s)
 * of the associated manuscript, to whom general correspondence should
 * be addressed.
 * This is the person contacted by the journal editorial staff.
 * This may or may not be the same person as _audit_contact_author,
 * which is the person responsible for the dataset.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublContactAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_contact_author";

    public PublContactAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Arbitrary identifier for the contact author of the associated
     * manuscript to whom general correspondence should be addressed.
     * This is the person contacted by the journal editorial staff.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_id"));
    }

    /**
     * Identifier in the IUCr contact database of the contact author of
     * the associated manuscript to whom general correspondence should be
     * addressed.
     * This is the person contacted by the journal editorial staff.
     * This identifier may be available from the World Directory of
     * Crystallographers (https://wdc.iucr.org/).
     * @return StrColumn
     */
    public StrColumn getIdIucr() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_id_iucr"));
    }

    /**
     * Identifier in the ORCID Registry of the contact author of the
     * associated manuscript to whom general correspondence should be
     * addressed.
     * This is the person contacted by the journal editorial staff.
     * ORCID is an open, non-profit, community-driven service to provide
     * a registry of unique researcher identifiers (https://orcid.org/).
     * @return StrColumn
     */
    public StrColumn getIdOrcid() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_id_orcid"));
    }

    /**
     * The address of the contact author of the associated manuscript to
     * whom general correspondence should be addressed.
     * This is the person contacted by the journal editorial staff.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_address"));
    }

    /**
     * DEPRECATED. The _publ_contact_author.name and _publ_contact_author.address
     * data items should be used instead of this item.
     * 
     * The name and address of the author submitting the manuscript and data block.
     * This is the person contacted by the journal editorial staff.
     * @return StrColumn
     */
    public StrColumn getContactDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("publ_contact_author", "publ_contact_author_contact_details"));
    }

    /**
     * The electronic mail (e-mail) address of the contact author of the
     * associated manuscript to whom general correspondence should be
     * addressed.
     * This is the person contacted by the journal editorial staff.
     * The e-mail address should be given in a form recognizable to
     * international networks. The format of e-mail addresses is given
     * in Section 3.4, Address Specification, of Internet Message
     * Format, RFC 2822, P. Resnick (Editor), Network Standards Group,
     * April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_email"));
    }

    /**
     * Facsimile telephone number of the contact author(s) of the contact
     * author of the associated manuscript to whom general correspondence
     * should be addressed.
     * This is the person contacted by the journal editorial staff.
     * The recommended style is the international dialing prefix, followed
     * by the area code in parentheses, followed by the local number with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getFax() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_fax"));
    }

    /**
     * The name of the contact author of the associated manuscript to
     * whom general correspondence should be addressed.
     * This is the person contacted by the journal editorial staff.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_name"));
    }

    /**
     * Telephone number of the contact author of the associated
     * manuscript to whom general correspondence should be addressed.
     * This is the person contacted by the journal editorial staff.
     * The recommended style is the international dialing prefix,
     * followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x', with
     * no spaces. The earlier convention of including the international
     * dialing prefix in parentheses is no longer recommended.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_contact_author_phone"));
    }

}