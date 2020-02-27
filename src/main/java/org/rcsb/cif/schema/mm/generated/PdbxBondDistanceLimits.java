package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category provides a table of upper and lower distance
 * limits used as criteria in determining covalent bonds.
 * The table is organized by atom type pairs.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxBondDistanceLimits extends BaseCategory {
    public PdbxBondDistanceLimits(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxBondDistanceLimits(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxBondDistanceLimits(String name) {
        super(name);
    }

    /**
     * The first atom type defining the bond
     * @return StrColumn
     */
    public StrColumn getAtomType1() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type_1", StrColumn::new) :
                getBinaryColumn("atom_type_1"));
    }

    /**
     * The first atom type defining the bond
     * @return StrColumn
     */
    public StrColumn getAtomType2() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("atom_type_2", StrColumn::new) :
                getBinaryColumn("atom_type_2"));
    }

    /**
     * The lower bond distance limit.
     * @return FloatColumn
     */
    public FloatColumn getLowerLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("lower_limit", FloatColumn::new) :
                getBinaryColumn("lower_limit"));
    }

    /**
     * The upper bond distance limit.
     * @return FloatColumn
     */
    public FloatColumn getUpperLimit() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("upper_limit", FloatColumn::new) :
                getBinaryColumn("upper_limit"));
    }
}
