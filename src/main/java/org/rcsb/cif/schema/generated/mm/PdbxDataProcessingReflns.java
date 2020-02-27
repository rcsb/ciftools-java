package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Details of reflections used in data processing.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDataProcessingReflns extends DelegatingCategory {
    public PdbxDataProcessingReflns(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_data_processing_reflns.entry_id identifies the data block.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Total number of reflections used in data processing.
     * @return IntColumn
     */
    public IntColumn getNumberAll() {
        return delegate.getColumn("number_all", DelegatingIntColumn::new);
    }

    /**
     * Total number of reflections marked for rejection in data processing.
     * @return IntColumn
     */
    public IntColumn getNumberMarkedReject() {
        return delegate.getColumn("number_marked_reject", DelegatingIntColumn::new);
    }

    /**
     * Percent of reflections marked for rejection in data processing.
     * @return FloatColumn
     */
    public FloatColumn getPercentMarkedReject() {
        return delegate.getColumn("percent_marked_reject", DelegatingFloatColumn::new);
    }

    /**
     * Percent of reflections rejected in data processing.
     * @return FloatColumn
     */
    public FloatColumn getPercentRejected() {
        return delegate.getColumn("percent_rejected", DelegatingFloatColumn::new);
    }

    /**
     * Total linear R factor in data processing.
     * @return FloatColumn
     */
    public FloatColumn getRFactorAllLinear() {
        return delegate.getColumn("R_factor_all_linear", DelegatingFloatColumn::new);
    }
}
