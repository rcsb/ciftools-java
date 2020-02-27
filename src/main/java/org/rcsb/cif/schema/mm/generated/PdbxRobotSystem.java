package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The details about each robotic system used to collect data for this
 * project.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxRobotSystem extends BaseCategory {
    public PdbxRobotSystem(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRobotSystem(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRobotSystem(String name) {
        super(name);
    }

    /**
     * Assign a numerical ID to each instrument.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The model of the robotic system.
     * @return StrColumn
     */
    public StrColumn getModel() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model", StrColumn::new) :
                getBinaryColumn("model"));
    }

    /**
     * The type of robotic system used for in the production pathway.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * The name of the manufacturer of the robotic system.
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("manufacturer", StrColumn::new) :
                getBinaryColumn("manufacturer"));
    }
}
