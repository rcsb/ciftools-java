package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POINT_SYMMETRY_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_POINT_SYMMETRY.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPointSymmetryDepositorInfo extends BaseCategory {
    public PdbxPointSymmetryDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPointSymmetryDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPointSymmetryDepositorInfo(String name) {
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

    /**
     * A flag to indicate that this data is relevant to the current entry
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStatusFlag() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("status_flag", SingleRowStrColumn::new) :
                getBinaryColumn("status_flag"));
    }
}
