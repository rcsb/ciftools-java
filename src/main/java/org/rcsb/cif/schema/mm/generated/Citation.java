package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CITATION category record details about the
 * literature cited as being relevant to the contents of the data
 * block.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getAbstract() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("abstract", StrColumn::new) :
                getBinaryColumn("abstract"));
    }

    /**
     * The Chemical Abstracts Service (CAS) abstract identifier;
     * relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getAbstractIdCAS() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("abstract_id_CAS", StrColumn::new) :
                getBinaryColumn("abstract_id_CAS"));
    }

    /**
     * The International Standard Book Number (ISBN) code assigned to
     * the book cited; relevant for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookIdISBN() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("book_id_ISBN", StrColumn::new) :
                getBinaryColumn("book_id_ISBN"));
    }

    /**
     * The name of the publisher of the citation; relevant
     * for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookPublisher() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("book_publisher", StrColumn::new) :
                getBinaryColumn("book_publisher"));
    }

    /**
     * The location of the publisher of the citation; relevant
     * for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookPublisherCity() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("book_publisher_city", StrColumn::new) :
                getBinaryColumn("book_publisher_city"));
    }

    /**
     * The title of the book in which the citation appeared; relevant
     * for books or book chapters.
     * @return StrColumn
     */
    public StrColumn getBookTitle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("book_title", StrColumn::new) :
                getBinaryColumn("book_title"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("coordinate_linkage", StrColumn::new) :
                getBinaryColumn("coordinate_linkage"));
    }

    /**
     * The country of publication; relevant for books
     * and book chapters.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("country", StrColumn::new) :
                getBinaryColumn("country"));
    }

    /**
     * Accession number used by Medline to categorize a specific
     * bibliographic entry.
     * @return IntColumn
     */
    public IntColumn getDatabaseIdMedline() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("database_id_Medline", IntColumn::new) :
                getBinaryColumn("database_id_Medline"));
    }

    /**
     * A description of special aspects of the relationship
     * of the contents of the data block to the literature item cited.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Abbreviated name of the cited journal as given in the
     * Chemical Abstracts Service Source Index.
     * @return StrColumn
     */
    public StrColumn getJournalAbbrev() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_abbrev", StrColumn::new) :
                getBinaryColumn("journal_abbrev"));
    }

    /**
     * The American Society for Testing and Materials (ASTM) code
     * assigned to the journal cited (also referred to as the CODEN
     * designator of the Chemical Abstracts Service); relevant for
     * journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalIdASTM() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_id_ASTM", StrColumn::new) :
                getBinaryColumn("journal_id_ASTM"));
    }

    /**
     * The Cambridge Structural Database (CSD) code assigned to the
     * journal cited; relevant for journal articles. This is also the
     * system used at the Protein Data Bank (PDB).
     * @return StrColumn
     */
    public StrColumn getJournalIdCSD() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_id_CSD", StrColumn::new) :
                getBinaryColumn("journal_id_CSD"));
    }

    /**
     * The International Standard Serial Number (ISSN) code assigned to
     * the journal cited; relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalIdISSN() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_id_ISSN", StrColumn::new) :
                getBinaryColumn("journal_id_ISSN"));
    }

    /**
     * Full name of the cited journal; relevant for journal articles.
     * @return StrColumn
     */
    public StrColumn getJournalFull() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_full", StrColumn::new) :
                getBinaryColumn("journal_full"));
    }

    /**
     * Issue number of the journal cited; relevant for journal
     * articles.
     * @return StrColumn
     */
    public StrColumn getJournalIssue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_issue", StrColumn::new) :
                getBinaryColumn("journal_issue"));
    }

    /**
     * Volume number of the journal cited; relevant for journal
     * articles.
     * @return StrColumn
     */
    public StrColumn getJournalVolume() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("journal_volume", StrColumn::new) :
                getBinaryColumn("journal_volume"));
    }

    /**
     * Language in which the cited article is written.
     * @return StrColumn
     */
    public StrColumn getLanguage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("language", StrColumn::new) :
                getBinaryColumn("language"));
    }

    /**
     * The first page of the citation; relevant for journal
     * articles, books and book chapters.
     * @return StrColumn
     */
    public StrColumn getPageFirst() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("page_first", StrColumn::new) :
                getBinaryColumn("page_first"));
    }

    /**
     * The last page of the citation; relevant for journal
     * articles, books and book chapters.
     * @return StrColumn
     */
    public StrColumn getPageLast() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("page_last", StrColumn::new) :
                getBinaryColumn("page_last"));
    }

    /**
     * The title of the citation; relevant for journal articles, books
     * and book chapters.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("title", StrColumn::new) :
                getBinaryColumn("title"));
    }

    /**
     * The year of the citation; relevant for journal articles, books
     * and book chapters.
     * @return IntColumn
     */
    public IntColumn getYear() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("year", IntColumn::new) :
                getBinaryColumn("year"));
    }

    /**
     * Identifier ('refcode') of the database record in the Cambridge
     * Structural Database that contains details of the cited structure.
     * @return StrColumn
     */
    public StrColumn getDatabaseIdCSD() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_id_CSD", StrColumn::new) :
                getBinaryColumn("database_id_CSD"));
    }

    /**
     * Document Object Identifier used by doi.org to uniquely
     * specify bibliographic entry.
     * @return StrColumn
     */
    public StrColumn getPdbxDatabaseIdDOI() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_database_id_DOI", StrColumn::new) :
                getBinaryColumn("pdbx_database_id_DOI"));
    }

    /**
     * Ascession number used by PubMed to categorize a specific
     * bibliographic entry.
     * @return IntColumn
     */
    public IntColumn getPdbxDatabaseIdPubMed() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_database_id_PubMed", IntColumn::new) :
                getBinaryColumn("pdbx_database_id_PubMed"));
    }

    /**
     * Flag to indicate that this citation will not be published.
     * @return StrColumn
     */
    public StrColumn getUnpublishedFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("unpublished_flag", StrColumn::new) :
                getBinaryColumn("unpublished_flag"));
    }
}
