package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to enumerate the display
 * colour codes used in the discipline.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DisplayColour extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "display_colour";

    public DisplayColour(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Colour hue as an enumerated code.
     * @return StrColumn
     */
    public StrColumn getHue() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_hue"));
    }

    /**
     * 
     * The red-green-blue intensities, bases 256, for each colour code.
     * @return StrColumn
     */
    public StrColumn getRGB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_RGB"));
    }
}
