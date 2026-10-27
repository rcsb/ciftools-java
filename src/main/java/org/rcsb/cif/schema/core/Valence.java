package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The category of items used to characterize localized inorganic
 * bond valences using the model of Brown (2002).
 * 
 * Ref: Brown, I. D. (2002). The Chemical Bond in Inorganic Chemistry:
 * the Bond-Valence Model, eq. (3.1). Oxford: Oxford University Press.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Valence extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "valence";

    public Valence(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }


}