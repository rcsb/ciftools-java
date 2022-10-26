package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_SINGLE_PARTICLE_ENTITY category provide
 * the details of the symmetry for a single particle entity type.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSingleParticleEntity extends DelegatingCategory {
    public EmSingleParticleEntity(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "symmetry_type":
                return getSymmetryType();
            case "image_processing_id":
                return getImageProcessingId();
            case "point_symmetry":
                return getPointSymmetry();
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
     * PRIMARY KEY
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The single particle symmetry type.
     * @return StrColumn
     */
    public StrColumn getSymmetryType() {
        return delegate.getColumn("symmetry_type", DelegatingStrColumn::new);
    }

    /**
     * pointer to _em_image_processing.id.
     * @return StrColumn
     */
    public StrColumn getImageProcessingId() {
        return delegate.getColumn("image_processing_id", DelegatingStrColumn::new);
    }

    /**
     * Point symmetry symbol, either Cn, Dn, T, O, or I
     * @return StrColumn
     */
    public StrColumn getPointSymmetry() {
        return delegate.getColumn("point_symmetry", DelegatingStrColumn::new);
    }

}