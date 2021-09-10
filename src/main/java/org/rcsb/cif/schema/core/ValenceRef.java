package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of items for listing valence references.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ValenceRef extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "valence_ref";

    public ValenceRef(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Unique loop code of the valence references.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_ref_id"));
    }

    /**
     * Literature reference from which the valence parameters
     * identified by _valence_param.id were taken.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return new DelegatingStrColumn(parentBlock.getColumn("valence_ref_reference"));
    }

}