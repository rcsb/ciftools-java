package org.rcsb.cif.model.generated.symmetry;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import java.util.Map;

public class Symmetry extends BaseCifCategory {
    public Symmetry(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public Symmetry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? getTextColumn("entry_id") : getBinaryColumn("entry_id", "EntryId"));
    }

    /**
     * The cell settings for this space-group symmetry.
     * @return CellSetting
     */
    public CellSetting getCellSetting() {
        return (CellSetting) (isText ? getTextColumn("cell_setting") : getBinaryColumn("cell_setting", "CellSetting"));
    }

    /**
     * Space-group number from International Tables for Crystallography
     * Vol. A (2002).
     * @return IntTablesNumber
     */
    public IntTablesNumber getIntTablesNumber() {
        return (IntTablesNumber) (isText ? getTextColumn("Int_Tables_number") : getBinaryColumn("Int_Tables_number", "IntTablesNumber"));
    }

    /**
     * Space-group symbol as described by Hall (1981). This symbol
     * gives the space-group setting explicitly. Leave spaces between
     * the separate components of the symbol.
     * 
     * Ref: Hall, S. R. (1981). Acta Cryst. A37, 517-525; erratum
     * (1981) A37, 921.
     * @return SpaceGroupNameHall
     */
    public SpaceGroupNameHall getSpaceGroupNameHall() {
        return (SpaceGroupNameHall) (isText ? getTextColumn("space_group_name_Hall") : getBinaryColumn("space_group_name_Hall", "SpaceGroupNameHall"));
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
     * @return SpaceGroupNameH_M
     */
    public SpaceGroupNameH_M getSpaceGroupNameH_M() {
        return (SpaceGroupNameH_M) (isText ? getTextColumn("space_group_name_H-M") : getBinaryColumn("space_group_name_H-M", "SpaceGroupNameH_M"));
    }
}
