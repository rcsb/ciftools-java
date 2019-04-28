package org.rcsb.cif.model.generated.pdbxentityfuncregulatory;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityFuncRegulatory extends BaseCategory {
    public PdbxEntityFuncRegulatory(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityFuncRegulatory(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityFuncRegulatory(String name) {
        super(name);
    }

    /**
     * This data item is pointer to _pdbx_entity_func_bind_mode.id in the
     * PDBX_ENTITY_FUNC_BIND_MODE category.
     * @return BindModeId
     */
    public BindModeId getBindModeId() {
        return (BindModeId) (isText ? textFields.computeIfAbsent("bind_mode_id",
                BindModeId::new) : getBinaryColumn("bind_mode_id"));
    }

    /**
     * This data item describes the type of regulatory function.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
