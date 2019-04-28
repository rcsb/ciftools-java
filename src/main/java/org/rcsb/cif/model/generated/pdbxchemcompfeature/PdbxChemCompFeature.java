package org.rcsb.cif.model.generated.pdbxchemcompfeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompFeature extends BaseCategory {
    public PdbxChemCompFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompFeature(String name) {
        super(name);
    }

    /**
     * The component identifier for this feature.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * The component feature type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The supporting evidence for this feature.
     * @return Support
     */
    public Support getSupport() {
        return (Support) (isText ? textFields.computeIfAbsent("support",
                Support::new) : getBinaryColumn("support"));
    }

    /**
     * The component feature value.
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * The information source for the component feature.
     * @return Source
     */
    public Source getSource() {
        return (Source) (isText ? textFields.computeIfAbsent("source",
                Source::new) : getBinaryColumn("source"));
    }
}
