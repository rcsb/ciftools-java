package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VALIDATE_PLANES_ATOM category list the
 * residues that contain unexpected deviations from planes
 * centers.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValidatePlanesAtom extends DelegatingCategory {
    public PdbxValidatePlanesAtom(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "plane_id":
                return getPlaneId();
            case "id":
                return getId();
            case "PDB_model_num":
                return getPDBModelNum();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "PDB_ins_code":
                return getPDBInsCode();
            case "auth_atom_id":
                return getAuthAtomId();
            case "atom_deviation":
                return getAtomDeviation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A pointer to _pdbx_validate_planes.id
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getPlaneId() {
        return delegate.getColumn("plane_id", DelegatingIntColumn::new);
    }

    /**
     * The value of _pdbx_validate_planes_atom.id must uniquely identify
     * each item in the PDBX_VALIDATE_PLANES_ATOM list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for an atom site defining the plane
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_model_num in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return delegate.getColumn("PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of an atom site that defines the plane
     * @return StrColumn
     */
    public StrColumn getPDBInsCode() {
        return delegate.getColumn("PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of an atom site that defines the plane
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The deviation from the plane per atom
     * @return FloatColumn
     */
    public FloatColumn getAtomDeviation() {
        return delegate.getColumn("atom_deviation", DelegatingFloatColumn::new);
    }

}