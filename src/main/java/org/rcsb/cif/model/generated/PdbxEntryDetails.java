package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTRY_DETAILS category provide additional
 * details about this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntryDetails extends BaseCategory {
    public PdbxEntryDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntryDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntryDetails(String name) {
        super(name);
    }

    /**
     * This item identifies the entry.  This is a reference to _entry.id.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Additional details about the non-polymer components in this entry.
     * @return StrColumn
     */
    public StrColumn getNonpolymerDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nonpolymer_details", StrColumn::new) :
                getBinaryColumn("nonpolymer_details"));
    }

    /**
     * Additional details about the sequence or sequence database correspondences
     * for this entry.
     * @return StrColumn
     */
    public StrColumn getSequenceDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sequence_details", StrColumn::new) :
                getBinaryColumn("sequence_details"));
    }

    /**
     * Additional details about the macromolecular compounds in this entry.
     * @return StrColumn
     */
    public StrColumn getCompoundDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("compound_details", StrColumn::new) :
                getBinaryColumn("compound_details"));
    }

    /**
     * Additional details about the source and taxonomy of the macromolecular
     * components in this entry.
     * @return StrColumn
     */
    public StrColumn getSourceDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("source_details", StrColumn::new) :
                getBinaryColumn("source_details"));
    }
}
