package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_OPER_LIST_DEPOSITOR_INFO category capture
 * depositor provided information related to the archival cateogory
 * PDBX_STRUCT_OPER_LIST.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A code to indicate the type of operator.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A descriptive name for the transformation operation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("name", SingleRowStrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * The symmetry operation corresponding to the transformation operation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSymmetryOperation() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("symmetry_operation", SingleRowStrColumn::new) :
                getBinaryColumn("symmetry_operation"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix11() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[1][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix12() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[1][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix13() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[1][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[1][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix21() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[2][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix22() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[2][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix23() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[2][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[2][3]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix31() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][1]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[3][1]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix32() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][2]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[3][2]"));
    }

    /**
     * The elements of the 3x3 matrix component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getMatrix33() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("matrix[3][3]", SingleRowFloatColumn::new) :
                getBinaryColumn("matrix[3][3]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVector1() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("vector[1]", SingleRowFloatColumn::new) :
                getBinaryColumn("vector[1]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVector2() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("vector[2]", SingleRowFloatColumn::new) :
                getBinaryColumn("vector[2]"));
    }

    /**
     * The elements of the three-element vector component of the
     * transformation operation.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getVector3() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("vector[3]", SingleRowFloatColumn::new) :
                getBinaryColumn("vector[3]"));
    }
}
