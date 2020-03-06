package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_MODEL_LIST category record the
 * details of the models being deposited.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelList extends DelegatingCategory {
    public IhmModelList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_id":
                return getModelId();
            case "model_name":
                return getModelName();
            case "assembly_id":
                return getAssemblyId();
            case "protocol_id":
                return getProtocolId();
            case "representation_id":
                return getRepresentationId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the structural model being deposited.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * A decsriptive name for the model.
     * @return StrColumn
     */
    public StrColumn getModelName() {
        return delegate.getColumn("model_name", DelegatingStrColumn::new);
    }

    /**
     * An identifier to the structure assembly corresponding to the model.
     * This data item is a pointer to the _ihm_struct_assembly.id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the modeling protocol that produced the model.
     * This data item is a pointer to the _ihm_modeling_protocol.id
     * in the IHM_MODELING_PROTOCOL category.
     * @return IntColumn
     */
    public IntColumn getProtocolId() {
        return delegate.getColumn("protocol_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the multi-scale model representation id of the model.
     * This data item is a pointer to the _ihm_model_representation.id
     * in the IHM_MODEL_REPRESENTATION category.
     * @return IntColumn
     */
    public IntColumn getRepresentationId() {
        return delegate.getColumn("representation_id", DelegatingIntColumn::new);
    }

}