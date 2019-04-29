package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_ORIENT_REFLN category record details
 * about the reflections that define the orientation matrix used in
 * the measurement of the diffraction intensities.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnOrientRefln extends BaseCategory {
    public DiffrnOrientRefln(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnOrientRefln(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnOrientRefln(String name) {
        super(name);
    }

    /**
     * Diffractometer angle chi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleChi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_chi", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_chi"));
    }

    /**
     * Diffractometer angle kappa of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleKappa() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_kappa", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_kappa"));
    }

    /**
     * Diffractometer angle omega of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices in
     * the DIFFRN_ORIENT_REFLN category.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleOmega() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_omega", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_omega"));
    }

    /**
     * Diffractometer angle phi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnglePhi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_phi", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_phi"));
    }

    /**
     * Diffractometer angle psi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAnglePsi() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_psi", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_psi"));
    }

    /**
     * Diffractometer angle theta of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getAngleTheta() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("angle_theta", SingleRowFloatColumn::new) :
                getBinaryColumn("angle_theta"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * Miller index h of a reflection used to define the orientation
     * matrix.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexH() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_h", SingleRowIntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a reflection used to define the orientation
     * matrix.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexK() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_k", SingleRowIntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a reflection used to define the orientation
     * matrix.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getIndexL() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("index_l", SingleRowIntColumn::new) :
                getBinaryColumn("index_l"));
    }
}
