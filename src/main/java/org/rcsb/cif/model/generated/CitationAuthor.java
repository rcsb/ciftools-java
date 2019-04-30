package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CITATION_AUTHOR category record details
 * about the authors associated with the citations in the
 * CITATION list.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Name of an author of the citation; relevant for journal
     * articles, books and book chapters.
     * 
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * This data item defines the order of the author's name in the
     * list of authors of a citation.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }

    /**
     * The Open Researcher and Contributor ID (ORCID).
     * @return StrColumn
     */
    public StrColumn getIdentifierORCID() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("identifier_ORCID", StrColumn::new) :
                getBinaryColumn("identifier_ORCID"));
    }
}
