package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_EXPTL_CRYSTAL_GROW_COMP category record
 * details about the components of the solutions that were 'mixed'
 * to produce the crystal.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * The value of _exptl_crystal_grow_comp.comp_id must uniquely identify
     * each item in the PDBX_EXPTL_CRYSTAL_GROW_COMP list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * A common name for the component of the solution.
     * @return StrColumn
     */
    public StrColumn getCompName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_name", StrColumn::new) :
                getBinaryColumn("comp_name"));
    }

    /**
     * An identifier for the solution to which the given solution
     * component belongs.
     * @return StrColumn
     */
    public StrColumn getSolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sol_id", StrColumn::new) :
                getBinaryColumn("sol_id"));
    }

    /**
     * The concentration value of the solution component.
     * @return FloatColumn
     */
    public FloatColumn getConc() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("conc", FloatColumn::new) :
                getBinaryColumn("conc"));
    }

    /**
     * The concentration range of the solution component.
     * @return StrColumn
     */
    public StrColumn getConcRange() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc_range", StrColumn::new) :
                getBinaryColumn("conc_range"));
    }

    /**
     * The concentration units for the solution component.
     * @return StrColumn
     */
    public StrColumn getConcUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc_units", StrColumn::new) :
                getBinaryColumn("conc_units"));
    }
}
