package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_CLASS_LINK category provides
 * details regarding the structural assembly classes. This
 * category provides a mechanism to identify the classes to which
 * structural assemblies belong.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStructAssemblyClassLink extends DelegatingCategory {
    public IhmStructAssemblyClassLink(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "class_id":
                return getClassId();
            case "assembly_id":
                return getAssemblyId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the structural assembly class.
     * This data item is a pointer to _ihm_struct_assembly_class.id
     * in the IHM_STRUCT_ASSEMBLY_CLASS category.
     * @return IntColumn
     */
    public IntColumn getClassId() {
        return delegate.getColumn("class_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural assembly.
     * This data item is a pointer to _ihm_struct_assembly.id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

}