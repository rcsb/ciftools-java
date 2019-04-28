package org.rcsb.cif.model.generated.valenceref;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class ValenceRef extends BaseCategory {
    public ValenceRef(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ValenceRef(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ValenceRef(String name) {
        super(name);
    }

    /**
     * An identifier for items in this category. Parent of
     * _valence_param.ref_id, which must have the same value.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Literature reference from which the valence parameters
     * identified by _valence_param.id were taken.
     * @return Reference
     */
    public Reference getReference() {
        return (Reference) (isText ? textFields.computeIfAbsent("reference",
                Reference::new) : getBinaryColumn("reference"));
    }
}
