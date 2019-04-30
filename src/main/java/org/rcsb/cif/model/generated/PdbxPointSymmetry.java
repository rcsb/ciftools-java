package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POINT_SYMMETRY category record details about the
 * point symmetry group associated with this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxPointSymmetry extends BaseCategory {
    public PdbxPointSymmetry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPointSymmetry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPointSymmetry(String name) {
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
     * The Schoenflies point symmetry symbol.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSchoenfliesSymbol() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("Schoenflies_symbol", SingleRowStrColumn::new) :
                getBinaryColumn("Schoenflies_symbol"));
    }

    /**
     * Rotational n-fold C and D point symmetry.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getCircularSymmetry() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("circular_symmetry", SingleRowIntColumn::new) :
                getBinaryColumn("circular_symmetry"));
    }

    /**
     * The Hermann-Mauguin notation for this point symmetry group.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getH_MNotation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("H-M_notation", SingleRowStrColumn::new) :
                getBinaryColumn("H-M_notation"));
    }
}
