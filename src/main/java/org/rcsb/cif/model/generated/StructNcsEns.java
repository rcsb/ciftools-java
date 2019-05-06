package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_NCS_ENS category record information
 * about ensembles of domains related by noncrystallographic
 * symmetry. The point group of the ensemble when taken as a
 * whole may be specified, as well as any special aspects of the
 * ensemble that require description.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_ens.id must uniquely identify a
     * record in the STRUCT_NCS_ENS list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The point group of the ensemble of structural elements related by
     * one or more noncrystallographic symmetry operations. The
     * relationships need not be precise; this data item is intended
     * to give a rough description of the noncrystallographic symmetry
     * relationships.
     * @return StrColumn
     */
    public StrColumn getPointGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("point_group", StrColumn::new) :
                getBinaryColumn("point_group"));
    }
}
