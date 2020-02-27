package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Number of operations.
     * @return IntColumn
     */
    public IntColumn getNumberOfOperations() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_operations", IntColumn::new) :
                getBinaryColumn("number_of_operations"));
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return FloatColumn
     */
    public FloatColumn getRotationPerNSubunits() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rotation_per_n_subunits", FloatColumn::new) :
                getBinaryColumn("rotation_per_n_subunits"));
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return FloatColumn
     */
    public FloatColumn getRisePerNSubunits() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rise_per_n_subunits", FloatColumn::new) :
                getBinaryColumn("rise_per_n_subunits"));
    }

    /**
     * Number of subunits used in the calculation of rise and
     * rotation.
     * @return IntColumn
     */
    public IntColumn getNSubunitsDivisor() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("n_subunits_divisor", IntColumn::new) :
                getBinaryColumn("n_subunits_divisor"));
    }

    /**
     * Two-fold symmetry perpendicular to the helical axis.
     * @return StrColumn
     */
    public StrColumn getDyadAxis() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("dyad_axis", StrColumn::new) :
                getBinaryColumn("dyad_axis"));
    }

    /**
     * Rotational n-fold symmetry about the helical axis.
     * @return IntColumn
     */
    public IntColumn getCircularSymmetry() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("circular_symmetry", IntColumn::new) :
                getBinaryColumn("circular_symmetry"));
    }
}
