package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_TLS category record details about
 * TLS parameters used in structure refinement. Note that the
 * intention is primarily to describe directly refined TLS
 * parameters, although other methods of obtaining TLS parameters
 * may be covered, see item _pdbx_refine_tls.method
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxRefineTls extends DelegatingCategory {
    public PdbxRefineTls(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "details":
                return getDetails();
            case "method":
                return getMethod();
            case "origin_x":
                return getOriginX();
            case "origin_y":
                return getOriginY();
            case "origin_z":
                return getOriginZ();
            case "T[1][1]":
                return getT11();
            case "T[1][1]_esd":
                return getT11Esd();
            case "T[1][2]":
                return getT12();
            case "T[1][2]_esd":
                return getT12Esd();
            case "T[1][3]":
                return getT13();
            case "T[1][3]_esd":
                return getT13Esd();
            case "T[2][2]":
                return getT22();
            case "T[2][2]_esd":
                return getT22Esd();
            case "T[2][3]":
                return getT23();
            case "T[2][3]_esd":
                return getT23Esd();
            case "T[3][3]":
                return getT33();
            case "T[3][3]_esd":
                return getT33Esd();
            case "L[1][1]":
                return getL11();
            case "L[1][1]_esd":
                return getL11Esd();
            case "L[1][2]":
                return getL12();
            case "L[1][2]_esd":
                return getL12Esd();
            case "L[1][3]":
                return getL13();
            case "L[1][3]_esd":
                return getL13Esd();
            case "L[2][2]":
                return getL22();
            case "L[2][2]_esd":
                return getL22Esd();
            case "L[2][3]":
                return getL23();
            case "L[2][3]_esd":
                return getL23Esd();
            case "L[3][3]":
                return getL33();
            case "L[3][3]_esd":
                return getL33Esd();
            case "S[1][1]":
                return getS11();
            case "S[1][1]_esd":
                return getS11Esd();
            case "S[1][2]":
                return getS12();
            case "S[1][2]_esd":
                return getS12Esd();
            case "S[1][3]":
                return getS13();
            case "S[1][3]_esd":
                return getS13Esd();
            case "S[2][1]":
                return getS21();
            case "S[2][1]_esd":
                return getS21Esd();
            case "S[2][2]":
                return getS22();
            case "S[2][2]_esd":
                return getS22Esd();
            case "S[2][3]":
                return getS23();
            case "S[2][3]_esd":
                return getS23Esd();
            case "S[3][1]":
                return getS31();
            case "S[3][1]_esd":
                return getS31Esd();
            case "S[3][2]":
                return getS32();
            case "S[3][2]_esd":
                return getS32Esd();
            case "S[3][3]":
                return getS33();
            case "S[3][3]_esd":
                return getS33Esd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_refine_tls.id must uniquely identify a record in
     * the PDBX_REFINE_TLS list.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_tls.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
    }

    /**
     * A description of the TLS group, such as a domain name or a
     * chemical group name.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The method by which the TLS parameters were obtained.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return delegate.getColumn("method", DelegatingStrColumn::new);
    }

    /**
     * The x coordinate in angstroms of the origin to which the
     * TLS parameters are referred, specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * given in _atom_sites.Cartn_transform_axes.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getOriginX() {
        return delegate.getColumn("origin_x", DelegatingFloatColumn::new);
    }

    /**
     * The y coordinate in angstroms of the origin to which the
     * TLS parameters are referred, specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * given in _atom_sites.Cartn_transform_axes.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getOriginY() {
        return delegate.getColumn("origin_y", DelegatingFloatColumn::new);
    }

    /**
     * The z coordinate in angstroms of the origin to which the
     * TLS parameters are referred, specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * given in _atom_sites.Cartn_transform_axes.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getOriginZ() {
        return delegate.getColumn("origin_z", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT11() {
        return delegate.getColumn("T[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT11Esd() {
        return delegate.getColumn("T[1][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT12() {
        return delegate.getColumn("T[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT12Esd() {
        return delegate.getColumn("T[1][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT13() {
        return delegate.getColumn("T[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT13Esd() {
        return delegate.getColumn("T[1][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT22() {
        return delegate.getColumn("T[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT22Esd() {
        return delegate.getColumn("T[2][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT23() {
        return delegate.getColumn("T[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT23Esd() {
        return delegate.getColumn("T[2][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT33() {
        return delegate.getColumn("T[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT33Esd() {
        return delegate.getColumn("T[3][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL11() {
        return delegate.getColumn("L[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL11Esd() {
        return delegate.getColumn("L[1][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL12() {
        return delegate.getColumn("L[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL12Esd() {
        return delegate.getColumn("L[1][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL13() {
        return delegate.getColumn("L[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL13Esd() {
        return delegate.getColumn("L[1][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL22() {
        return delegate.getColumn("L[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL22Esd() {
        return delegate.getColumn("L[2][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL23() {
        return delegate.getColumn("L[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL23Esd() {
        return delegate.getColumn("L[2][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL33() {
        return delegate.getColumn("L[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL33Esd() {
        return delegate.getColumn("L[3][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * The trace of S is indeterminate by crystallography, and should
     * be set to zero.
     * @return FloatColumn
     */
    public FloatColumn getS11() {
        return delegate.getColumn("S[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS11Esd() {
        return delegate.getColumn("S[1][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getS12() {
        return delegate.getColumn("S[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS12Esd() {
        return delegate.getColumn("S[1][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getS13() {
        return delegate.getColumn("S[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS13Esd() {
        return delegate.getColumn("S[1][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getS21() {
        return delegate.getColumn("S[2][1]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS21Esd() {
        return delegate.getColumn("S[2][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * The trace of S is indeterminate by crystallography, and should
     * be set to zero.
     * @return FloatColumn
     */
    public FloatColumn getS22() {
        return delegate.getColumn("S[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS22Esd() {
        return delegate.getColumn("S[2][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getS23() {
        return delegate.getColumn("S[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS23Esd() {
        return delegate.getColumn("S[2][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getS31() {
        return delegate.getColumn("S[3][1]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS31Esd() {
        return delegate.getColumn("S[3][1]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return FloatColumn
     */
    public FloatColumn getS32() {
        return delegate.getColumn("S[3][2]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS32Esd() {
        return delegate.getColumn("S[3][2]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * The trace of S is indeterminate by crystallography, and should
     * be set to zero.
     * @return FloatColumn
     */
    public FloatColumn getS33() {
        return delegate.getColumn("S[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS33Esd() {
        return delegate.getColumn("S[3][3]_esd", DelegatingFloatColumn::new);
    }

}