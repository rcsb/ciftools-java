package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Listing of all structure factor files associated with the EM entry
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmStructureFactors extends DelegatingCategory {
    public EmStructureFactors(Category delegate) {
        super(delegate);
    }

    /**
     * Details about the structure factor file.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to the EM EXPERIMENT category.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return delegate.getColumn("experiment_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the structure factor file associated with the map entry
     * @return StrColumn
     */
    public StrColumn getFile() {
        return delegate.getColumn("file", DelegatingStrColumn::new);
    }

    /**
     * This data item is the unique identifier for the structure factor file.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }
}
