package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_STRUCT_ASSEMBLY_DETAILS category provides
 * additional details regarding the structure assembly.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaStructAssemblyDetails extends DelegatingCategory {
    public MaStructAssemblyDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "assembly_id":
                return getAssemblyId();
            case "assembly_name":
                return getAssemblyName();
            case "assembly_description":
                return getAssemblyDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the structural assembly.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * A name for the structural assembly.
     * @return StrColumn
     */
    public StrColumn getAssemblyName() {
        return delegate.getColumn("assembly_name", DelegatingStrColumn::new);
    }

    /**
     * Description of the structural assembly.
     * @return StrColumn
     */
    public StrColumn getAssemblyDescription() {
        return delegate.getColumn("assembly_description", DelegatingStrColumn::new);
    }

}