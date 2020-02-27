package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_ORIENT_REFLN category record details
 * about the reflections that define the orientation matrix used in
 * the measurement of the diffraction intensities.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getAngleChi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_chi", FloatColumn::new) :
                getBinaryColumn("angle_chi"));
    }

    /**
     * Diffractometer angle kappa of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleKappa() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_kappa", FloatColumn::new) :
                getBinaryColumn("angle_kappa"));
    }

    /**
     * Diffractometer angle omega of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices in
     * the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleOmega() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_omega", FloatColumn::new) :
                getBinaryColumn("angle_omega"));
    }

    /**
     * Diffractometer angle phi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAnglePhi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_phi", FloatColumn::new) :
                getBinaryColumn("angle_phi"));
    }

    /**
     * Diffractometer angle psi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAnglePsi() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_psi", FloatColumn::new) :
                getBinaryColumn("angle_psi"));
    }

    /**
     * Diffractometer angle theta of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return FloatColumn
     */
    public FloatColumn getAngleTheta() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_theta", FloatColumn::new) :
                getBinaryColumn("angle_theta"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * Miller index h of a reflection used to define the orientation
     * matrix.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_h", IntColumn::new) :
                getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a reflection used to define the orientation
     * matrix.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_k", IntColumn::new) :
                getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a reflection used to define the orientation
     * matrix.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("index_l", IntColumn::new) :
                getBinaryColumn("index_l"));
    }
}
