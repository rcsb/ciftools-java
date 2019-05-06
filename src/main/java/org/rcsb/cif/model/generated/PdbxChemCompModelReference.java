package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Additional features associated with the chemical component.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The component model feature type.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * The component feature value.
     * @return StrColumn
     */
    public StrColumn getDbCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_code", StrColumn::new) :
                getBinaryColumn("db_code"));
    }
}
