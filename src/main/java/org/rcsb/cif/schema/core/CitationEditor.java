package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of items describing citation editor(s) details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CitationEditor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "citation_editor";

    public CitationEditor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Code identifier in the CITATION list. The value must match an
     * identifier specified by _citation.id in the CITATION list.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_editor_citation_id"));
    }

    /**
     * Name of citation editor; relevant for book chapters.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn("citation_editor_name"));
    }

    /**
     * This data item defines the order of the editor's name in the
     * list of editors of a citation.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return new DelegatingIntColumn(parentBlock.getColumn("citation_editor_ordinal"));
    }

}