package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_DEPOSITOR INFO category record parameters for EM depositions
 * that are provided by the depositor
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmDepositorInfo extends DelegatingCategory {
    public EmDepositorInfo(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The selected EM experimental method.
     * @return StrColumn
     */
    public StrColumn getEmMethodSelection() {
        return delegate.getColumn("em_method_selection", DelegatingStrColumn::new);
    }

    /**
     * Records whether molecular/polymer entities of the EM sample will be described.
     * @return StrColumn
     */
    public StrColumn getMolecularDescriptionFlag() {
        return delegate.getColumn("molecular_description_flag", DelegatingStrColumn::new);
    }
}
