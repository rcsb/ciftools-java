package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_RELATED_DATA_SET category record references
 * to experimental data sets related to the entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRelatedExpDataSet extends DelegatingCategory {
    public PdbxRelatedExpDataSet(Category delegate) {
        super(delegate);
    }

    /**
     * Ordinal identifier for each related experimental data set.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A DOI reference to the related data set.
     * @return StrColumn
     */
    public StrColumn getDataReference() {
        return delegate.getColumn("data_reference", DelegatingStrColumn::new);
    }

    /**
     * A DOI reference to the metadata decribing the related data set.
     * @return StrColumn
     */
    public StrColumn getMetadataReference() {
        return delegate.getColumn("metadata_reference", DelegatingStrColumn::new);
    }

    /**
     * The type of the experimenatal data set.
     * @return StrColumn
     */
    public StrColumn getDataSetType() {
        return delegate.getColumn("data_set_type", DelegatingStrColumn::new);
    }

    /**
     * Additional details describing the content of the related data set and its application to
     * the current investigation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }
}
