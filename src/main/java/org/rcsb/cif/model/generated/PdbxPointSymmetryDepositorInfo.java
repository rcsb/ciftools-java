package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POINT_SYMMETRY_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_POINT_SYMMETRY.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The Schoenflies point symmetry symbol.
     * @return StrColumn
     */
    public StrColumn getSchoenfliesSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("Schoenflies_symbol", StrColumn::new) :
                getBinaryColumn("Schoenflies_symbol"));
    }

    /**
     * Rotational n-fold C and D point symmetry.
     * @return IntColumn
     */
    public IntColumn getCircularSymmetry() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("circular_symmetry", IntColumn::new) :
                getBinaryColumn("circular_symmetry"));
    }

    /**
     * The Hermann-Mauguin notation for this point symmetry group.
     * @return StrColumn
     */
    public StrColumn getH_MNotation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("H-M_notation", StrColumn::new) :
                getBinaryColumn("H-M_notation"));
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
