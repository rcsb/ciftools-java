package org.rcsb.cif.model.atomsitesfootnote;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class AtomSitesFootnote extends BaseCategory {
    public AtomSitesFootnote(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSitesFootnote(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSitesFootnote(String name) {
        super(name);
    }

    /**
     * A code that identifies the footnote.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The text of the footnote. Footnotes are used to describe
     * an atom site or a group of atom sites in the ATOM_SITE list.
     * 
     * For example, footnotes may be used to indicate atoms for which
     * the electron density is very weak, or atoms for which static
     * disorder has been modelled.
     * @return Text
     */
    public Text getText() {
        return (Text) (isText ? textFields.computeIfAbsent("text",
                Text::new) : getBinaryColumn("text"));
    }
}
