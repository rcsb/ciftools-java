package org.rcsb.cif.model.pdbxserialcrystallographysampledelivery;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSerialCrystallographySampleDelivery extends BaseCategory {
    public PdbxSerialCrystallographySampleDelivery(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSerialCrystallographySampleDelivery(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSerialCrystallographySampleDelivery(String name) {
        super(name);
    }

    /**
     * The data item is a pointer to _diffrn.id in the DIFFRN
     * category.
     * @return DiffrnId
     */
    public DiffrnId getDiffrnId() {
        return (DiffrnId) (isText ? textFields.computeIfAbsent("diffrn_id",
                DiffrnId::new) : getBinaryColumn("diffrn_id"));
    }

    /**
     * The description of the mechanism by which the specimen in placed in the path
     * of the source.
     * @return Description
     */
    public Description getDescription() {
        return (Description) (isText ? textFields.computeIfAbsent("description",
                Description::new) : getBinaryColumn("description"));
    }

    /**
     * The description of the mechanism by which the specimen in placed in the path
     * of the source.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }
}
