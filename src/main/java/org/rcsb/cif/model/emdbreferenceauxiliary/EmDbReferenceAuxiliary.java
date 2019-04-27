package org.rcsb.cif.model.emdbreferenceauxiliary;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Hyperlink to the auxiliary data.
     * @return Link
     */
    public Link getLink() {
        return (Link) (isText ? textFields.computeIfAbsent("link",
                Link::new) : getBinaryColumn("link"));
    }

    /**
     * Type of auxiliary data stored at the indicated link.
     * @return LinkType
     */
    public LinkType getLinkType() {
        return (LinkType) (isText ? textFields.computeIfAbsent("link_type",
                LinkType::new) : getBinaryColumn("link_type"));
    }
}
