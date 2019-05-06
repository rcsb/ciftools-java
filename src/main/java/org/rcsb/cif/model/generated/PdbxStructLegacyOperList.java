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
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
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
