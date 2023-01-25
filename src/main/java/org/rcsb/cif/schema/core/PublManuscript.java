package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category of items describing the publication manuscript.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublManuscript extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_manuscript";

    public PublManuscript(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * A description of the word processor package and computer used to
     * create the manuscript stored as _publ_manuscript.processed.
     * @return StrColumn
     */
    public StrColumn getCreation() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_creation"));
    }

    /**
     * The full manuscript of a paper (excluding possibly the figures
     * and the tables) output in ASCII characters from a word processor.
     * Information about the generation of this data item must be
     * specified in the data item _publ_manuscript.creation.
     * @return StrColumn
     */
    public StrColumn getProcessed() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_processed"));
    }

    /**
     * The full manuscript of a paper (excluding figures and possibly
     * the tables) output as standard ASCII text.
     * @return StrColumn
     */
    public StrColumn getText() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_manuscript_text"));
    }

}