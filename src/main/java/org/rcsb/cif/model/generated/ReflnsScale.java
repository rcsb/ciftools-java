package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFLNS_SCALE category record details about
 * the structure-factor scales. They are referenced from within
 * the REFLN list through _refln.scale_group_code.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ReflnsScale extends BaseCategory {
    public ReflnsScale(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ReflnsScale(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ReflnsScale(String name) {
        super(name);
    }

    /**
     * The code identifying a scale _reflns_scale.meas_F,
     * _reflns_scale.meas_F_squared or _reflns_scale.meas_intensity.
     * These are linked to the REFLN list by the
     * _refln.scale_group_code. These codes
     * need not correspond to those in the DIFFRN_SCALE list.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getGroupCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("group_code", SingleRowStrColumn::new) :
                getBinaryColumn("group_code"));
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeasF() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("meas_F", SingleRowFloatColumn::new) :
                getBinaryColumn("meas_F"));
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeasFSquared() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("meas_F_squared", SingleRowFloatColumn::new) :
                getBinaryColumn("meas_F_squared"));
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMeasIntensity() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("meas_intensity", SingleRowFloatColumn::new) :
                getBinaryColumn("meas_intensity"));
    }
}
