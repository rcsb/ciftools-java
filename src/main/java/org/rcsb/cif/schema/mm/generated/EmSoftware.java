package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Description of the software that was used for data collection, data processing,
 * data analysis, structure calculations and refinement. The description should
 * include the name of the software, the author of the software and the version used.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmSoftware extends BaseCategory {
    public EmSoftware(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSoftware(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSoftware(String name) {
        super(name);
    }

    /**
     * The purpose of the software.
     * @return StrColumn
     */
    public StrColumn getCategory() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("category", StrColumn::new) :
                getBinaryColumn("category"));
    }

    /**
     * Details about the software used.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * Unique identifier for each software description.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * pointer to _em_image_processing.id in the EM_IMAGE_PROCESSING category.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * pointer to _em_3d_fitting.id in the EM_3D_FITTING category.
     * @return StrColumn
     */
    public StrColumn getFittingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fitting_id", StrColumn::new) :
                getBinaryColumn("fitting_id"));
    }

    /**
     * pointer to _em_imaging.id in the EM_IMAGING category.
     * @return StrColumn
     */
    public StrColumn getImagingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("imaging_id", StrColumn::new) :
                getBinaryColumn("imaging_id"));
    }

    /**
     * The name of the software package used, e.g., RELION.  Depositors are strongly
     * encouraged to provide a value in this field.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The version of the software.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("version", StrColumn::new) :
                getBinaryColumn("version"));
    }
}
