package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CITATION category record details about the
 * literature cited as being relevant to the contents of the data
 * block.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Citation extends DelegatingCategory {
    public Citation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "abstract":
                return getAbstract();
            case "abstract_id_CAS":
                return getAbstractIdCAS();
            case "book_id_ISBN":
                return getBookIdISBN();
            case "book_publisher":
                return getBookPublisher();
            case "book_publisher_city":
                return getBookPublisherCity();
            case "book_title":
                return getBookTitle();
            case "coordinate_linkage":
                return getCoordinateLinkage();
            case "country":
                return getCountry();
            case "database_id_Medline":
                return getDatabaseIdMedline();
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "journal_abbrev":
                return getJournalAbbrev();
            case "journal_id_ASTM":
                return getJournalIdASTM();
            case "journal_id_CSD":
                return getJournalIdCSD();
            case "journal_id_ISSN":
                return getJournalIdISSN();
            case "journal_full":
                return getJournalFull();
            case "journal_issue":
                return getJournalIssue();
            case "journal_volume":
                return getJournalVolume();
            case "language":
                return getLanguage();
            case "page_first":
                return getPageFirst();
            case "page_last":
                return getPageLast();
            case "title":
                return getTitle();
            case "year":
                return getYear();
            case "database_id_CSD":
                return getDatabaseIdCSD();
            case "pdbx_database_id_DOI":
                return getPdbxDatabaseIdDOI();
            case "pdbx_database_id_PubMed":
                return getPdbxDatabaseIdPubMed();
            case "pdbx_database_id_patent":
                return getPdbxDatabaseIdPatent();
            case "unpublished_flag":
                return getUnpublishedFlag();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Abstract for the citation. This is used most when the
     * citation is extracted from a bibliographic database that
     * contains full text or abstract information.
     * @return StrColumn
     */
    public StrColumn getAbstract() {
        return delegate.getColumn("abstract", DelegatingStrColumn::new);
    }

    /**
     * The Chemical Abstracts Service (CAS) abstract identifier;
     * relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getAbstractIdCAS() {
        return delegate.getColumn("abstract_id_CAS", DelegatingStrColumn::new);
    }

    /**
     * The International Standard Book Number (ISBN) code assigned to
     * the book cited; relevant for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookIdISBN() {
        return delegate.getColumn("book_id_ISBN", DelegatingStrColumn::new);
    }

    /**
     * The name of the publisher of the citation; relevant
     * for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookPublisher() {
        return delegate.getColumn("book_publisher", DelegatingStrColumn::new);
    }

    /**
     * The location of the publisher of the citation; relevant
     * for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookPublisherCity() {
        return delegate.getColumn("book_publisher_city", DelegatingStrColumn::new);
    }

    /**
     * The title of the book in which the citation appeared; relevant
     * for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookTitle() {
        return delegate.getColumn("book_title", DelegatingStrColumn::new);
    }

    /**
     * _citation.coordinate_linkage states whether this citation
     * is concerned with precisely the set of coordinates given in the
     * data block. If, for instance, the publication described the same
     * structure, but the coordinates had undergone further refinement
     * prior to the creation of the data block, the value of this data
     * item would be 'no'.
     * @return StrColumn
     */
    public StrColumn getCoordinateLinkage() {
        return delegate.getColumn("coordinate_linkage", DelegatingStrColumn::new);
    }

    /**
     * The country/region of publication; relevant for books
     * and book chapters.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return delegate.getColumn("country", DelegatingStrColumn::new);
    }

    /**
     * Accession number used by Medline to categorize a specific
     * bibliographic entry.
     * @return IntColumn
     */
    public IntColumn getDatabaseIdMedline() {
        return delegate.getColumn("database_id_Medline", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of the relationship
     * of the contents of the data block to the literature item cited.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Abbreviated name of the cited journal as given in the
     * Chemical Abstracts Service Source Index.
     * @return StrColumn
     */
    public StrColumn getJournalAbbrev() {
        return delegate.getColumn("journal_abbrev", DelegatingStrColumn::new);
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * assigned to the journal cited (also referred to as the CODEN
     * designator of the Chemical Abstracts Service); relevant for
     * journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalIdASTM() {
        return delegate.getColumn("journal_id_ASTM", DelegatingStrColumn::new);
    }

    /**
     * The Cambridge Structural Database (CSD) code assigned to the
     * journal cited; relevant for journal articles. This is also the
     * system used at the Protein Data Bank (PDB).
     * @return StrColumn
     */
    public StrColumn getJournalIdCSD() {
        return delegate.getColumn("journal_id_CSD", DelegatingStrColumn::new);
    }

    /**
     * The International Standard Serial Number (ISSN) code assigned to
     * the journal cited; relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalIdISSN() {
        return delegate.getColumn("journal_id_ISSN", DelegatingStrColumn::new);
    }

    /**
     * Full name of the cited journal; relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalFull() {
        return delegate.getColumn("journal_full", DelegatingStrColumn::new);
    }

    /**
     * Issue number of the journal cited; relevant for journal
     * articles.
     * @return StrColumn
     */
    public StrColumn getJournalIssue() {
        return delegate.getColumn("journal_issue", DelegatingStrColumn::new);
    }

    /**
     * Volume number of the journal cited; relevant for journal
     * articles.
     * @return StrColumn
     */
    public StrColumn getJournalVolume() {
        return delegate.getColumn("journal_volume", DelegatingStrColumn::new);
    }

    /**
     * Language in which the cited article is written.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return delegate.getColumn("language", DelegatingStrColumn::new);
    }

    /**
     * The first page of the citation; relevant for journal
     * articles, books and book chapters.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return delegate.getColumn("page_first", DelegatingStrColumn::new);
    }

    /**
     * The last page of the citation; relevant for journal
     * articles, books and book chapters.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return delegate.getColumn("page_last", DelegatingStrColumn::new);
    }

    /**
     * The title of the citation; relevant for journal articles, books
     * and book chapters.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return delegate.getColumn("title", DelegatingStrColumn::new);
    }

    /**
     * The year of the citation; relevant for journal articles, books
     * and book chapters.
     * @return IntColumn
     */
    public IntColumn getYear() {
        return delegate.getColumn("year", DelegatingIntColumn::new);
    }

    /**
     * Identifier ('refcode') of the database record in the Cambridge
     * Structural Database that contains details of the cited structure.
     * @return StrColumn
     */
    public StrColumn getDatabaseIdCSD() {
        return delegate.getColumn("database_id_CSD", DelegatingStrColumn::new);
    }

    /**
     * Document Object Identifier used by doi.org to uniquely
     * specify bibliographic entry.
     * @return StrColumn
     */
    public StrColumn getPdbxDatabaseIdDOI() {
        return delegate.getColumn("pdbx_database_id_DOI", DelegatingStrColumn::new);
    }

    /**
     * Ascession number used by PubMed to categorize a specific
     * bibliographic entry.
     * @return IntColumn
     */
    public IntColumn getPdbxDatabaseIdPubMed() {
        return delegate.getColumn("pdbx_database_id_PubMed", DelegatingIntColumn::new);
    }

    /**
     * If citation is a patent, the accession issued by a
     * patent office.
     * @return StrColumn
     */
    public StrColumn getPdbxDatabaseIdPatent() {
        return delegate.getColumn("pdbx_database_id_patent", DelegatingStrColumn::new);
    }

    /**
     * Flag to indicate that this citation will not be published.
     * @return StrColumn
     */
    public StrColumn getUnpublishedFlag() {
        return delegate.getColumn("unpublished_flag", DelegatingStrColumn::new);
    }

}