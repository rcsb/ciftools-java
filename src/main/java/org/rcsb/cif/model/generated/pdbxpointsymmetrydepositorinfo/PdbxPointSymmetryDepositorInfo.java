package org.rcsb.cif.model.generated.pdbxpointsymmetrydepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The Schoenflies point symmetry symbol.
     * @return SchoenfliesSymbol
     */
    public SchoenfliesSymbol getSchoenfliesSymbol() {
        return (SchoenfliesSymbol) (isText ? textFields.computeIfAbsent("Schoenflies_symbol",
                SchoenfliesSymbol::new) : getBinaryColumn("Schoenflies_symbol"));
    }

    /**
     * Rotational n-fold C and D point symmetry.
     * @return CircularSymmetry
     */
    public CircularSymmetry getCircularSymmetry() {
        return (CircularSymmetry) (isText ? textFields.computeIfAbsent("circular_symmetry",
                CircularSymmetry::new) : getBinaryColumn("circular_symmetry"));
    }

    /**
     * The Hermann-Mauguin notation for this point symmetry group.
     * @return H_MNotation
     */
    public H_MNotation getH_MNotation() {
        return (H_MNotation) (isText ? textFields.computeIfAbsent("H-M_notation",
                H_MNotation::new) : getBinaryColumn("H-M_notation"));
    }

    /**
     * A flag to indicate that this data is relevant to the current entry
     * @return StatusFlag
     */
    public StatusFlag getStatusFlag() {
        return (StatusFlag) (isText ? textFields.computeIfAbsent("status_flag",
                StatusFlag::new) : getBinaryColumn("status_flag"));
    }
}
