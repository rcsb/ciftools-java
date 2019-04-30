package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_TLS category record details about
 * TLS parameters used in structure refinement. Note that the
 * intention is primarily to describe directly refined TLS
 * parameters, although other methods of obtaining TLS parameters
 * may be covered, see item _pdbx_refine_tls.method
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _pdbx_refine_tls.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * A description of the TLS group, such as a domain name or a
     * chemical group name.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The method by which the TLS parameters were obtained.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origin_x", FloatColumn::new) :
                getBinaryColumn("origin_x"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origin_y", FloatColumn::new) :
                getBinaryColumn("origin_y"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("origin_z", FloatColumn::new) :
                getBinaryColumn("origin_z"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[1][1]", FloatColumn::new) :
                getBinaryColumn("T[1][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("T[1][1]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[1][2]", FloatColumn::new) :
                getBinaryColumn("T[1][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("T[1][2]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[1][3]", FloatColumn::new) :
                getBinaryColumn("T[1][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("T[1][3]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[2][2]", FloatColumn::new) :
                getBinaryColumn("T[2][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("T[2][2]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[2][3]", FloatColumn::new) :
                getBinaryColumn("T[2][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("T[2][3]_esd"));
    }

    /**
     * The elements of the translation tensor T. This should
     * be given in the same coordinate frame and units as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getT33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[3][3]", FloatColumn::new) :
                getBinaryColumn("T[3][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.T.
     * @return FloatColumn
     */
    public FloatColumn getT33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("T[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("T[3][3]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[1][1]", FloatColumn::new) :
                getBinaryColumn("L[1][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("L[1][1]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[1][2]", FloatColumn::new) :
                getBinaryColumn("L[1][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("L[1][2]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[1][3]", FloatColumn::new) :
                getBinaryColumn("L[1][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("L[1][3]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[2][2]", FloatColumn::new) :
                getBinaryColumn("L[2][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("L[2][2]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[2][3]", FloatColumn::new) :
                getBinaryColumn("L[2][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("L[2][3]_esd"));
    }

    /**
     * The elements of the libration tensor L. This should
     * be given in the same coordinate frame as the
     * corresponding anisotropic displacement parameters.
     * @return FloatColumn
     */
    public FloatColumn getL33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[3][3]", FloatColumn::new) :
                getBinaryColumn("L[3][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.L.
     * @return FloatColumn
     */
    public FloatColumn getL33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("L[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("L[3][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[1][1]", FloatColumn::new) :
                getBinaryColumn("S[1][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("S[1][1]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[1][2]", FloatColumn::new) :
                getBinaryColumn("S[1][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("S[1][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[1][3]", FloatColumn::new) :
                getBinaryColumn("S[1][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("S[1][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[2][1]", FloatColumn::new) :
                getBinaryColumn("S[2][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS21Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[2][1]_esd", FloatColumn::new) :
                getBinaryColumn("S[2][1]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[2][2]", FloatColumn::new) :
                getBinaryColumn("S[2][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("S[2][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[2][3]", FloatColumn::new) :
                getBinaryColumn("S[2][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("S[2][3]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[3][1]", FloatColumn::new) :
                getBinaryColumn("S[3][1]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS31Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[3][1]_esd", FloatColumn::new) :
                getBinaryColumn("S[3][1]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[3][2]", FloatColumn::new) :
                getBinaryColumn("S[3][2]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS32Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[3][2]_esd", FloatColumn::new) :
                getBinaryColumn("S[3][2]_esd"));
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
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[3][3]", FloatColumn::new) :
                getBinaryColumn("S[3][3]"));
    }

    /**
     * The estimated standard deviation of _pdbx_refine_tls.S.
     * @return FloatColumn
     */
    public FloatColumn getS33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("S[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("S[3][3]_esd"));
    }
}
