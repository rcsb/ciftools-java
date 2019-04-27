package org.rcsb.cif.model.citation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Citation extends BaseCategory {
    public Citation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Citation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Citation(String name) {
        super(name);
    }

    /**
     * Abstract for the citation. This is used most when the
     * citation is extracted from a bibliographic database that
     * contains full text or abstract information.
     * @return Abstract
     */
    public Abstract getAbstract() {
        return (Abstract) (isText ? textFields.computeIfAbsent("abstract",
                Abstract::new) : getBinaryColumn("abstract"));
    }

    /**
     * The Chemical Abstracts Service (CAS) abstract identifier;
     * relevant for journal articles.
     * @return AbstractIdCAS
     */
    public AbstractIdCAS getAbstractIdCAS() {
        return (AbstractIdCAS) (isText ? textFields.computeIfAbsent("abstract_id_CAS",
                AbstractIdCAS::new) : getBinaryColumn("abstract_id_CAS"));
    }

    /**
     * The International Standard Book Number (ISBN) code assigned to
     * the book cited; relevant for books or book chapters.
     * @return BookIdISBN
     */
    public BookIdISBN getBookIdISBN() {
        return (BookIdISBN) (isText ? textFields.computeIfAbsent("book_id_ISBN",
                BookIdISBN::new) : getBinaryColumn("book_id_ISBN"));
    }

    /**
     * The name of the publisher of the citation; relevant
     * for books or book chapters.
     * @return BookPublisher
     */
    public BookPublisher getBookPublisher() {
        return (BookPublisher) (isText ? textFields.computeIfAbsent("book_publisher",
                BookPublisher::new) : getBinaryColumn("book_publisher"));
    }

    /**
     * The location of the publisher of the citation; relevant
     * for books or book chapters.
     * @return BookPublisherCity
     */
    public BookPublisherCity getBookPublisherCity() {
        return (BookPublisherCity) (isText ? textFields.computeIfAbsent("book_publisher_city",
                BookPublisherCity::new) : getBinaryColumn("book_publisher_city"));
    }

    /**
     * The title of the book in which the citation appeared; relevant
     * for books or book chapters.
     * @return BookTitle
     */
    public BookTitle getBookTitle() {
        return (BookTitle) (isText ? textFields.computeIfAbsent("book_title",
                BookTitle::new) : getBinaryColumn("book_title"));
    }

    /**
     * _citation.coordinate_linkage states whether this citation
     * is concerned with precisely the set of coordinates given in the
     * data block. If, for instance, the publication described the same
     * structure, but the coordinates had undergone further refinement
     * prior to the creation of the data block, the value of this data
     * item would be 'no'.
     * @return CoordinateLinkage
     */
    public CoordinateLinkage getCoordinateLinkage() {
        return (CoordinateLinkage) (isText ? textFields.computeIfAbsent("coordinate_linkage",
                CoordinateLinkage::new) : getBinaryColumn("coordinate_linkage"));
    }

    /**
     * The country of publication; relevant for books
     * and book chapters.
     * @return Country
     */
    public Country getCountry() {
        return (Country) (isText ? textFields.computeIfAbsent("country",
                Country::new) : getBinaryColumn("country"));
    }

    /**
     * Accession number used by Medline to categorize a specific
     * bibliographic entry.
     * @return DatabaseIdMedline
     */
    public DatabaseIdMedline getDatabaseIdMedline() {
        return (DatabaseIdMedline) (isText ? textFields.computeIfAbsent("database_id_Medline",
                DatabaseIdMedline::new) : getBinaryColumn("database_id_Medline"));
    }

    /**
     * A description of special aspects of the relationship
     * of the contents of the data block to the literature item cited.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _citation.id must uniquely identify a record in the
     * CITATION list.
     * 
     * The _citation.id 'primary' should be used to indicate the
     * citation that the author(s) consider to be the most pertinent to
     * the contents of the data block.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Abbreviated name of the cited journal as given in the
     * Chemical Abstracts Service Source Index.
     * @return JournalAbbrev
     */
    public JournalAbbrev getJournalAbbrev() {
        return (JournalAbbrev) (isText ? textFields.computeIfAbsent("journal_abbrev",
                JournalAbbrev::new) : getBinaryColumn("journal_abbrev"));
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * assigned to the journal cited (also referred to as the CODEN
     * designator of the Chemical Abstracts Service); relevant for
     * journal articles.
     * @return JournalIdASTM
     */
    public JournalIdASTM getJournalIdASTM() {
        return (JournalIdASTM) (isText ? textFields.computeIfAbsent("journal_id_ASTM",
                JournalIdASTM::new) : getBinaryColumn("journal_id_ASTM"));
    }

    /**
     * The Cambridge Structural Database (CSD) code assigned to the
     * journal cited; relevant for journal articles. This is also the
     * system used at the Protein Data Bank (PDB).
     * @return JournalIdCSD
     */
    public JournalIdCSD getJournalIdCSD() {
        return (JournalIdCSD) (isText ? textFields.computeIfAbsent("journal_id_CSD",
                JournalIdCSD::new) : getBinaryColumn("journal_id_CSD"));
    }

    /**
     * The International Standard Serial Number (ISSN) code assigned to
     * the journal cited; relevant for journal articles.
     * @return JournalIdISSN
     */
    public JournalIdISSN getJournalIdISSN() {
        return (JournalIdISSN) (isText ? textFields.computeIfAbsent("journal_id_ISSN",
                JournalIdISSN::new) : getBinaryColumn("journal_id_ISSN"));
    }

    /**
     * Full name of the cited journal; relevant for journal articles.
     * @return JournalFull
     */
    public JournalFull getJournalFull() {
        return (JournalFull) (isText ? textFields.computeIfAbsent("journal_full",
                JournalFull::new) : getBinaryColumn("journal_full"));
    }

    /**
     * Issue number of the journal cited; relevant for journal
     * articles.
     * @return JournalIssue
     */
    public JournalIssue getJournalIssue() {
        return (JournalIssue) (isText ? textFields.computeIfAbsent("journal_issue",
                JournalIssue::new) : getBinaryColumn("journal_issue"));
    }

    /**
     * Volume number of the journal cited; relevant for journal
     * articles.
     * @return JournalVolume
     */
    public JournalVolume getJournalVolume() {
        return (JournalVolume) (isText ? textFields.computeIfAbsent("journal_volume",
                JournalVolume::new) : getBinaryColumn("journal_volume"));
    }

    /**
     * Language in which the cited article is written.
     * @return Language
     */
    public Language getLanguage() {
        return (Language) (isText ? textFields.computeIfAbsent("language",
                Language::new) : getBinaryColumn("language"));
    }

    /**
     * The first page of the citation; relevant for journal
     * articles, books and book chapters.
     * @return PageFirst
     */
    public PageFirst getPageFirst() {
        return (PageFirst) (isText ? textFields.computeIfAbsent("page_first",
                PageFirst::new) : getBinaryColumn("page_first"));
    }

    /**
     * The last page of the citation; relevant for journal
     * articles, books and book chapters.
     * @return PageLast
     */
    public PageLast getPageLast() {
        return (PageLast) (isText ? textFields.computeIfAbsent("page_last",
                PageLast::new) : getBinaryColumn("page_last"));
    }

    /**
     * The title of the citation; relevant for journal articles, books
     * and book chapters.
     * @return Title
     */
    public Title getTitle() {
        return (Title) (isText ? textFields.computeIfAbsent("title",
                Title::new) : getBinaryColumn("title"));
    }

    /**
     * The year of the citation; relevant for journal articles, books
     * and book chapters.
     * @return Year
     */
    public Year getYear() {
        return (Year) (isText ? textFields.computeIfAbsent("year",
                Year::new) : getBinaryColumn("year"));
    }

    /**
     * Identifier ('refcode') of the database record in the Cambridge
     * Structural Database that contains details of the cited structure.
     * @return DatabaseIdCSD
     */
    public DatabaseIdCSD getDatabaseIdCSD() {
        return (DatabaseIdCSD) (isText ? textFields.computeIfAbsent("database_id_CSD",
                DatabaseIdCSD::new) : getBinaryColumn("database_id_CSD"));
    }

    /**
     * Document Object Identifier used by doi.org to uniquely
     * specify bibliographic entry.
     * @return PdbxDatabaseIdDOI
     */
    public PdbxDatabaseIdDOI getPdbxDatabaseIdDOI() {
        return (PdbxDatabaseIdDOI) (isText ? textFields.computeIfAbsent("pdbx_database_id_DOI",
                PdbxDatabaseIdDOI::new) : getBinaryColumn("pdbx_database_id_DOI"));
    }

    /**
     * Ascession number used by PubMed to categorize a specific
     * bibliographic entry.
     * @return PdbxDatabaseIdPubMed
     */
    public PdbxDatabaseIdPubMed getPdbxDatabaseIdPubMed() {
        return (PdbxDatabaseIdPubMed) (isText ? textFields.computeIfAbsent("pdbx_database_id_PubMed",
                PdbxDatabaseIdPubMed::new) : getBinaryColumn("pdbx_database_id_PubMed"));
    }

    /**
     * Flag to indicate that this citation will not be published.
     * @return UnpublishedFlag
     */
    public UnpublishedFlag getUnpublishedFlag() {
        return (UnpublishedFlag) (isText ? textFields.computeIfAbsent("unpublished_flag",
                UnpublishedFlag::new) : getBinaryColumn("unpublished_flag"));
    }
}
