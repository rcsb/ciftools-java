package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_CLASS category provides
 * details regarding the structural assembly classes. This
 * category provides a mechanism to identify the classes to which
 * structural assemblies belong.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStructAssemblyClass extends DelegatingCategory {
    public IhmStructAssemblyClass(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural assembly class.
     * This data item is a pointer to _ihm_struct_assembly_class_list.class_id
     * in the IHM_STRUCT_ASSEMBLY_CLASS_LIST category.
     * @return IntColumn
     */
    public IntColumn getClassId() {
        return delegate.getColumn("class_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural assembly.
     * This data item is a pointer to _ihm_struct_assembly.assembly_id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }
}
