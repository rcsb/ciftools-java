package org.rcsb.cif.model.symmetryequiv;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class SymmetryEquiv extends BaseCategory {
    public SymmetryEquiv(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public SymmetryEquiv(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public SymmetryEquiv(String name) {
        super(name);
    }

    /**
     * The value of _symmetry_equiv.id must uniquely identify
     * a record in the SYMMETRY_EQUIV category.
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
     * Symmetry-equivalent position in the 'xyz' representation. Except
     * for the space group P1, these data will be repeated in a loop.
     * The format of the data item is as per International Tables for
     * Crystallography Vol. A (2002). All equivalent positions should
     * be entered, including those for lattice centring and a centre of
     * symmetry, if present.
     * @return PosAsXyz
     */
    public PosAsXyz getPosAsXyz() {
        return (PosAsXyz) (isText ? textFields.computeIfAbsent("pos_as_xyz",
                PosAsXyz::new) : getBinaryColumn("pos_as_xyz"));
    }
}
