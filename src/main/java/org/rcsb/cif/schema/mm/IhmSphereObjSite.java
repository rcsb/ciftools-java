package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_SPHERE_OBJ_SITE category records the details
 * of the spherical objects modeled in the integrative structural model.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmSphereObjSite extends DelegatingCategory {
    public IhmSphereObjSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "seq_id_begin":
                return getSeqIdBegin();
            case "seq_id_end":
                return getSeqIdEnd();
            case "asym_id":
                return getAsymId();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_z":
                return getCartnZ();
            case "object_radius":
                return getObjectRadius();
            case "rmsf":
                return getRmsf();
            case "model_id":
                return getModelId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this pseudo atom / sphere object.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier corresponding to this sphere object.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The leading sequence index corresponding to this sphere object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The trailing sequence index corresponding to this sphere object.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * An asym/strand identifier corresponding to this sphere object.
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The Cartesian X component corresponding to this sphere object.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Y component corresponding to this sphere object.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The Cartesian Z component corresponding to this sphere object.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The radius associated with the primitive sphere object at this position.
     * @return FloatColumn
     */
    public FloatColumn getObjectRadius() {
        return delegate.getColumn("object_radius", DelegatingFloatColumn::new);
    }

    /**
     * The Root Mean Square Fluctuation (RMSF) observed in the primitive
     * sphere object at this position.
     * @return FloatColumn
     */
    public FloatColumn getRmsf() {
        return delegate.getColumn("rmsf", DelegatingFloatColumn::new);
    }

    /**
     * The model id corresponding to the sphere object.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

}