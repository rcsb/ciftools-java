package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_IDENTIFIER category provide
 * identifiers for chemical components.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * This data item contains the identifier value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getIdentifier() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("identifier", StrColumn::new) :
                getBinaryColumn("identifier"));
    }

    /**
     * This data item contains the identifier type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the identifier.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("program", StrColumn::new) :
                getBinaryColumn("program"));
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the identifier.
     * @return StrColumn
     */
    public StrColumn getProgramVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("program_version", StrColumn::new) :
                getBinaryColumn("program_version"));
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
