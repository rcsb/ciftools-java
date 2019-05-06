package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_EXPTL_CRYSTAL_CRYO_TREATMENT category
 * record details cryogenic treatments applied to this crystal.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("crystal_id", StrColumn::new) :
                getBinaryColumn("crystal_id"));
    }

    /**
     * Details of the final solution used in the treatment of this crystal
     * @return StrColumn
     */
    public StrColumn getFinalSolutionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("final_solution_details", StrColumn::new) :
                getBinaryColumn("final_solution_details"));
    }

    /**
     * Details of the soaking treatment applied to this crystal.
     * @return StrColumn
     */
    public StrColumn getSoakingDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("soaking_details", StrColumn::new) :
                getBinaryColumn("soaking_details"));
    }

    /**
     * Details of the cooling treatment applied to this crystal.
     * @return StrColumn
     */
    public StrColumn getCoolingDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cooling_details", StrColumn::new) :
                getBinaryColumn("cooling_details"));
    }

    /**
     * Details of the annealing treatment applied to this crystal.
     * @return StrColumn
     */
    public StrColumn getAnnealingDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("annealing_details", StrColumn::new) :
                getBinaryColumn("annealing_details"));
    }
}
