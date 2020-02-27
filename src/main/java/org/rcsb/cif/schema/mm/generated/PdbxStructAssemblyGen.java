package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ASSEMBLY_GEN category record details about
 * the generation of each macromolecular assemblies. The PDBX_STRUCT_ASSEMBLY_GEN
 * data items provide the specifications of the components that
 * constitute that assembly in terms of cartesian transformations.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAssemblyGen extends BaseCategory {
    public PdbxStructAssemblyGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAssemblyGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAssemblyGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_struct_entity_inst.id in
     * the PDBX_STRUCT_ENTITY_INST category.
     * 
     * This item may be expressed as a comma separated list of instance identifiers.
     * @return StrColumn
     */
    public StrColumn getEntityInstId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_inst_id", StrColumn::new) :
                getBinaryColumn("entity_inst_id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in
     * the STRUCT_ASYM category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getAsymIdList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id_list", StrColumn::new) :
                getBinaryColumn("asym_id_list"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in
     * the ATOM_SITE category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return StrColumn
     */
    public StrColumn getAuthAsymIdList() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id_list", StrColumn::new) :
                getBinaryColumn("auth_asym_id_list"));
    }

    /**
     * This data item is a pointer to _pdbx_struct_assembly.id in the
     * PDBX_STRUCT_ASSEMBLY category.
     * @return StrColumn
     */
    public StrColumn getAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("assembly_id", StrColumn::new) :
                getBinaryColumn("assembly_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("oper_expression", StrColumn::new) :
                getBinaryColumn("oper_expression"));
    }
}
