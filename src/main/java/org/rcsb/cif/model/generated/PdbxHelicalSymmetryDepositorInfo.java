package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_HELICAL_SYMMETRY_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_HELICAL_SYMMETRY.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxHelicalSymmetryDepositorInfo extends BaseCategory {
    public PdbxHelicalSymmetryDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxHelicalSymmetryDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxHelicalSymmetryDepositorInfo(String name) {
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

    /**
     * A flag to indicate that this data is relevant to the current entry
     * @return StrColumn
     */
    public StrColumn getStatusFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("status_flag", StrColumn::new) :
                getBinaryColumn("status_flag"));
    }
}
