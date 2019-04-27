package org.rcsb.cif.model.pdbxrobotsystem;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The model of the robotic system.
     * @return Model
     */
    public Model getModel() {
        return (Model) (isText ? textFields.computeIfAbsent("model",
                Model::new) : getBinaryColumn("model"));
    }

    /**
     * The type of robotic system used for in the production pathway.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * The name of the manufacturer of the robotic system.
     * @return Manufacturer
     */
    public Manufacturer getManufacturer() {
        return (Manufacturer) (isText ? textFields.computeIfAbsent("manufacturer",
                Manufacturer::new) : getBinaryColumn("manufacturer"));
    }
}
