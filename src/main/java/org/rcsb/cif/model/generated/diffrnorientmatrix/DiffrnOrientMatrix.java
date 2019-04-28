package org.rcsb.cif.model.generated.diffrnorientmatrix;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class DiffrnOrientMatrix extends BaseCategory {
    public DiffrnOrientMatrix(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DiffrnOrientMatrix(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DiffrnOrientMatrix(String name) {
        super(name);
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
     * A description of the orientation matrix type and how it should
     * be applied to define the orientation of the crystal precisely
     * with respect to the diffractometer axes.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB11
     */
    public UB11 getUB11() {
        return (UB11) (isText ? textFields.computeIfAbsent("UB[1][1]",
                UB11::new) : getBinaryColumn("UB[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB12
     */
    public UB12 getUB12() {
        return (UB12) (isText ? textFields.computeIfAbsent("UB[1][2]",
                UB12::new) : getBinaryColumn("UB[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB13
     */
    public UB13 getUB13() {
        return (UB13) (isText ? textFields.computeIfAbsent("UB[1][3]",
                UB13::new) : getBinaryColumn("UB[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB21
     */
    public UB21 getUB21() {
        return (UB21) (isText ? textFields.computeIfAbsent("UB[2][1]",
                UB21::new) : getBinaryColumn("UB[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB22
     */
    public UB22 getUB22() {
        return (UB22) (isText ? textFields.computeIfAbsent("UB[2][2]",
                UB22::new) : getBinaryColumn("UB[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB23
     */
    public UB23 getUB23() {
        return (UB23) (isText ? textFields.computeIfAbsent("UB[2][3]",
                UB23::new) : getBinaryColumn("UB[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB31
     */
    public UB31 getUB31() {
        return (UB31) (isText ? textFields.computeIfAbsent("UB[3][1]",
                UB31::new) : getBinaryColumn("UB[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB32
     */
    public UB32 getUB32() {
        return (UB32) (isText ? textFields.computeIfAbsent("UB[3][2]",
                UB32::new) : getBinaryColumn("UB[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local  diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return UB33
     */
    public UB33 getUB33() {
        return (UB33) (isText ? textFields.computeIfAbsent("UB[3][3]",
                UB33::new) : getBinaryColumn("UB[3][3]"));
    }
}
