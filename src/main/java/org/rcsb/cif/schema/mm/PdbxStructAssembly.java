package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY category record details about
 * the structural elements that form macromolecular assemblies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssembly extends DelegatingCategory {
    public PdbxStructAssembly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "method_details":
                return getMethodDetails();
            case "oligomeric_details":
                return getOligomericDetails();
            case "oligomeric_count":
                return getOligomericCount();
            case "details":
                return getDetails();
            case "id":
                return getId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Provides details of the method used to determine or
     * compute the assembly.
     * @return StrColumn
     */
    public StrColumn getMethodDetails() {
        return delegate.getColumn("method_details", DelegatingStrColumn::new);
    }

    /**
     * Provides the details of the oligomeric state of the assembly.
     * @return StrColumn
     */
    public StrColumn getOligomericDetails() {
        return delegate.getColumn("oligomeric_details", DelegatingStrColumn::new);
    }

    /**
     * The number of polymer molecules in the assembly.
     * @return IntColumn
     */
    public IntColumn getOligomericCount() {
        return delegate.getColumn("oligomeric_count", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of the macromolecular assembly.
     * 
     * In the PDB, 'representative helical assembly', 'complete point assembly',
     * 'complete icosahedral assembly', 'software_defined_assembly', 'author_defined_assembly',
     * and 'author_and_software_defined_assembly' are considered "biologically relevant assemblies.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_struct_assembly.id must uniquely identify a record in
     * the PDBX_STRUCT_ASSEMBLY list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

}