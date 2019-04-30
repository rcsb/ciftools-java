package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_MODEL_DESCRIPTOR category provide
 * string descriptors for component model structures.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompModelDescriptor extends BaseCategory {
    public PdbxChemCompModelDescriptor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompModelDescriptor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompModelDescriptor(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_chem_comp_model.id in the PDBX_CHEM_COMP_MODEL
     * category.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * This data item contains the descriptor value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("descriptor", StrColumn::new) :
                getBinaryColumn("descriptor"));
    }

    /**
     * This data item contains the descriptor type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }
}
