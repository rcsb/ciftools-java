package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SAMPLE_SUPPORT category record details
 * of the electron microscope grid type, grid support film and pretreatment
 * of whole before sample is applied
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The support material covering the em grid.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getFilmMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("film_material", SingleRowStrColumn::new) :
                getBinaryColumn("film_material"));
    }

    /**
     * A description of the method used to produce the support film.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }

    /**
     * The name of the material from which the grid is made.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getGridMaterial() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("grid_material", SingleRowStrColumn::new) :
                getBinaryColumn("grid_material"));
    }

    /**
     * The value of the mesh size (divisions per inch) of the em grid.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getGridMeshSize() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("grid_mesh_size", SingleRowIntColumn::new) :
                getBinaryColumn("grid_mesh_size"));
    }

    /**
     * A description of the grid type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getGridType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("grid_type", SingleRowStrColumn::new) :
                getBinaryColumn("grid_type"));
    }

    /**
     * A description of the grid plus support film pretreatment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPretreatment() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pretreatment", SingleRowStrColumn::new) :
                getBinaryColumn("pretreatment"));
    }

    /**
     * Any additional details concerning the sample support.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the EM_SPECIMEN category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_id", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_id"));
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCitationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("citation_id", SingleRowStrColumn::new) :
                getBinaryColumn("citation_id"));
    }
}
