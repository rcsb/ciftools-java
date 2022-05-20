package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_PROTOCOL_STEP category captures the
 * details of the modeling protocol and individial steps
 * within each protocol.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaProtocolStep extends DelegatingCategory {
    public MaProtocolStep(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "protocol_id":
                return getProtocolId();
            case "step_id":
                return getStepId();
            case "method_type":
                return getMethodType();
            case "details":
                return getDetails();
            case "step_name":
                return getStepName();
            case "software_group_id":
                return getSoftwareGroupId();
            case "input_data_group_id":
                return getInputDataGroupId();
            case "output_data_group_id":
                return getOutputDataGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This is a counter keeping track of the protocol steps.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * Unique identifier for the protocol.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return delegate.getColumn("protocol_id", DelegatingIntColumn::new);
    }

    /**
     * Unique identifier for the protocol step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * The method type that was applied in this protocol step.
     * @return StrColumn
     */
    public StrColumn getMethodType() {
        return delegate.getColumn("method_type", DelegatingStrColumn::new);
    }

    /**
     * Details of the protocol step.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A name for the protocol step.
     * @return StrColumn
     */
    public StrColumn getStepName() {
        return delegate.getColumn("step_name", DelegatingStrColumn::new);
    }

    /**
     * Identifier to the set of software used when applying the protocol step.
     * This data item is a pointer to the _ma_software_group.group_id in the
     * MA_SOFTWARE_GROUP category.
     * @return IntColumn
     */
    public IntColumn getSoftwareGroupId() {
        return delegate.getColumn("software_group_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the input data group id.
     * This data item is a pointer to _ma_data_group.group_id in the
     * MA_DATA_GROUP category.
     * @return IntColumn
     */
    public IntColumn getInputDataGroupId() {
        return delegate.getColumn("input_data_group_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the output data group_id.
     * This data item is a pointer to _ma_data_group.group_id in the
     * MA_DATA_GROUP category.
     * @return IntColumn
     */
    public IntColumn getOutputDataGroupId() {
        return delegate.getColumn("output_data_group_id", DelegatingIntColumn::new);
    }

}