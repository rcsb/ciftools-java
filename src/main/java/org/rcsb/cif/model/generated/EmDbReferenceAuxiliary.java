package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category holds links to raw data sources for the entry, e.g.,
 * held by a remote server.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmDbReferenceAuxiliary extends BaseCategory {
    public EmDbReferenceAuxiliary(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmDbReferenceAuxiliary(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmDbReferenceAuxiliary(String name) {
        super(name);
    }

    /**
     * Unique identifier for a provided link.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Hyperlink to the auxiliary data.
     * @return StrColumn
     */
    public StrColumn getLink() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link", StrColumn::new) :
                getBinaryColumn("link"));
    }

    /**
     * Type of auxiliary data stored at the indicated link.
     * @return StrColumn
     */
    public StrColumn getLinkType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("link_type", StrColumn::new) :
                getBinaryColumn("link_type"));
    }
}
