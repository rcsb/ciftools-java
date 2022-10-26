package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_EXPERIMENT category provide
 * high-level classification of the EM experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmExperiment extends DelegatingCategory {
    public EmExperiment(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "reconstruction_method":
                return getReconstructionMethod();
            case "aggregation_state":
                return getAggregationState();
            case "specimen_type":
                return getSpecimenType();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * PRIMARY KEY
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The reconstruction method used in the EM experiment.
     * @return StrColumn
     */
    public StrColumn getReconstructionMethod() {
        return delegate.getColumn("reconstruction_method", DelegatingStrColumn::new);
    }

    /**
     * The aggregation/assembly state of the imaged specimen.
     * @return StrColumn
     */
    public StrColumn getAggregationState() {
        return delegate.getColumn("aggregation_state", DelegatingStrColumn::new);
    }

    /**
     * The specimen type used in the EM experiment.
     * @return StrColumn
     */
    public StrColumn getSpecimenType() {
        return delegate.getColumn("specimen_type", DelegatingStrColumn::new);
    }

    /**
     * Foreign key to the EM_ENTITY_ASSEMBLY category
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

}