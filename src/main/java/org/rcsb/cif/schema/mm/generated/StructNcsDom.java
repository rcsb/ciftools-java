package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the STRUCT_NCS_DOM category record information
 * about the domains in an ensemble of domains related by one or
 * more noncrystallographic symmetry operators.
 * 
 * A domain need not correspond to a complete polypeptide chain;
 * it can be composed of one or more segments in a single chain,
 * or by segments from more than one chain.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The value of _struct_ncs_dom.id must uniquely identify a
     * record in the STRUCT_NCS_DOM list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This is a unique identifier for a collection NCS related domains.
     * This references item '_struct_ncs_ens.id'.
     * @return StrColumn
     */
    public StrColumn getPdbxEnsId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ens_id", StrColumn::new) :
                getBinaryColumn("pdbx_ens_id"));
    }
}
