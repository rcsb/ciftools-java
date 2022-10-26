package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The startup model employed to begin refinement of the parameters for
 * a 3DEM reconstruction
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmStartModel extends DelegatingCategory {
    public EmStartModel(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "emdb_id":
                return getEmdbId();
            case "id":
                return getId();
            case "image_processing_id":
                return getImageProcessingId();
            case "insilico_model":
                return getInsilicoModel();
            case "orthogonal_tilt_angle1":
                return getOrthogonalTiltAngle1();
            case "orthogonal_tilt_angle2":
                return getOrthogonalTiltAngle2();
            case "orthogonal_tilt_num_images":
                return getOrthogonalTiltNumImages();
            case "other":
                return getOther();
            case "pdb_id":
                return getPdbId();
            case "random_conical_tilt_angle":
                return getRandomConicalTiltAngle();
            case "random_conical_tilt_num_images":
                return getRandomConicalTiltNumImages();
            case "type":
                return getType();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Any additional details about generating the startup model
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * EMDB id of the map used as the startup model
     * @return StrColumn
     */
    public StrColumn getEmdbId() {
        return delegate.getColumn("emdb_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM_IMAGE_PROCESSING category
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * Description of the "in silico" model used to generate the startup model
     * @return StrColumn
     */
    public StrColumn getInsilicoModel() {
        return delegate.getColumn("insilico_model", DelegatingStrColumn::new);
    }

    /**
     * Tilt angle for the 1st image set of the orthogonal tilt pairs
     * @return FloatColumn
     */
    public FloatColumn getOrthogonalTiltAngle1() {
        return delegate.getColumn("orthogonal_tilt_angle1", DelegatingFloatColumn::new);
    }

    /**
     * Tilt angle for the 2nd image set of the orthogonal tilt pairs
     * @return FloatColumn
     */
    public FloatColumn getOrthogonalTiltAngle2() {
        return delegate.getColumn("orthogonal_tilt_angle2", DelegatingFloatColumn::new);
    }

    /**
     * number of images used to generate the orthogonal tilt startup model
     * @return IntColumn
     */
    public IntColumn getOrthogonalTiltNumImages() {
        return delegate.getColumn("orthogonal_tilt_num_images", DelegatingIntColumn::new);
    }

    /**
     * Description of other method/source used to generate the startup model
     * @return StrColumn
     */
    public StrColumn getOther() {
        return delegate.getColumn("other", DelegatingStrColumn::new);
    }

    /**
     * PDB id of the model coordinates used to generate the startup model
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return delegate.getColumn("pdb_id", DelegatingStrColumn::new);
    }

    /**
     * Angular difference between the conical tilt images used to generate the startup model
     * @return FloatColumn
     */
    public FloatColumn getRandomConicalTiltAngle() {
        return delegate.getColumn("random_conical_tilt_angle", DelegatingFloatColumn::new);
    }

    /**
     * number of images used to generate the random conical tilt startup model
     * @return IntColumn
     */
    public IntColumn getRandomConicalTiltNumImages() {
        return delegate.getColumn("random_conical_tilt_num_images", DelegatingIntColumn::new);
    }

    /**
     * Type of startup model (map density) used to initiate the reconstruction
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

}