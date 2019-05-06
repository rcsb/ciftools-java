package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the DIFFRN_ORIENT_MATRIX category record details
 * about the orientation matrix used in the measurement of the
 * diffraction data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDiffrnId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", StrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * A description of the orientation matrix type and how it should
     * be applied to define the orientation of the crystal precisely
     * with respect to the diffractometer axes.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[1][1]", FloatColumn::new) :
                getBinaryColumn("UB[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[1][2]", FloatColumn::new) :
                getBinaryColumn("UB[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[1][3]", FloatColumn::new) :
                getBinaryColumn("UB[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[2][1]", FloatColumn::new) :
                getBinaryColumn("UB[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[2][2]", FloatColumn::new) :
                getBinaryColumn("UB[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[2][3]", FloatColumn::new) :
                getBinaryColumn("UB[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[3][1]", FloatColumn::new) :
                getBinaryColumn("UB[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[3][2]", FloatColumn::new) :
                getBinaryColumn("UB[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local  diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return FloatColumn
     */
    public FloatColumn getUB33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("UB[3][3]", FloatColumn::new) :
                getBinaryColumn("UB[3][3]"));
    }
}
