package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompModelReference extends DelegatingCategory {
    public PdbxChemCompModelReference(Category delegate) {
        super(delegate);
    }

    /**
     * The component model identifier for this feature.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingStrColumn::new);
    }

    /**
     * The component model feature type.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The component feature value.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return delegate.getColumn("db_code", DelegatingStrColumn::new);
    }
}
