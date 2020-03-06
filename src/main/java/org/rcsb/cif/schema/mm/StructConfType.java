package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the STRUCT_CONF_TYPE category record details
 * about the criteria used to identify backbone conformations of a
 * segment of polymer.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class StructConfType extends DelegatingCategory {
    public StructConfType(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "criteria":
                return getCriteria();
            case "id":
                return getId();
            case "reference":
                return getReference();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The criteria used to assign this conformation type.
     * @return StrColumn
     */
    public StrColumn getCriteria() {
        return delegate.getColumn("criteria", DelegatingStrColumn::new);
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
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * A literature reference that defines the criteria used to assign
     * this conformation type and subtype.
     * @return StrColumn
     */
    public StrColumn getReference() {
        return delegate.getColumn("reference", DelegatingStrColumn::new);
    }

}