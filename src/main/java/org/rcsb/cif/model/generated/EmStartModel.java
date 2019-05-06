package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The startup model employed to begin refinement of the parameters for
 * a 3DEM reconstruction
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * EMDB id of the map used as the startup model
     * @return StrColumn
     */
    public StrColumn getEmdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("emdb_id", StrColumn::new) :
                getBinaryColumn("emdb_id"));
    }

    /**
     * Primary key
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("image_processing_id", StrColumn::new) :
                getBinaryColumn("image_processing_id"));
    }

    /**
     * Description of the "in silico" model used to generate the startup model
     * @return StrColumn
     */
    public StrColumn getInsilicoModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("insilico_model", StrColumn::new) :
                getBinaryColumn("insilico_model"));
    }

    /**
     * Tilt angle for the 1st image set of the orthogonal tilt pairs
     * @return FloatColumn
     */
    public FloatColumn getOrthogonalTiltAngle1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("orthogonal_tilt_angle1", FloatColumn::new) :
                getBinaryColumn("orthogonal_tilt_angle1"));
    }

    /**
     * Tilt angle for the 2nd image set of the orthogonal tilt pairs
     * @return FloatColumn
     */
    public FloatColumn getOrthogonalTiltAngle2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("orthogonal_tilt_angle2", FloatColumn::new) :
                getBinaryColumn("orthogonal_tilt_angle2"));
    }

    /**
     * number of images used to generate the orthogonal tilt startup model
     * @return IntColumn
     */
    public IntColumn getOrthogonalTiltNumImages() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("orthogonal_tilt_num_images", IntColumn::new) :
                getBinaryColumn("orthogonal_tilt_num_images"));
    }

    /**
     * Description of other method/source used to generate the startup model
     * @return StrColumn
     */
    public StrColumn getOther() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("other", StrColumn::new) :
                getBinaryColumn("other"));
    }

    /**
     * PDB id of the model coordinates used to generate the startup model
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_id", StrColumn::new) :
                getBinaryColumn("pdb_id"));
    }

    /**
     * Angular difference between the conical tilt images used to generate the startup model
     * @return FloatColumn
     */
    public FloatColumn getRandomConicalTiltAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("random_conical_tilt_angle", FloatColumn::new) :
                getBinaryColumn("random_conical_tilt_angle"));
    }

    /**
     * number of images used to generate the random conical tilt startup model
     * @return IntColumn
     */
    public IntColumn getRandomConicalTiltNumImages() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("random_conical_tilt_num_images", IntColumn::new) :
                getBinaryColumn("random_conical_tilt_num_images"));
    }

    /**
     * Type of startup model (map density) used to initiate the reconstruction
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
