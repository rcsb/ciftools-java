package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
 * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
 * data items provide the specifications of the components that
 * constitute that assembly in terms of cartesian transformations.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructAssemblyGen extends DelegatingCategory {
    public PdbxStructAssemblyGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_inst_id":
                return getEntityInstId();
            case "asym_id_list":
                return getAsymIdList();
            case "auth_asym_id_list":
                return getAuthAsymIdList();
            case "assembly_id":
                return getAssemblyId();
            case "oper_expression":
                return getOperExpression();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _pdbx_struct_entity_inst.id in
     * the PDBX_STRUCT_ENTITY_INST category.
     * 
     * This item may be expressed as a comma separated list of instance identifiers.
     * @return StrColumn
     */
    public StrColumn getEntityInstId() {
        return delegate.getColumn("entity_inst_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_asym.id in
     * the STRUCT_ASYM category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getAsymIdList() {
        return delegate.getColumn("asym_id_list", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in
     * the ATOM_SITE category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getAuthAsymIdList() {
        return delegate.getColumn("auth_asym_id_list", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _pdbx_struct_assembly.id in the
     * PDBX_STRUCT_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Identifies the operation of collection of operations
     * from category PDBX_STRUCT_OPER_LIST.
     * 
     * Operation expressions may have the forms:
     * 
     * (1)        the single operation 1
     * (1,2,5)    the operations 1, 2, 5
     * (1-4)      the operations 1,2,3 and 4
     * (1,2)(3,4) the combinations of operations
     * 3 and 4 followed by 1 and 2 (i.e.
     * the cartesian product of parenthetical
     * groups applied from right to left)
     * @return StrColumn
     */
    public StrColumn getOperExpression() {
        return delegate.getColumn("oper_expression", DelegatingStrColumn::new);
    }

}