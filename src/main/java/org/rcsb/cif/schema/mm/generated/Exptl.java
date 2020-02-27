package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EXPTL category record details about the
 * experimental work prior to the intensity measurements and
 * details about the absorption-correction technique employed.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCoefficientMu() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("absorpt_coefficient_mu", FloatColumn::new) :
                getBinaryColumn("absorpt_coefficient_mu"));
    }

    /**
     * The maximum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCorrectionTMax() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("absorpt_correction_T_max", FloatColumn::new) :
                getBinaryColumn("absorpt_correction_T_max"));
    }

    /**
     * The minimum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCorrectionTMin() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("absorpt_correction_T_min", FloatColumn::new) :
                getBinaryColumn("absorpt_correction_T_min"));
    }

    /**
     * The absorption correction type and method. The value
     * 'empirical' should NOT be used unless more detailed
     * information is not available.
     * @return StrColumn
     */
    public StrColumn getAbsorptCorrectionType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("absorpt_correction_type", StrColumn::new) :
                getBinaryColumn("absorpt_correction_type"));
    }

    /**
     * Description of the absorption process applied to the
     * intensities. A literature reference should be supplied for
     * psi-scan techniques.
     * @return StrColumn
     */
    public StrColumn getAbsorptProcessDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("absorpt_process_details", StrColumn::new) :
                getBinaryColumn("absorpt_process_details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The total number of crystals used in the  measurement of
     * intensities.
     * @return IntColumn
     */
    public IntColumn getCrystalsNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("crystals_number", IntColumn::new) :
                getBinaryColumn("crystals_number"));
    }

    /**
     * Any special information about the experimental work prior to the
     * intensity measurement. See also _exptl_crystal.preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The method used in the experiment.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * A description of special aspects of the experimental method.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method_details", StrColumn::new) :
                getBinaryColumn("method_details"));
    }
}
