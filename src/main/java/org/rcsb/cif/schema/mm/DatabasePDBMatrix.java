package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The DATABASE_PDB_MATRIX category provides placeholders for
 * transformation matrices and vectors used by the Protein Data
 * Bank (PDB).
 * 
 * These data items are included only for consistency with older
 * PDB format files. They should appear in a data block only if
 * that data block was created by reformatting a PDB format file.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DatabasePDBMatrix extends DelegatingCategory {
    public DatabasePDBMatrix(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "origx[1][1]":
                return getOrigx11();
            case "origx[1][2]":
                return getOrigx12();
            case "origx[1][3]":
                return getOrigx13();
            case "origx[2][1]":
                return getOrigx21();
            case "origx[2][2]":
                return getOrigx22();
            case "origx[2][3]":
                return getOrigx23();
            case "origx[3][1]":
                return getOrigx31();
            case "origx[3][2]":
                return getOrigx32();
            case "origx[3][3]":
                return getOrigx33();
            case "origx_vector[1]":
                return getOrigxVector1();
            case "origx_vector[2]":
                return getOrigxVector2();
            case "origx_vector[3]":
                return getOrigxVector3();
            case "scale[1][1]":
                return getScale11();
            case "scale[1][2]":
                return getScale12();
            case "scale[1][3]":
                return getScale13();
            case "scale[2][1]":
                return getScale21();
            case "scale[2][2]":
                return getScale22();
            case "scale[2][3]":
                return getScale23();
            case "scale[3][1]":
                return getScale31();
            case "scale[3][2]":
                return getScale32();
            case "scale[3][3]":
                return getScale33();
            case "scale_vector[1]":
                return getScaleVector1();
            case "scale_vector[2]":
                return getScaleVector2();
            case "scale_vector[3]":
                return getScaleVector3();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx11() {
        return delegate.getColumn("origx[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx12() {
        return delegate.getColumn("origx[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx13() {
        return delegate.getColumn("origx[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx21() {
        return delegate.getColumn("origx[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx22() {
        return delegate.getColumn("origx[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx23() {
        return delegate.getColumn("origx[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx31() {
        return delegate.getColumn("origx[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx32() {
        return delegate.getColumn("origx[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX matrix.
     * @return FloatColumn
     */
    public FloatColumn getOrigx33() {
        return delegate.getColumn("origx[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return FloatColumn
     */
    public FloatColumn getOrigxVector1() {
        return delegate.getColumn("origx_vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return FloatColumn
     */
    public FloatColumn getOrigxVector2() {
        return delegate.getColumn("origx_vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB ORIGX vector.
     * @return FloatColumn
     */
    public FloatColumn getOrigxVector3() {
        return delegate.getColumn("origx_vector[3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale11() {
        return delegate.getColumn("scale[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale12() {
        return delegate.getColumn("scale[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale13() {
        return delegate.getColumn("scale[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale21() {
        return delegate.getColumn("scale[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale22() {
        return delegate.getColumn("scale[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale23() {
        return delegate.getColumn("scale[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale31() {
        return delegate.getColumn("scale[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale32() {
        return delegate.getColumn("scale[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE matrix.
     * @return FloatColumn
     */
    public FloatColumn getScale33() {
        return delegate.getColumn("scale[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return FloatColumn
     */
    public FloatColumn getScaleVector1() {
        return delegate.getColumn("scale_vector[1]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return FloatColumn
     */
    public FloatColumn getScaleVector2() {
        return delegate.getColumn("scale_vector[2]", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the PDB SCALE vector.
     * @return FloatColumn
     */
    public FloatColumn getScaleVector3() {
        return delegate.getColumn("scale_vector[3]", DelegatingFloatColumn::new);
    }

}