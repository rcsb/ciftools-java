package org.rcsb.cif.model.generated.pdbxexptlcrystalgrowcomp;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxExptlCrystalGrowComp extends BaseCategory {
    public PdbxExptlCrystalGrowComp(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxExptlCrystalGrowComp(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxExptlCrystalGrowComp(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * The value of _exptl_crystal_grow_comp.comp_id must uniquely identify
     * each item in the PDBX_EXPTL_CRYSTAL_GROW_COMP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return CompId
     */
    public CompId getCompId() {
        return (CompId) (isText ? textFields.computeIfAbsent("comp_id",
                CompId::new) : getBinaryColumn("comp_id"));
    }

    /**
     * A common name for the component of the solution.
     * @return CompName
     */
    public CompName getCompName() {
        return (CompName) (isText ? textFields.computeIfAbsent("comp_name",
                CompName::new) : getBinaryColumn("comp_name"));
    }

    /**
     * An identifier for the solution to which the given solution
     * component belongs.
     * @return SolId
     */
    public SolId getSolId() {
        return (SolId) (isText ? textFields.computeIfAbsent("sol_id",
                SolId::new) : getBinaryColumn("sol_id"));
    }

    /**
     * The concentration value of the solution component.
     * @return Conc
     */
    public Conc getConc() {
        return (Conc) (isText ? textFields.computeIfAbsent("conc",
                Conc::new) : getBinaryColumn("conc"));
    }

    /**
     * The concentration range of the solution component.
     * @return ConcRange
     */
    public ConcRange getConcRange() {
        return (ConcRange) (isText ? textFields.computeIfAbsent("conc_range",
                ConcRange::new) : getBinaryColumn("conc_range"));
    }

    /**
     * The concentration units for the solution component.
     * @return ConcUnits
     */
    public ConcUnits getConcUnits() {
        return (ConcUnits) (isText ? textFields.computeIfAbsent("conc_units",
                ConcUnits::new) : getBinaryColumn("conc_units"));
    }
}
