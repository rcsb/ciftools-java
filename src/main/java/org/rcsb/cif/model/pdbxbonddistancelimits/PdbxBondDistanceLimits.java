package org.rcsb.cif.model.pdbxbonddistancelimits;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AtomType1
     */
    public AtomType1 getAtomType1() {
        return (AtomType1) (isText ? textFields.computeIfAbsent("atom_type_1",
                AtomType1::new) : getBinaryColumn("atom_type_1"));
    }

    /**
     * The first atom type defining the bond
     * @return AtomType2
     */
    public AtomType2 getAtomType2() {
        return (AtomType2) (isText ? textFields.computeIfAbsent("atom_type_2",
                AtomType2::new) : getBinaryColumn("atom_type_2"));
    }

    /**
     * The lower bond distance limit.
     * @return LowerLimit
     */
    public LowerLimit getLowerLimit() {
        return (LowerLimit) (isText ? textFields.computeIfAbsent("lower_limit",
                LowerLimit::new) : getBinaryColumn("lower_limit"));
    }

    /**
     * The upper bond distance limit.
     * @return UpperLimit
     */
    public UpperLimit getUpperLimit() {
        return (UpperLimit) (isText ? textFields.computeIfAbsent("upper_limit",
                UpperLimit::new) : getBinaryColumn("upper_limit"));
    }
}
