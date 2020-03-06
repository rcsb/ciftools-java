package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompFeature extends DelegatingCategory {
    public PdbxChemCompFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "comp_id":
                return getCompId();
            case "type":
                return getType();
            case "support":
                return getSupport();
            case "value":
                return getValue();
            case "source":
                return getSource();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The component identifier for this feature.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The component feature type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The supporting evidence for this feature.
     * @return StrColumn
     */
    public StrColumn getSupport() {
        return delegate.getColumn("support", DelegatingStrColumn::new);
    }

    /**
     * The component feature value.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * The information source for the component feature.
     * @return StrColumn
     */
    public StrColumn getSource() {
        return delegate.getColumn("source", DelegatingStrColumn::new);
    }

}