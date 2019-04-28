package org.rcsb.cif.model.generated.emfiguredepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmFigureDepositorInfo extends BaseCategory {
    public EmFigureDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmFigureDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmFigureDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is the unique identifier for an image file.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item optionally associates an image (figure) with an experiment.
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the image file associated with the map entry
     * @return UploadFileName
     */
    public UploadFileName getUploadFileName() {
        return (UploadFileName) (isText ? textFields.computeIfAbsent("upload_file_name",
                UploadFileName::new) : getBinaryColumn("upload_file_name"));
    }

    /**
     * Details about the image file.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
