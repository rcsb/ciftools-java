package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DEPUI_ENTITY_STATUS_FLAGS category record status
 * details related to individual entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDepuiEntityStatusFlags extends DelegatingCategory {
    public PdbxDepuiEntityStatusFlags(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "dep_dataset_id":
                return getDepDatasetId();
            case "entity_id":
                return getEntityId();
            case "has_mutation":
                return getHasMutation();
            case "sample_xyz_sequence_alignments_valid":
                return getSampleXyzSequenceAlignmentsValid();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The internal identifier assigned to each deposition.
     * @return StrColumn
     */
    public StrColumn getDepDatasetId() {
        return delegate.getColumn("dep_dataset_id", DelegatingStrColumn::new);
    }

    /**
     * A reference to the _entity.id in the ENTITY_POLY category
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that the entity has a mutation.
     * @return StrColumn
     */
    public StrColumn getHasMutation() {
        return delegate.getColumn("has_mutation", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that sample and coordinate sequence alignments is valid for this entity
     * @return StrColumn
     */
    public StrColumn getSampleXyzSequenceAlignmentsValid() {
        return delegate.getColumn("sample_xyz_sequence_alignments_valid", DelegatingStrColumn::new);
    }

}