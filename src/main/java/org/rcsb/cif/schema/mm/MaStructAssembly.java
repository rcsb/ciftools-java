package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_STRUCT_ASSEMBLY category records the
 * details of the structural assemblies modeled.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaStructAssembly extends DelegatingCategory {
    public MaStructAssembly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "assembly_id":
                return getAssemblyId();
            case "entity_description":
                return getEntityDescription();
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "seq_id_begin":
                return getSeqIdBegin();
            case "seq_id_end":
                return getSeqIdEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the structural assembly description.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural assembly.
     * This data item will remain the same for all components
     * of an assembly.
     * This data item is a pointer to _ma_model_list.assembly_id in the
     * MA_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * A text description of the molecular entity
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return delegate.getColumn("entity_description", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier for distinct molecular entities.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the component in the assembly.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The starting residue index for the sequence segment of the entity instance
     * that is part of the assembly.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The ending residue index for the sequence segment of the entity instance
     * that is part of the assembly.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

}