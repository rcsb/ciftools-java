package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY category records the
 * details of the structural assemblies and used in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStructAssembly extends DelegatingCategory {
    public IhmStructAssembly(Category delegate) {
        super(delegate);
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
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * The parent of this assembly in a hierarchy.
     * This data item is an internal category pointer to
     * _ihm_struct_assembly.assembly_id
     * This data item should point to the assembly id of the immediate
     * parent in a hierarchy.
     * By convention, the full assembly (top of hierarchy) is assigned parent id 0 (zero).
     * In case of assemblies that do not conform to a hierarchy,
     * _ihm_struct_assembly.parent_assembly_id is the same as
     * _ihm_struct_assembly.assembly_id indicating a self-parent.
     * @return IntColumn
     */
    public IntColumn getParentAssemblyId() {
        return delegate.getColumn("parent_assembly_id", DelegatingIntColumn::new);
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
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
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
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return delegate.getColumn("seq_id_begin", DelegatingIntColumn::new);
    }

    /**
     * The ending residue index for the sequence segment of the entity instance
     * that is part of the assembly.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }
}
