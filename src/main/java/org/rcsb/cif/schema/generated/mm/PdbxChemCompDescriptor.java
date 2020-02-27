package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_DESCRIPTOR category provide
 * string descriptors of component chemical structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompDescriptor extends DelegatingCategory {
    public PdbxChemCompDescriptor(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the descriptor value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return delegate.getColumn("descriptor", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the descriptor type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the descriptor.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return delegate.getColumn("program", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the descriptor.
     * @return StrColumn
     */
    public StrColumn getProgramVersion() {
        return delegate.getColumn("program_version", DelegatingStrColumn::new);
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }
}
