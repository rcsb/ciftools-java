package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
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
     * Integer value between 0 and 255 giving the intensity of a
     * specific colour component (red, green or blue) for the RGB
     * display colour code.
     * @return IntColumn
     */
    public IntColumn getBlue() {
        return new DelegatingIntColumn(parentBlock.getColumn("display_colour_blue"));
    }

    /**
     * Integer value between 0 and 255 giving the intensity of a
     * specific colour component (red, green or blue) for the RGB
     * display colour code.
     * @return IntColumn
     */
    public IntColumn getGreen() {
        return new DelegatingIntColumn(parentBlock.getColumn("display_colour_green"));
    }

    /**
     * Colour hue as an enumerated code.
     * @return StrColumn
     */
    public StrColumn getHue() {
        return new DelegatingStrColumn(parentBlock.getColumn("display_colour_hue"));
    }

    /**
     * Integer value between 0 and 255 giving the intensity of a
     * specific colour component (red, green or blue) for the RGB
     * display colour code.
     * @return IntColumn
     */
    public IntColumn getRed() {
        return new DelegatingIntColumn(parentBlock.getColumn("display_colour_red"));
    }

    /**
     * The red-green-blue intensities, bases 256, for each colour code.
     * @return IntColumn
     */
    public IntColumn getRgb() {
        return new DelegatingIntColumn(parentBlock.getColumn("display_colour_rgb"));
    }

}