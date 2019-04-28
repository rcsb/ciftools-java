package org.rcsb.cif.model.generated.pdbxchemcompmodeldescriptor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * This data item contains the descriptor value for this
     * component.
     * @return Descriptor
     */
    public Descriptor getDescriptor() {
        return (Descriptor) (isText ? textFields.computeIfAbsent("descriptor",
                Descriptor::new) : getBinaryColumn("descriptor"));
    }

    /**
     * This data item contains the descriptor type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }
}
