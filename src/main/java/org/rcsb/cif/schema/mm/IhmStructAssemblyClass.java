package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_CLASS category lists
 * all the structural assembly classes relevant to the entry. This
 * category provides a mechanism to define classes of the
 * structural assemblies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStructAssemblyClass extends DelegatingCategory {
    public IhmStructAssemblyClass(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "name":
                return getName();
            case "type":
                return getType();
            case "description":
                return getDescription();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the structural assembly class.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A user provided name for the class.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * The type of classifier.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Additional description regarding the class.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

}