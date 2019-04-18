package org.rcsb.cif.model.pdbxstructassemblygen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
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
     * This data item is a pointer to _struct_asym.id in
     * the STRUCT_ASYM category.
     * 
     * This item may be expressed as a comma separated list of identifiers.
     * @return AsymIdList
     */
    public AsymIdList getAsymIdList() {
        return (AsymIdList) (isText ? getTextColumn("asym_id_list") : getBinaryColumn("asym_id_list"));
    }

    /**
     * This data item is a pointer to _pdbx_struct_assembly.id in the
     * PDBX_STRUCT_ASSEMBLY category.
     * @return AssemblyId
     */
    public AssemblyId getAssemblyId() {
        return (AssemblyId) (isText ? getTextColumn("assembly_id") : getBinaryColumn("assembly_id"));
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
     * @return OperExpression
     */
    public OperExpression getOperExpression() {
        return (OperExpression) (isText ? getTextColumn("oper_expression") : getBinaryColumn("oper_expression"));
    }
}
