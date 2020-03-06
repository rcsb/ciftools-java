package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_LIGAND_PROBE category identifies
 * non-polymeric entities (ligands) that are used as probes.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmLigandProbe extends DelegatingCategory {
    public IhmLigandProbe(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "probe_id":
                return getProbeId();
            case "entity_id":
                return getEntityId();
            case "details":
                return getDetails();
            case "dataset_list_id":
                return getDatasetListId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the probe.
     * This data item is a pointer to _ihm_probe_list.probe_id
     * in the IHM_PROBE_LIST category.
     * @return IntColumn
     */
    public IntColumn getProbeId() {
        return delegate.getColumn("probe_id", DelegatingIntColumn::new);
    }

    /**
     * The entity id of the ligand.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the ligand probe.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the experimental dataset corresponding
     * to the ligand probe.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

}