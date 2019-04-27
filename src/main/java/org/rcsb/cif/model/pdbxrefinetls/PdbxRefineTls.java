package org.rcsb.cif.model.pdbxrefinetls;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxRefineTls extends BaseCategory {
    public PdbxRefineTls(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxRefineTls(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxRefineTls(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_refine_tls.id must uniquely identify a record in
     * the PDBX_REFINE_TLS list.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_tls.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * A description of the TLS group, such as a domain name or a
     * chemical group name.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The method by which the TLS parameters were obtained.
     * @return Method
     */
    public Method getMethod() {
        return (Method) (isText ? textFields.computeIfAbsent("method",
                Method::new) : getBinaryColumn("method"));
    }

    /**
     * The x coordinate in angstroms of the origin to which the
     * TLS parameters are referred, specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * given in _atom_sites.Cartn_transform_axes.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return OriginX
     */
    public OriginX getOriginX() {
        return (OriginX) (isText ? textFields.computeIfAbsent("origin_x",
                OriginX::new) : getBinaryColumn("origin_x"));
    }

    /**
     * The y coordinate in angstroms of the origin to which the
     * TLS parameters are referred, specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * given in _atom_sites.Cartn_transform_axes.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return OriginY
     */
    public OriginY getOriginY() {
        return (OriginY) (isText ? textFields.computeIfAbsent("origin_y",
                OriginY::new) : getBinaryColumn("origin_y"));
    }

    /**
     * The z coordinate in angstroms of the origin to which the
     * TLS parameters are referred, specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * given in _atom_sites.Cartn_transform_axes.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return OriginZ
     */
    public OriginZ getOriginZ() {
        return (OriginZ) (isText ? textFields.computeIfAbsent("origin_z",
                OriginZ::new) : getBinaryColumn("origin_z"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return T11
     */
    public T11 getT11() {
        return (T11) (isText ? textFields.computeIfAbsent("T[1][1]",
                T11::new) : getBinaryColumn("T[1][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return T11Esd
     */
    public T11Esd getT11Esd() {
        return (T11Esd) (isText ? textFields.computeIfAbsent("T[1][1]_esd",
                T11Esd::new) : getBinaryColumn("T[1][1]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return T12
     */
    public T12 getT12() {
        return (T12) (isText ? textFields.computeIfAbsent("T[1][2]",
                T12::new) : getBinaryColumn("T[1][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return T12Esd
     */
    public T12Esd getT12Esd() {
        return (T12Esd) (isText ? textFields.computeIfAbsent("T[1][2]_esd",
                T12Esd::new) : getBinaryColumn("T[1][2]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return T13
     */
    public T13 getT13() {
        return (T13) (isText ? textFields.computeIfAbsent("T[1][3]",
                T13::new) : getBinaryColumn("T[1][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return T13Esd
     */
    public T13Esd getT13Esd() {
        return (T13Esd) (isText ? textFields.computeIfAbsent("T[1][3]_esd",
                T13Esd::new) : getBinaryColumn("T[1][3]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return T22
     */
    public T22 getT22() {
        return (T22) (isText ? textFields.computeIfAbsent("T[2][2]",
                T22::new) : getBinaryColumn("T[2][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return T22Esd
     */
    public T22Esd getT22Esd() {
        return (T22Esd) (isText ? textFields.computeIfAbsent("T[2][2]_esd",
                T22Esd::new) : getBinaryColumn("T[2][2]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return T23
     */
    public T23 getT23() {
        return (T23) (isText ? textFields.computeIfAbsent("T[2][3]",
                T23::new) : getBinaryColumn("T[2][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return T23Esd
     */
    public T23Esd getT23Esd() {
        return (T23Esd) (isText ? textFields.computeIfAbsent("T[2][3]_esd",
                T23Esd::new) : getBinaryColumn("T[2][3]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return T33
     */
    public T33 getT33() {
        return (T33) (isText ? textFields.computeIfAbsent("T[3][3]",
                T33::new) : getBinaryColumn("T[3][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return T33Esd
     */
    public T33Esd getT33Esd() {
        return (T33Esd) (isText ? textFields.computeIfAbsent("T[3][3]_esd",
                T33Esd::new) : getBinaryColumn("T[3][3]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return L11
     */
    public L11 getL11() {
        return (L11) (isText ? textFields.computeIfAbsent("L[1][1]",
                L11::new) : getBinaryColumn("L[1][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return L11Esd
     */
    public L11Esd getL11Esd() {
        return (L11Esd) (isText ? textFields.computeIfAbsent("L[1][1]_esd",
                L11Esd::new) : getBinaryColumn("L[1][1]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return L12
     */
    public L12 getL12() {
        return (L12) (isText ? textFields.computeIfAbsent("L[1][2]",
                L12::new) : getBinaryColumn("L[1][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return L12Esd
     */
    public L12Esd getL12Esd() {
        return (L12Esd) (isText ? textFields.computeIfAbsent("L[1][2]_esd",
                L12Esd::new) : getBinaryColumn("L[1][2]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return L13
     */
    public L13 getL13() {
        return (L13) (isText ? textFields.computeIfAbsent("L[1][3]",
                L13::new) : getBinaryColumn("L[1][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return L13Esd
     */
    public L13Esd getL13Esd() {
        return (L13Esd) (isText ? textFields.computeIfAbsent("L[1][3]_esd",
                L13Esd::new) : getBinaryColumn("L[1][3]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return L22
     */
    public L22 getL22() {
        return (L22) (isText ? textFields.computeIfAbsent("L[2][2]",
                L22::new) : getBinaryColumn("L[2][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return L22Esd
     */
    public L22Esd getL22Esd() {
        return (L22Esd) (isText ? textFields.computeIfAbsent("L[2][2]_esd",
                L22Esd::new) : getBinaryColumn("L[2][2]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return L23
     */
    public L23 getL23() {
        return (L23) (isText ? textFields.computeIfAbsent("L[2][3]",
                L23::new) : getBinaryColumn("L[2][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return L23Esd
     */
    public L23Esd getL23Esd() {
        return (L23Esd) (isText ? textFields.computeIfAbsent("L[2][3]_esd",
                L23Esd::new) : getBinaryColumn("L[2][3]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return L33
     */
    public L33 getL33() {
        return (L33) (isText ? textFields.computeIfAbsent("L[3][3]",
                L33::new) : getBinaryColumn("L[3][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return L33Esd
     */
    public L33Esd getL33Esd() {
        return (L33Esd) (isText ? textFields.computeIfAbsent("L[3][3]_esd",
                L33Esd::new) : getBinaryColumn("L[3][3]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * The trace of S is indeterminate by crystallography, and should
     * be set to zero.
     * @return S11
     */
    public S11 getS11() {
        return (S11) (isText ? textFields.computeIfAbsent("S[1][1]",
                S11::new) : getBinaryColumn("S[1][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S11Esd
     */
    public S11Esd getS11Esd() {
        return (S11Esd) (isText ? textFields.computeIfAbsent("S[1][1]_esd",
                S11Esd::new) : getBinaryColumn("S[1][1]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return S12
     */
    public S12 getS12() {
        return (S12) (isText ? textFields.computeIfAbsent("S[1][2]",
                S12::new) : getBinaryColumn("S[1][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S12Esd
     */
    public S12Esd getS12Esd() {
        return (S12Esd) (isText ? textFields.computeIfAbsent("S[1][2]_esd",
                S12Esd::new) : getBinaryColumn("S[1][2]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return S13
     */
    public S13 getS13() {
        return (S13) (isText ? textFields.computeIfAbsent("S[1][3]",
                S13::new) : getBinaryColumn("S[1][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S13Esd
     */
    public S13Esd getS13Esd() {
        return (S13Esd) (isText ? textFields.computeIfAbsent("S[1][3]_esd",
                S13Esd::new) : getBinaryColumn("S[1][3]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return S21
     */
    public S21 getS21() {
        return (S21) (isText ? textFields.computeIfAbsent("S[2][1]",
                S21::new) : getBinaryColumn("S[2][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S21Esd
     */
    public S21Esd getS21Esd() {
        return (S21Esd) (isText ? textFields.computeIfAbsent("S[2][1]_esd",
                S21Esd::new) : getBinaryColumn("S[2][1]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * The trace of S is indeterminate by crystallography, and should
     * be set to zero.
     * @return S22
     */
    public S22 getS22() {
        return (S22) (isText ? textFields.computeIfAbsent("S[2][2]",
                S22::new) : getBinaryColumn("S[2][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S22Esd
     */
    public S22Esd getS22Esd() {
        return (S22Esd) (isText ? textFields.computeIfAbsent("S[2][2]_esd",
                S22Esd::new) : getBinaryColumn("S[2][2]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return S23
     */
    public S23 getS23() {
        return (S23) (isText ? textFields.computeIfAbsent("S[2][3]",
                S23::new) : getBinaryColumn("S[2][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S23Esd
     */
    public S23Esd getS23Esd() {
        return (S23Esd) (isText ? textFields.computeIfAbsent("S[2][3]_esd",
                S23Esd::new) : getBinaryColumn("S[2][3]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return S31
     */
    public S31 getS31() {
        return (S31) (isText ? textFields.computeIfAbsent("S[3][1]",
                S31::new) : getBinaryColumn("S[3][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S31Esd
     */
    public S31Esd getS31Esd() {
        return (S31Esd) (isText ? textFields.computeIfAbsent("S[3][1]_esd",
                S31Esd::new) : getBinaryColumn("S[3][1]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * If the origin is omitted, it is assumed to be the centre of
     * reaction of the group, in which case S must be symmetric
     * @return S32
     */
    public S32 getS32() {
        return (S32) (isText ? textFields.computeIfAbsent("S[3][2]",
                S32::new) : getBinaryColumn("S[3][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S32Esd
     */
    public S32Esd getS32Esd() {
        return (S32Esd) (isText ? textFields.computeIfAbsent("S[3][2]_esd",
                S32Esd::new) : getBinaryColumn("S[3][2]_esd"));
    }

    /**
     * The elements of the screw-rotation tensor S. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * 
     * The trace of S is indeterminate by crystallography, and should
     * be set to zero.
     * @return S33
     */
    public S33 getS33() {
        return (S33) (isText ? textFields.computeIfAbsent("S[3][3]",
                S33::new) : getBinaryColumn("S[3][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return S33Esd
     */
    public S33Esd getS33Esd() {
        return (S33Esd) (isText ? textFields.computeIfAbsent("S[3][3]_esd",
                S33Esd::new) : getBinaryColumn("S[3][3]_esd"));
    }
}
