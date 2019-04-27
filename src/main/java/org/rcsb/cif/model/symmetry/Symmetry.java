package org.rcsb.cif.model.symmetry;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class Symmetry extends BaseCategory {
    public Symmetry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public Symmetry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public Symmetry(String name) {
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
     * The cell settings for this space-group symmetry.
     * @return CellSetting
     */
    public CellSetting getCellSetting() {
        return (CellSetting) (isText ? textFields.computeIfAbsent("cell_setting",
                CellSetting::new) : getBinaryColumn("cell_setting"));
    }

    /**
     * Space-group number from International Tables for Crystallography
     * Vol. A (2002).
     * @return IntTablesNumber
     */
    public IntTablesNumber getIntTablesNumber() {
        return (IntTablesNumber) (isText ? textFields.computeIfAbsent("Int_Tables_number",
                IntTablesNumber::new) : getBinaryColumn("Int_Tables_number"));
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
        return (SpaceGroupNameHall) (isText ? textFields.computeIfAbsent("space_group_name_Hall",
                SpaceGroupNameHall::new) : getBinaryColumn("space_group_name_Hall"));
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
        return (SpaceGroupNameH_M) (isText ? textFields.computeIfAbsent("space_group_name_H-M",
                SpaceGroupNameH_M::new) : getBinaryColumn("space_group_name_H-M"));
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
     * @return PdbxFullSpaceGroupNameH_M
     */
    public PdbxFullSpaceGroupNameH_M getPdbxFullSpaceGroupNameH_M() {
        return (PdbxFullSpaceGroupNameH_M) (isText ? textFields.computeIfAbsent("pdbx_full_space_group_name_H-M",
                PdbxFullSpaceGroupNameH_M::new) : getBinaryColumn("pdbx_full_space_group_name_H-M"));
    }
}
