package org.rcsb.cif.model.pdbxentrydetails;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Additional details about the non-polymer components in this entry.
     * @return NonpolymerDetails
     */
    public NonpolymerDetails getNonpolymerDetails() {
        return (NonpolymerDetails) (isText ? textFields.computeIfAbsent("nonpolymer_details",
                NonpolymerDetails::new) : getBinaryColumn("nonpolymer_details"));
    }

    /**
     * Additional details about the sequence or sequence database correspondences
     * for this entry.
     * @return SequenceDetails
     */
    public SequenceDetails getSequenceDetails() {
        return (SequenceDetails) (isText ? textFields.computeIfAbsent("sequence_details",
                SequenceDetails::new) : getBinaryColumn("sequence_details"));
    }

    /**
     * Additional details about the macromolecular compounds in this entry.
     * @return CompoundDetails
     */
    public CompoundDetails getCompoundDetails() {
        return (CompoundDetails) (isText ? textFields.computeIfAbsent("compound_details",
                CompoundDetails::new) : getBinaryColumn("compound_details"));
    }

    /**
     * Additional details about the source and taxonomy of the macromolecular
     * components in this entry.
     * @return SourceDetails
     */
    public SourceDetails getSourceDetails() {
        return (SourceDetails) (isText ? textFields.computeIfAbsent("source_details",
                SourceDetails::new) : getBinaryColumn("source_details"));
    }
}
