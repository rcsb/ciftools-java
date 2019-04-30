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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("code", SingleRowStrColumn::new) :
                getBinaryColumn("code"));
    }

    /**
     * A description of special aspects of the noncrystallographic
     * symmetry operator.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_oper.id must uniquely identify a
     * record in the STRUCT_NCS_OPER list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix21() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix31() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix32() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVector1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("vector[1]", SingleRowFloatColumn::new) :
                getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVector2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("vector[2]", SingleRowFloatColumn::new) :
                getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the three-element vector component of a
     * noncrystallographic symmetry operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVector3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("vector[3]", SingleRowFloatColumn::new) :
                getBinaryColumn("vector[3]"));
    }
}
