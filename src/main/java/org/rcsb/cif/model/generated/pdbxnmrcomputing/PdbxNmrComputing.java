package org.rcsb.cif.model.generated.pdbxnmrcomputing;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrComputing extends BaseCategory {
    public PdbxNmrComputing(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrComputing(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrComputing(String name) {
        super(name);
    }

    /**
     * The entry ID for the structure determination.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Enter the name of the software used for data collection.
     * @return Collection
     */
    public Collection getCollection() {
        return (Collection) (isText ? textFields.computeIfAbsent("collection",
                Collection::new) : getBinaryColumn("collection"));
    }

    /**
     * Enter the version of the software used for data collection.
     * @return CollectionVersion
     */
    public CollectionVersion getCollectionVersion() {
        return (CollectionVersion) (isText ? textFields.computeIfAbsent("collection_version",
                CollectionVersion::new) : getBinaryColumn("collection_version"));
    }

    /**
     * Enter the name of the software used for data processing.
     * @return Processing
     */
    public Processing getProcessing() {
        return (Processing) (isText ? textFields.computeIfAbsent("processing",
                Processing::new) : getBinaryColumn("processing"));
    }

    /**
     * Enter the version of the software used for data processing.
     * @return ProcessingVersion
     */
    public ProcessingVersion getProcessingVersion() {
        return (ProcessingVersion) (isText ? textFields.computeIfAbsent("processing_version",
                ProcessingVersion::new) : getBinaryColumn("processing_version"));
    }

    /**
     * Enter the name of the software used for data analysis.
     * @return DataAnalysis
     */
    public DataAnalysis getDataAnalysis() {
        return (DataAnalysis) (isText ? textFields.computeIfAbsent("data_analysis",
                DataAnalysis::new) : getBinaryColumn("data_analysis"));
    }

    /**
     * Enter the version of the software used for data analysis.
     * @return DataAnalysisVersion
     */
    public DataAnalysisVersion getDataAnalysisVersion() {
        return (DataAnalysisVersion) (isText ? textFields.computeIfAbsent("data_analysis_version",
                DataAnalysisVersion::new) : getBinaryColumn("data_analysis_version"));
    }

    /**
     * Enter the name of the software used to calculate the structure.
     * @return StructureSolution
     */
    public StructureSolution getStructureSolution() {
        return (StructureSolution) (isText ? textFields.computeIfAbsent("structure_solution",
                StructureSolution::new) : getBinaryColumn("structure_solution"));
    }

    /**
     * Enter the version of the software used to calculate the structure.
     * @return StructureSolutionVersion
     */
    public StructureSolutionVersion getStructureSolutionVersion() {
        return (StructureSolutionVersion) (isText ? textFields.computeIfAbsent("structure_solution_version",
                StructureSolutionVersion::new) : getBinaryColumn("structure_solution_version"));
    }

    /**
     * Enter the name of the software used for refinement.
     * @return Refinement
     */
    public Refinement getRefinement() {
        return (Refinement) (isText ? textFields.computeIfAbsent("refinement",
                Refinement::new) : getBinaryColumn("refinement"));
    }

    /**
     * Enter the version of the software used for refinement.
     * @return RefinementVersion
     */
    public RefinementVersion getRefinementVersion() {
        return (RefinementVersion) (isText ? textFields.computeIfAbsent("refinement_version",
                RefinementVersion::new) : getBinaryColumn("refinement_version"));
    }

    /**
     * Enter the name of the software used for iterative relaxation matrix methods.
     * @return IterativeRelaxationMatrix
     */
    public IterativeRelaxationMatrix getIterativeRelaxationMatrix() {
        return (IterativeRelaxationMatrix) (isText ? textFields.computeIfAbsent("iterative_relaxation_matrix",
                IterativeRelaxationMatrix::new) : getBinaryColumn("iterative_relaxation_matrix"));
    }

    /**
     * Enter the version of the software used for iterative relaxation matrix methods.
     * @return IterativeRelaxationMatrixVersion
     */
    public IterativeRelaxationMatrixVersion getIterativeRelaxationMatrixVersion() {
        return (IterativeRelaxationMatrixVersion) (isText ? textFields.computeIfAbsent("iterative_relaxation_matrix_version",
                IterativeRelaxationMatrixVersion::new) : getBinaryColumn("iterative_relaxation_matrix_version"));
    }
}
