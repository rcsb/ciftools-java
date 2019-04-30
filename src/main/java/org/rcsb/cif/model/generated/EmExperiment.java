package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_EXPERIMENT category provide
 * high-level classification of the EM experiment.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmExperiment extends BaseCategory {
    public EmExperiment(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmExperiment(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmExperiment(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Placeholder ID.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The reconstruction method used in the EM experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getReconstructionMethod() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("reconstruction_method", SingleRowStrColumn::new) :
                getBinaryColumn("reconstruction_method"));
    }

    /**
     * The aggregation/assembly state of the imaged specimen.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAggregationState() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("aggregation_state", SingleRowStrColumn::new) :
                getBinaryColumn("aggregation_state"));
    }

    /**
     * The specimen type used in the EM experiment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSpecimenType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("specimen_type", SingleRowStrColumn::new) :
                getBinaryColumn("specimen_type"));
    }

    /**
     * Foreign key to the EM_ENTITY_ASSEMBLY category
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityAssemblyId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", SingleRowStrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }
}
