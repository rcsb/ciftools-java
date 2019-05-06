package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_SHEET category record details about
 * the beta-sheets.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_strands", IntColumn::new) :
                getBinaryColumn("number_strands"));
    }

    /**
     * A simple descriptor for the type of the sheet.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
