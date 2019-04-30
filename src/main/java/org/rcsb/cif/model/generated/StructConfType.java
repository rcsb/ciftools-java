package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_CONF_TYPE category record details
 * about the criteria used to identify backbone conformations of a
 * segment of polymer.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCriteria() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("criteria", StrColumn::new) :
                getBinaryColumn("criteria"));
    }

    /**
     * The descriptor that categorizes the type of the conformation
     * of the backbone of the polymer (whether protein or nucleic acid).
     * Explicit values for the torsion angles that define each
     * conformation are not given here, but it is expected that the
     * author would provide such information in either the
     * _struct_conf_type.criteria or _struct_conf_type.reference data
     * items, or both.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A literature reference that defines the criteria used to assign
     * this conformation type and subtype.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reference", StrColumn::new) :
                getBinaryColumn("reference"));
    }
}
