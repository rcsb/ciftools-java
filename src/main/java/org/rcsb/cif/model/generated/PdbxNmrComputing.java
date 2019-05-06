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
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Enter the name of the software used for data collection.
     * @return StrColumn
     */
    public StrColumn getCollection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("collection", StrColumn::new) :
                getBinaryColumn("collection"));
    }

    /**
     * Enter the version of the software used for data collection.
     * @return StrColumn
     */
    public StrColumn getCollectionVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("collection_version", StrColumn::new) :
                getBinaryColumn("collection_version"));
    }

    /**
     * Enter the name of the software used for data processing.
     * @return StrColumn
     */
    public StrColumn getProcessing() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("processing", StrColumn::new) :
                getBinaryColumn("processing"));
    }

    /**
     * Enter the version of the software used for data processing.
     * @return StrColumn
     */
    public StrColumn getProcessingVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("processing_version", StrColumn::new) :
                getBinaryColumn("processing_version"));
    }

    /**
     * Enter the name of the software used for data analysis.
     * @return StrColumn
     */
    public StrColumn getDataAnalysis() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_analysis", StrColumn::new) :
                getBinaryColumn("data_analysis"));
    }

    /**
     * Enter the version of the software used for data analysis.
     * @return StrColumn
     */
    public StrColumn getDataAnalysisVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_analysis_version", StrColumn::new) :
                getBinaryColumn("data_analysis_version"));
    }

    /**
     * Enter the name of the software used to calculate the structure.
     * @return StrColumn
     */
    public StrColumn getStructureSolution() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("structure_solution", StrColumn::new) :
                getBinaryColumn("structure_solution"));
    }

    /**
     * Enter the version of the software used to calculate the structure.
     * @return StrColumn
     */
    public StrColumn getStructureSolutionVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("structure_solution_version", StrColumn::new) :
                getBinaryColumn("structure_solution_version"));
    }

    /**
     * Enter the name of the software used for refinement.
     * @return StrColumn
     */
    public StrColumn getRefinement() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement", StrColumn::new) :
                getBinaryColumn("refinement"));
    }

    /**
     * Enter the version of the software used for refinement.
     * @return StrColumn
     */
    public StrColumn getRefinementVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_version", StrColumn::new) :
                getBinaryColumn("refinement_version"));
    }

    /**
     * Enter the name of the software used for iterative relaxation matrix methods.
     * @return StrColumn
     */
    public StrColumn getIterativeRelaxationMatrix() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("iterative_relaxation_matrix", StrColumn::new) :
                getBinaryColumn("iterative_relaxation_matrix"));
    }

    /**
     * Enter the version of the software used for iterative relaxation matrix methods.
     * @return StrColumn
     */
    public StrColumn getIterativeRelaxationMatrixVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("iterative_relaxation_matrix_version", StrColumn::new) :
                getBinaryColumn("iterative_relaxation_matrix_version"));
    }
}
