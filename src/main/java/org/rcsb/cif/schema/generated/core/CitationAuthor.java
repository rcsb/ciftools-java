package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Category of items describing citation author(s) details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CitationAuthor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "citation_author";

    public CitationAuthor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Value is a unique key to a set of CITATION_AUTHOR items
     * in a looped list.
     * @return StrColumn
     */
    public StrColumn getKey() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_key"));
    }

    /**
     * 
     * Code identifier in the CITATION data list. The value of must match
     * an identifier specified in the CITATION list.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_citation_id"));
    }

    /**
     * 
     * Name of citation author; relevant for articles and book chapters.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name"));
    }

    /**
     * 
     * Ordinal code specifies the order of the author's name in the list
     * of authors of the citation.
     * @return StrColumn
     */
    public StrColumn getOrdinal() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_ordinal"));
    }
}
