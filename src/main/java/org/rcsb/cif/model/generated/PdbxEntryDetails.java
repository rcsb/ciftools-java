package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTRY_DETAILS category provide additional
 * details about this entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Additional details about the non-polymer components in this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getNonpolymerDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("nonpolymer_details", SingleRowStrColumn::new) :
                getBinaryColumn("nonpolymer_details"));
    }

    /**
     * Additional details about the sequence or sequence database correspondences
     * for this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSequenceDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("sequence_details", SingleRowStrColumn::new) :
                getBinaryColumn("sequence_details"));
    }

    /**
     * Additional details about the macromolecular compounds in this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCompoundDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("compound_details", SingleRowStrColumn::new) :
                getBinaryColumn("compound_details"));
    }

    /**
     * Additional details about the source and taxonomy of the macromolecular
     * components in this entry.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSourceDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("source_details", SingleRowStrColumn::new) :
                getBinaryColumn("source_details"));
    }
}
