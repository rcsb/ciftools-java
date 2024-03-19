package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The CATEGORY of data items used to list atomic scattering factor values for
 * use in crystallographic structure studies.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomScatVersusStol extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_scat_versus_stol";

    public AtomScatVersusStol(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * The identity of the atom specie(s) representing this atom type.
     * See _atom_type.symbol for further details.
     * @return StrColumn
     */
    public StrColumn getAtomType() {
        return new DelegatingStrColumn(parentBlock.getColumn("atom_scat_versus_stol_atom_type"));
    }

    /**
     * The value of the scattering factor of a particular atom type at a particular
     * stol value.
     * @return FloatColumn
     */
    public FloatColumn getScatValue() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_scat_versus_stol_scat_value"));
    }

    /**
     * Standard uncertainty of _atom_scat_versus_stol.scat_value.
     * @return FloatColumn
     */
    public FloatColumn getScatValueSu() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_scat_versus_stol_scat_value_su"));
    }

    /**
     * The value of sin(θ)/λ (sin theta over lambda, stol) to which the
     * accompanying atom symbol and scattering factor value correspond to.
     * 
     * A regularly spaced grid is strongly recommended.
     * @return FloatColumn
     */
    public FloatColumn getStolValue() {
        return new DelegatingFloatColumn(parentBlock.getColumn("atom_scat_versus_stol_stol_value"));
    }

}