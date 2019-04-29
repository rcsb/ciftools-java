package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_FUNC_ENZYME category describe
 * characteristics of protein oligonucleotide binding in which
 * the binding mode is enzymatic.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntityFuncEnzyme extends BaseCategory {
    public PdbxEntityFuncEnzyme(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityFuncEnzyme(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityFuncEnzyme(String name) {
        super(name);
    }

    /**
     * This data item is pointer to _pdbx_entity_func_bind_mode.id in the
     * PDBX_ENTITY_FUNC_BIND_MODE category.
     * @return StrColumn
     */
    public StrColumn getBindModeId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("bind_mode_id", StrColumn::new) :
                getBinaryColumn("bind_mode_id"));
    }

    /**
     * This data item describes the type of enzyme function.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
