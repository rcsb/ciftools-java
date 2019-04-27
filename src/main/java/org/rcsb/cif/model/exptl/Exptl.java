package org.rcsb.cif.model.exptl;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return AbsorptCoefficientMu
     */
    public AbsorptCoefficientMu getAbsorptCoefficientMu() {
        return (AbsorptCoefficientMu) (isText ? textFields.computeIfAbsent("absorpt_coefficient_mu",
                AbsorptCoefficientMu::new) : getBinaryColumn("absorpt_coefficient_mu"));
    }

    /**
     * The maximum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return AbsorptCorrectionTMax
     */
    public AbsorptCorrectionTMax getAbsorptCorrectionTMax() {
        return (AbsorptCorrectionTMax) (isText ? textFields.computeIfAbsent("absorpt_correction_T_max",
                AbsorptCorrectionTMax::new) : getBinaryColumn("absorpt_correction_T_max"));
    }

    /**
     * The minimum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return AbsorptCorrectionTMin
     */
    public AbsorptCorrectionTMin getAbsorptCorrectionTMin() {
        return (AbsorptCorrectionTMin) (isText ? textFields.computeIfAbsent("absorpt_correction_T_min",
                AbsorptCorrectionTMin::new) : getBinaryColumn("absorpt_correction_T_min"));
    }

    /**
     * The absorption correction type and method. The value
     * 'empirical' should NOT be used unless more detailed
     * information is not available.
     * @return AbsorptCorrectionType
     */
    public AbsorptCorrectionType getAbsorptCorrectionType() {
        return (AbsorptCorrectionType) (isText ? textFields.computeIfAbsent("absorpt_correction_type",
                AbsorptCorrectionType::new) : getBinaryColumn("absorpt_correction_type"));
    }

    /**
     * Description of the absorption process applied to the
     * intensities. A literature reference should be supplied for
     * psi-scan techniques.
     * @return AbsorptProcessDetails
     */
    public AbsorptProcessDetails getAbsorptProcessDetails() {
        return (AbsorptProcessDetails) (isText ? textFields.computeIfAbsent("absorpt_process_details",
                AbsorptProcessDetails::new) : getBinaryColumn("absorpt_process_details"));
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The total number of crystals used in the  measurement of
     * intensities.
     * @return CrystalsNumber
     */
    public CrystalsNumber getCrystalsNumber() {
        return (CrystalsNumber) (isText ? textFields.computeIfAbsent("crystals_number",
                CrystalsNumber::new) : getBinaryColumn("crystals_number"));
    }

    /**
     * Any special information about the experimental work prior to the
     * intensity measurement. See also _exptl_crystal.preparation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The method used in the experiment.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * A description of special aspects of the experimental method.
     * @return MethodDetails
     */
    public MethodDetails getMethodDetails() {
        return (MethodDetails) (isText ? textFields.computeIfAbsent("method_details",
                MethodDetails::new) : getBinaryColumn("method_details"));
    }
}
