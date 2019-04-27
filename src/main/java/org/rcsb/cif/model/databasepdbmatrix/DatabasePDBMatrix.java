package org.rcsb.cif.model.databasepdbmatrix;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx11
     */
    public Origx11 getOrigx11() {
        return (Origx11) (isText ? textFields.computeIfAbsent("origx[1][1]",
                Origx11::new) : getBinaryColumn("origx[1][1]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx12
     */
    public Origx12 getOrigx12() {
        return (Origx12) (isText ? textFields.computeIfAbsent("origx[1][2]",
                Origx12::new) : getBinaryColumn("origx[1][2]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx13
     */
    public Origx13 getOrigx13() {
        return (Origx13) (isText ? textFields.computeIfAbsent("origx[1][3]",
                Origx13::new) : getBinaryColumn("origx[1][3]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx21
     */
    public Origx21 getOrigx21() {
        return (Origx21) (isText ? textFields.computeIfAbsent("origx[2][1]",
                Origx21::new) : getBinaryColumn("origx[2][1]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx22
     */
    public Origx22 getOrigx22() {
        return (Origx22) (isText ? textFields.computeIfAbsent("origx[2][2]",
                Origx22::new) : getBinaryColumn("origx[2][2]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx23
     */
    public Origx23 getOrigx23() {
        return (Origx23) (isText ? textFields.computeIfAbsent("origx[2][3]",
                Origx23::new) : getBinaryColumn("origx[2][3]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx31
     */
    public Origx31 getOrigx31() {
        return (Origx31) (isText ? textFields.computeIfAbsent("origx[3][1]",
                Origx31::new) : getBinaryColumn("origx[3][1]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx32
     */
    public Origx32 getOrigx32() {
        return (Origx32) (isText ? textFields.computeIfAbsent("origx[3][2]",
                Origx32::new) : getBinaryColumn("origx[3][2]"));
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return Origx33
     */
    public Origx33 getOrigx33() {
        return (Origx33) (isText ? textFields.computeIfAbsent("origx[3][3]",
                Origx33::new) : getBinaryColumn("origx[3][3]"));
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return OrigxVector1
     */
    public OrigxVector1 getOrigxVector1() {
        return (OrigxVector1) (isText ? textFields.computeIfAbsent("origx_vector[1]",
                OrigxVector1::new) : getBinaryColumn("origx_vector[1]"));
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return OrigxVector2
     */
    public OrigxVector2 getOrigxVector2() {
        return (OrigxVector2) (isText ? textFields.computeIfAbsent("origx_vector[2]",
                OrigxVector2::new) : getBinaryColumn("origx_vector[2]"));
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return OrigxVector3
     */
    public OrigxVector3 getOrigxVector3() {
        return (OrigxVector3) (isText ? textFields.computeIfAbsent("origx_vector[3]",
                OrigxVector3::new) : getBinaryColumn("origx_vector[3]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale11
     */
    public Scale11 getScale11() {
        return (Scale11) (isText ? textFields.computeIfAbsent("scale[1][1]",
                Scale11::new) : getBinaryColumn("scale[1][1]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale12
     */
    public Scale12 getScale12() {
        return (Scale12) (isText ? textFields.computeIfAbsent("scale[1][2]",
                Scale12::new) : getBinaryColumn("scale[1][2]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale13
     */
    public Scale13 getScale13() {
        return (Scale13) (isText ? textFields.computeIfAbsent("scale[1][3]",
                Scale13::new) : getBinaryColumn("scale[1][3]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale21
     */
    public Scale21 getScale21() {
        return (Scale21) (isText ? textFields.computeIfAbsent("scale[2][1]",
                Scale21::new) : getBinaryColumn("scale[2][1]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale22
     */
    public Scale22 getScale22() {
        return (Scale22) (isText ? textFields.computeIfAbsent("scale[2][2]",
                Scale22::new) : getBinaryColumn("scale[2][2]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale23
     */
    public Scale23 getScale23() {
        return (Scale23) (isText ? textFields.computeIfAbsent("scale[2][3]",
                Scale23::new) : getBinaryColumn("scale[2][3]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale31
     */
    public Scale31 getScale31() {
        return (Scale31) (isText ? textFields.computeIfAbsent("scale[3][1]",
                Scale31::new) : getBinaryColumn("scale[3][1]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale32
     */
    public Scale32 getScale32() {
        return (Scale32) (isText ? textFields.computeIfAbsent("scale[3][2]",
                Scale32::new) : getBinaryColumn("scale[3][2]"));
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return Scale33
     */
    public Scale33 getScale33() {
        return (Scale33) (isText ? textFields.computeIfAbsent("scale[3][3]",
                Scale33::new) : getBinaryColumn("scale[3][3]"));
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return ScaleVector1
     */
    public ScaleVector1 getScaleVector1() {
        return (ScaleVector1) (isText ? textFields.computeIfAbsent("scale_vector[1]",
                ScaleVector1::new) : getBinaryColumn("scale_vector[1]"));
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return ScaleVector2
     */
    public ScaleVector2 getScaleVector2() {
        return (ScaleVector2) (isText ? textFields.computeIfAbsent("scale_vector[2]",
                ScaleVector2::new) : getBinaryColumn("scale_vector[2]"));
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return ScaleVector3
     */
    public ScaleVector3 getScaleVector3() {
        return (ScaleVector3) (isText ? textFields.computeIfAbsent("scale_vector[3]",
                ScaleVector3::new) : getBinaryColumn("scale_vector[3]"));
    }
}
