package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Volume selection in image processing
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmVolumeSelection extends DelegatingCategory {
    public EmVolumeSelection(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "method":
                return getMethod();
            case "num_tomograms":
                return getNumTomograms();
            case "num_volumes_extracted":
                return getNumVolumesExtracted();
            case "reference_model":
                return getReferenceModel();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Any additional details used for selecting volumes.
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
     * The value of _em_volume_selection.image_processing_id points to
     * the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * The method used for selecting volumes.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The number of tomograms used in the extraction/selection
     * @return IntColumn
     */
    public IntColumn getNumTomograms() {
        return delegate.getColumn("num_tomograms", DelegatingIntColumn::new);
    }

    /**
     * The number of volumes selected from the projection set of images.
     * @return IntColumn
     */
    public IntColumn getNumVolumesExtracted() {
        return delegate.getColumn("num_volumes_extracted", DelegatingIntColumn::new);
    }

    /**
     * Description of reference model used for volume selection
     * @return StrColumn
     */
    public StrColumn getReferenceModel() {
        return delegate.getColumn("reference_model", DelegatingStrColumn::new);
    }

}