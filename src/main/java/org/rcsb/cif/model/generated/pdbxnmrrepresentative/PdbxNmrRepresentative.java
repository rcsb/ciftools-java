package org.rcsb.cif.model.generated.pdbxnmrrepresentative;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * If a member of the ensemble has been selected as a representative
     * structure, identify it by its model number.
     * @return ConformerId
     */
    public ConformerId getConformerId() {
        return (ConformerId) (isText ? textFields.computeIfAbsent("conformer_id",
                ConformerId::new) : getBinaryColumn("conformer_id"));
    }

    /**
     * 
     * By highlighting the appropriate choice(s), describe the criteria used to
     * select this structure as a representative structure, or if an average
     * structure has been calculated describe how this was done.
     * @return SelectionCriteria
     */
    public SelectionCriteria getSelectionCriteria() {
        return (SelectionCriteria) (isText ? textFields.computeIfAbsent("selection_criteria",
                SelectionCriteria::new) : getBinaryColumn("selection_criteria"));
    }
}
