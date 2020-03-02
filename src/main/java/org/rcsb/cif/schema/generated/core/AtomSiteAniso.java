package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe the anisotropic
 * thermal parameters of the atomic sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSiteAniso extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_site_aniso";

    public AtomSiteAniso(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Anisotropic atomic displacement parameters are usually looped in
     * a separate list. If this is the case, this code must match the
     * _atom_site.label of the associated atom in the atom coordinate
     * list and conform with the same rules described in _atom_site.label.
     * @return StrColumn
     */
    public StrColumn getLabel() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_label"));
    }

    /**
     * 
     * The symmetric anisotropic atomic displacement matrix B.
     * @return StrColumn
     */
    public StrColumn getMatrixB() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_matrix_B"));
    }

    /**
     * 
     * The symmetric anisotropic atomic displacement matrix U.
     * @return StrColumn
     */
    public StrColumn getMatrixU() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_matrix_U"));
    }

    /**
     * 
     * Ratio of the maximum to minimum eigenvalues of the atomic
     * displacement (thermal) ellipsoids.
     * @return StrColumn
     */
    public StrColumn getRatio() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_ratio"));
    }

    /**
     * 
     * This _atom_type.symbol code links the anisotropic atom parameters to
     * the atom type data associated with this site and must match one of
     * the _atom_type.symbol codes in this list.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_type_symbol"));
    }
}
