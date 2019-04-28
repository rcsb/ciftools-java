package org.rcsb.cif.model.generated.pdbxchemcompidentifier;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxChemCompIdentifier extends BaseCategory {
    public PdbxChemCompIdentifier(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompIdentifier(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompIdentifier(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * This data item contains the identifier value for this
     * component.
     * @return Identifier
     */
    public Identifier getIdentifier() {
        return (Identifier) (isText ? textFields.computeIfAbsent("identifier",
                Identifier::new) : getBinaryColumn("identifier"));
    }

    /**
     * This data item contains the identifier type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the identifier.
     * @return Program
     */
    public Program getProgram() {
        return (Program) (isText ? textFields.computeIfAbsent("program",
                Program::new) : getBinaryColumn("program"));
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the identifier.
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
