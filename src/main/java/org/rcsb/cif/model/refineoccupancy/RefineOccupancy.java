package org.rcsb.cif.model.refineoccupancy;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The class of atoms treated similarly for occupancy refinement.
     * @return Clazz
     */
    public Clazz getClazz() {
        return (Clazz) (isText ? textFields.computeIfAbsent("class",
                Clazz::new) : getBinaryColumn("class"));
    }

    /**
     * A description of special aspects of the occupancy refinement for
     * a class of atoms described in _refine_occupancy.class.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The treatment of occupancies for a class of atoms
     * described in _refine_occupancy.class.
     * @return Treatment
     */
    public Treatment getTreatment() {
        return (Treatment) (isText ? textFields.computeIfAbsent("treatment",
                Treatment::new) : getBinaryColumn("treatment"));
    }

    /**
     * The value of occupancy assigned to a class of atoms defined in
     * _refine_occupancy.class. Meaningful only for atoms with fixed
     * occupancy.
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }
}
