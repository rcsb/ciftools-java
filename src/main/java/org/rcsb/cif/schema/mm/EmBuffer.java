package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the BUFFER category
 * record details of the sample buffer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmBuffer extends DelegatingCategory {
    public EmBuffer(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "specimen_id":
                return getSpecimenId();
            case "name":
                return getName();
            case "details":
                return getDetails();
            case "pH":
                return getPH();
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
     * pointer to  _em_specimen.id
     * @return StrColumn
     */
    public StrColumn getSpecimenId() {
        return delegate.getColumn("specimen_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the buffer.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the buffer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The pH of the sample buffer.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return delegate.getColumn("pH", DelegatingFloatColumn::new);
    }

}