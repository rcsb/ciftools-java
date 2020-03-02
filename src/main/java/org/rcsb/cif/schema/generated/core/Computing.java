package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The CATEGORY of data items used to record details of the
 * computer programs used in the crystal structure analysis.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Computing extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "computing";

    public Computing(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Brief description of software used for cell refinement.
     * @return StrColumn
     */
    public StrColumn getCellRefinement() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_cell_refinement"));
    }

    /**
     * 
     * Description of software used to measure diffraction data.
     * @return StrColumn
     */
    public StrColumn getDiffrnCollection() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_diffrn_collection"));
    }

    /**
     * 
     * Description of software used to convert diffraction data
     * to measured structure factors.
     * @return StrColumn
     */
    public StrColumn getDiffrnReduction() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_diffrn_reduction"));
    }

    /**
     * 
     * Brief description of software used for molecular graphics.
     * @return StrColumn
     */
    public StrColumn getMolecularGraphics() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_molecular_graphics"));
    }

    /**
     * 
     * Brief description of software used for publication material.
     * @return StrColumn
     */
    public StrColumn getPublicationMaterial() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_publication_material"));
    }

    /**
     * 
     * Brief description of software used for structure refinement.
     * @return StrColumn
     */
    public StrColumn getStructureRefinement() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_structure_refinement"));
    }

    /**
     * 
     * Brief description of software used for structure solution.
     * @return StrColumn
     */
    public StrColumn getStructureSolution() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_structure_solution"));
    }
}
