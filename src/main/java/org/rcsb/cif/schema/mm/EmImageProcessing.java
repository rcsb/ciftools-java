package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_IMAGE_PROCESSING category
 * record details of the EM image processing procedure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmImageProcessing extends DelegatingCategory {
    public EmImageProcessing(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "image_recording_id":
                return getImageRecordingId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Method details.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM_IMAGE_RECORDING
     * @return StrColumn
     */
    public StrColumn getImageRecordingId() {
        return delegate.getColumn("image_recording_id", DelegatingStrColumn::new);
    }

}