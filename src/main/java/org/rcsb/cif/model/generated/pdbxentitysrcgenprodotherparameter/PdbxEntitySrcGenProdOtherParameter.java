package org.rcsb.cif.model.generated.pdbxentitysrcgenprodotherparameter;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenProdOtherParameter extends BaseCategory {
    public PdbxEntitySrcGenProdOtherParameter(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenProdOtherParameter(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenProdOtherParameter(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_other_parameter.entry_id is a pointer
     * to _pdbx_entity_src_gen_prod_other.entry.id
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_other_parameter.entity_id is a pointer
     * to _pdbx_entity_src_gen_prod_other.entity_id
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_prod_other.step_id
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * The name of the parameter associated with the process step
     * @return Parameter
     */
    public Parameter getParameter() {
        return (Parameter) (isText ? textFields.computeIfAbsent("parameter",
                Parameter::new) : getBinaryColumn("parameter"));
    }

    /**
     * The value of the parameter
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * Additional details about the parameter
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
