package org.rcsb.cif.model.pdbxexptlcrystalgrowsol;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return CrystalId
     */
    public CrystalId getCrystalId() {
        return (CrystalId) (isText ? textFields.computeIfAbsent("crystal_id",
                CrystalId::new) : getBinaryColumn("crystal_id"));
    }

    /**
     * An identifier for this solution (e.g. precipitant, reservoir, macromolecule)
     * @return SolId
     */
    public SolId getSolId() {
        return (SolId) (isText ? textFields.computeIfAbsent("sol_id",
                SolId::new) : getBinaryColumn("sol_id"));
    }

    /**
     * The volume of the solution.
     * @return Volume
     */
    public Volume getVolume() {
        return (Volume) (isText ? textFields.computeIfAbsent("volume",
                Volume::new) : getBinaryColumn("volume"));
    }

    /**
     * The volume units of the solution.
     * @return VolumeUnits
     */
    public VolumeUnits getVolumeUnits() {
        return (VolumeUnits) (isText ? textFields.computeIfAbsent("volume_units",
                VolumeUnits::new) : getBinaryColumn("volume_units"));
    }

    /**
     * The pH of the solution.
     * @return PH
     */
    public PH getPH() {
        return (PH) (isText ? textFields.computeIfAbsent("pH",
                PH::new) : getBinaryColumn("pH"));
    }
}
