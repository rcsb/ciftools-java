package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains parameters and values required to capture
 * information about a particular process step
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_prod_other_parameter.entity_id is a pointer
     * to _pdbx_entity_src_gen_prod_other.entity_id
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is a pointer to _pdbx_entity_src_gen_prod_other.step_id
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * The name of the parameter associated with the process step
     * @return StrColumn
     */
    public StrColumn getParameter() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("parameter", StrColumn::new) :
                getBinaryColumn("parameter"));
    }

    /**
     * The value of the parameter
     * @return StrColumn
     */
    public StrColumn getValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value", StrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * Additional details about the parameter
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
