package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_POINT_SYMMETRY category record details about the
 * point symmetry group associated with this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPointSymmetry extends DelegatingCategory {
    public PdbxPointSymmetry(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "Schoenflies_symbol":
                return getSchoenfliesSymbol();
            case "circular_symmetry":
                return getCircularSymmetry();
            case "H-M_notation":
                return getH_MNotation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The Schoenflies point symmetry symbol.
     * @return StrColumn
     */
    public StrColumn getSchoenfliesSymbol() {
        return delegate.getColumn("Schoenflies_symbol", DelegatingStrColumn::new);
    }

    /**
     * Rotational n-fold C and D point symmetry.
     * @return IntColumn
     */
    public IntColumn getCircularSymmetry() {
        return delegate.getColumn("circular_symmetry", DelegatingIntColumn::new);
    }

    /**
     * The Hermann-Mauguin notation for this point symmetry group.
     * @return StrColumn
     */
    public StrColumn getH_MNotation() {
        return delegate.getColumn("H-M_notation", DelegatingStrColumn::new);
    }

}