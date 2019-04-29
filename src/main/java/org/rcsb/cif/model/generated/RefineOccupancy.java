package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_OCCUPANCY category record details
 * about the treatment of atom occupancies during refinement.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefineOccupancy extends BaseCategory {
    public RefineOccupancy(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineOccupancy(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineOccupancy(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_occupancy.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The class of atoms treated similarly for occupancy refinement.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * A description of special aspects of the occupancy refinement for
     * a class of atoms described in _refine_occupancy.class.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The treatment of occupancies for a class of atoms
     * described in _refine_occupancy.class.
     * @return StrColumn
     */
    public StrColumn getTreatment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("treatment", StrColumn::new) :
                getBinaryColumn("treatment"));
    }

    /**
     * The value of occupancy assigned to a class of atoms defined in
     * _refine_occupancy.class. Meaningful only for atoms with fixed
     * occupancy.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("value", FloatColumn::new) :
                getBinaryColumn("value"));
    }
}
