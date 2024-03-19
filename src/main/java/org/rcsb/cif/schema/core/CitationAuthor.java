package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of items describing citation author(s) details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CitationAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "citation_author";

    public CitationAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifier in the CITATION data list. The value of must match
     * an identifier specified in the CITATION list.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_author_citation_id"));
    }

    /**
     * Name of citation author; relevant for articles and book chapters.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * For authors with only one name, provide the full name without
     * abbreviation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_author_name"));
    }

    /**
     * Ordinal code specifies the order of the author's name in the list
     * of authors of the citation.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return new DelegatingIntColumn(parentBlock.getColumn("citation_author_ordinal"));
    }

}