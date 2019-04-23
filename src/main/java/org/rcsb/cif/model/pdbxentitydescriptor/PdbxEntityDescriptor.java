package org.rcsb.cif.model.pdbxentitydescriptor;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityDescriptor extends BaseCategory {
    public PdbxEntityDescriptor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntityDescriptor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntityDescriptor(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity_poly.entity_id in the ENTITY
     * category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This data item contains the descriptor value for this
     * entity.
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

    /**
     * This data item contains the name of the program
     * or library used to compute the descriptor.
     * @return Program
     */
    public Program getProgram() {
        return (Program) (isText ? textFields.computeIfAbsent("program",
                Program::new) : getBinaryColumn("program"));
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the descriptor.
     * @return ProgramVersion
     */
    public ProgramVersion getProgramVersion() {
        return (ProgramVersion) (isText ? textFields.computeIfAbsent("program_version",
                ProgramVersion::new) : getBinaryColumn("program_version"));
    }

    /**
     * Ordinal index for this category.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? textFields.computeIfAbsent("ordinal",
                Ordinal::new) : getBinaryColumn("ordinal"));
    }
}
