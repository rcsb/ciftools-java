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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_sheet.id must uniquely identify a record in
     * the STRUCT_SHEET list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The number of strands in the sheet. If a given range of residues
     * bulges out from the strands, it is still counted as one strand.
     * If a strand is composed of two different regions of polypeptide,
     * it is still counted as one strand, as long as the proper hydrogen-
     * bonding connections are made to adjacent strands.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberStrands() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_strands", SingleRowIntColumn::new) :
                getBinaryColumn("number_strands"));
    }

    /**
     * A simple descriptor for the type of the sheet.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
