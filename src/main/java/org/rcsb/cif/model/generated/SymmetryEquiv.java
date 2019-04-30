package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the SYMMETRY_EQUIV category list the
 * symmetry-equivalent positions for the space group.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Symmetry-equivalent position in the 'xyz' representation. Except
     * for the space group P1, these data will be repeated in a loop.
     * The format of the data item is as per International Tables for
     * Crystallography Vol. A (2002). All equivalent positions should
     * be entered, including those for lattice centring and a centre of
     * symmetry, if present.
     * @return StrColumn
     */
    public StrColumn getPosAsXyz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pos_as_xyz", StrColumn::new) :
                getBinaryColumn("pos_as_xyz"));
    }
}
