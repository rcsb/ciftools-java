package org.rcsb.cif.model.generated.structncsens;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructNcsEns extends BaseCategory {
    public StructNcsEns(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructNcsEns(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructNcsEns(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the ensemble.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_ens.id must uniquely identify a
     * record in the STRUCT_NCS_ENS list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The point group of the ensemble of structural elements related by
     * one or more noncrystallographic symmetry operations. The
     * relationships need not be precise; this data item is intended
     * to give a rough description of the noncrystallographic symmetry
     * relationships.
     * @return PointGroup
     */
    public PointGroup getPointGroup() {
        return (PointGroup) (isText ? textFields.computeIfAbsent("point_group",
                PointGroup::new) : getBinaryColumn("point_group"));
    }
}
