package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_ASYM_GEN category record details about
 * the generation of the crystallographic asymmetric unit. The
 * PDBX_STRUCT_ASYM_GEN data items provide the specifications of the
 * components that constitute the asymmetric unit in terms of cartesian
 * transformations of deposited coordinates.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxStructAsymGen extends BaseCategory {
    public PdbxStructAsymGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructAsymGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructAsymGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_struct_entity_inst.id in
     * the PDBX_STRUCT_ENTITY_INST category.
     * @return StrColumn
     */
    public StrColumn getEntityInstId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_inst_id", StrColumn::new) :
                getBinaryColumn("entity_inst_id"));
    }

    /**
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * Identifies the operation from category PDBX_STRUCT_OPER_LIST.
     * @return StrColumn
     */
    public StrColumn getOperExpression() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("oper_expression", StrColumn::new) :
                getBinaryColumn("oper_expression"));
    }
}
