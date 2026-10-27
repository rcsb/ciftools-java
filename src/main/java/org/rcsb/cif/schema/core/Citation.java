package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CITATION category record details about the
 * literature cited as being relevant to the contents of the data
 * block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Citation extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "citation";

    public Citation(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Abstract for the citation. This is used most when the
     * citation is extracted from a bibliographic database that
     * contains full text or abstract information.
     * @return StrColumn
     */
    public StrColumn getAbstract() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_abstract"));
    }

    /**
     * Chemical Abstracts Service (CAS) abstract identifier.
     * @return StrColumn
     */
    public StrColumn getAbstractIdCas() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_abstract_id_cas"));
    }

    /**
     * International Standard Book Number (ISBN) for book chapter cited.
     * @return StrColumn
     */
    public StrColumn getBookIdIsbn() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_book_id_isbn"));
    }

    /**
     * Publisher of the citation; relevant for book chapters.
     * @return StrColumn
     */
    public StrColumn getBookPublisher() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_book_publisher"));
    }

    /**
     * Location of publisher of the citation; relevant for book chapters.
     * @return StrColumn
     */
    public StrColumn getBookPublisherCity() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_book_publisher_city"));
    }

    /**
     * Title of the book in which the citation appeared.
     * @return StrColumn
     */
    public StrColumn getBookTitle() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_book_title"));
    }

    /**
     * Code specifies whether this citation is concerned with precisely
     * the set of coordinates given in the data block. If, for instance,
     * the publication described the same structure, but the coordinates
     * had undergone further refinement prior to creation of the data
     * block, the value of this data item would be 'no'.
     * @return StrColumn
     */
    public StrColumn getCoordinateLinkage() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_coordinate_linkage"));
    }

    /**
     * Country of publication; for journal articles and book chapters.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_country"));
    }

    /**
     * Identifier ('refcode') of the database record in the Cambridge
     * Structural Database containing details of the cited structure.
     * @return StrColumn
     */
    public StrColumn getDatabaseIdCsd() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_database_id_csd"));
    }

    /**
     * MEDLINE accession number categorizing a bibliographic entry.
     * @return StrColumn
     */
    public StrColumn getDatabaseIdMedline() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_database_id_medline"));
    }

    /**
     * The Digital Object Identifier (DOI) of the cited work.
     * 
     * A DOI is a unique character string identifying any
     * object of intellectual property. It provides a
     * persistent identifier for an object on a digital network
     * and permits the association of related current data in a
     * structured extensible way. A DOI is an implementation
     * of the Internet concepts of Uniform Resource Name and
     * Universal Resource Locator managed according to the
     * specifications of the International DOI Foundation
     * (see https://www.doi.org/).
     * @return StrColumn
     */
    public StrColumn getDoi() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_doi"));
    }

    /**
     * Unique identifier to the CITATION list. A value of 'primary'
     * should be used to indicate the citation that the author(s)
     * consider to be the most pertinent to the contents of the data
     * block. Note that this item need not be a number; it can be
     * any unique identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_id"));
    }

    /**
     * Abbreviated name of the journal cited as given in the Chemical
     * Abstracts Service Source Index.
     * @return StrColumn
     */
    public StrColumn getJournalAbbrev() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_journal_abbrev"));
    }

    /**
     * Full name of the journal cited; relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalFull() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_journal_full"));
    }

    /**
     * American Society for the Testing of Materials (ASTM) code assigned
     * to the journal cited (also referred to as the CODEN designator of
     * the Chemical Abstracts Service); relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalIdAstm() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_journal_id_astm"));
    }

    /**
     * The Cambridge Structural Database (CSD) code assigned to the
     * journal cited; relevant for journal articles. This is also the
     * system used at the Protein Data Bank (PDB).
     * @return StrColumn
     */
    public StrColumn getJournalIdCsd() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_journal_id_csd"));
    }

    /**
     * The International Standard Serial Number (ISSN) code assigned to
     * the journal cited. Relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalIdIssn() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_journal_id_issn"));
    }

    /**
     * Issue identifier of the journal cited; relevant for articles.
     * @return StrColumn
     */
    public StrColumn getJournalIssue() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_journal_issue"));
    }

    /**
     * Volume number of the journal cited; relevant for articles.
     * @return IntColumn
     */
    public IntColumn getJournalVolume() {
        return new DelegatingIntColumn(parentBlock.getColumn("citation_journal_volume"));
    }

    /**
     * Language in which the citation appears.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_language"));
    }

    /**
     * First page of citation; relevant for articles and book chapters.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_page_first"));
    }

    /**
     * Last page of citation; relevant for articles and book chapters.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_page_last"));
    }

    /**
     * The name of the publisher of the cited work. This should be used
     * for citations of journal articles or datasets (in the latter case
     * the publisher could be a curated database). For books or book chapters
     * use _citation.book_publisher.
     * @return StrColumn
     */
    public StrColumn getPublisher() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_publisher"));
    }

    /**
     * Title of citation; relevant for articles and book chapters.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_title"));
    }

    /**
     * The Uniform Resource Locator (URL) of the cited work.
     * 
     * The _citation.DOI data item should be used in preference to this item when
     * possible.
     * @return StrColumn
     */
    public StrColumn getUrl() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_url"));
    }

    /**
     * Year of citation; relevant for articles and book chapters.
     * @return IntColumn
     */
    public IntColumn getYear() {
        return new DelegatingIntColumn(parentBlock.getColumn("citation_year"));
    }

    /**
     * Special aspects of the relationship of the data block contents
     * to the literature item cited.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("citation_details", "citation_special_details"));
    }

    /**
     * Special aspects of the relationship of the data block contents
     * to the literature item cited.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("citation_details", "citation_special_details"));
    }

}