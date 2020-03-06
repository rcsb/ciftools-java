package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the SYMMETRY category record details about the
 * space-group symmetry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Symmetry extends DelegatingCategory {
    public Symmetry(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "cell_setting":
                return getCellSetting();
            case "Int_Tables_number":
                return getIntTablesNumber();
            case "space_group_name_Hall":
                return getSpaceGroupNameHall();
            case "space_group_name_H-M":
                return getSpaceGroupNameH_M();
            case "pdbx_full_space_group_name_H-M":
                return getPdbxFullSpaceGroupNameH_M();
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
     * The cell settings for this space-group symmetry.
     * @return StrColumn
     */
    public StrColumn getCellSetting() {
        return delegate.getColumn("cell_setting", DelegatingStrColumn::new);
    }

    /**
     * Space-group number from International Tables for Crystallography
     * Vol. A (2002).
     * @return IntColumn
     */
    public IntColumn getIntTablesNumber() {
        return delegate.getColumn("Int_Tables_number", DelegatingIntColumn::new);
    }

    /**
     * Space-group symbol as described by Hall (1981). This symbol
     * gives the space-group setting explicitly. Leave spaces between
     * the separate components of the symbol.
     * 
     * Ref: Hall, S. R. (1981). Acta Cryst. A37, 517-525; erratum
     * (1981) A37, 921.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupNameHall() {
        return delegate.getColumn("space_group_name_Hall", DelegatingStrColumn::new);
    }

    /**
     * Hermann-Mauguin space-group symbol. Note that the
     * Hermann-Mauguin symbol does not necessarily contain complete
     * information about the symmetry and the space-group origin. If
     * used, always supply the FULL symbol from International Tables
     * for Crystallography Vol. A (2002) and indicate the origin and
     * the setting if it is not implicit. If there is any doubt that
     * the equivalent positions can be uniquely deduced from this
     * symbol, specify the  _symmetry_equiv.pos_as_xyz or
     * _symmetry.space_group_name_Hall  data items as well. Leave
     * spaces between symbols referring to
     * different axes.
     * @return StrColumn
     */
    public StrColumn getSpaceGroupNameH_M() {
        return delegate.getColumn("space_group_name_H-M", DelegatingStrColumn::new);
    }

    /**
     * Used for PDB space group:
     * 
     * Example: 'C 1 2 1'  (instead of C 2)
     * 'P 1 2 1'  (instead of P 2)
     * 'P 1 21 1' (instead of P 21)
     * 'P 1 1 21' (instead of P 21 -unique C axis)
     * 'H 3'      (instead of R 3   -hexagonal)
     * 'H 3 2'    (instead of R 3 2 -hexagonal)
     * @return StrColumn
     */
    public StrColumn getPdbxFullSpaceGroupNameH_M() {
        return delegate.getColumn("pdbx_full_space_group_name_H-M", DelegatingStrColumn::new);
    }

}