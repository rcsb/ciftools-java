package org.rcsb.cif.model.generated.reflnsscale;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return GroupCode
     */
    public GroupCode getGroupCode() {
        return (GroupCode) (isText ? textFields.computeIfAbsent("group_code",
                GroupCode::new) : getBinaryColumn("group_code"));
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return MeasF
     */
    public MeasF getMeasF() {
        return (MeasF) (isText ? textFields.computeIfAbsent("meas_F",
                MeasF::new) : getBinaryColumn("meas_F"));
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return MeasFSquared
     */
    public MeasFSquared getMeasFSquared() {
        return (MeasFSquared) (isText ? textFields.computeIfAbsent("meas_F_squared",
                MeasFSquared::new) : getBinaryColumn("meas_F_squared"));
    }

    /**
     * A scale associated with _reflns_scale.group_code.
     * @return MeasIntensity
     */
    public MeasIntensity getMeasIntensity() {
        return (MeasIntensity) (isText ? textFields.computeIfAbsent("meas_intensity",
                MeasIntensity::new) : getBinaryColumn("meas_intensity"));
    }
}
