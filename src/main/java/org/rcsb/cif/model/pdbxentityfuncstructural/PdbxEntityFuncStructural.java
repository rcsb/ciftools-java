package org.rcsb.cif.model.pdbxentityfuncstructural;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityFuncStructural extends BaseCategory {
    public PdbxEntityFuncStructural(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityFuncStructural(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityFuncStructural(String name) {
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
     * This data item describes the type of structural function.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
