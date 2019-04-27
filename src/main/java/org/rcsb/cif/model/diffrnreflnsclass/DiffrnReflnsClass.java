package org.rcsb.cif.model.diffrnreflnsclass;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnReflnsClass extends BaseCategory {
    public DiffrnReflnsClass(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnReflnsClass(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnReflnsClass(String name) {
        super(name);
    }

    /**
     * For each reflection class, the residual
     * [sum av|del(I)|/sum|av(I)|] for symmetry-equivalent reflections
     * used to calculate the average intensity av(I). The av|del(I)|
     * term is the average absolute difference between av(I) and the
     * individual intensities.
     * @return AvREq
     */
    public AvREq getAvREq() {
        return (AvREq) (isText ? textFields.computeIfAbsent("av_R_eq",
                AvREq::new) : getBinaryColumn("av_R_eq"));
    }

    /**
     * Measure [sum|sigma(net I)|/sum|net I|] for all measured intensities
     * in a reflection class.
     * @return AvSgI_I
     */
    public AvSgI_I getAvSgI_I() {
        return (AvSgI_I) (isText ? textFields.computeIfAbsent("av_sgI/I",
                AvSgI_I::new) : getBinaryColumn("av_sgI/I"));
    }

    /**
     * Measure [sum|u(net I)|/sum|net I|] for all measured intensities
     * in a reflection class.
     * @return AvUI_I
     */
    public AvUI_I getAvUI_I() {
        return (AvUI_I) (isText ? textFields.computeIfAbsent("av_uI/I",
                AvUI_I::new) : getBinaryColumn("av_uI/I"));
    }

    /**
     * The code identifying a certain reflection class.
     * @return Code
     */
    public Code getCode() {
        return (Code) (isText ? textFields.computeIfAbsent("code",
                Code::new) : getBinaryColumn("code"));
    }

    /**
     * Description of each reflection class.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * The smallest value in angstroms for the interplanar
     * spacings for the reflections in each measured reflection class.
     * This is called the highest resolution for this reflection class.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The largest value in angstroms of the interplanar
     * spacings for the reflections for each measured reflection class.
     * This is called the lowest resolution for this reflection class.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * The total number of measured intensities for each reflection
     * class, excluding the systematic absences arising from
     * centring translations.
     * @return Number
     */
    public Number getNumber() {
        return (Number) (isText ? textFields.computeIfAbsent("number",
                Number::new) : getBinaryColumn("number"));
    }
}
