package org.rcsb.cif.model.generated.pdbxpostprocessdetails;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPostProcessDetails extends BaseCategory {
    public PdbxPostProcessDetails(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPostProcessDetails(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPostProcessDetails(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_post_process_details.entry_id identifies the data block.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The text description of changes required to standardize
     * this entry.   This should include any errors detected
     * or changes in nomenclature.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }

    /**
     * Details concerning the standardization of the chemical
     * sequence data in this entry.
     * @return SeqDetails
     */
    public SeqDetails getSeqDetails() {
        return (SeqDetails) (isText ? textFields.computeIfAbsent("seq_details",
                SeqDetails::new) : getBinaryColumn("seq_details"));
    }
}
