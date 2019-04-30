package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITES_FOOTNOTE category record detailed
 * comments about an atom site or a group of atom sites.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("text", StrColumn::new) :
                getBinaryColumn("text"));
    }
}
