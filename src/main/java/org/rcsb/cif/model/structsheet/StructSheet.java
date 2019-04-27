package org.rcsb.cif.model.structsheet;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructSheet extends BaseCategory {
    public StructSheet(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructSheet(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructSheet(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the beta-sheet.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_sheet.id must uniquely identify a record in
     * the STRUCT_SHEET list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The number of strands in the sheet. If a given range of residues
     * bulges out from the strands, it is still counted as one strand.
     * If a strand is composed of two different regions of polypeptide,
     * it is still counted as one strand, as long as the proper hydrogen-
     * bonding connections are made to adjacent strands.
     * @return NumberStrands
     */
    public NumberStrands getNumberStrands() {
        return (NumberStrands) (isText ? textFields.computeIfAbsent("number_strands",
                NumberStrands::new) : getBinaryColumn("number_strands"));
    }

    /**
     * A simple descriptor for the type of the sheet.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
