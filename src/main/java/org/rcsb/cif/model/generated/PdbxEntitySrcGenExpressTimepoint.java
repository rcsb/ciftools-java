package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for OD time series used to monitor a
 * given EXPRESSION step used in the overall protein production process.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenExpressTimepoint extends BaseCategory {
    public PdbxEntitySrcGenExpressTimepoint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenExpressTimepoint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenExpressTimepoint(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_express_timepoint.entry_id is a pointer
     * to _pdbx_entity_src_gen_express.entry_id
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_express_timepoint.entity_id is a pointer
     * to _pdbx_entity_src_gen_express.entity_id
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_express.step_id
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * This items uniquely defines a timepoint within a series.
     * @return IntColumn
     */
    public IntColumn getSerial() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("serial", IntColumn::new) :
                getBinaryColumn("serial"));
    }

    /**
     * The optical density of the expression culture in arbitrary units at the
     * timepoint specified.
     * @return IntColumn
     */
    public IntColumn getOD() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("OD", IntColumn::new) :
                getBinaryColumn("OD"));
    }

    /**
     * The time in hours after induction/transformation/transfection at which
     * the optical density of the culture was measured.
     * @return IntColumn
     */
    public IntColumn getTime() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("time", IntColumn::new) :
                getBinaryColumn("time"));
    }
}
