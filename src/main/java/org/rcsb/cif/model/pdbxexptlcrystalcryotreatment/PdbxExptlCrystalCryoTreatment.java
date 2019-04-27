package org.rcsb.cif.model.pdbxexptlcrystalcryotreatment;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxExptlCrystalCryoTreatment extends BaseCategory {
    public PdbxExptlCrystalCryoTreatment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxExptlCrystalCryoTreatment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxExptlCrystalCryoTreatment(String name) {
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
     * Details of the final solution used in the treatment of this crystal
     * @return FinalSolutionDetails
     */
    public FinalSolutionDetails getFinalSolutionDetails() {
        return (FinalSolutionDetails) (isText ? textFields.computeIfAbsent("final_solution_details",
                FinalSolutionDetails::new) : getBinaryColumn("final_solution_details"));
    }

    /**
     * Details of the soaking treatment applied to this crystal.
     * @return SoakingDetails
     */
    public SoakingDetails getSoakingDetails() {
        return (SoakingDetails) (isText ? textFields.computeIfAbsent("soaking_details",
                SoakingDetails::new) : getBinaryColumn("soaking_details"));
    }

    /**
     * Details of the cooling treatment applied to this crystal.
     * @return CoolingDetails
     */
    public CoolingDetails getCoolingDetails() {
        return (CoolingDetails) (isText ? textFields.computeIfAbsent("cooling_details",
                CoolingDetails::new) : getBinaryColumn("cooling_details"));
    }

    /**
     * Details of the annealing treatment applied to this crystal.
     * @return AnnealingDetails
     */
    public AnnealingDetails getAnnealingDetails() {
        return (AnnealingDetails) (isText ? textFields.computeIfAbsent("annealing_details",
                AnnealingDetails::new) : getBinaryColumn("annealing_details"));
    }
}
