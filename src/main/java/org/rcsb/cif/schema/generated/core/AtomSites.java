package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to describe information which applies
 * to all atom sites in a crystal structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSites extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "atom_sites";

    public AtomSites(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Codes which identify the methods used to locate the initial
     * atom sites. The *_primary code identifies how the first
     * atom sites were determined; the *_secondary code identifies
     * how the remaining non-hydrogen sites were located; and the
     * *_hydrogens code identifies how the hydrogen sites were located.
     * 
     * Ref: Sheldrick, G. M., Hauptman, H. A., Weeks, C. M.,
     * Miller, R. and Us\'on, I. (2001). Ab initio phasing.
     * In International Tables for Crystallography,
     * Vol. F. Crystallography of biological macromolecules,
     * edited by M. G. Rossmann and E. Arnold, ch. 16.1.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSolutionHydrogens() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_solution_hydrogens"));
    }

    /**
     * 
     * Codes which identify the methods used to locate the initial
     * atom sites. The *_primary code identifies how the first
     * atom sites were determined; the *_secondary code identifies
     * how the remaining non-hydrogen sites were located; and the
     * *_hydrogens code identifies how the hydrogen sites were located.
     * 
     * Ref: Sheldrick, G. M., Hauptman, H. A., Weeks, C. M.,
     * Miller, R. and Us\'on, I. (2001). Ab initio phasing.
     * In International Tables for Crystallography,
     * Vol. F. Crystallography of biological macromolecules,
     * edited by M. G. Rossmann and E. Arnold, ch. 16.1.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSolutionPrimary() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_solution_primary"));
    }

    /**
     * 
     * Codes which identify the methods used to locate the initial
     * atom sites. The *_primary code identifies how the first
     * atom sites were determined; the *_secondary code identifies
     * how the remaining non-hydrogen sites were located; and the
     * *_hydrogens code identifies how the hydrogen sites were located.
     * 
     * Ref: Sheldrick, G. M., Hauptman, H. A., Weeks, C. M.,
     * Miller, R. and Us\'on, I. (2001). Ab initio phasing.
     * In International Tables for Crystallography,
     * Vol. F. Crystallography of biological macromolecules,
     * edited by M. G. Rossmann and E. Arnold, ch. 16.1.
     * Dordrecht: Kluwer Academic Publishers.
     * @return StrColumn
     */
    public StrColumn getSolutionSecondary() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_solution_secondary"));
    }

    /**
     * 
     * Information about atomic coordinates not coded elsewhere in the CIF.
     * @return StrColumn
     */
    public StrColumn getSpecialDetails() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_special_details"));
    }
}
