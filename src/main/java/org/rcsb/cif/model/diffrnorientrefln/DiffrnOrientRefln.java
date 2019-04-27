package org.rcsb.cif.model.diffrnorientrefln;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return AngleChi
     */
    public AngleChi getAngleChi() {
        return (AngleChi) (isText ? textFields.computeIfAbsent("angle_chi",
                AngleChi::new) : getBinaryColumn("angle_chi"));
    }

    /**
     * Diffractometer angle kappa of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return AngleKappa
     */
    public AngleKappa getAngleKappa() {
        return (AngleKappa) (isText ? textFields.computeIfAbsent("angle_kappa",
                AngleKappa::new) : getBinaryColumn("angle_kappa"));
    }

    /**
     * Diffractometer angle omega of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices in
     * the DIFFRN_ORIENT_REFLN category.
     * @return AngleOmega
     */
    public AngleOmega getAngleOmega() {
        return (AngleOmega) (isText ? textFields.computeIfAbsent("angle_omega",
                AngleOmega::new) : getBinaryColumn("angle_omega"));
    }

    /**
     * Diffractometer angle phi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return AnglePhi
     */
    public AnglePhi getAnglePhi() {
        return (AnglePhi) (isText ? textFields.computeIfAbsent("angle_phi",
                AnglePhi::new) : getBinaryColumn("angle_phi"));
    }

    /**
     * Diffractometer angle psi of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return AnglePsi
     */
    public AnglePsi getAnglePsi() {
        return (AnglePsi) (isText ? textFields.computeIfAbsent("angle_psi",
                AnglePsi::new) : getBinaryColumn("angle_psi"));
    }

    /**
     * Diffractometer angle theta of a reflection used to
     * define the orientation matrix in degrees. See
     * _diffrn_orient_matrix.UB[][] and the Miller indices
     * in the DIFFRN_ORIENT_REFLN category.
     * @return AngleTheta
     */
    public AngleTheta getAngleTheta() {
        return (AngleTheta) (isText ? textFields.computeIfAbsent("angle_theta",
                AngleTheta::new) : getBinaryColumn("angle_theta"));
    }

    /**
     * This data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * Miller index h of a reflection used to define the orientation
     * matrix.
     * @return IndexH
     */
    public IndexH getIndexH() {
        return (IndexH) (isText ? textFields.computeIfAbsent("index_h",
                IndexH::new) : getBinaryColumn("index_h"));
    }

    /**
     * Miller index k of a reflection used to define the orientation
     * matrix.
     * @return IndexK
     */
    public IndexK getIndexK() {
        return (IndexK) (isText ? textFields.computeIfAbsent("index_k",
                IndexK::new) : getBinaryColumn("index_k"));
    }

    /**
     * Miller index l of a reflection used to define the orientation
     * matrix.
     * @return IndexL
     */
    public IndexL getIndexL() {
        return (IndexL) (isText ? textFields.computeIfAbsent("index_l",
                IndexL::new) : getBinaryColumn("index_l"));
    }
}
