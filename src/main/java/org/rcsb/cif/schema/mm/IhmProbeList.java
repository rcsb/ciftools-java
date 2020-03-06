package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_PROBE_LIST category records the
 * list of probes used in the experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmProbeList extends DelegatingCategory {
    public IhmProbeList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "probe_id":
                return getProbeId();
            case "probe_name":
                return getProbeName();
            case "reactive_probe_flag":
                return getReactiveProbeFlag();
            case "reactive_probe_name":
                return getReactiveProbeName();
            case "probe_origin":
                return getProbeOrigin();
            case "probe_link_type":
                return getProbeLinkType();
            case "probe_chem_comp_descriptor_id":
                return getProbeChemCompDescriptorId();
            case "reactive_probe_chem_comp_descriptor_id":
                return getReactiveProbeChemCompDescriptorId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getProbeId() {
        return delegate.getColumn("probe_id", DelegatingIntColumn::new);
    }

    /**
     * Author provided name for the probe.
     * @return StrColumn
     */
    public StrColumn getProbeName() {
        return delegate.getColumn("probe_name", DelegatingStrColumn::new);
    }

    /**
     * Indicate whether the probe has a reactive form.
     * @return StrColumn
     */
    public StrColumn getReactiveProbeFlag() {
        return delegate.getColumn("reactive_probe_flag", DelegatingStrColumn::new);
    }

    /**
     * Author provided name for the reactive_probe, if applicable.
     * @return StrColumn
     */
    public StrColumn getReactiveProbeName() {
        return delegate.getColumn("reactive_probe_name", DelegatingStrColumn::new);
    }

    /**
     * The origin of the probe.
     * @return StrColumn
     */
    public StrColumn getProbeOrigin() {
        return delegate.getColumn("probe_origin", DelegatingStrColumn::new);
    }

    /**
     * The type of link between the probe and the biomolecule.
     * @return StrColumn
     */
    public StrColumn getProbeLinkType() {
        return delegate.getColumn("probe_link_type", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the chemical descriptor of the probe.
     * This data item is a pointer to _ihm_chemical_component_descriptor.id in the
     * IHM_CHEMICAL_COMPONENT_DESCRIPTOR category.
     * @return IntColumn
     */
    public IntColumn getProbeChemCompDescriptorId() {
        return delegate.getColumn("probe_chem_comp_descriptor_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier for the chemical descriptor of the reactive probe.
     * This data item is a pointer to _ihm_chemical_component_descriptor.id in the
     * IHM_CHEMICAL_COMPONENT_DESCRIPTOR category.
     * @return IntColumn
     */
    public IntColumn getReactiveProbeChemCompDescriptorId() {
        return delegate.getColumn("reactive_probe_chem_comp_descriptor_id", DelegatingIntColumn::new);
    }

}