package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_EXPTL_CRYSTAL_CRYO_TREATMENT category
 * record details cryogenic treatments applied to this crystal.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxExptlCrystalCryoTreatment extends DelegatingCategory {
    public PdbxExptlCrystalCryoTreatment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "crystal_id":
                return getCrystalId();
            case "final_solution_details":
                return getFinalSolutionDetails();
            case "soaking_details":
                return getSoakingDetails();
            case "cooling_details":
                return getCoolingDetails();
            case "annealing_details":
                return getAnnealingDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _exptl_crystal.id in the
     * EXPTL_CRYSTAL category.
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * Details of the final solution used in the treatment of this crystal
     * @return StrColumn
     */
    public StrColumn getFinalSolutionDetails() {
        return delegate.getColumn("final_solution_details", DelegatingStrColumn::new);
    }

    /**
     * Details of the soaking treatment applied to this crystal.
     * @return StrColumn
     */
    public StrColumn getSoakingDetails() {
        return delegate.getColumn("soaking_details", DelegatingStrColumn::new);
    }

    /**
     * Details of the cooling treatment applied to this crystal.
     * @return StrColumn
     */
    public StrColumn getCoolingDetails() {
        return delegate.getColumn("cooling_details", DelegatingStrColumn::new);
    }

    /**
     * Details of the annealing treatment applied to this crystal.
     * @return StrColumn
     */
    public StrColumn getAnnealingDetails() {
        return delegate.getColumn("annealing_details", DelegatingStrColumn::new);
    }

}