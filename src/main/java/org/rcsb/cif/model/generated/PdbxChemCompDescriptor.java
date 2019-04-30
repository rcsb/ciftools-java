package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_COMP_DESCRIPTOR category provide
 * string descriptors of component chemical structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxChemCompDescriptor extends BaseCategory {
    public PdbxChemCompDescriptor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxChemCompDescriptor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxChemCompDescriptor(String name) {
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
     * This data item contains the descriptor value for this
     * component.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("descriptor", StrColumn::new) :
                getBinaryColumn("descriptor"));
    }

    /**
     * This data item contains the descriptor type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the descriptor.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("program", StrColumn::new) :
                getBinaryColumn("program"));
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the descriptor.
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
