package org.rcsb.cif.model.citationauthor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CitationAuthor extends BaseCategory {
    public CitationAuthor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public CitationAuthor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public CitationAuthor(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * Name of an author of the citation; relevant for journal
     * articles, books and book chapters.
     * 
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * This data item defines the order of the author's name in the
     * list of authors of a citation.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return IdentifierORCID
     */
    public IdentifierORCID getIdentifierORCID() {
        return (IdentifierORCID) (isText ? textFields.computeIfAbsent("identifier_ORCID",
                IdentifierORCID::new) : getBinaryColumn("identifier_ORCID"));
    }
}
