package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_NONPOLY_ATOM_COORDINATION_SPHERE category provide
 * geometric coordination information on selected atoms
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNonpolyAtomCoordinationSphere extends DelegatingCategory {
    public PdbxNonpolyAtomCoordinationSphere(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "geometry_id":
                return getGeometryId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_seq_id":
                return getLabelSeqId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_atom_id":
                return getLabelAtomId();
            case "label_alt_id":
                return getLabelAltId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "descriptor":
                return getDescriptor();
            case "provenance":
                return getProvenance();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is the parent for
     * _pdbx_nonpoly_atom_coordination_sphere_order.sphere_id.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a foreign key to _pdbx_nonpoly_atom_coordination.geometry_id. This
     * item maps the coordination descriptor to a specific geometry described in the
     * pdbx_nonpoly_atom_coordination category.
     * @return IntColumn
     */
    public IntColumn getGeometryId() {
        return delegate.getColumn("geometry_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the instance of the STRUCT_ASYM_ID to which this feature applies.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.comp_id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the target atom to which the feature is assigned.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A place holder to indicate alternate conformation.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for the residue at which the
     * conformation segment begins.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in
     * the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for partner 1 of the structure
     * connection.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * This data item contains a descriptor of the coordination environment
     * of an atom. The descriptor is based on what is observed in the coordinate
     * file.
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

}