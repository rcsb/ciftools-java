package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Describes the origin of the experimental data used in this
 * entry.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxReRefinement extends BaseCategory {
    public PdbxReRefinement(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReRefinement(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReRefinement(String name) {
        super(name);
    }

    /**
     * The identifier for entry where the experimental data was obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A pointer to _citation.id in category CITATION describing the
     * the citation of the entry from from which the experimental data
     * was obtained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCitationId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("citation_id", SingleRowStrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Additional details about this re-refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
