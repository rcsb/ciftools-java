package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_IDENTIFIER category provide
 * identifiers for chemical components.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompIdentifier extends DelegatingCategory {
    public PdbxChemCompIdentifier(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "comp_id":
                return getCompId();
            case "identifier":
                return getIdentifier();
            case "type":
                return getType();
            case "program":
                return getProgram();
            case "program_version":
                return getProgramVersion();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
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
     * This data item contains the identifier value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getIdentifier() {
        return delegate.getColumn("identifier", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the identifier type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the identifier.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return delegate.getColumn("program", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the identifier.
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