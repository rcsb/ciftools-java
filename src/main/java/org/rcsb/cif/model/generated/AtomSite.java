package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ATOM_SITE category record details about
 * the atom sites in a macromolecular crystal structure, such as
 * the positional coordinates, atomic displacement parameters,
 * magnetic moments and directions.
 * 
 * The data items for describing anisotropic atomic
 * displacement factors are only used if the corresponding items
 * are not given in the ATOM_SITE_ANISOTROP category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class AtomSite extends BaseCategory {
    public AtomSite(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public AtomSite(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public AtomSite(String name) {
        super(name);
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][1]", FloatColumn::new) :
                getBinaryColumn("aniso_B[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_B[1][1]_esd"));
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][2]", FloatColumn::new) :
                getBinaryColumn("aniso_B[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_B[1][2]_esd"));
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][3]", FloatColumn::new) :
                getBinaryColumn("aniso_B[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_B[1][3]_esd"));
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[2][2]", FloatColumn::new) :
                getBinaryColumn("aniso_B[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_B[2][2]_esd"));
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[2][3]", FloatColumn::new) :
                getBinaryColumn("aniso_B[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_B[2][3]_esd"));
    }

    /**
     * The elements of the anisotropic atomic displacement
     * matrix B, which appears in the structure-factor term as:
     * 
     * T = exp{-1/4 sum~i~[sum~j~(B^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[3][3]", FloatColumn::new) :
                getBinaryColumn("aniso_B[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_B[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_B[3][3]_esd"));
    }

    /**
     * Ratio of the maximum to minimum principal axes of
     * displacement (thermal) ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getAnisoRatio() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_ratio", FloatColumn::new) :
                getBinaryColumn("aniso_ratio"));
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU11() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[1][1]", FloatColumn::new) :
                getBinaryColumn("aniso_U[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU11Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[1][1]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_U[1][1]_esd"));
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU12() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[1][2]", FloatColumn::new) :
                getBinaryColumn("aniso_U[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU12Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[1][2]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_U[1][2]_esd"));
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU13() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[1][3]", FloatColumn::new) :
                getBinaryColumn("aniso_U[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU13Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[1][3]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_U[1][3]_esd"));
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU22() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[2][2]", FloatColumn::new) :
                getBinaryColumn("aniso_U[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU22Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[2][2]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_U[2][2]_esd"));
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU23() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[2][3]", FloatColumn::new) :
                getBinaryColumn("aniso_U[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU23Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[2][3]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_U[2][3]_esd"));
    }

    /**
     * The elements of the standard anisotropic atomic
     * displacement matrix U, which appears in the structure-factor
     * term as:
     * 
     * T = exp{-2 pi^2^ sum~i~[sum~j~(U^ij^ h~i~ h~j~ a*~i~ a*~j~)]}
     * 
     * h  = the Miller indices
     * a* = the reciprocal space cell lengths
     * 
     * These matrix elements may appear with atomic coordinates
     * in the ATOM_SITE category, or they may appear in the separate
     * ATOM_SITE_ANISOTROP category, but they may not appear in both
     * places. Similarly, anisotropic displacements may appear as
     * either B's or U's, but not as both.
     * 
     * The unique elements of the real symmetric matrix are
     * entered by row.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU33() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[3][3]", FloatColumn::new) :
                getBinaryColumn("aniso_U[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU33Esd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("aniso_U[3][3]_esd", FloatColumn::new) :
                getBinaryColumn("aniso_U[3][3]_esd"));
    }

    /**
     * The number of hydrogen atoms attached to the atom at this site
     * excluding any hydrogen atoms for which coordinates (measured or
     * calculated) are given.
     * @return IntColumn
     */
    public IntColumn getAttachedHydrogens() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("attached_hydrogens", IntColumn::new) :
                getBinaryColumn("attached_hydrogens"));
    }

    /**
     * An alternative identifier for _atom_site.label_asym_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_atom_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_atom_id", StrColumn::new) :
                getBinaryColumn("auth_atom_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_comp_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_seq_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * 
     * Note that this is not necessarily a number, that the values do
     * not have to be positive, and that the value does not have to
     * correspond to the value of _atom_site.label_seq_id. The value
     * of _atom_site.label_seq_id is required to be a sequential list
     * of positive integers.
     * 
     * The author may assign values to _atom_site.auth_seq_id in any
     * desired way. For instance, the values may be used to relate
     * this structure to a numbering scheme in a homologous structure,
     * including sequence gaps or insertion codes. Alternatively, a
     * scheme may be used for a truncated polymer that maintains the
     * numbering scheme of the full length polymer. In all cases, the
     * scheme used here must match the scheme used in the publication
     * that describes the structure.
     * @return IntColumn
     */
    public IntColumn getAuthSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", IntColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Equivalent isotropic atomic displacement parameter, B~eq~,
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * B~eq~ = (B~i~ B~j~ B~k~)^1/3^
     * 
     * B~n~ = the principal components of the orthogonalized B^ij^
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * @return FloatColumn
     */
    public FloatColumn getBEquivGeomMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_equiv_geom_mean", FloatColumn::new) :
                getBinaryColumn("B_equiv_geom_mean"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.B_equiv_geom_mean.
     * @return FloatColumn
     */
    public FloatColumn getBEquivGeomMeanEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_equiv_geom_mean_esd", FloatColumn::new) :
                getBinaryColumn("B_equiv_geom_mean_esd"));
    }

    /**
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic displacement parameter, B~eq~, calculated from the
     * anisotropic displacement parameters.
     * 
     * B~eq~ = (1/3) sum~i~[sum~j~(B^ij^ A~i~ A~j~ a*~i~ a*~j~)]
     * 
     * A     = the real space cell lengths
     * a*    = the reciprocal space cell lengths
     * B^ij^ = 8 pi^2^ U^ij^
     * 
     * Ref: Fischer, R. X. &amp; Tillmanns, E. (1988). Acta Cryst. C44,
     * 775-776.
     * 
     * The IUCr Commission on Nomenclature recommends against the use
     * of B for reporting atomic displacement parameters. U, being
     * directly proportional to B, is preferred.
     * 
     * Note -
     * 
     * The particular type of ADP stored in this item is qualified
     * by item _refine.pdbx_adp_type.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquiv() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_or_equiv", FloatColumn::new) :
                getBinaryColumn("B_iso_or_equiv"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.B_iso_or_equiv.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquivEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("B_iso_or_equiv_esd", FloatColumn::new) :
                getBinaryColumn("B_iso_or_equiv_esd"));
    }

    /**
     * The _atom_site.id of the atom site to which the
     * 'geometry-calculated' atom site is attached.
     * @return StrColumn
     */
    public StrColumn getCalcAttachedAtom() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("calc_attached_atom", StrColumn::new) :
                getBinaryColumn("calc_attached_atom"));
    }

    /**
     * A standard code to signal whether the site coordinates have been
     * determined from the intensities or calculated from the geometry
     * of surrounding sites, or have been assigned dummy values. The
     * abbreviation 'c' may be used in place of 'calc'.
     * @return StrColumn
     */
    public StrColumn getCalcFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("calc_flag", StrColumn::new) :
                getBinaryColumn("calc_flag"));
    }

    /**
     * The x atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x", FloatColumn::new) :
                getBinaryColumn("Cartn_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_x.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_x_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_x_esd"));
    }

    /**
     * The y atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y", FloatColumn::new) :
                getBinaryColumn("Cartn_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_y.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_y_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_y_esd"));
    }

    /**
     * The z atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z", FloatColumn::new) :
                getBinaryColumn("Cartn_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_z.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Cartn_z_esd", FloatColumn::new) :
                getBinaryColumn("Cartn_z_esd"));
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return IntColumn
     */
    public IntColumn getChemicalConnNumber() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("chemical_conn_number", IntColumn::new) :
                getBinaryColumn("chemical_conn_number"));
    }

    /**
     * A description of the constraints applied to parameters at this
     * site during refinement. See also _atom_site.refinement_flags
     * and _refine.ls_number_constraints.
     * @return StrColumn
     */
    public StrColumn getConstraints() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("constraints", StrColumn::new) :
                getBinaryColumn("constraints"));
    }

    /**
     * A description of special aspects of this site. See also
     * _atom_site.refinement_flags.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A code which identifies a cluster of atoms that show long-range
     * positional disorder but are locally ordered. Within each such
     * cluster of atoms, _atom_site.disorder_group is used to identify
     * the sites that are simultaneously occupied. This field is only
     * needed if there is more than one cluster of disordered atoms
     * showing independent local order.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return StrColumn
     */
    public StrColumn getDisorderAssembly() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("disorder_assembly", StrColumn::new) :
                getBinaryColumn("disorder_assembly"));
    }

    /**
     * A code which identifies a group of positionally disordered atom
     * sites that are locally simultaneously occupied. Atoms that are
     * positionally disordered over two or more sites (e.g. the hydrogen
     * atoms of a methyl group that exists in two orientations) can
     * be assigned to two or more groups. Sites belonging to the same
     * group are simultaneously occupied, but those belonging to
     * different groups are not. A minus prefix (e.g. '-1') is used to
     * indicate sites disordered about a special position.
     * 
     * *** This data item would not in general be used in a
     * macromolecular data block. ***
     * @return StrColumn
     */
    public StrColumn getDisorderGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("disorder_group", StrColumn::new) :
                getBinaryColumn("disorder_group"));
    }

    /**
     * The value of _atom_site.footnote_id must match an ID
     * specified by _atom_sites_footnote.id in the
     * ATOM_SITES_FOOTNOTE list.
     * @return StrColumn
     */
    public StrColumn getFootnoteId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("footnote_id", StrColumn::new) :
                getBinaryColumn("footnote_id"));
    }

    /**
     * The x coordinate of the atom-site position specified as a
     * fraction of _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_x", FloatColumn::new) :
                getBinaryColumn("fract_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_x.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_x_esd", FloatColumn::new) :
                getBinaryColumn("fract_x_esd"));
    }

    /**
     * The y coordinate of the atom-site position specified as a
     * fraction of _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_y", FloatColumn::new) :
                getBinaryColumn("fract_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_y.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_y_esd", FloatColumn::new) :
                getBinaryColumn("fract_y_esd"));
    }

    /**
     * The z coordinate of the atom-site position specified as a
     * fraction of _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_z", FloatColumn::new) :
                getBinaryColumn("fract_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_z.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fract_z_esd", FloatColumn::new) :
                getBinaryColumn("fract_z_esd"));
    }

    /**
     * The group of atoms to which the atom site belongs. This data
     * item is provided for compatibility with the original Protein
     * Data Bank format, and only for that purpose.
     * @return StrColumn
     */
    public StrColumn getGroupPDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("group_PDB", StrColumn::new) :
                getBinaryColumn("group_PDB"));
    }

    /**
     * The value of _atom_site.id must uniquely identify a record in the
     * ATOM_SITE list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * 
     * This data item was introduced to provide compatibility between
     * small-molecule and macromolecular CIFs. In a small-molecule
     * CIF, _atom_site_label is the identifier for the atom. In a
     * macromolecular CIF, the atom identifier is the aggregate of
     * _atom_site.label_alt_id, _atom_site.label_asym_id,
     * _atom_site.label_atom_id, _atom_site.label_comp_id and
     * _atom_site.label_seq_id. For the two types of files to be
     * compatible, a formal identifier for the category had to be
     * introduced that was independent of the different modes of
     * identifying the atoms. For compatibility with older CIFs,
     * _atom_site_label is aliased to _atom_site.id.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for this atom site.
     * For further details, see the definition of the ATOM_SITE_ALT
     * category.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * For further details, see the definition of the STRUCT_ASYM
     * category.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_asym_id", StrColumn::new) :
                getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_atom_id", StrColumn::new) :
                getBinaryColumn("label_atom_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_comp_id", StrColumn::new) :
                getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getLabelEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_entity_id", StrColumn::new) :
                getBinaryColumn("label_entity_id"));
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }

    /**
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not significantly exceed 1.0 unless it is a dummy site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy", FloatColumn::new) :
                getBinaryColumn("occupancy"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.occupancy.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_esd", FloatColumn::new) :
                getBinaryColumn("occupancy_esd"));
    }

    /**
     * A description of restraints applied to specific parameters at
     * this site during refinement. See also _atom_site.refinement_flags
     * and _refine.ls_number_restraints.
     * @return StrColumn
     */
    public StrColumn getRestraints() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("restraints", StrColumn::new) :
                getBinaryColumn("restraints"));
    }

    /**
     * The multiplicity of a site due to the space-group symmetry as is
     * given in International Tables for Crystallography Vol. A (2002).
     * @return IntColumn
     */
    public IntColumn getSymmetryMultiplicity() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("symmetry_multiplicity", IntColumn::new) :
                getBinaryColumn("symmetry_multiplicity"));
    }

    /**
     * A standard code used to describe the type of atomic displacement
     * parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getThermalDisplaceType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("thermal_displace_type", StrColumn::new) :
                getBinaryColumn("thermal_displace_type"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_symbol", StrColumn::new) :
                getBinaryColumn("type_symbol"));
    }

    /**
     * Equivalent isotropic atomic displacement parameter, U~eq~,
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * U~eq~ = (U~i~ U~j~ U~k~)^1/3^
     * 
     * U~n~ = the principal components of the orthogonalized U^ij^
     * @return FloatColumn
     */
    public FloatColumn getUEquivGeomMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_equiv_geom_mean", FloatColumn::new) :
                getBinaryColumn("U_equiv_geom_mean"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.U_equiv_geom_mean.
     * @return FloatColumn
     */
    public FloatColumn getUEquivGeomMeanEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_equiv_geom_mean_esd", FloatColumn::new) :
                getBinaryColumn("U_equiv_geom_mean_esd"));
    }

    /**
     * Isotropic atomic displacement parameter, or equivalent isotropic
     * atomic  displacement parameter, U~eq~, calculated from
     * anisotropic atomic displacement  parameters.
     * 
     * U~eq~ = (1/3) sum~i~[sum~j~(U^ij^ A~i~ A~j~ a*~i~ a*~j~)]
     * 
     * A  = the real space cell lengths
     * a* = the reciprocal space cell lengths
     * 
     * Ref: Fischer, R. X. &amp; Tillmanns, E. (1988). Acta Cryst. C44,
     * 775-776.
     * @return FloatColumn
     */
    public FloatColumn getUIsoOrEquiv() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_iso_or_equiv", FloatColumn::new) :
                getBinaryColumn("U_iso_or_equiv"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.U_iso_or_equiv.
     * @return FloatColumn
     */
    public FloatColumn getUIsoOrEquivEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("U_iso_or_equiv_esd", FloatColumn::new) :
                getBinaryColumn("U_iso_or_equiv_esd"));
    }

    /**
     * The Wyckoff symbol (letter) as listed in the space-group tables
     * of International Tables for Crystallography, Vol. A (2002).
     * @return StrColumn
     */
    public StrColumn getWyckoffSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("Wyckoff_symbol", StrColumn::new) :
                getBinaryColumn("Wyckoff_symbol"));
    }

    /**
     * A standard code used to describe the type of atomic displacement
     * parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getAdpType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("adp_type", StrColumn::new) :
                getBinaryColumn("adp_type"));
    }

    /**
     * A concatenated series of single-letter codes which indicate the
     * refinement restraints or constraints applied to this site.  This
     * item should not be used.  It has been replaced by
     * _atom_site.refinement_flags_posn, *_adp and *_occupancy. It is
     * retained in this dictionary only to provide compatibility with
     * old CIFs.
     * @return StrColumn
     */
    public StrColumn getRefinementFlags() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_flags", StrColumn::new) :
                getBinaryColumn("refinement_flags"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the atomic displacement parameters of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsAdp() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_flags_adp", StrColumn::new) :
                getBinaryColumn("refinement_flags_adp"));
    }

    /**
     * A code which indicates that refinement restraints or
     * constraints were applied to the occupancy of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsOccupancy() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_flags_occupancy", StrColumn::new) :
                getBinaryColumn("refinement_flags_occupancy"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the positional coordinates of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsPosn() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("refinement_flags_posn", StrColumn::new) :
                getBinaryColumn("refinement_flags_posn"));
    }

    /**
     * Author's alternate location identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_alt_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_alt_id"));
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_ins_code"));
    }

    /**
     * PDB model number.
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num", IntColumn::new) :
                getBinaryColumn("pdbx_PDB_model_num"));
    }

    /**
     * PDB residue number.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueNo() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_no", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_residue_no"));
    }

    /**
     * PDB residue name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_name", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_residue_name"));
    }

    /**
     * PDB strand id.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_strand_id", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_strand_id"));
    }

    /**
     * PDB atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_PDB_atom_name", StrColumn::new) :
                getBinaryColumn("pdbx_PDB_atom_name"));
    }

    /**
     * Author's atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAtomName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_atom_name", StrColumn::new) :
                getBinaryColumn("pdbx_auth_atom_name"));
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getPdbxFormalCharge() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_formal_charge", IntColumn::new) :
                getBinaryColumn("pdbx_formal_charge"));
    }

    /**
     * Author's residue name.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * Author's strand id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Author's sequence identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id", StrColumn::new) :
                getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * The TLS group to which the atom position is assigned.
     * 
     * The TLS group is defined in category pdbx_refine_tls.
     * This item is a reference to _pdbx_refine_tls.id.
     * @return StrColumn
     */
    public StrColumn getPdbxTlsGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_tls_group_id", StrColumn::new) :
                getBinaryColumn("pdbx_tls_group_id"));
    }

    /**
     * The NCS domain to which the atom position is assigned.
     * 
     * The NCS group is defined in category struct_ncs_dom.
     * This item is a reference to _struct_ncs_dom.id.
     * @return StrColumn
     */
    public StrColumn getPdbxNcsDomId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ncs_dom_id", StrColumn::new) :
                getBinaryColumn("pdbx_ncs_dom_id"));
    }

    /**
     * The value of _atom_site.pdbx_struct_group_id identifies the group or groups
     * assigned to this atom.    This is a reference to the identifier for
     * group definition in category PDBX_STRUCT_GROUP_LIST.
     * 
     * Multiple groups identifiers are encoded as a comma separated list.
     * @return StrColumn
     */
    public StrColumn getPdbxStructGroupId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_struct_group_id", StrColumn::new) :
                getBinaryColumn("pdbx_struct_group_id"));
    }

    /**
     * The ATOM group code used by the NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxGroupNDB() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_group_NDB", StrColumn::new) :
                getBinaryColumn("pdbx_group_NDB"));
    }

    /**
     * The ATOM group code used by the NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomGroup() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atom_group", StrColumn::new) :
                getBinaryColumn("pdbx_atom_group"));
    }

    /**
     * Sequential residue number used by NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_label_seq_num", StrColumn::new) :
                getBinaryColumn("pdbx_label_seq_num"));
    }

    /**
     * Will identify with a 'Y' that this strand got generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNotInAsym() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_not_in_asym", StrColumn::new) :
                getBinaryColumn("pdbx_not_in_asym"));
    }

    /**
     * The model id corresponding to the atom site.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getIhmModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ihm_model_id", IntColumn::new) :
                getBinaryColumn("ihm_model_id"));
    }
}
