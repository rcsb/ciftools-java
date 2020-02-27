package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_HELICAL_SYMMETRY category record details about the
 * helical symmetry group associated with this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxHelicalSymmetry extends DelegatingCategory {
    public PdbxHelicalSymmetry(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Number of operations.
     * @return IntColumn
     */
    public IntColumn getNumberOfOperations() {
        return delegate.getColumn("number_of_operations", DelegatingIntColumn::new);
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return FloatColumn
     */
    public FloatColumn getRotationPerNSubunits() {
        return delegate.getColumn("rotation_per_n_subunits", DelegatingFloatColumn::new);
    }

    /**
     * Angular rotation (degrees) in N subunits
     * @return FloatColumn
     */
    public FloatColumn getRisePerNSubunits() {
        return delegate.getColumn("rise_per_n_subunits", DelegatingFloatColumn::new);
    }

    /**
     * Number of subunits used in the calculation of rise and
     * rotation.
     * @return IntColumn
     */
    public IntColumn getNSubunitsDivisor() {
        return delegate.getColumn("n_subunits_divisor", DelegatingIntColumn::new);
    }

    /**
     * Two-fold symmetry perpendicular to the helical axis.
     * @return StrColumn
     */
    public StrColumn getDyadAxis() {
        return delegate.getColumn("dyad_axis", DelegatingStrColumn::new);
    }

    /**
     * Rotational n-fold symmetry about the helical axis.
     * @return IntColumn
     */
    public IntColumn getCircularSymmetry() {
        return delegate.getColumn("circular_symmetry", DelegatingIntColumn::new);
    }
}
