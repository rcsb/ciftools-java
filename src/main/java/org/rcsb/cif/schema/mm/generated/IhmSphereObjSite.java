package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_SPHERE_OBJ_SITE category records the details
 * of the spherical objects modeled in the integrative structural model.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmSphereObjSite extends BaseCategory {
    public IhmSphereObjSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmSphereObjSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmSphereObjSite(String name) {
        super(name);
    }

    /**
     * A unique identifier for this pseudo atom / sphere object.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * The entity identifier corresponding to this sphere object.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The leading sequence index corresponding to this sphere object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The trailing sequence index corresponding to this sphere object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }

    /**
     * An asym/strand identifier corresponding to this sphere object.
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The Cartesian X component corresponding to this sphere object.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * The Cartesian Y component corresponding to this sphere object.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * The Cartesian Z component corresponding to this sphere object.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * The radius associated with the primitive sphere object at this position.
     * @return FloatColumn
     */
    public FloatColumn getObjectRadius() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("object_radius", FloatColumn::new) :
                getBinaryColumn("object_radius"));
    }

    /**
     * The Root Mean Square Fluctuation (RMSF) observed in the primitive
     * sphere object at this position.
     * @return FloatColumn
     */
    public FloatColumn getRmsf() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("rmsf", FloatColumn::new) :
                getBinaryColumn("rmsf"));
    }

    /**
     * The model id corresponding to the sphere object.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("model_id", IntColumn::new) :
                getBinaryColumn("model_id"));
    }
}
