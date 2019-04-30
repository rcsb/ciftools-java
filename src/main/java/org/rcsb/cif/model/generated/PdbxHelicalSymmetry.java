package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
 * helical symmetry group associated with this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxHelicalSymmetry extends BaseCategory {
    public PdbxHelicalSymmetry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxHelicalSymmetry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxHelicalSymmetry(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Number of operations.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberOfOperations() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_of_operations", SingleRowIntColumn::new) :
                getBinaryColumn("number_of_operations"));
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRotationPerNSubunits() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rotation_per_n_subunits", SingleRowFloatColumn::new) :
                getBinaryColumn("rotation_per_n_subunits"));
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRisePerNSubunits() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("rise_per_n_subunits", SingleRowFloatColumn::new) :
                getBinaryColumn("rise_per_n_subunits"));
    }

    /**
     * Number of subunits used in the calculation of rise and
     * rotation.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNSubunitsDivisor() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("n_subunits_divisor", SingleRowIntColumn::new) :
                getBinaryColumn("n_subunits_divisor"));
    }

    /**
     * Two-fold symmetry perpendicular to the helical axis.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDyadAxis() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("dyad_axis", SingleRowStrColumn::new) :
                getBinaryColumn("dyad_axis"));
    }

    /**
     * Rotational n-fold symmetry about the helical axis.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCircularSymmetry() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("circular_symmetry", SingleRowIntColumn::new) :
                getBinaryColumn("circular_symmetry"));
    }
}
