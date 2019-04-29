package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CITATION_EDITOR category record details
 * about the editors associated with the books or book chapters
 * cited in the CITATION list.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class CitationEditor extends BaseCategory {
    public CitationEditor(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public CitationEditor(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public CitationEditor(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("citation_id", StrColumn::new) :
                getBinaryColumn("citation_id"));
    }

    /**
     * Names of an editor of the citation; relevant for books and
     * book chapters.
     * 
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * This data item defines the order of the editor's name in the
     * list of editors of a citation.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal", IntColumn::new) :
                getBinaryColumn("ordinal"));
    }
}
