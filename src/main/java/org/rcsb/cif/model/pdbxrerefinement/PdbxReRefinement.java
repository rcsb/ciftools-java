package org.rcsb.cif.model.pdbxrerefinement;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * A pointer to _citation.id in category CITATION describing the
     * the citation of the entry from from which the experimental data
     * was obtained.
     * @return CitationId
     */
    public CitationId getCitationId() {
        return (CitationId) (isText ? textFields.computeIfAbsent("citation_id",
                CitationId::new) : getBinaryColumn("citation_id"));
    }

    /**
     * Additional details about this re-refinement.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
