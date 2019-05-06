package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Describes the origin of the experimental data used in this
 * entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * A pointer to _citation.id in category CITATION describing the
     * the citation of the entry from from which the experimental data
     * was obtained.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Additional details about this re-refinement.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
