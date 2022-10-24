package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_SAMPLE_SUPPORT category record details
 * of the electron microscope grid type, grid support film and pretreatment
 * of whole before sample is applied
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSampleSupport extends DelegatingCategory {
    public EmSampleSupport(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "film_material":
                return getFilmMaterial();
            case "method":
                return getMethod();
            case "grid_material":
                return getGridMaterial();
            case "grid_mesh_size":
                return getGridMeshSize();
            case "grid_type":
                return getGridType();
            case "pretreatment":
                return getPretreatment();
            case "details":
                return getDetails();
            case "specimen_id":
                return getSpecimenId();
            case "citation_id":
                return getCitationId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The support material covering the em grid.
     * @return StrColumn
     */
    public StrColumn getFilmMaterial() {
        return delegate.getColumn("film_material", DelegatingStrColumn::new);
    }

    /**
     * A description of the method used to produce the support film.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The name of the material from which the grid is made.
     * @return StrColumn
     */
    public StrColumn getGridMaterial() {
        return delegate.getColumn("grid_material", DelegatingStrColumn::new);
    }

    /**
     * The value of the mesh size (divisions per inch) of the em grid.
     * @return IntColumn
     */
    public IntColumn getGridMeshSize() {
        return delegate.getColumn("grid_mesh_size", DelegatingIntColumn::new);
    }

    /**
     * A description of the grid type.
     * @return StrColumn
     */
    public StrColumn getGridType() {
        return delegate.getColumn("grid_type", DelegatingStrColumn::new);
    }

    /**
     * A description of the grid plus support film pretreatment.
     * @return StrColumn
     */
    public StrColumn getPretreatment() {
        return delegate.getColumn("pretreatment", DelegatingStrColumn::new);
    }

    /**
     * Any additional details concerning the sample support.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the EM_SPECIMEN category.
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
    }

}