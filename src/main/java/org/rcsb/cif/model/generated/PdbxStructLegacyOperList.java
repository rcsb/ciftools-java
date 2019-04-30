package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_LEGACY_OPER_LIST category describe
 * Cartesian rotation and translation operations required to
 * generate or transform the coordinates deposited with this entry.
 * 
 * This category provides a container for matrices used to construct
 * icosahedral assemblies in legacy entries.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructLegacyOperList extends BaseCategory {
    public PdbxStructLegacyOperList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructLegacyOperList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructLegacyOperList(String name) {
        super(name);
    }

    /**
     * This integer value must uniquely identify a
     * record in the PDBX_STRUCT_LEGACY_OPER_LIST list.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("id", SingleRowIntColumn::new) :
                getBinaryColumn("id"));
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
