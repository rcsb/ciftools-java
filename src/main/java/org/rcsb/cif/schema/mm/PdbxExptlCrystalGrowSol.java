package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_EXPTL_CRYSTAL_GROW_SOL category record
 * details about the solutions that were 'mixed'
 * to produce the crystal.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxExptlCrystalGrowSol extends DelegatingCategory {
    public PdbxExptlCrystalGrowSol(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "crystal_id":
                return getCrystalId();
            case "sol_id":
                return getSolId();
            case "volume":
                return getVolume();
            case "volume_units":
                return getVolumeUnits();
            case "pH":
                return getPH();
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
     * An identifier for this solution (e.g. precipitant, reservoir, macromolecule)
     * @return StrColumn
     */
    public StrColumn getSolId() {
        return delegate.getColumn("sol_id", DelegatingStrColumn::new);
    }

    /**
     * The volume of the solution.
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return delegate.getColumn("volume", DelegatingFloatColumn::new);
    }

    /**
     * The volume units of the solution.
     * @return StrColumn
     */
    public StrColumn getVolumeUnits() {
        return delegate.getColumn("volume_units", DelegatingStrColumn::new);
    }

    /**
     * The pH of the solution.
     * @return FloatColumn
     */
    public FloatColumn getPH() {
        return delegate.getColumn("pH", DelegatingFloatColumn::new);
    }

}