package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The startup model employed to begin refinement of the parameters for
 * a 3DEM reconstruction
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmStartModel extends BaseCategory {
    public EmStartModel(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmStartModel(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmStartModel(String name) {
        super(name);
    }

    /**
     * Any additional details about generating the startup model
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * EMDB id of the map used as the startup model
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEmdbId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("emdb_id", SingleRowStrColumn::new) :
                getBinaryColumn("emdb_id"));
    }

    /**
     * Primary key
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getImageProcessingId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", SingleRowStrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Description of the "in silico" model used to generate the startup model
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getInsilicoModel() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("insilico_model", SingleRowStrColumn::new) :
                getBinaryColumn("insilico_model"));
    }

    /**
     * Tilt angle for the 1st image set of the orthogonal tilt pairs
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOrthogonalTiltAngle1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("orthogonal_tilt_angle1", SingleRowFloatColumn::new) :
                getBinaryColumn("orthogonal_tilt_angle1"));
    }

    /**
     * Tilt angle for the 2nd image set of the orthogonal tilt pairs
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getOrthogonalTiltAngle2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("orthogonal_tilt_angle2", SingleRowFloatColumn::new) :
                getBinaryColumn("orthogonal_tilt_angle2"));
    }

    /**
     * number of images used to generate the orthogonal tilt startup model
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getOrthogonalTiltNumImages() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("orthogonal_tilt_num_images", SingleRowIntColumn::new) :
                getBinaryColumn("orthogonal_tilt_num_images"));
    }

    /**
     * Description of other method/source used to generate the startup model
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getOther() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("other", SingleRowStrColumn::new) :
                getBinaryColumn("other"));
    }

    /**
     * PDB id of the model coordinates used to generate the startup model
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_id"));
    }

    /**
     * Angular difference between the conical tilt images used to generate the startup model
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRandomConicalTiltAngle() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("random_conical_tilt_angle", SingleRowFloatColumn::new) :
                getBinaryColumn("random_conical_tilt_angle"));
    }

    /**
     * number of images used to generate the random conical tilt startup model
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getRandomConicalTiltNumImages() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("random_conical_tilt_num_images", SingleRowIntColumn::new) :
                getBinaryColumn("random_conical_tilt_num_images"));
    }

    /**
     * Type of startup model (map density) used to initiate the reconstruction
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }
}
