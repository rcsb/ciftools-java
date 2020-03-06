package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_POST_PROCESS_DETAILS identify
 * problems or errors encountered in the post-processing
 * of this entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxPostProcessDetails extends DelegatingCategory {
    public PdbxPostProcessDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "text":
                return getText();
            case "seq_details":
                return getSeqDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_post_process_details.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The text description of changes required to standardize
     * this entry.   This should include any errors detected
     * or changes in nomenclature.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

    /**
     * Details concerning the standardization of the chemical
     * sequence data in this entry.
     * @return StrColumn
     */
    public StrColumn getSeqDetails() {
        return delegate.getColumn("seq_details", DelegatingStrColumn::new);
    }

}