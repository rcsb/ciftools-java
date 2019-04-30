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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * A description of the orientation matrix type and how it should
     * be applied to define the orientation of the crystal precisely
     * with respect to the diffractometer axes.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB21() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[2][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB31() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[3][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB32() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[3][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix that defines the dimensions
     * of the reciprocal cell and its orientation with respect to the
     * local  diffractometer axes. See also _diffrn_orient_matrix.type.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getUB33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("UB[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("UB[3][3]"));
    }
}
