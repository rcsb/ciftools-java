package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_REFLNS_CLASS category record details
 * about the classes of reflections measured in the diffraction
 * experiment.
 */
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
     * @return FloatColumn
     */
    public FloatColumn getAvREq() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("av_R_eq", FloatColumn::new) :
                getBinaryColumn("av_R_eq"));
    }

    /**
     * Measure [sum|sigma(net I)|/sum|net I|] for all measured intensities
     * in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvSgI_I() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("av_sgI/I", FloatColumn::new) :
                getBinaryColumn("av_sgI/I"));
    }

    /**
     * Measure [sum|u(net I)|/sum|net I|] for all measured intensities
     * in a reflection class.
     * @return FloatColumn
     */
    public FloatColumn getAvUI_I() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("av_uI/I", FloatColumn::new) :
                getBinaryColumn("av_uI/I"));
    }

    /**
     * The code identifying a certain reflection class.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code", StrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * Description of each reflection class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("description", StrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * The smallest value in angstroms for the interplanar
     * spacings for the reflections in each measured reflection class.
     * This is called the highest resolution for this reflection class.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The largest value in angstroms of the interplanar
     * spacings for the reflections for each measured reflection class.
     * This is called the lowest resolution for this reflection class.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The total number of measured intensities for each reflection
     * class, excluding the systematic absences arising from
     * centring translations.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number", IntColumn::new) :
                getBinaryColumn("number"));
    }
}
