package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODELING_PROTOCOL category lists all
 * modeling protocols used in the integrative modeling study.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelingProtocol extends DelegatingCategory {
    public IhmModelingProtocol(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "num_steps":
                return getNumSteps();
            case "protocol_name":
                return getProtocolName();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the modeling protocol.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Number of independent steps in the modeling protocol.
     * @return IntColumn
     */
    public IntColumn getNumSteps() {
        return delegate.getColumn("num_steps", DelegatingIntColumn::new);
    }

    /**
     * The name for the modeling protocol.
     * @return StrColumn
     */
    public StrColumn getProtocolName() {
        return delegate.getColumn("protocol_name", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the modeling protocol.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}