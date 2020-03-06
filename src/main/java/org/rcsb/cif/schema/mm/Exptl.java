package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EXPTL category record details about the
 * experimental work prior to the intensity measurements and
 * details about the absorption-correction technique employed.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Exptl extends DelegatingCategory {
    public Exptl(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "absorpt_coefficient_mu":
                return getAbsorptCoefficientMu();
            case "absorpt_correction_T_max":
                return getAbsorptCorrectionTMax();
            case "absorpt_correction_T_min":
                return getAbsorptCorrectionTMin();
            case "absorpt_correction_type":
                return getAbsorptCorrectionType();
            case "absorpt_process_details":
                return getAbsorptProcessDetails();
            case "entry_id":
                return getEntryId();
            case "crystals_number":
                return getCrystalsNumber();
            case "details":
                return getDetails();
            case "method":
                return getMethod();
            case "method_details":
                return getMethodDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The absorption coefficient mu in reciprocal millimetres
     * calculated from the atomic content of the cell, the density and
     * the radiation wavelength.
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCoefficientMu() {
        return delegate.getColumn("absorpt_coefficient_mu", DelegatingFloatColumn::new);
    }

    /**
     * The maximum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCorrectionTMax() {
        return delegate.getColumn("absorpt_correction_T_max", DelegatingFloatColumn::new);
    }

    /**
     * The minimum transmission factor for the crystal and radiation.
     * The maximum and minimum transmission factors are also referred
     * to as the absorption correction
     * A or 1/A*.
     * @return FloatColumn
     */
    public FloatColumn getAbsorptCorrectionTMin() {
        return delegate.getColumn("absorpt_correction_T_min", DelegatingFloatColumn::new);
    }

    /**
     * The absorption correction type and method. The value
     * 'empirical' should NOT be used unless more detailed
     * information is not available.
     * @return StrColumn
     */
    public StrColumn getAbsorptCorrectionType() {
        return delegate.getColumn("absorpt_correction_type", DelegatingStrColumn::new);
    }

    /**
     * Description of the absorption process applied to the
     * intensities. A literature reference should be supplied for
     * psi-scan techniques.
     * @return StrColumn
     */
    public StrColumn getAbsorptProcessDetails() {
        return delegate.getColumn("absorpt_process_details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The total number of crystals used in the  measurement of
     * intensities.
     * @return IntColumn
     */
    public IntColumn getCrystalsNumber() {
        return delegate.getColumn("crystals_number", DelegatingIntColumn::new);
    }

    /**
     * Any special information about the experimental work prior to the
     * intensity measurement. See also _exptl_crystal.preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The method used in the experiment.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the experimental method.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return delegate.getColumn("method_details", DelegatingStrColumn::new);
    }

}