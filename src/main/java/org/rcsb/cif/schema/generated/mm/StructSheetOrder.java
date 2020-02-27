package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SHEET_ORDER category record details
 * about the order of the residue ranges that form a beta-sheet.
 * All order links are pairwise and the specified pairs are
 * assumed to be adjacent to one another in the sheet. These data
 * items are an alternative to the STRUCT_SHEET_TOPOLOGY data
 * items and they allow all manner of sheets to be described.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSheetOrder extends DelegatingCategory {
    public StructSheetOrder(Category delegate) {
        super(delegate);
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
