package org.rcsb.cif.model.pdbxhelicalsymmetry;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Number of operations.
     * @return NumberOfOperations
     */
    public NumberOfOperations getNumberOfOperations() {
        return (NumberOfOperations) (isText ? textFields.computeIfAbsent("number_of_operations",
                NumberOfOperations::new) : getBinaryColumn("number_of_operations"));
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return RotationPerNSubunits
     */
    public RotationPerNSubunits getRotationPerNSubunits() {
        return (RotationPerNSubunits) (isText ? textFields.computeIfAbsent("rotation_per_n_subunits",
                RotationPerNSubunits::new) : getBinaryColumn("rotation_per_n_subunits"));
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return RisePerNSubunits
     */
    public RisePerNSubunits getRisePerNSubunits() {
        return (RisePerNSubunits) (isText ? textFields.computeIfAbsent("rise_per_n_subunits",
                RisePerNSubunits::new) : getBinaryColumn("rise_per_n_subunits"));
    }

    /**
     * Number of subunits used in the calculation of rise and
     * rotation.
     * @return NSubunitsDivisor
     */
    public NSubunitsDivisor getNSubunitsDivisor() {
        return (NSubunitsDivisor) (isText ? textFields.computeIfAbsent("n_subunits_divisor",
                NSubunitsDivisor::new) : getBinaryColumn("n_subunits_divisor"));
    }

    /**
     * Two-fold symmetry perpendicular to the helical axis.
     * @return DyadAxis
     */
    public DyadAxis getDyadAxis() {
        return (DyadAxis) (isText ? textFields.computeIfAbsent("dyad_axis",
                DyadAxis::new) : getBinaryColumn("dyad_axis"));
    }

    /**
     * Rotational n-fold symmetry about the helical axis.
     * @return CircularSymmetry
     */
    public CircularSymmetry getCircularSymmetry() {
        return (CircularSymmetry) (isText ? textFields.computeIfAbsent("circular_symmetry",
                CircularSymmetry::new) : getBinaryColumn("circular_symmetry"));
    }
}
