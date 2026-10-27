package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of items describing publication indices.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class JournalIndex extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "journal_index";

    public JournalIndex(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Unique identifier for a journal index entry.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_index_id"));
    }

    /**
     * Sub-term index assigned for the publication.
     * @return StrColumn
     */
    public StrColumn getSubterm() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_index_subterm"));
    }

    /**
     * Term index assigned for the publication.
     * @return StrColumn
     */
    public StrColumn getTerm() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_index_term"));
    }

    /**
     * Type of index assigned for the publication.
     * @return StrColumn
     */
    public StrColumn getType() {
        return new DelegatingStrColumn(parentBlock.getColumn("journal_index_type"));
    }

}