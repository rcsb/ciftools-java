package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublBody extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_body";

    public PublBody(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * A text section of a submitted paper.
     * @return StrColumn
     */
    public StrColumn getContents() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_body_contents"));
    }

    /**
     * The functional role of the associated text section.
     * @return StrColumn
     */
    public StrColumn getElement() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_body_element"));
    }

    /**
     * Enumerated state indicating the appropriate typesetting
     * conventions for accented characters and special symbols
     * in the text section.
     * @return StrColumn
     */
    public StrColumn getFormat() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_body_format"));
    }

    /**
     * Unique identifier for each part of the body of the paper.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_body_label"));
    }

    /**
     * Title of the associated section of text.
     * @return StrColumn
     */
    public StrColumn getTitle() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_body_title"));
    }

}