package org.rcsb.cif.model.emstartmodel;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * EMDB id of the map used as the startup model
     * @return EmdbId
     */
    public EmdbId getEmdbId() {
        return (EmdbId) (isText ? textFields.computeIfAbsent("emdb_id",
                EmdbId::new) : getBinaryColumn("emdb_id"));
    }

    /**
     * Primary key
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return ImageProcessingId
     */
    public ImageProcessingId getImageProcessingId() {
        return (ImageProcessingId) (isText ? textFields.computeIfAbsent("image_processing_id",
                ImageProcessingId::new) : getBinaryColumn("image_processing_id"));
    }

    /**
     * Description of the "in silico" model used to generate the startup model
     * @return InsilicoModel
     */
    public InsilicoModel getInsilicoModel() {
        return (InsilicoModel) (isText ? textFields.computeIfAbsent("insilico_model",
                InsilicoModel::new) : getBinaryColumn("insilico_model"));
    }

    /**
     * Tilt angle for the 1st image set of the orthogonal tilt pairs
     * @return OrthogonalTiltAngle1
     */
    public OrthogonalTiltAngle1 getOrthogonalTiltAngle1() {
        return (OrthogonalTiltAngle1) (isText ? textFields.computeIfAbsent("orthogonal_tilt_angle1",
                OrthogonalTiltAngle1::new) : getBinaryColumn("orthogonal_tilt_angle1"));
    }

    /**
     * Tilt angle for the 2nd image set of the orthogonal tilt pairs
     * @return OrthogonalTiltAngle2
     */
    public OrthogonalTiltAngle2 getOrthogonalTiltAngle2() {
        return (OrthogonalTiltAngle2) (isText ? textFields.computeIfAbsent("orthogonal_tilt_angle2",
                OrthogonalTiltAngle2::new) : getBinaryColumn("orthogonal_tilt_angle2"));
    }

    /**
     * number of images used to generate the orthogonal tilt startup model
     * @return OrthogonalTiltNumImages
     */
    public OrthogonalTiltNumImages getOrthogonalTiltNumImages() {
        return (OrthogonalTiltNumImages) (isText ? textFields.computeIfAbsent("orthogonal_tilt_num_images",
                OrthogonalTiltNumImages::new) : getBinaryColumn("orthogonal_tilt_num_images"));
    }

    /**
     * Description of other method/source used to generate the startup model
     * @return Other
     */
    public Other getOther() {
        return (Other) (isText ? textFields.computeIfAbsent("other",
                Other::new) : getBinaryColumn("other"));
    }

    /**
     * PDB id of the model coordinates used to generate the startup model
     * @return PdbId
     */
    public PdbId getPdbId() {
        return (PdbId) (isText ? textFields.computeIfAbsent("pdb_id",
                PdbId::new) : getBinaryColumn("pdb_id"));
    }

    /**
     * Angular difference between the conical tilt images used to generate the startup model
     * @return RandomConicalTiltAngle
     */
    public RandomConicalTiltAngle getRandomConicalTiltAngle() {
        return (RandomConicalTiltAngle) (isText ? textFields.computeIfAbsent("random_conical_tilt_angle",
                RandomConicalTiltAngle::new) : getBinaryColumn("random_conical_tilt_angle"));
    }

    /**
     * number of images used to generate the random conical tilt startup model
     * @return RandomConicalTiltNumImages
     */
    public RandomConicalTiltNumImages getRandomConicalTiltNumImages() {
        return (RandomConicalTiltNumImages) (isText ? textFields.computeIfAbsent("random_conical_tilt_num_images",
                RandomConicalTiltNumImages::new) : getBinaryColumn("random_conical_tilt_num_images"));
    }

    /**
     * Type of startup model (map density) used to initiate the reconstruction
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
