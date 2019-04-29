package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SERIAL_CRYSTALLOGRAPHY_SAMPLE_DELIVERY category
 * record general details about the sample delivery
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDiffrnId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("diffrn_id", SingleRowStrColumn::new) :
                getBinaryColumn("diffrn_id"));
    }

    /**
     * The description of the mechanism by which the specimen in placed in the path
     * of the source.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDescription() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("description", SingleRowStrColumn::new) :
                getBinaryColumn("description"));
    }

    /**
     * The description of the mechanism by which the specimen in placed in the path
     * of the source.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("method", SingleRowStrColumn::new) :
                getBinaryColumn("method"));
    }
}
