package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_ASSEMBLY category record details
 * about the imaged EM sample.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmAssembly extends DelegatingCategory {
    public EmAssembly(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _em_assembly.id must uniquely identify
     * a collection of observed complexes.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The name of the assembly of observed complexes.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * A description of the aggregation state of the assembly.
     * @return StrColumn
     */
    public StrColumn getAggregationState() {
        return delegate.getColumn("aggregation_state", DelegatingStrColumn::new);
    }

    /**
     * The composition of the assembly.
     * @return StrColumn
     */
    public StrColumn getComposition() {
        return delegate.getColumn("composition", DelegatingStrColumn::new);
    }

    /**
     * The number of components of the biological assembly.
     * @return IntColumn
     */
    public IntColumn getNumComponents() {
        return delegate.getColumn("num_components", DelegatingIntColumn::new);
    }

    /**
     * The value (in megadaltons) of the experimentally
     * determined molecular weight of the assembly.
     * @return FloatColumn
     */
    public FloatColumn getMolWtExp() {
        return delegate.getColumn("mol_wt_exp", DelegatingFloatColumn::new);
    }

    /**
     * The value (in megadaltons) of the theoretically
     * determined molecular weight of the assembly.
     * @return FloatColumn
     */
    public FloatColumn getMolWtTheo() {
        return delegate.getColumn("mol_wt_theo", DelegatingFloatColumn::new);
    }

    /**
     * The method used to determine the molecular weight.
     * @return StrColumn
     */
    public StrColumn getMolWtMethod() {
        return delegate.getColumn("mol_wt_method", DelegatingStrColumn::new);
    }

    /**
     * Any additional details describing the imaged sample.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
