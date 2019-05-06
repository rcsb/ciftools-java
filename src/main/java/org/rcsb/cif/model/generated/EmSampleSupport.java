package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SAMPLE_SUPPORT category record details
 * of the electron microscope grid type, grid support film and pretreatment
 * of whole before sample is applied
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmSampleSupport extends BaseCategory {
    public EmSampleSupport(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSampleSupport(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSampleSupport(String name) {
        super(name);
    }

    /**
     * The value of _em_sample_support.id must uniquely identify
     * the sample support.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The support material covering the em grid.
     * @return StrColumn
     */
    public StrColumn getFilmMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("film_material", StrColumn::new) :
                getBinaryColumn("film_material"));
    }

    /**
     * A description of the method used to produce the support film.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The name of the material from which the grid is made.
     * @return StrColumn
     */
    public StrColumn getGridMaterial() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("grid_material", StrColumn::new) :
                getBinaryColumn("grid_material"));
    }

    /**
     * The value of the mesh size (divisions per inch) of the em grid.
     * @return IntColumn
     */
    public IntColumn getGridMeshSize() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("grid_mesh_size", IntColumn::new) :
                getBinaryColumn("grid_mesh_size"));
    }

    /**
     * A description of the grid type.
     * @return StrColumn
     */
    public StrColumn getGridType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("grid_type", StrColumn::new) :
                getBinaryColumn("grid_type"));
    }

    /**
     * A description of the grid plus support film pretreatment.
     * @return StrColumn
     */
    public StrColumn getPretreatment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pretreatment", StrColumn::new) :
                getBinaryColumn("pretreatment"));
    }

    /**
     * Any additional details concerning the sample support.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the EM_SPECIMEN category.
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_id", StrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }
}
