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
     * Integer value between 0 and 255 giving the intensity of a
     * specific colour component (red, green or blue) for the RGB
     * display colour code.
     * @return StrColumn
     */
    public StrColumn getBlue() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_blue"));
    }

    /**
     * 
     * Integer value between 0 and 255 giving the intensity of a
     * specific colour component (red, green or blue) for the RGB
     * display colour code.
     * @return StrColumn
     */
    public StrColumn getGreen() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_green"));
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
     * Integer value between 0 and 255 giving the intensity of a
     * specific colour component (red, green or blue) for the RGB
     * display colour code.
     * @return StrColumn
     */
    public StrColumn getRed() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_red"));
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
