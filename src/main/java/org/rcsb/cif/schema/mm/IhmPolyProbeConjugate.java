package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_POLY_PROBE_CONJUGATE category records the
 * details of the probes that are covalenty attached to residues in the
 * polymeric entities.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPolyProbeConjugate extends DelegatingCategory {
    public IhmPolyProbeConjugate(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "probe_id":
                return getProbeId();
            case "position_id":
                return getPositionId();
            case "chem_comp_descriptor_id":
                return getChemCompDescriptorId();
            case "ambiguous_stoichiometry_flag":
                return getAmbiguousStoichiometryFlag();
            case "probe_stoichiometry":
                return getProbeStoichiometry();
            case "details":
                return getDetails();
            case "dataset_list_id":
                return getDatasetListId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the probe.
     * This data item is a pointer to _ihm_probe_list.probe_id in the
     * IHM_PROBE_LIST category.
     * @return IntColumn
     */
    public IntColumn getProbeId() {
        return delegate.getColumn("probe_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the position in the polymeric entity where the probe
     * is attached.
     * This data item is a pointer to _ihm_poly_probe_position.id in the
     * IHM_POLY_PROBE_POSITION category.
     * @return IntColumn
     */
    public IntColumn getPositionId() {
        return delegate.getColumn("position_id", DelegatingIntColumn::new);
    }

    /**
     * The chemical descriptor of the polymeric residue conjugate with the probe.
     * This data item is a pointer to _ihm_chemical_component_descriptor.id in the
     * IHM_CHEMICAL_COMPONENT_DESCRIPTOR category.
     * @return IntColumn
     */
    public IntColumn getChemCompDescriptorId() {
        return delegate.getColumn("chem_comp_descriptor_id", DelegatingIntColumn::new);
    }

    /**
     * Indicate whether there is ambiguity regarding the stoichiometry of the labeled site.
     * @return StrColumn
     */
    public StrColumn getAmbiguousStoichiometryFlag() {
        return delegate.getColumn("ambiguous_stoichiometry_flag", DelegatingStrColumn::new);
    }

    /**
     * The stoichiometry of the probe labeling site, if known.
     * @return FloatColumn
     */
    public FloatColumn getProbeStoichiometry() {
        return delegate.getColumn("probe_stoichiometry", DelegatingFloatColumn::new);
    }

    /**
     * Additional details regarding the conjugate.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * An identifier for the experimental dataset corresponding to the
     * polymer-probe conjugate.
     * This data item is a pointer to _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

}