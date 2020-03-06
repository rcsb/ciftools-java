package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_SHEET category record details about
 * the beta-sheets.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructSheet extends DelegatingCategory {
    public StructSheet(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "number_strands":
                return getNumberStrands();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A description of special aspects of the beta-sheet.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _struct_sheet.id must uniquely identify a record in
     * the STRUCT_SHEET list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The number of strands in the sheet. If a given range of residues
     * bulges out from the strands, it is still counted as one strand.
     * If a strand is composed of two different regions of polypeptide,
     * it is still counted as one strand, as long as the proper hydrogen-
     * bonding connections are made to adjacent strands.
     * @return IntColumn
     */
    public IntColumn getNumberStrands() {
        return delegate.getColumn("number_strands", DelegatingIntColumn::new);
    }

    /**
     * A simple descriptor for the type of the sheet.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}