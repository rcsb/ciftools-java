package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

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
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSheetTopology extends DelegatingCategory {
    public StructSheetTopology(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "offset":
                return getOffset();
            case "range_id_1":
                return getRangeId1();
            case "range_id_2":
                return getRangeId2();
            case "sense":
                return getSense();
            case "sheet_id":
                return getSheetId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Designates the relative position in the sheet, plus or minus, of
     * the second residue range to the first.
     * @return IntColumn
     */
    public IntColumn getOffset() {
        return delegate.getColumn("offset", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId1() {
        return delegate.getColumn("range_id_1", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_sheet_range.id in
     * the STRUCT_SHEET_RANGE category.
     * @return StrColumn
     */
    public StrColumn getRangeId2() {
        return delegate.getColumn("range_id_2", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the two designated residue ranges are
     * parallel or antiparallel to one another.
     * @return StrColumn
     */
    public StrColumn getSense() {
        return delegate.getColumn("sense", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_sheet.id in the
     * STRUCT_SHEET category.
     * @return StrColumn
     */
    public StrColumn getSheetId() {
        return delegate.getColumn("sheet_id", DelegatingStrColumn::new);
    }

}