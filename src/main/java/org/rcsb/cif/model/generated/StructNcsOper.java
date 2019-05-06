package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_NCS_OPER category describe the
 * noncrystallographic symmetry operations.
 * 
 * Each operator is specified as a matrix and a subsequent
 * translation vector. Operators need not represent proper
 * rotations.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class StructNcsOper extends BaseCategory {
    public StructNcsOper(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructNcsOper(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructNcsOper(String name) {
        super(name);
    }

    /**
     * A code to indicate whether this operator describes a
     * relationship between coordinates all of which are given in the
     * data block (in which case the value of code is 'given'), or
     * whether the operator is used to generate new coordinates from
     * those that are given in the data block (in which case the value
     * of code is 'generate').
     * @return StrColumn
     */
    public StrColumn getCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("code", StrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * A description of special aspects of the noncrystallographic
     * symmetry operator.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_oper.id must uniquely identify a
     * record in the STRUCT_NCS_OPER list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][1]", FloatColumn::new) :
                getBinaryColumn("matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][2]", FloatColumn::new) :
                getBinaryColumn("matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][3]", FloatColumn::new) :
                getBinaryColumn("matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][1]", FloatColumn::new) :
                getBinaryColumn("matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][2]", FloatColumn::new) :
                getBinaryColumn("matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][3]", FloatColumn::new) :
                getBinaryColumn("matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][1]", FloatColumn::new) :
                getBinaryColumn("matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][2]", FloatColumn::new) :
                getBinaryColumn("matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getMatrix33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][3]", FloatColumn::new) :
                getBinaryColumn("matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[1]", FloatColumn::new) :
                getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[2]", FloatColumn::new) :
                getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return FloatColumn
     */
    public FloatColumn getVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("vector[3]", FloatColumn::new) :
                getBinaryColumn("vector[3]"));
    }
}
