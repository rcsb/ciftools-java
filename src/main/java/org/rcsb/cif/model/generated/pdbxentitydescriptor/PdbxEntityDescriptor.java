package org.rcsb.cif.model.generated.pdbxentitydescriptor;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import java.util.Map;

public class PdbxEntityDescriptor extends BaseCifCategory {
    public PdbxEntityDescriptor(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxEntityDescriptor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _entity_poly.entity_id in the ENTITY
     * category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? getTextColumn("entity_id") : getBinaryColumn("entity_id", "EntityId"));
    }

    /**
     * This data item contains the descriptor value for this
     * entity.
     * @return Descriptor
     */
    public Descriptor getDescriptor() {
        return (Descriptor) (isText ? getTextColumn("descriptor") : getBinaryColumn("descriptor", "Descriptor"));
    }

    /**
     * This data item contains the descriptor type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type", "Type"));
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the descriptor.
     * @return Program
     */
    public Program getProgram() {
        return (Program) (isText ? getTextColumn("program") : getBinaryColumn("program", "Program"));
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the descriptor.
     * @return ProgramVersion
     */
    public ProgramVersion getProgramVersion() {
        return (ProgramVersion) (isText ? getTextColumn("program_version") : getBinaryColumn("program_version", "ProgramVersion"));
    }

    /**
     * Ordinal index for this category.
     * @return Ordinal
     */
    public Ordinal getOrdinal() {
        return (Ordinal) (isText ? getTextColumn("ordinal") : getBinaryColumn("ordinal", "Ordinal"));
    }
}
