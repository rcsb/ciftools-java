package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SHEET_ORDER category record details
 * about the order of the residue ranges that form a beta-sheet.
 * All order links are pairwise and the specified pairs are
 * assumed to be adjacent to one another in the sheet. These data
 * items are an alternative to the STRUCT_SHEET_TOPOLOGY data
 * items and they allow all manner of sheets to be described.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getOffset() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("offset", IntColumn::new) :
                getBinaryColumn("offset"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_id_1", StrColumn::new) :
                getBinaryColumn("range_id_1"));
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("range_id_2", StrColumn::new) :
                getBinaryColumn("range_id_2"));
    }

    /**
     * A flag to indicate whether the two designated residue ranges are
     * parallel or antiparallel to one another.
     * @return StrColumn
     */
    public StrColumn getSense() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sense", StrColumn::new) :
                getBinaryColumn("sense"));
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return StrColumn
     */
    public StrColumn getSheetId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sheet_id", StrColumn::new) :
                getBinaryColumn("sheet_id"));
    }
}
