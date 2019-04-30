package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the VALENCE_REF category list the references
 * from which the bond-valence parameters have been taken.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Literature reference from which the valence parameters
     * identified by _valence_param.id were taken.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference", StrColumn::new) :
                getBinaryColumn("reference"));
    }
}
