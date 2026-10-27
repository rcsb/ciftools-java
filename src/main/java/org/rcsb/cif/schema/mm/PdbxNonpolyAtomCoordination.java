package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_NONPOLY_ATOM_COORDINATION category provide
 * coordination information on selected atoms
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNonpolyAtomCoordination extends DelegatingCategory {
    public PdbxNonpolyAtomCoordination(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
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
            case "number":
                return getNumber();
            case "geometry_calculated":
                return getGeometryCalculated();
            case "remark":
                return getRemark();
            case "geometry_generic":
                return getGeometryGeneric();
            case "geometry_abbr":
                return getGeometryAbbr();
            case "provenance":
                return getProvenance();
            case "assessment":
                return getAssessment();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is used to group together equivalent
     * geometries coming from different software programs.
     * For instance, if one program has an output of 'tetrahedral'
     * and another has an output of 'tetrahedron' for the same atom,
     * these two records will have the same geometry_id
     * because these two outputs represent the same coordination geometry.
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
     * This data item is a pointer to _atom_site.label_comp_id in the ATOM_SITE
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
     * The coordination number of the target atom.
     * @return IntColumn
     */
    public IntColumn getNumber() {
        return delegate.getColumn("number", DelegatingIntColumn::new);
    }

    /**
     * This data item contains the geometry output from a software program
     * (for example, FindGeo or MetalCoord). The geometry is based on what
     * is observed in the coordinate file.
     * @return StrColumn
     */
    public StrColumn getGeometryCalculated() {
        return delegate.getColumn("geometry_calculated", DelegatingStrColumn::new);
    }

    /**
     * This data item describes the agreement of the
     * software-generated geometry with the idealized
     * reference geometries. This information is generated by
     * the software that generates geometry annotation.
     * @return StrColumn
     */
    public StrColumn getRemark() {
        return delegate.getColumn("remark", DelegatingStrColumn::new);
    }

    /**
     * This data item translates the geometry output from a
     * software program (for example, FindGeo or MetalCoord)
     * into a unified naming scheme. As software programs
     * sometimes have different names for the same geometry
     * (for instance, 'tetrahedral' and 'tetrahedron'
     * correspond to the same geometry), this data item
     * provides a name for the geometry that is consistent
     * regardless of the provenance to enhance
     * findability. The geometry is based on what is observed
     * in the coordinate file.
     * @return StrColumn
     */
    public StrColumn getGeometryGeneric() {
        return delegate.getColumn("geometry_generic", DelegatingStrColumn::new);
    }

    /**
     * This data item lists the abbreviated name of the
     * geometry, as specified in the
     * _pdbx_nonpoly_atom_coordination_sphere.descriptor. For
     * instance, square planar is abbreviated to SPL. The
     * geometry derived from observed geometries in atomic
     * coordinate files.
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
     * This data item provides an assessment of the coordination.
     * The assessment is based on comparison with the CCD. If coordination
     * is annotated in the CCD, then the coordination in the structure will
     * be compared with the reference(s) in the CCD. If there is a match
     * with the reference CCD, assessment will be annotated as Expected,
     * whereas if there is not a match, assessment will be annotated as Unexpected.
     * If there is no reference in the CCD, assessment will be annotated
     * as 'No reference'.
     * @return StrColumn
     */
    public StrColumn getAssessment() {
        return delegate.getColumn("assessment", DelegatingStrColumn::new);
    }

}