package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
 * about structural features of the NA.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNaStructKeywds extends DelegatingCategory {
    public PdbxNaStructKeywds(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Provides overall idea about conformation type of NA.  Also,
     * it identifies tRNAs by assigning a 'T' here.
     * @return StrColumn
     */
    public StrColumn getConformationType() {
        return delegate.getColumn("conformation_type", DelegatingStrColumn::new);
    }

    /**
     * Gives general structural description of NA.
     * @return StrColumn
     */
    public StrColumn getStrandDescription() {
        return delegate.getColumn("strand_description", DelegatingStrColumn::new);
    }

    /**
     * Describes special features of NA.
     * @return StrColumn
     */
    public StrColumn getSpecialFeature() {
        return delegate.getColumn("special_feature", DelegatingStrColumn::new);
    }
}
