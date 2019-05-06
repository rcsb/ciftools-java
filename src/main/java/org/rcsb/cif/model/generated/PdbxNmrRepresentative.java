package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * An average structure is often calculated in addition to the ensemble, or one
 * of the ensemble is selected as a representative structure. This section
 * describes selection of the representative structure.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxNmrRepresentative extends BaseCategory {
    public PdbxNmrRepresentative(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrRepresentative(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrRepresentative(String name) {
        super(name);
    }

    /**
     * msd will assign the ID.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * If a member of the ensemble has been selected as a representative
     * structure, identify it by its model number.
     * @return StrColumn
     */
    public StrColumn getConformerId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conformer_id", StrColumn::new) :
                getBinaryColumn("conformer_id"));
    }

    /**
     * 
     * By highlighting the appropriate choice(s), describe the criteria used to
     * select this structure as a representative structure, or if an average
     * structure has been calculated describe how this was done.
     * @return StrColumn
     */
    public StrColumn getSelectionCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("selection_criteria", StrColumn::new) :
                getBinaryColumn("selection_criteria"));
    }
}
