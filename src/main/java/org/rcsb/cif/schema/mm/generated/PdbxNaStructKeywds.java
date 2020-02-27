package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
 * about structural features of the NA.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNaStructKeywds extends BaseCategory {
    public PdbxNaStructKeywds(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNaStructKeywds(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNaStructKeywds(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Provides overall idea about conformation type of NA.  Also,
     * it identifies tRNAs by assigning a 'T' here.
     * @return StrColumn
     */
    public StrColumn getConformationType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conformation_type", StrColumn::new) :
                getBinaryColumn("conformation_type"));
    }

    /**
     * Gives general structural description of NA.
     * @return StrColumn
     */
    public StrColumn getStrandDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strand_description", StrColumn::new) :
                getBinaryColumn("strand_description"));
    }

    /**
     * Describes special features of NA.
     * @return StrColumn
     */
    public StrColumn getSpecialFeature() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("special_feature", StrColumn::new) :
                getBinaryColumn("special_feature"));
    }
}
