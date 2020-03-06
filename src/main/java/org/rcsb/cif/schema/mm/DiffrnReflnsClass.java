package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the DIFFRN_REFLNS_CLASS category record details
 * about the classes of reflections measured in the diffraction
 * experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnReflnsClass extends DelegatingCategory {
    public DiffrnReflnsClass(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "av_R_eq":
                return getAvREq();
            case "av_sgI/I":
                return getAvSgI_I();
            case "av_uI/I":
                return getAvUI_I();
            case "code":
                return getCode();
            case "description":
                return getDescription();
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "number":
                return getNumber();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * For each reflection class, the residual
     * [sum av|del(I)|/sum|av(I)|] for symmetry-equivalent reflections
     * used to calculate the average intensity av(I). The av|del(I)|
     * term is the average absolute difference between av(I) and the
     * individual intensities.
     * @return FloatColumn
     */
    public FloatColumn getAvREq() {
        return delegate.getColumn("av_R_eq", DelegatingFloatColumn::new);
    }

    /**
     * Measure [sum|sigma(net I)|/sum|net I|] for all measured intensities
     * in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvSgI_I() {
        return delegate.getColumn("av_sgI/I", DelegatingFloatColumn::new);
    }

    /**
     * Measure [sum|u(net I)|/sum|net I|] for all measured intensities
     * in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvUI_I() {
        return delegate.getColumn("av_uI/I", DelegatingFloatColumn::new);
    }

    /**
     * The code identifying a certain reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return delegate.getColumn("code", DelegatingStrColumn::new);
    }

    /**
     * Description of each reflection class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The smallest value in angstroms for the interplanar
     * spacings for the reflections in each measured reflection class.
     * This is called the highest resolution for this reflection class.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The largest value in angstroms of the interplanar
     * spacings for the reflections for each measured reflection class.
     * This is called the lowest resolution for this reflection class.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The total number of measured intensities for each reflection
     * class, excluding the systematic absences arising from
     * centring translations.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

}