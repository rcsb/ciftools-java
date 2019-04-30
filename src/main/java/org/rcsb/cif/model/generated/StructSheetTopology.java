package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SHEET_TOPOLOGY category record details
 * about the topology of the residue ranges that form a beta-sheet.
 * All topology links are pairwise and the specified pairs are
 * assumed to be successive in the amino-acid sequence. These
 * data items are useful in describing various simple and complex
 * folds, but they become inadequate when the strands in the sheet
 * come from more than one chain. The
 * STRUCT_SHEET_ORDER data items can be used to describe
 * single- and multiple-chain-containing sheets.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructSheetTopology extends BaseCategory {
    public StructSheetTopology(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSheetTopology(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSheetTopology(String name) {
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
