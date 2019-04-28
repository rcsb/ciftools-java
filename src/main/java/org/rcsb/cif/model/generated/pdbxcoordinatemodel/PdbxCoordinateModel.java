package org.rcsb.cif.model.generated.pdbxcoordinatemodel;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxCoordinateModel extends BaseCategory {
    public PdbxCoordinateModel(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxCoordinateModel(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxCoordinateModel(String name) {
        super(name);
    }

    /**
     * A reference to _struct_asym.id.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * A classification of the composition of the coordinate model.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
