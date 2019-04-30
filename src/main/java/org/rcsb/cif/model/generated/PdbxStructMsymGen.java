package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_MSYM_GEN category record details about
 * the generation of the minimal asymmetric unit. For instance, this
 * category can be used to provide this information for helical and point
 * symmetry systems.   The PDBX_STRUCT_MSYM_GEN data items provide the
 * specifications of the components that constitute the asymmetric unit
 * in terms of cartesian transformations of deposited coordinates.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntityInstId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_inst_id", StrColumn::new) :
                getBinaryColumn("entity_inst_id"));
    }

    /**
     * Uniquely identifies the this structure instance in
     * point symmetry unit.
     * @return StrColumn
     */
    public StrColumn getMsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("msym_id", StrColumn::new) :
                getBinaryColumn("msym_id"));
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
