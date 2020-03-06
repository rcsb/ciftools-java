package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_POLY_PROBE_POSITION category identifies
 * specific residue positions in the polymeric entity where probes
 * are covalently attached.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPolyProbePosition extends DelegatingCategory {
    public IhmPolyProbePosition(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "entity_id":
                return getEntityId();
            case "entity_description":
                return getEntityDescription();
            case "seq_id":
                return getSeqId();
            case "comp_id":
                return getCompId();
            case "mutation_flag":
                return getMutationFlag();
            case "mut_res_chem_comp_id":
                return getMutResChemCompId();
            case "modification_flag":
                return getModificationFlag();
            case "mod_res_chem_comp_descriptor_id":
                return getModResChemCompDescriptorId();
            case "description":
                return getDescription();
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
     * A unique identifier for the entity where the probe is attached.
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * Description of the entity.
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return delegate.getColumn("entity_description", DelegatingStrColumn::new);
    }

    /**
     * The sequence index of the residue in the entity where the probe is attached.
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * The component identifier of the residue in the entity where the probe is attached.
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the residue has an engineered mutation or not.
     * @return StrColumn
     */
    public StrColumn getMutationFlag() {
        return delegate.getColumn("mutation_flag", DelegatingStrColumn::new);
    }

    /**
     * The chemical component identifier of the mutated residue, if applicable.
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP category.
     * @return StrColumn
     */
    public StrColumn getMutResChemCompId() {
        return delegate.getColumn("mut_res_chem_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the residue is chemically modified or not.
     * @return StrColumn
     */
    public StrColumn getModificationFlag() {
        return delegate.getColumn("modification_flag", DelegatingStrColumn::new);
    }

    /**
     * An identifier to the chemical descriptor of the modified residue, if applicable.
     * This data item is a pointer to _ihm_chemical_component_descriptor.id in the
     * IHM_CHEMICAL_COMPONENT_DESCRIPTOR category.
     * @return IntColumn
     */
    public IntColumn getModResChemCompDescriptorId() {
        return delegate.getColumn("mod_res_chem_comp_descriptor_id", DelegatingIntColumn::new);
    }

    /**
     * An author provided description for the residue position in the polymer.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

}