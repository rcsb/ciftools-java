package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of data items recording the author information.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_author";

    public PublAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The address of a publication author. If there is more than one
     * author, this will be looped with _publ_author.name.
     * @return StrColumn
     */
    public StrColumn getAddress() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_address"));
    }

    /**
     * The e-mail address of a publication author. If there is more
     * than one author, this will be looped with _publ_author.name.
     * The format of e-mail addresses is given in Section 3.4, Address
     * Specification, of Internet Message Format, RFC 2822, P. Resnick
     * (Editor), Network Standards Group, April 2001.
     * @return StrColumn
     */
    public StrColumn getEmail() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_email"));
    }

    /**
     * A footnote accompanying an author's name in the list of authors
     * of a paper. Typically indicates sabbatical address, additional
     * affiliations or date of decease.
     * @return StrColumn
     */
    public StrColumn getFootnote() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_footnote"));
    }

    /**
     * Arbitrary identifier for this author.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_id"));
    }

    /**
     * Identifier corresponding to this author in the AUDIT_AUTHOR category list,
     * if present.
     * @return StrColumn
     */
    public StrColumn getIdAudit() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_id_audit"));
    }

    /**
     * Identifier in the IUCr contact database of a publication
     * author. This identifier may be available from the World
     * Directory of Crystallographers (http://wdc.iucr.org).
     * @return StrColumn
     */
    public StrColumn getIdIucr() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_id_iucr"));
    }

    /**
     * Identifier in the ORCID Registry of a publication
     * author. ORCID is an open, non-profit, community-driven
     * service to provide a registry of unique researcher
     * identifiers (https://orcid.org/).
     * @return StrColumn
     */
    public StrColumn getIdOrcid() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_id_orcid"));
    }

    /**
     * The name of a publication author. If there are multiple authors,
     * this will be looped with _publ_author.address. The family
     * name(s), followed by a comma and including any dynastic
     * components, precedes the first names or initials. For authors
     * with only one name, provide the full name without abbreviation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_name"));
    }

    /**
     * Telephone number of the author submitting the manuscript and
     * data block.
     * 
     * The recommended style starts with the international dialing
     * prefix, followed by the area code in parentheses, followed by the
     * local number and any extension number prefixed by 'x',
     * with no spaces. The earlier convention of including
     * the international dialing prefix in parentheses is no longer
     * recommended.
     * @return StrColumn
     */
    public StrColumn getPhone() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_author_phone"));
    }

}