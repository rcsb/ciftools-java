package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The details about each robotic system used to collect data for this
 * project.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRobotSystem extends DelegatingCategory {
    public PdbxRobotSystem(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "model":
                return getModel();
            case "type":
                return getType();
            case "manufacturer":
                return getManufacturer();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Assign a numerical ID to each instrument.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The model of the robotic system.
     * @return StrColumn
     */
    public StrColumn getModel() {
        return delegate.getColumn("model", DelegatingStrColumn::new);
    }

    /**
     * The type of robotic system used for in the production pathway.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * The name of the manufacturer of the robotic system.
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return delegate.getColumn("manufacturer", DelegatingStrColumn::new);
    }

}