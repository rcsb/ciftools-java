package org.rcsb.cif.model.pdbxstructmsymgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructMsymGen extends BaseCategory {
    public PdbxStructMsymGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructMsymGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructMsymGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_struct_entity_inst.id in
     * the PDBX_STRUCT_ENTITY_INST category.
     * @return EntityInstId
     */
    public EntityInstId getEntityInstId() {
        return (EntityInstId) (isText ? textFields.computeIfAbsent("entity_inst_id",
                EntityInstId::new) : getBinaryColumn("entity_inst_id"));
    }

    /**
     * Uniquely identifies the this structure instance in
     * point symmetry unit.
     * @return MsymId
     */
    public MsymId getMsymId() {
        return (MsymId) (isText ? textFields.computeIfAbsent("msym_id",
                MsymId::new) : getBinaryColumn("msym_id"));
    }

    /**
     * Identifies the operation from category PDBX_STRUCT_OPER_LIST.
     * @return OperExpression
     */
    public OperExpression getOperExpression() {
        return (OperExpression) (isText ? textFields.computeIfAbsent("oper_expression",
                OperExpression::new) : getBinaryColumn("oper_expression"));
    }
}
