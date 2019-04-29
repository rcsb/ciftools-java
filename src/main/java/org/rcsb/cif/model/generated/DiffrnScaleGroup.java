package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_SCALE_GROUP category record details
 * of the scaling factors applied to place all intensities in the
 * reflection lists on a common scale.
 * Scaling groups might, for example, correspond to each film in a
 * multi-film data set or each crystal in a multi-crystal data set.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnScaleGroup extends BaseCategory {
    public DiffrnScaleGroup(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnScaleGroup(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnScaleGroup(String name) {
        super(name);
    }

    /**
     * The value of _diffrn_scale_group.code must uniquely identify a
     * record in the DIFFRN_SCALE_GROUP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("code", SingleRowStrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * The scale for a specific measurement group which is to be
     * multiplied with the net intensity to place all intensities
     * in the DIFFRN_REFLN or REFLN list on a common scale.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getINet() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("I_net", SingleRowFloatColumn::new) :
                getBinaryColumn("I_net"));
    }
}
