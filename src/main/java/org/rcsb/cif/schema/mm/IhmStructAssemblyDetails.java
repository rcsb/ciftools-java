package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_DETAILS category records
 * the details of the structural assemblies and used in the
 * integrative modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStructAssemblyDetails extends DelegatingCategory {
    public IhmStructAssemblyDetails(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "assembly_id":
                return getAssemblyId();
            case "parent_assembly_id":
                return getParentAssemblyId();
            case "entity_description":
                return getEntityDescription();
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "entity_poly_segment_id":
                return getEntityPolySegmentId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the structural assembly description.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the structural assembly.
     * This data item will remain the same for all components
     * of an assembly.
     * This data item is a pointer to _ihm_struct_assembly.id
     * in the IHM_STRUCT_ASSEMBLY category.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * The parent of this assembly in a hierarchy.
     * This data item is a pointer to _ihm_struct_assembly.id in the
     * IHM_STRUCT_ASSEMBLY category.
     * This data item should point to the assembly id of the immediate
     * parent in a hierarchy.
     * By convention, the full assembly (top of hierarchy) is assigned parent id 0 (zero).
     * In case of assemblies that do not conform to a hierarchy,
     * _ihm_struct_assembly_details.parent_assembly_id is the same as
     * _ihm_struct_assembly_details.assembly_id indicating a self-parent.
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
     * The identifier for the polymeric segment in the assembly.
     * This data item is a pointer to _ihm_entity_poly_segment.id in the
     * IHM_ENTITY_POLY_SEGMENT category.
     * @return IntColumn
     */
    public IntColumn getEntityPolySegmentId() {
        return delegate.getColumn("entity_poly_segment_id", DelegatingIntColumn::new);
    }

}