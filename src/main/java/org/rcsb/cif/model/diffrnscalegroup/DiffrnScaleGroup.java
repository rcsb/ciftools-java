package org.rcsb.cif.model.diffrnscalegroup;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Code
     */
    public Code getCode() {
        return (Code) (isText ? textFields.computeIfAbsent("code",
                Code::new) : getBinaryColumn("code"));
    }

    /**
     * The scale for a specific measurement group which is to be
     * multiplied with the net intensity to place all intensities
     * in the DIFFRN_REFLN or REFLN list on a common scale.
     * @return INet
     */
    public INet getINet() {
        return (INet) (isText ? textFields.computeIfAbsent("I_net",
                INet::new) : getBinaryColumn("I_net"));
    }
}
