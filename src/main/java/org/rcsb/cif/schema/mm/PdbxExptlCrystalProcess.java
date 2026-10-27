package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_exptl_crystal_process category
 * record details of the post-crystallization process to
 * prepare specific crystal samples such as microcrystals
 * for subsequent diffraction experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxExptlCrystalProcess extends DelegatingCategory {
    public PdbxExptlCrystalProcess(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "crystal_id":
                return getCrystalId();
            case "microcrystal_method":
                return getMicrocrystalMethod();
            case "microcrystal_instrument":
                return getMicrocrystalInstrument();
            case "microcrystal_min_dim":
                return getMicrocrystalMinDim();
            case "microcrystal_max_dim":
                return getMicrocrystalMaxDim();
            case "microcrystal_description":
                return getMicrocrystalDescription();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ordinal identifier for the category
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to the _exptl_crystal.id
     * @return StrColumn
     */
    public StrColumn getCrystalId() {
        return delegate.getColumn("crystal_id", DelegatingStrColumn::new);
    }

    /**
     * The method used to produce microcrystals for
     * diffraction experiments, if applicable.
     * @return StrColumn
     */
    public StrColumn getMicrocrystalMethod() {
        return delegate.getColumn("microcrystal_method", DelegatingStrColumn::new);
    }

    /**
     * The instrument used to produce microcrystals for the experiments, if applicable.
     * @return StrColumn
     */
    public StrColumn getMicrocrystalInstrument() {
        return delegate.getColumn("microcrystal_instrument", DelegatingStrColumn::new);
    }

    /**
     * The minimal dimension of the final crystal ready for
     * diffraction experiments. For example, for
     * microcrystals processed by FIB milling, this item
     * refers to the thickness of the thin lamella.
     * @return FloatColumn
     */
    public FloatColumn getMicrocrystalMinDim() {
        return delegate.getColumn("microcrystal_min_dim", DelegatingFloatColumn::new);
    }

    /**
     * The maximal dimension of the final crystal ready for
     * diffraction experiments. For example, for
     * microcrystals processed by FIB milling, this item
     * refers to the length of the thin lamella.
     * @return FloatColumn
     */
    public FloatColumn getMicrocrystalMaxDim() {
        return delegate.getColumn("microcrystal_max_dim", DelegatingFloatColumn::new);
    }

    /**
     * Characteristics of the final crystal ready for diffraction experiments, e.g. shape.
     * @return StrColumn
     */
    public StrColumn getMicrocrystalDescription() {
        return delegate.getColumn("microcrystal_description", DelegatingStrColumn::new);
    }

    /**
     * The details about the crystal process.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}