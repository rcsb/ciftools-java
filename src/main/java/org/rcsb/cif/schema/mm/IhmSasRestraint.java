package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_SAS_RESTRAINT category records the
 * details of the SAS data used as restraints in the
 * IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmSasRestraint extends DelegatingCategory {
    public IhmSasRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "dataset_list_id":
                return getDatasetListId();
            case "model_id":
                return getModelId();
            case "struct_assembly_id":
                return getStructAssemblyId();
            case "profile_segment_flag":
                return getProfileSegmentFlag();
            case "fitting_atom_type":
                return getFittingAtomType();
            case "fitting_method":
                return getFittingMethod();
            case "fitting_state":
                return getFittingState();
            case "radius_of_gyration":
                return getRadiusOfGyration();
            case "chi_value":
                return getChiValue();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the SAS restraint description.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the SAS data used.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The model number corresponding to the SAS fitting result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * An indicator to whether the whole assembly that is modeled is fit into the SAS data
     * or if only a subset of the structural assembly is fit into the data.
     * This data item is a pointer to _ihm_struct_assembly.id in the
     * IHM_STRUCT_ASSEMBLY category. The IHM_STRUCT_ASSEMBLY category provides the
     * details regarding the different structural assemblies used in the modeling.
     * The default value for this data item is "1" indicating that the entire assembly
     * being modeled is fit into the SAS data.
     * @return IntColumn
     */
    public IntColumn getStructAssemblyId() {
        return delegate.getColumn("struct_assembly_id", DelegatingIntColumn::new);
    }

    /**
     * A flag that indicates whether or not the SAS profile is segmented i.e.,
     * whether the whole SAS profile is used or only a portion of it is used
     * (by masking or by other means) as restraint in the modeling.
     * @return StrColumn
     */
    public StrColumn getProfileSegmentFlag() {
        return delegate.getColumn("profile_segment_flag", DelegatingStrColumn::new);
    }

    /**
     * The type of atoms in the model fit to the SAS data.
     * @return StrColumn
     */
    public StrColumn getFittingAtomType() {
        return delegate.getColumn("fitting_atom_type", DelegatingStrColumn::new);
    }

    /**
     * The method used for fitting the model to the SAS data.
     * @return StrColumn
     */
    public StrColumn getFittingMethod() {
        return delegate.getColumn("fitting_method", DelegatingStrColumn::new);
    }

    /**
     * An indicator to single or multiple state fitting.
     * @return StrColumn
     */
    public StrColumn getFittingState() {
        return delegate.getColumn("fitting_state", DelegatingStrColumn::new);
    }

    /**
     * Radius of gyration obtained from the SAS profile, if used as input restraint.
     * @return FloatColumn
     */
    public FloatColumn getRadiusOfGyration() {
        return delegate.getColumn("radius_of_gyration", DelegatingFloatColumn::new);
    }

    /**
     * The chi value resulting from fitting the model to the SAS data.
     * @return FloatColumn
     */
    public FloatColumn getChiValue() {
        return delegate.getColumn("chi_value", DelegatingFloatColumn::new);
    }

    /**
     * Additional details regarding the SAS restraint used.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}