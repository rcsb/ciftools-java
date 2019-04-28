package org.rcsb.cif.model.generated.emsamplesupport;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The support material covering the em grid.
     * @return FilmMaterial
     */
    public FilmMaterial getFilmMaterial() {
        return (FilmMaterial) (isText ? textFields.computeIfAbsent("film_material",
                FilmMaterial::new) : getBinaryColumn("film_material"));
    }

    /**
     * A description of the method used to produce the support film.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The name of the material from which the grid is made.
     * @return GridMaterial
     */
    public GridMaterial getGridMaterial() {
        return (GridMaterial) (isText ? textFields.computeIfAbsent("grid_material",
                GridMaterial::new) : getBinaryColumn("grid_material"));
    }

    /**
     * The value of the mesh size (divisions per inch) of the em grid.
     * @return GridMeshSize
     */
    public GridMeshSize getGridMeshSize() {
        return (GridMeshSize) (isText ? textFields.computeIfAbsent("grid_mesh_size",
                GridMeshSize::new) : getBinaryColumn("grid_mesh_size"));
    }

    /**
     * A description of the grid type.
     * @return GridType
     */
    public GridType getGridType() {
        return (GridType) (isText ? textFields.computeIfAbsent("grid_type",
                GridType::new) : getBinaryColumn("grid_type"));
    }

    /**
     * A description of the grid plus support film pretreatment.
     * @return Pretreatment
     */
    public Pretreatment getPretreatment() {
        return (Pretreatment) (isText ? textFields.computeIfAbsent("pretreatment",
                Pretreatment::new) : getBinaryColumn("pretreatment"));
    }

    /**
     * Any additional details concerning the sample support.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to _em_sample_preparation.id in the EM_SPECIMEN category.
     * @return SpecimenId
     */
    public SpecimenId getSpecimenId() {
        return (SpecimenId) (isText ? textFields.computeIfAbsent("specimen_id",
                SpecimenId::new) : getBinaryColumn("specimen_id"));
    }

    /**
     * This data item is a pointer to _citation.id
     * in the CITATION category.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }
}
