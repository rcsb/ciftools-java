package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for OD time series used to monitor a
 * given EXPRESSION step used in the overall protein production process.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenExpressTimepoint extends DelegatingCategory {
    public PdbxEntitySrcGenExpressTimepoint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "step_id":
                return getStepId();
            case "serial":
                return getSerial();
            case "OD":
                return getOD();
            case "time":
                return getTime();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_express_timepoint.entry_id is a pointer
     * to _pdbx_entity_src_gen_express.entry_id
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_express_timepoint.entity_id is a pointer
     * to _pdbx_entity_src_gen_express.entity_id
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_express.step_id
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * This items uniquely defines a timepoint within a series.
     * @return IntColumn
     */
    public IntColumn getSerial() {
        return delegate.getColumn("serial", DelegatingIntColumn::new);
    }

    /**
     * The optical density of the expression culture in arbitrary units at the
     * timepoint specified.
     * @return IntColumn
     */
    public IntColumn getOD() {
        return delegate.getColumn("OD", DelegatingIntColumn::new);
    }

    /**
     * The time in hours after induction/transformation/transfection at which
     * the optical density of the culture was measured.
     * @return IntColumn
     */
    public IntColumn getTime() {
        return delegate.getColumn("time", DelegatingIntColumn::new);
    }

}