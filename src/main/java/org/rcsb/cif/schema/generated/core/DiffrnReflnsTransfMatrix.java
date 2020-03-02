package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items which specify the elements of the matrix
 * used to transform the reflection indices _diffrn_refln.hkl
 * into _refln.hkl.
 * |11 12 13|
 * (h k l) diffraction  |21 22 23|  =  (h' k' l')
 * |31 32 33|
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class DiffrnReflnsTransfMatrix extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "diffrn_reflns_transf_matrix";

    public DiffrnReflnsTransfMatrix(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Elements of the matrix used to transform the diffraction reflection
     * indices _diffrn_refln.hkl into the _refln.hkl indices.
     * |11 12 13|
     * (h k l) diffraction  |21 22 23|  =  (h' k' l')
     * |31 32 33|
     * @return StrColumn
     */
    public StrColumn getTIJ() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_TIJ"));
    }
}
