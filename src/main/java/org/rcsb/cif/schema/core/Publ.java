package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Data items in the PUBL category are used when submitting a
 * manuscript for publication. They refer either to the paper as
 * a whole, or to specific named elements within a paper (such as
 * the title and abstract, or the Comment and Experimental
 * sections of Acta Crystallographica Section C). The data items
 * in the PUBL_BODY category should be used for the textual
 * content of other submissions. Typically, each journal will
 * supply a list of the specific items it requires in its Notes
 * for Authors.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Publ extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ";

    public Publ(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * A letter submitted to the journal editor by the contact author.
     * @return StrColumn
     */
    public StrColumn getContactLetter() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_contact_letter"));
    }
}
