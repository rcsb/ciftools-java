package org.rcsb.cif.schema.mm.generated;

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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * Placeholder ID.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The reconstruction method used in the EM experiment.
     * @return StrColumn
     */
    public StrColumn getReconstructionMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("reconstruction_method", StrColumn::new) :
                getBinaryColumn("reconstruction_method"));
    }

    /**
     * The aggregation/assembly state of the imaged specimen.
     * @return StrColumn
     */
    public StrColumn getAggregationState() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("aggregation_state", StrColumn::new) :
                getBinaryColumn("aggregation_state"));
    }

    /**
     * The specimen type used in the EM experiment.
     * @return StrColumn
     */
    public StrColumn getSpecimenType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("specimen_type", StrColumn::new) :
                getBinaryColumn("specimen_type"));
    }

    /**
     * Foreign key to the EM_ENTITY_ASSEMBLY category
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }
}
