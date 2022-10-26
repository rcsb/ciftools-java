package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items to describe films supporting the specimen
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSupportFilm extends DelegatingCategory {
    public EmSupportFilm(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "material":
                return getMaterial();
            case "sample_support_id":
                return getSampleSupportId();
            case "thickness":
                return getThickness();
            case "topology":
                return getTopology();
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
    public StrColumn getMaterial() {
        return delegate.getColumn("material", DelegatingStrColumn::new);
    }

    /**
     * Pointer to  EM SAMPLE SUPPORT
     * @return StrColumn
     */
    public StrColumn getSampleSupportId() {
        return delegate.getColumn("sample_support_id", DelegatingStrColumn::new);
    }

    /**
     * Thickness of the support film, in angstroms
     * @return FloatColumn
     */
    public FloatColumn getThickness() {
        return delegate.getColumn("thickness", DelegatingFloatColumn::new);
    }

    /**
     * The topology of the material from which the grid is made.
     * @return StrColumn
     */
    public StrColumn getTopology() {
        return delegate.getColumn("topology", DelegatingStrColumn::new);
    }

}