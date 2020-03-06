package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CITATION_EDITOR category record details
 * about the editors associated with the books or book chapters
 * cited in the CITATION list.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CitationEditor extends DelegatingCategory {
    public CitationEditor(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "citation_id":
                return getCitationId();
            case "name":
                return getName();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _citation.id in the CITATION
     * category.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return delegate.getColumn("citation_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * This data item defines the order of the editor's name in the
     * list of editors of a citation.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

}