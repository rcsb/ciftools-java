package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompModelReference extends BaseCategory {
    public PdbxChemCompModelReference(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModelReference(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModelReference(String name) {
        super(name);
    }

    /**
     * The component model identifier for this feature.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getModelId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("model_id", SingleRowStrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The component model feature type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbName() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_name", SingleRowStrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * The component feature value.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDbCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("db_code", SingleRowStrColumn::new) :
                getBinaryColumn("db_code"));
    }
}
