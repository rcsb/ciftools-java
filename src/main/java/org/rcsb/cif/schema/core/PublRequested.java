package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * CATEGORY of data items that enable the author to make
 * specific requests to the journal office for processing.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublRequested extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_requested";

    public PublRequested(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The category of paper submitted. For submission to Acta
     * Crystallographica Section C or Acta Crystallographica
     * Section E, ONLY those codes indicated for use with those
     * journals should be used.
     * @return StrColumn
     */
    public StrColumn getCategory() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_requested_category"));
    }

    /**
     * The name of the coeditor whom the authors would like to
     * process the submitted manuscript.
     * @return StrColumn
     */
    public StrColumn getCoeditorName() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_requested_coeditor_name"));
    }

    /**
     * Name of the journal to which the manuscript is being submitted.
     * @return StrColumn
     */
    public StrColumn getJournal() {
        return new DelegatingStrColumn(parentBlock.getColumn("publ_requested_journal"));
    }

}