package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CHEM_COMP_ATOM_COORDINATION category provide
 * coordination information on selected atoms
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxChemCompAtomCoordination extends DelegatingCategory {
    public PdbxChemCompAtomCoordination(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "geometry_id":
                return getGeometryId();
            case "comp_id":
                return getCompId();
            case "atom_id":
                return getAtomId();
            case "number":
                return getNumber();
            case "geometry_calculated":
                return getGeometryCalculated();
            case "geometry_generic":
                return getGeometryGeneric();
            case "geometry_abbr":
                return getGeometryAbbr();
            case "provenance":
                return getProvenance();
            case "representative_entry_id":
                return getRepresentativeEntryId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is used to group together equivalent geometries coming from different
     * software programs. For instance, if one program has an output of 'tetrahedral' and
     * another has an output of 'tetrahedron' for the same atom, these two records will
     * have the same geometry_id because these two outputs represent the same coordination geometry.
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
     * The coordination number of the target atom.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * This data item contains the geometry output from a software program (for example, FindGeo or MetalCoord).
     * The geometry derived from observed geometries in atomic coordinate files.
     * @return StrColumn
     */
    public StrColumn getGeometryCalculated() {
        return delegate.getColumn("geometry_calculated", DelegatingStrColumn::new);
    }

    /**
     * This data item translates the geometry output from a software program (for example, FindGeo or MetalCoord) into
     * a unified naming scheme. As software programs sometimes have different names for the same geometry (for instance,
     * 'tetrahedral' and 'tetrahedron' correspond to the same geometry), this data item provides a name for
     * the geometry that is consistent regardless of the provenance to enhance findability. The geometry derived
     * from observed geometries in atomic coordinate files.
     * @return StrColumn
     */
    public StrColumn getGeometryGeneric() {
        return delegate.getColumn("geometry_generic", DelegatingStrColumn::new);
    }

    /**
     * This data item lists the abbreviated name of the geometry, as specified in the
     * _pdbx_chem_comp_atom_coordination_sphere.descriptor. For instance, square planar
     * is abbreviated to SPL. The geometry derived from observed geometries in atomic coordinate files.
     * @return StrColumn
     */
    public StrColumn getGeometryAbbr() {
        return delegate.getColumn("geometry_abbr", DelegatingStrColumn::new);
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