package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_ATOM_COORDINATION_SPHERE category provide
 * geometric coordination information on selected atoms
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompAtomCoordinationSphere extends DelegatingCategory {
    public PdbxChemCompAtomCoordinationSphere(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "geometry_id":
                return getGeometryId();
            case "comp_id":
                return getCompId();
            case "atom_id":
                return getAtomId();
            case "descriptor":
                return getDescriptor();
            case "provenance":
                return getProvenance();
            case "representative_entry_id":
                return getRepresentativeEntryId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a foreign key to _pdbx_chem_comp_atom_coordination.geometry_id. This item maps the
     * coordination descriptor to a specific geometry described in the pdbx_chem_comp_atom_coordination category.
     * @return IntColumn
     */
    public IntColumn getGeometryId() {
        return delegate.getColumn("geometry_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp_atom.comp_id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the target atom to which the feature is assigned.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * This data item contains a descriptor of the coordination environment of
     * an atom. The descriptor is derived from observed coordination environments
     * in atomic coordinate files.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return delegate.getColumn("descriptor", DelegatingStrColumn::new);
    }

    /**
     * The provenance of the feature assigned to this atom.
     * @return StrColumn
     */
    public StrColumn getProvenance() {
        return delegate.getColumn("provenance", DelegatingStrColumn::new);
    }

    /**
     * The representative entry for this set
     * @return StrColumn
     */
    public StrColumn getRepresentativeEntryId() {
        return delegate.getColumn("representative_entry_id", DelegatingStrColumn::new);
    }

}