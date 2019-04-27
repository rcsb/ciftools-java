package org.rcsb.cif.model.structconftype;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructConfType extends BaseCategory {
    public StructConfType(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructConfType(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructConfType(String name) {
        super(name);
    }

    /**
     * The criteria used to assign this conformation type.
     * @return Criteria
     */
    public Criteria getCriteria() {
        return (Criteria) (isText ? textFields.computeIfAbsent("criteria",
                Criteria::new) : getBinaryColumn("criteria"));
    }

    /**
     * The descriptor that categorizes the type of the conformation
     * of the backbone of the polymer (whether protein or nucleic acid).
     * Explicit values for the torsion angles that define each
     * conformation are not given here, but it is expected that the
     * author would provide such information in either the
     * _struct_conf_type.criteria or _struct_conf_type.reference data
     * items, or both.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A literature reference that defines the criteria used to assign
     * this conformation type and subtype.
     * @return Reference
     */
    public Reference getReference() {
        return (Reference) (isText ? textFields.computeIfAbsent("reference",
                Reference::new) : getBinaryColumn("reference"));
    }
}
