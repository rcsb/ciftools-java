package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_CROSS_LINK_RESULT category records the
 * results of the crosslinking restraints in the IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmCrossLinkResult extends DelegatingCategory {
    public IhmCrossLinkResult(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "restraint_id":
                return getRestraintId();
            case "ensemble_id":
                return getEnsembleId();
            case "num_models":
                return getNumModels();
            case "distance_threshold":
                return getDistanceThreshold();
            case "median_distance":
                return getMedianDistance();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the restraint/ensemble combination.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the crosslink restraint between a pair of residues.
     * This data item is a pointer to _ihm_cross_link_restraint.id in the
     * IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return delegate.getColumn("restraint_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the ensemble whose results are described.
     * This data item is a pointer to _ihm_ensemble_info.ensemble_id in the
     * IHM_ENSEMBLE_INFO category.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return delegate.getColumn("ensemble_id", DelegatingIntColumn::new);
    }

    /**
     * Number of models sampled in the integrative modeling task, for which
     * the crosslinking distance is provided.
     * @return IntColumn
     */
    public IntColumn getNumModels() {
        return delegate.getColumn("num_models", DelegatingIntColumn::new);
    }

    /**
     * The distance threshold applied to this crosslink in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceThreshold() {
        return delegate.getColumn("distance_threshold", DelegatingFloatColumn::new);
    }

    /**
     * The median distance between the crosslinked residues in the sampled models.
     * @return FloatColumn
     */
    public FloatColumn getMedianDistance() {
        return delegate.getColumn("median_distance", DelegatingFloatColumn::new);
    }

    /**
     * This records holds any associated details of the results of the particular
     * crosslink restraint in the integrative modeling task.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}