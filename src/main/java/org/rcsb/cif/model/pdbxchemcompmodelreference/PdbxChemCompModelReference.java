package org.rcsb.cif.model.pdbxchemcompmodelreference;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * The component model feature type.
     * @return DbName
     */
    public DbName getDbName() {
        return (DbName) (isText ? textFields.computeIfAbsent("db_name",
                DbName::new) : getBinaryColumn("db_name"));
    }

    /**
     * The component feature value.
     * @return DbCode
     */
    public DbCode getDbCode() {
        return (DbCode) (isText ? textFields.computeIfAbsent("db_code",
                DbCode::new) : getBinaryColumn("db_code"));
    }
}
