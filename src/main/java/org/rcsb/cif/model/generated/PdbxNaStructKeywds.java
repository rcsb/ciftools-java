package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_NA_STRUCT_KEYWDS category record give details
 * about structural features of the NA.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Provides overall idea about conformation type of NA.  Also,
     * it identifies tRNAs by assigning a 'T' here.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getConformationType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("conformation_type", SingleRowStrColumn::new) :
                getBinaryColumn("conformation_type"));
    }

    /**
     * Gives general structural description of NA.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStrandDescription() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("strand_description", SingleRowStrColumn::new) :
                getBinaryColumn("strand_description"));
    }

    /**
     * Describes special features of NA.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecialFeature() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("special_feature", SingleRowStrColumn::new) :
                getBinaryColumn("special_feature"));
    }
}
