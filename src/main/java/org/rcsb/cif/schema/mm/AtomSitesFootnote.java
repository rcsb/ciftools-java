package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITES_FOOTNOTE category record detailed
 * comments about an atom site or a group of atom sites.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSitesFootnote extends DelegatingCategory {
    public AtomSitesFootnote(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "text":
                return getText();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A code that identifies the footnote.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The text of the footnote. Footnotes are used to describe
     * an atom site or a group of atom sites in the ATOM_SITE list.
     * 
     * For example, footnotes may be used to indicate atoms for which
     * the electron density is very weak, or atoms for which static
     * disorder has been modelled.
     * @return StrColumn
     */
    public StrColumn getText() {
        return delegate.getColumn("text", DelegatingStrColumn::new);
    }

}