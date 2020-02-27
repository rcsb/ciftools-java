package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
 * details about the solutions that were 'mixed'
 * to produce the crystal.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxExptlCrystalGrowSol extends BaseCategory {
    public PdbxExptlCrystalGrowSol(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxExptlCrystalGrowSol(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxExptlCrystalGrowSol(String name) {
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
     * An identifier for this solution (e.g. precipitant, reservoir, macromolecule)
     * @return StrColumn
     */
    public StrColumn getSolId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sol_id", StrColumn::new) :
                getBinaryColumn("sol_id"));
    }

    /**
     * The volume of the solution.
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("volume", FloatColumn::new) :
                getBinaryColumn("volume"));
    }

    /**
     * The volume units of the solution.
     * @return StrColumn
     */
    public StrColumn getVolumeUnits() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("volume_units", StrColumn::new) :
                getBinaryColumn("volume_units"));
    }

    /**
     * The pH of the solution.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pH", FloatColumn::new) :
                getBinaryColumn("pH"));
    }
}
