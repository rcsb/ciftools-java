package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The table in this section is used to describe the software
 * that was used for data collection, data processing, data analysis,
 * structure calculations and refinement. The description should include
 * both the name of the software and the version used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrComputing extends DelegatingCategory {
    public PdbxNmrComputing(Category delegate) {
        super(delegate);
    }

    /**
     * The entry ID for the structure determination.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Enter the name of the software used for data collection.
     * @return StrColumn
     */
    public StrColumn getCollection() {
        return delegate.getColumn("collection", DelegatingStrColumn::new);
    }

    /**
     * Enter the version of the software used for data collection.
     * @return StrColumn
     */
    public StrColumn getCollectionVersion() {
        return delegate.getColumn("collection_version", DelegatingStrColumn::new);
    }

    /**
     * Enter the name of the software used for data processing.
     * @return StrColumn
     */
    public StrColumn getProcessing() {
        return delegate.getColumn("processing", DelegatingStrColumn::new);
    }

    /**
     * Enter the version of the software used for data processing.
     * @return StrColumn
     */
    public StrColumn getProcessingVersion() {
        return delegate.getColumn("processing_version", DelegatingStrColumn::new);
    }

    /**
     * Enter the name of the software used for data analysis.
     * @return StrColumn
     */
    public StrColumn getDataAnalysis() {
        return delegate.getColumn("data_analysis", DelegatingStrColumn::new);
    }

    /**
     * Enter the version of the software used for data analysis.
     * @return StrColumn
     */
    public StrColumn getDataAnalysisVersion() {
        return delegate.getColumn("data_analysis_version", DelegatingStrColumn::new);
    }

    /**
     * Enter the name of the software used to calculate the structure.
     * @return StrColumn
     */
    public StrColumn getStructureSolution() {
        return delegate.getColumn("structure_solution", DelegatingStrColumn::new);
    }

    /**
     * Enter the version of the software used to calculate the structure.
     * @return StrColumn
     */
    public StrColumn getStructureSolutionVersion() {
        return delegate.getColumn("structure_solution_version", DelegatingStrColumn::new);
    }

    /**
     * Enter the name of the software used for refinement.
     * @return StrColumn
     */
    public StrColumn getRefinement() {
        return delegate.getColumn("refinement", DelegatingStrColumn::new);
    }

    /**
     * Enter the version of the software used for refinement.
     * @return StrColumn
     */
    public StrColumn getRefinementVersion() {
        return delegate.getColumn("refinement_version", DelegatingStrColumn::new);
    }

    /**
     * Enter the name of the software used for iterative relaxation matrix methods.
     * @return StrColumn
     */
    public StrColumn getIterativeRelaxationMatrix() {
        return delegate.getColumn("iterative_relaxation_matrix", DelegatingStrColumn::new);
    }

    /**
     * Enter the version of the software used for iterative relaxation matrix methods.
     * @return StrColumn
     */
    public StrColumn getIterativeRelaxationMatrixVersion() {
        return delegate.getColumn("iterative_relaxation_matrix_version", DelegatingStrColumn::new);
    }
}
