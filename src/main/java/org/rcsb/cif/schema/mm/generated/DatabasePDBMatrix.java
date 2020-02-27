package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The DATABASE_PDB_MATRIX category provides placeholders for
 * transformation matrices and vectors used by the Protein Data
 * Bank (PDB).
 * 
 * These data items are included only for consistency with older
 * PDB format files. They should appear in a data block only if
 * that data block was created by reformatting a PDB format file.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class DatabasePDBMatrix extends BaseCategory {
    public DatabasePDBMatrix(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public DatabasePDBMatrix(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public DatabasePDBMatrix(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[1][1]", FloatColumn::new) :
                getBinaryColumn("origx[1][1]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[1][2]", FloatColumn::new) :
                getBinaryColumn("origx[1][2]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[1][3]", FloatColumn::new) :
                getBinaryColumn("origx[1][3]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[2][1]", FloatColumn::new) :
                getBinaryColumn("origx[2][1]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[2][2]", FloatColumn::new) :
                getBinaryColumn("origx[2][2]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[2][3]", FloatColumn::new) :
                getBinaryColumn("origx[2][3]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[3][1]", FloatColumn::new) :
                getBinaryColumn("origx[3][1]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[3][2]", FloatColumn::new) :
                getBinaryColumn("origx[3][2]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx[3][3]", FloatColumn::new) :
                getBinaryColumn("origx[3][3]"));
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return FloatColumn
     */
    public FloatColumn getOrigxVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx_vector[1]", FloatColumn::new) :
                getBinaryColumn("origx_vector[1]"));
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return FloatColumn
     */
    public FloatColumn getOrigxVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx_vector[2]", FloatColumn::new) :
                getBinaryColumn("origx_vector[2]"));
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return FloatColumn
     */
    public FloatColumn getOrigxVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origx_vector[3]", FloatColumn::new) :
                getBinaryColumn("origx_vector[3]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[1][1]", FloatColumn::new) :
                getBinaryColumn("scale[1][1]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[1][2]", FloatColumn::new) :
                getBinaryColumn("scale[1][2]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[1][3]", FloatColumn::new) :
                getBinaryColumn("scale[1][3]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale21() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[2][1]", FloatColumn::new) :
                getBinaryColumn("scale[2][1]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[2][2]", FloatColumn::new) :
                getBinaryColumn("scale[2][2]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[2][3]", FloatColumn::new) :
                getBinaryColumn("scale[2][3]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale31() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[3][1]", FloatColumn::new) :
                getBinaryColumn("scale[3][1]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale32() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[3][2]", FloatColumn::new) :
                getBinaryColumn("scale[3][2]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale[3][3]", FloatColumn::new) :
                getBinaryColumn("scale[3][3]"));
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return FloatColumn
     */
    public FloatColumn getScaleVector1() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale_vector[1]", FloatColumn::new) :
                getBinaryColumn("scale_vector[1]"));
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return FloatColumn
     */
    public FloatColumn getScaleVector2() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale_vector[2]", FloatColumn::new) :
                getBinaryColumn("scale_vector[2]"));
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return FloatColumn
     */
    public FloatColumn getScaleVector3() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("scale_vector[3]", FloatColumn::new) :
                getBinaryColumn("scale_vector[3]"));
    }
}
