package org.rcsb.cif.model.emexperiment;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * Placeholder ID.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The reconstruction method used in the EM experiment.
     * @return ReconstructionMethod
     */
    public ReconstructionMethod getReconstructionMethod() {
        return (ReconstructionMethod) (isText ? textFields.computeIfAbsent("reconstruction_method",
                ReconstructionMethod::new) : getBinaryColumn("reconstruction_method"));
    }

    /**
     * The aggregation/assembly state of the imaged specimen.
     * @return AggregationState
     */
    public AggregationState getAggregationState() {
        return (AggregationState) (isText ? textFields.computeIfAbsent("aggregation_state",
                AggregationState::new) : getBinaryColumn("aggregation_state"));
    }

    /**
     * The specimen type used in the EM experiment.
     * @return SpecimenType
     */
    public SpecimenType getSpecimenType() {
        return (SpecimenType) (isText ? textFields.computeIfAbsent("specimen_type",
                SpecimenType::new) : getBinaryColumn("specimen_type"));
    }

    /**
     * Foreign key to the EM_ENTITY_ASSEMBLY category
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }
}
