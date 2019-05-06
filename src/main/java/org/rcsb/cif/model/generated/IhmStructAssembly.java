package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY category records the
 * details of the structural assemblies and used in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStructAssembly extends BaseCategory {
    public IhmStructAssembly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStructAssembly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStructAssembly(String name) {
        super(name);
    }

    /**
     * A unique identifier for the structural assembly description.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the structural assembly.
     * This data item will remain the same for all components
     * of an assembly.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("assembly_id", IntColumn::new) :
                getBinaryColumn("assembly_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("parent_assembly_id", IntColumn::new) :
                getBinaryColumn("parent_assembly_id"));
    }

    /**
     * A text description of the molecular entity
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description", StrColumn::new) :
                getBinaryColumn("entity_description"));
    }

    /**
     * A unique identifier for distinct molecular entities.
     * This data item is a pointer to _entity.id in the
     * ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * An asym/strand identifier for the component in the assembly.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The starting residue index for the sequence segment of the entity instance
     * that is part of the assembly.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The ending residue index for the sequence segment of the entity instance
     * that is part of the assembly.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }
}
