package org.rcsb.cif.model.structsheetorder;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructSheetOrder extends BaseCategory {
    public StructSheetOrder(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSheetOrder(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSheetOrder(String name) {
        super(name);
    }

    /**
     * Designates the relative position in the sheet, plus or minus, of
     * the second residue range to the first.
     * @return Offset
     */
    public Offset getOffset() {
        return (Offset) (isText ? textFields.computeIfAbsent("offset",
                Offset::new) : getBinaryColumn("offset"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return RangeId1
     */
    public RangeId1 getRangeId1() {
        return (RangeId1) (isText ? textFields.computeIfAbsent("range_id_1",
                RangeId1::new) : getBinaryColumn("range_id_1"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return RangeId2
     */
    public RangeId2 getRangeId2() {
        return (RangeId2) (isText ? textFields.computeIfAbsent("range_id_2",
                RangeId2::new) : getBinaryColumn("range_id_2"));
    }

    /**
     * A flag to indicate whether the two designated residue ranges are
     * parallel or antiparallel to one another.
     * @return Sense
     */
    public Sense getSense() {
        return (Sense) (isText ? textFields.computeIfAbsent("sense",
                Sense::new) : getBinaryColumn("sense"));
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return SheetId
     */
    public SheetId getSheetId() {
        return (SheetId) (isText ? textFields.computeIfAbsent("sheet_id",
                SheetId::new) : getBinaryColumn("sheet_id"));
    }
}
