package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_EPR_RESTRAINT category records the
 * details of the EPR data used as restraints in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmEprRestraint extends DelegatingCategory {
    public IhmEprRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "dataset_list_id":
                return getDatasetListId();
            case "model_id":
                return getModelId();
            case "fitting_particle_type":
                return getFittingParticleType();
            case "fitting_method":
                return getFittingMethod();
            case "fitting_method_citation_id":
                return getFittingMethodCitationId();
            case "fitting_state":
                return getFittingState();
            case "fitting_software_id":
                return getFittingSoftwareId();
            case "chi_value":
                return getChiValue();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the EPR restraint description.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the EPR data used.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The model number corresponding to the EPR fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The type of particle fit to the EPR data.
     * @return StrColumn
     */
    public StrColumn getFittingParticleType() {
        return delegate.getColumn("fitting_particle_type", DelegatingStrColumn::new);
    }

    /**
     * The method used for fitting the model to the EPR data.
     * @return StrColumn
     */
    public StrColumn getFittingMethod() {
        return delegate.getColumn("fitting_method", DelegatingStrColumn::new);
    }

    /**
     * Identifier pointing to the citation for the fitting method.
     * This data item is a pointer to _citation.id in the
     * CITATION category.
     * @return StrColumn
     */
    public StrColumn getFittingMethodCitationId() {
        return delegate.getColumn("fitting_method_citation_id", DelegatingStrColumn::new);
    }

    /**
     * An indicator to single or multiple state fitting.
     * @return StrColumn
     */
    public StrColumn getFittingState() {
        return delegate.getColumn("fitting_state", DelegatingStrColumn::new);
    }

    /**
     * Identifier pointing to the software used for fitting.
     * This data item is a pointer to _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getFittingSoftwareId() {
        return delegate.getColumn("fitting_software_id", DelegatingIntColumn::new);
    }

    /**
     * The chi value resulting from fitting the model to the EPR data.
     * @return FloatColumn
     */
    public FloatColumn getChiValue() {
        return delegate.getColumn("chi_value", DelegatingFloatColumn::new);
    }

    /**
     * Additional details regarding the EPR restraint used.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}