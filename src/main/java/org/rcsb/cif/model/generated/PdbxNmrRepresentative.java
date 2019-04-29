package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * An average structure is often calculated in addition to the ensemble, or one
 * of the ensemble is selected as a representative structure. This section
 * describes selection of the representative structure.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * If a member of the ensemble has been selected as a representative
     * structure, identify it by its model number.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getConformerId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("conformer_id", SingleRowStrColumn::new) :
                getBinaryColumn("conformer_id"));
    }

    /**
     * 
     * By highlighting the appropriate choice(s), describe the criteria used to
     * select this structure as a representative structure, or if an average
     * structure has been calculated describe how this was done.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSelectionCriteria() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("selection_criteria", SingleRowStrColumn::new) :
                getBinaryColumn("selection_criteria"));
    }
}
