package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of ENUMERATION items used to specify information about the
 * crystal colour and appearance.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ExptlCrystalAppearance extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "exptl_crystal_appearance";

    public ExptlCrystalAppearance(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Appearance of the crystal as prescribed state codes. Note that 'dull'
     * and 'clear' should no longer be used.
     * @return StrColumn
     */
    public StrColumn getGeneral() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_general"));
    }

    /**
     * 
     * Colour hue of the crystals as prescribed state codes.
     * @return StrColumn
     */
    public StrColumn getHue() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hue"));
    }

    /**
     * 
     * Colour intensity of the crystal as prescribed state codes.
     * @return StrColumn
     */
    public StrColumn getIntensity() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_intensity"));
    }
}
