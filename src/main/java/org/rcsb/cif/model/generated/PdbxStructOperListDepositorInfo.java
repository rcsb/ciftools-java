package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_OPER_LIST.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructOperListDepositorInfo extends BaseCategory {
    public PdbxStructOperListDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructOperListDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructOperListDepositorInfo(String name) {
        super(name);
    }

    /**
     * This identifier code must uniquely identify a
     * record in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A code to indicate the type of operator.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A descriptive name for the transformation operation.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The symmetry operation corresponding to the transformation operation.
     * @return StrColumn
     */
    public StrColumn getSymmetryOperation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("symmetry_operation", StrColumn::new) :
                getBinaryColumn("symmetry_operation"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[1]", FloatColumn::new) :
                getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[2]", FloatColumn::new) :
                getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return FloatColumn
     */
    public FloatColumn getVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[3]", FloatColumn::new) :
                getBinaryColumn("vector[3]"));
    }
}
