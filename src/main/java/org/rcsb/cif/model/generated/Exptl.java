package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL category record details about the
 * experimental work prior to the intensity measurements and
 * details about the absorption-correction technique employed.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Exptl extends BaseCategory {
    public Exptl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Exptl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Exptl(String name) {
        super(name);
    }

    /**
     * The absorption coefficient mu in reciprocal millimetres
     * calculated from the atomic content of the cell, the density and
     * the radiation wavelength.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAbsorptCoefficientMu() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("absorpt_coefficient_mu", SingleRowFloatColumn::new) :
                getBinaryColumn("absorpt_coefficient_mu"));
    }

    /**
     * The maximum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAbsorptCorrectionTMax() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("absorpt_correction_T_max", SingleRowFloatColumn::new) :
                getBinaryColumn("absorpt_correction_T_max"));
    }

    /**
     * The minimum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAbsorptCorrectionTMin() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("absorpt_correction_T_min", SingleRowFloatColumn::new) :
                getBinaryColumn("absorpt_correction_T_min"));
    }

    /**
     * The absorption correction type and method. The value
     * 'empirical' should NOT be used unless more detailed
     * information is not available.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAbsorptCorrectionType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("absorpt_correction_type", SingleRowStrColumn::new) :
                getBinaryColumn("absorpt_correction_type"));
    }

    /**
     * Description of the absorption process applied to the
     * intensities. A literature reference should be supplied for
     * psi-scan techniques.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAbsorptProcessDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("absorpt_process_details", SingleRowStrColumn::new) :
                getBinaryColumn("absorpt_process_details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The total number of crystals used in the  measurement of
     * intensities.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCrystalsNumber() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("crystals_number", SingleRowIntColumn::new) :
                getBinaryColumn("crystals_number"));
    }

    /**
     * Any special information about the experimental work prior to the
     * intensity measurement. See also _exptl_crystal.preparation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The method used in the experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * A description of special aspects of the experimental method.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethodDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method_details", SingleRowStrColumn::new) :
                getBinaryColumn("method_details"));
    }
}
