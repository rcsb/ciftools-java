package org.rcsb.cif.model.structncsdom;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructNcsDom extends BaseCategory {
    public StructNcsDom(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructNcsDom(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructNcsDom(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the structural elements that
     * comprise a domain in an ensemble of domains related by
     * noncrystallographic symmetry.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_dom.id must uniquely identify a
     * record in the STRUCT_NCS_DOM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_ens.id'.
     * @return PdbxEnsId
     */
    public PdbxEnsId getPdbxEnsId() {
        return (PdbxEnsId) (isText ? textFields.computeIfAbsent("pdbx_ens_id",
                PdbxEnsId::new) : getBinaryColumn("pdbx_ens_id"));
    }
}
