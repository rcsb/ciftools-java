package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The table in this section is used to describe the software
 * that was used for data collection, data processing, data analysis,
 * structure calculations and refinement. The description should include
 * both the name of the software and the version used.
 */
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Enter the name of the software used for data collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCollection() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("collection", SingleRowStrColumn::new) :
                getBinaryColumn("collection"));
    }

    /**
     * Enter the version of the software used for data collection.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCollectionVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("collection_version", SingleRowStrColumn::new) :
                getBinaryColumn("collection_version"));
    }

    /**
     * Enter the name of the software used for data processing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProcessing() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("processing", SingleRowStrColumn::new) :
                getBinaryColumn("processing"));
    }

    /**
     * Enter the version of the software used for data processing.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getProcessingVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("processing_version", SingleRowStrColumn::new) :
                getBinaryColumn("processing_version"));
    }

    /**
     * Enter the name of the software used for data analysis.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDataAnalysis() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("data_analysis", SingleRowStrColumn::new) :
                getBinaryColumn("data_analysis"));
    }

    /**
     * Enter the version of the software used for data analysis.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDataAnalysisVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("data_analysis_version", SingleRowStrColumn::new) :
                getBinaryColumn("data_analysis_version"));
    }

    /**
     * Enter the name of the software used to calculate the structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStructureSolution() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("structure_solution", SingleRowStrColumn::new) :
                getBinaryColumn("structure_solution"));
    }

    /**
     * Enter the version of the software used to calculate the structure.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStructureSolutionVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("structure_solution_version", SingleRowStrColumn::new) :
                getBinaryColumn("structure_solution_version"));
    }

    /**
     * Enter the name of the software used for refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefinement() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("refinement", SingleRowStrColumn::new) :
                getBinaryColumn("refinement"));
    }

    /**
     * Enter the version of the software used for refinement.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getRefinementVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("refinement_version", SingleRowStrColumn::new) :
                getBinaryColumn("refinement_version"));
    }

    /**
     * Enter the name of the software used for iterative relaxation matrix methods.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIterativeRelaxationMatrix() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("iterative_relaxation_matrix", SingleRowStrColumn::new) :
                getBinaryColumn("iterative_relaxation_matrix"));
    }

    /**
     * Enter the version of the software used for iterative relaxation matrix methods.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getIterativeRelaxationMatrixVersion() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("iterative_relaxation_matrix_version", SingleRowStrColumn::new) :
                getBinaryColumn("iterative_relaxation_matrix_version"));
    }
}
