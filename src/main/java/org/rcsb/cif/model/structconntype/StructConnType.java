package org.rcsb.cif.model.structconntype;

import org.rcsb.cif.model.BaseCifCategory;
import org.rcsb.cif.model.CifColumn;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
public class StructConnType extends BaseCifCategory {
    public StructConnType(String name, Map<String, CifColumn> columns) {
        super(name, columns);
    }

    public StructConnType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    /**
     * The criteria used to define the interaction.
     * @return Criteria
     */
    public Criteria getCriteria() {
        return (Criteria) (isText ? getTextColumn("criteria") : getBinaryColumn("criteria"));
    }

    /**
     * The chemical or structural type of the interaction.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? getTextColumn("id") : getBinaryColumn("id"));
    }

    /**
     * A reference that specifies the criteria used to define the
     * interaction.
     * @return Reference
     */
    public Reference getReference() {
        return (Reference) (isText ? getTextColumn("reference") : getBinaryColumn("reference"));
    }
}
