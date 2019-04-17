package org.rcsb.cif.model.generated.pdbxchemcompidentifier;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class PdbxChemCompIdentifier extends BaseCifCategory {
    public PdbxChemCompIdentifier(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public PdbxChemCompIdentifier(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? getTextColumn("comp_id") : getBinaryColumn("comp_id"));
    }

    /**
     * This data item contains the identifier value for this
     * component.
     * @return Identifier
     */
    public Identifier getIdentifier() {
        return (Identifier) (isText ? getTextColumn("identifier") : getBinaryColumn("identifier"));
    }

    /**
     * This data item contains the identifier type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? getTextColumn("type") : getBinaryColumn("type"));
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the identifier.
     * @return Program
     */
    public Program getProgram() {
        return (Program) (isText ? getTextColumn("program") : getBinaryColumn("program"));
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the identifier.
     * @return ProgramVersion
     */
    public ProgramVersion getProgramVersion() {
        return (ProgramVersion) (isText ? getTextColumn("program_version") : getBinaryColumn("program_version"));
    }
}
