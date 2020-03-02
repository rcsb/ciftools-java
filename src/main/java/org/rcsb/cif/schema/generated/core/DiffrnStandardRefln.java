package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the "standard" reflections
 * measured repeatedly to monitor variations in intensity due to source
 * flux, environment conditions or crystal quality.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnStandardRefln extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_standard_refln";

    public DiffrnStandardRefln(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Code identifying a standard reflection used to monitor source
     * intensity variations or crystal degradation or movement during
     * data collection.
     * @return StrColumn
     */
    public StrColumn getCode() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_code"));
    }

    /**
     * 
     * Miller indices of a standard reflection.
     * @return IntColumn
     */
    public IntColumn getHkl() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_hkl"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexH() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_index_h"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexK() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_index_k"));
    }

    /**
     * 
     * The index of a reciprocal space vector.
     * @return IntColumn
     */
    public IntColumn getIndexL() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_index_l"));
    }
}
