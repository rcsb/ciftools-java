package org.rcsb.cif.model.atomsite;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return AnisoB11
     */
    public AnisoB11 getAnisoB11() {
        return (AnisoB11) (isText ? textFields.computeIfAbsent("aniso_B[1][1]",
                AnisoB11::new) : getBinaryColumn("aniso_B[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return AnisoB11Esd
     */
    public AnisoB11Esd getAnisoB11Esd() {
        return (AnisoB11Esd) (isText ? textFields.computeIfAbsent("aniso_B[1][1]_esd",
                AnisoB11Esd::new) : getBinaryColumn("aniso_B[1][1]_esd"));
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
     * @return AnisoB12
     */
    public AnisoB12 getAnisoB12() {
        return (AnisoB12) (isText ? textFields.computeIfAbsent("aniso_B[1][2]",
                AnisoB12::new) : getBinaryColumn("aniso_B[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return AnisoB12Esd
     */
    public AnisoB12Esd getAnisoB12Esd() {
        return (AnisoB12Esd) (isText ? textFields.computeIfAbsent("aniso_B[1][2]_esd",
                AnisoB12Esd::new) : getBinaryColumn("aniso_B[1][2]_esd"));
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
     * @return AnisoB13
     */
    public AnisoB13 getAnisoB13() {
        return (AnisoB13) (isText ? textFields.computeIfAbsent("aniso_B[1][3]",
                AnisoB13::new) : getBinaryColumn("aniso_B[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return AnisoB13Esd
     */
    public AnisoB13Esd getAnisoB13Esd() {
        return (AnisoB13Esd) (isText ? textFields.computeIfAbsent("aniso_B[1][3]_esd",
                AnisoB13Esd::new) : getBinaryColumn("aniso_B[1][3]_esd"));
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
     * @return AnisoB22
     */
    public AnisoB22 getAnisoB22() {
        return (AnisoB22) (isText ? textFields.computeIfAbsent("aniso_B[2][2]",
                AnisoB22::new) : getBinaryColumn("aniso_B[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return AnisoB22Esd
     */
    public AnisoB22Esd getAnisoB22Esd() {
        return (AnisoB22Esd) (isText ? textFields.computeIfAbsent("aniso_B[2][2]_esd",
                AnisoB22Esd::new) : getBinaryColumn("aniso_B[2][2]_esd"));
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
     * @return AnisoB23
     */
    public AnisoB23 getAnisoB23() {
        return (AnisoB23) (isText ? textFields.computeIfAbsent("aniso_B[2][3]",
                AnisoB23::new) : getBinaryColumn("aniso_B[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return AnisoB23Esd
     */
    public AnisoB23Esd getAnisoB23Esd() {
        return (AnisoB23Esd) (isText ? textFields.computeIfAbsent("aniso_B[2][3]_esd",
                AnisoB23Esd::new) : getBinaryColumn("aniso_B[2][3]_esd"));
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
     * @return AnisoB33
     */
    public AnisoB33 getAnisoB33() {
        return (AnisoB33) (isText ? textFields.computeIfAbsent("aniso_B[3][3]",
                AnisoB33::new) : getBinaryColumn("aniso_B[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return AnisoB33Esd
     */
    public AnisoB33Esd getAnisoB33Esd() {
        return (AnisoB33Esd) (isText ? textFields.computeIfAbsent("aniso_B[3][3]_esd",
                AnisoB33Esd::new) : getBinaryColumn("aniso_B[3][3]_esd"));
    }

    /**
     * Ratio of the maximum to minimum principal axes of
     * displacement (thermal) ellipsoids.
     * @return AnisoRatio
     */
    public AnisoRatio getAnisoRatio() {
        return (AnisoRatio) (isText ? textFields.computeIfAbsent("aniso_ratio",
                AnisoRatio::new) : getBinaryColumn("aniso_ratio"));
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
     * @return AnisoU11
     */
    public AnisoU11 getAnisoU11() {
        return (AnisoU11) (isText ? textFields.computeIfAbsent("aniso_U[1][1]",
                AnisoU11::new) : getBinaryColumn("aniso_U[1][1]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return AnisoU11Esd
     */
    public AnisoU11Esd getAnisoU11Esd() {
        return (AnisoU11Esd) (isText ? textFields.computeIfAbsent("aniso_U[1][1]_esd",
                AnisoU11Esd::new) : getBinaryColumn("aniso_U[1][1]_esd"));
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
     * @return AnisoU12
     */
    public AnisoU12 getAnisoU12() {
        return (AnisoU12) (isText ? textFields.computeIfAbsent("aniso_U[1][2]",
                AnisoU12::new) : getBinaryColumn("aniso_U[1][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return AnisoU12Esd
     */
    public AnisoU12Esd getAnisoU12Esd() {
        return (AnisoU12Esd) (isText ? textFields.computeIfAbsent("aniso_U[1][2]_esd",
                AnisoU12Esd::new) : getBinaryColumn("aniso_U[1][2]_esd"));
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
     * @return AnisoU13
     */
    public AnisoU13 getAnisoU13() {
        return (AnisoU13) (isText ? textFields.computeIfAbsent("aniso_U[1][3]",
                AnisoU13::new) : getBinaryColumn("aniso_U[1][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return AnisoU13Esd
     */
    public AnisoU13Esd getAnisoU13Esd() {
        return (AnisoU13Esd) (isText ? textFields.computeIfAbsent("aniso_U[1][3]_esd",
                AnisoU13Esd::new) : getBinaryColumn("aniso_U[1][3]_esd"));
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
     * @return AnisoU22
     */
    public AnisoU22 getAnisoU22() {
        return (AnisoU22) (isText ? textFields.computeIfAbsent("aniso_U[2][2]",
                AnisoU22::new) : getBinaryColumn("aniso_U[2][2]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return AnisoU22Esd
     */
    public AnisoU22Esd getAnisoU22Esd() {
        return (AnisoU22Esd) (isText ? textFields.computeIfAbsent("aniso_U[2][2]_esd",
                AnisoU22Esd::new) : getBinaryColumn("aniso_U[2][2]_esd"));
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
     * @return AnisoU23
     */
    public AnisoU23 getAnisoU23() {
        return (AnisoU23) (isText ? textFields.computeIfAbsent("aniso_U[2][3]",
                AnisoU23::new) : getBinaryColumn("aniso_U[2][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return AnisoU23Esd
     */
    public AnisoU23Esd getAnisoU23Esd() {
        return (AnisoU23Esd) (isText ? textFields.computeIfAbsent("aniso_U[2][3]_esd",
                AnisoU23Esd::new) : getBinaryColumn("aniso_U[2][3]_esd"));
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
     * @return AnisoU33
     */
    public AnisoU33 getAnisoU33() {
        return (AnisoU33) (isText ? textFields.computeIfAbsent("aniso_U[3][3]",
                AnisoU33::new) : getBinaryColumn("aniso_U[3][3]"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return AnisoU33Esd
     */
    public AnisoU33Esd getAnisoU33Esd() {
        return (AnisoU33Esd) (isText ? textFields.computeIfAbsent("aniso_U[3][3]_esd",
                AnisoU33Esd::new) : getBinaryColumn("aniso_U[3][3]_esd"));
    }

    /**
     * The number of hydrogen atoms attached to the atom at this site
     * excluding any hydrogen atoms for which coordinates (measured or
     * calculated) are given.
     * @return AttachedHydrogens
     */
    public AttachedHydrogens getAttachedHydrogens() {
        return (AttachedHydrogens) (isText ? textFields.computeIfAbsent("attached_hydrogens",
                AttachedHydrogens::new) : getBinaryColumn("attached_hydrogens"));
    }

    /**
     * An alternative identifier for _atom_site.label_asym_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_atom_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return AuthAtomId
     */
    public AuthAtomId getAuthAtomId() {
        return (AuthAtomId) (isText ? textFields.computeIfAbsent("auth_atom_id",
                AuthAtomId::new) : getBinaryColumn("auth_atom_id"));
    }

    /**
     * An alternative identifier for _atom_site.label_comp_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
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
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
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
     * @return BEquivGeomMean
     */
    public BEquivGeomMean getBEquivGeomMean() {
        return (BEquivGeomMean) (isText ? textFields.computeIfAbsent("B_equiv_geom_mean",
                BEquivGeomMean::new) : getBinaryColumn("B_equiv_geom_mean"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.B_equiv_geom_mean.
     * @return BEquivGeomMeanEsd
     */
    public BEquivGeomMeanEsd getBEquivGeomMeanEsd() {
        return (BEquivGeomMeanEsd) (isText ? textFields.computeIfAbsent("B_equiv_geom_mean_esd",
                BEquivGeomMeanEsd::new) : getBinaryColumn("B_equiv_geom_mean_esd"));
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
     * Ref: Fischer, R. X. & Tillmanns, E. (1988). Acta Cryst. C44,
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
     * @return BIsoOrEquiv
     */
    public BIsoOrEquiv getBIsoOrEquiv() {
        return (BIsoOrEquiv) (isText ? textFields.computeIfAbsent("B_iso_or_equiv",
                BIsoOrEquiv::new) : getBinaryColumn("B_iso_or_equiv"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.B_iso_or_equiv.
     * @return BIsoOrEquivEsd
     */
    public BIsoOrEquivEsd getBIsoOrEquivEsd() {
        return (BIsoOrEquivEsd) (isText ? textFields.computeIfAbsent("B_iso_or_equiv_esd",
                BIsoOrEquivEsd::new) : getBinaryColumn("B_iso_or_equiv_esd"));
    }

    /**
     * The _atom_site.id of the atom site to which the
     * 'geometry-calculated' atom site is attached.
     * @return CalcAttachedAtom
     */
    public CalcAttachedAtom getCalcAttachedAtom() {
        return (CalcAttachedAtom) (isText ? textFields.computeIfAbsent("calc_attached_atom",
                CalcAttachedAtom::new) : getBinaryColumn("calc_attached_atom"));
    }

    /**
     * A standard code to signal whether the site coordinates have been
     * determined from the intensities or calculated from the geometry
     * of surrounding sites, or have been assigned dummy values. The
     * abbreviation 'c' may be used in place of 'calc'.
     * @return CalcFlag
     */
    public CalcFlag getCalcFlag() {
        return (CalcFlag) (isText ? textFields.computeIfAbsent("calc_flag",
                CalcFlag::new) : getBinaryColumn("calc_flag"));
    }

    /**
     * The x atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return CartnX
     */
    public CartnX getCartnX() {
        return (CartnX) (isText ? textFields.computeIfAbsent("Cartn_x",
                CartnX::new) : getBinaryColumn("Cartn_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_x.
     * @return CartnXEsd
     */
    public CartnXEsd getCartnXEsd() {
        return (CartnXEsd) (isText ? textFields.computeIfAbsent("Cartn_x_esd",
                CartnXEsd::new) : getBinaryColumn("Cartn_x_esd"));
    }

    /**
     * The y atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return CartnY
     */
    public CartnY getCartnY() {
        return (CartnY) (isText ? textFields.computeIfAbsent("Cartn_y",
                CartnY::new) : getBinaryColumn("Cartn_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_y.
     * @return CartnYEsd
     */
    public CartnYEsd getCartnYEsd() {
        return (CartnYEsd) (isText ? textFields.computeIfAbsent("Cartn_y_esd",
                CartnYEsd::new) : getBinaryColumn("Cartn_y_esd"));
    }

    /**
     * The z atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return CartnZ
     */
    public CartnZ getCartnZ() {
        return (CartnZ) (isText ? textFields.computeIfAbsent("Cartn_z",
                CartnZ::new) : getBinaryColumn("Cartn_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_z.
     * @return CartnZEsd
     */
    public CartnZEsd getCartnZEsd() {
        return (CartnZEsd) (isText ? textFields.computeIfAbsent("Cartn_z_esd",
                CartnZEsd::new) : getBinaryColumn("Cartn_z_esd"));
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return ChemicalConnNumber
     */
    public ChemicalConnNumber getChemicalConnNumber() {
        return (ChemicalConnNumber) (isText ? textFields.computeIfAbsent("chemical_conn_number",
                ChemicalConnNumber::new) : getBinaryColumn("chemical_conn_number"));
    }

    /**
     * A description of the constraints applied to parameters at this
     * site during refinement. See also _atom_site.refinement_flags
     * and _refine.ls_number_constraints.
     * @return Constraints
     */
    public Constraints getConstraints() {
        return (Constraints) (isText ? textFields.computeIfAbsent("constraints",
                Constraints::new) : getBinaryColumn("constraints"));
    }

    /**
     * A description of special aspects of this site. See also
     * _atom_site.refinement_flags.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * @return DisorderAssembly
     */
    public DisorderAssembly getDisorderAssembly() {
        return (DisorderAssembly) (isText ? textFields.computeIfAbsent("disorder_assembly",
                DisorderAssembly::new) : getBinaryColumn("disorder_assembly"));
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
     * @return DisorderGroup
     */
    public DisorderGroup getDisorderGroup() {
        return (DisorderGroup) (isText ? textFields.computeIfAbsent("disorder_group",
                DisorderGroup::new) : getBinaryColumn("disorder_group"));
    }

    /**
     * The value of _atom_site.footnote_id must match an ID
     * specified by _atom_sites_footnote.id in the
     * ATOM_SITES_FOOTNOTE list.
     * @return FootnoteId
     */
    public FootnoteId getFootnoteId() {
        return (FootnoteId) (isText ? textFields.computeIfAbsent("footnote_id",
                FootnoteId::new) : getBinaryColumn("footnote_id"));
    }

    /**
     * The x coordinate of the atom-site position specified as a
     * fraction of _cell.length_a.
     * @return FractX
     */
    public FractX getFractX() {
        return (FractX) (isText ? textFields.computeIfAbsent("fract_x",
                FractX::new) : getBinaryColumn("fract_x"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_x.
     * @return FractXEsd
     */
    public FractXEsd getFractXEsd() {
        return (FractXEsd) (isText ? textFields.computeIfAbsent("fract_x_esd",
                FractXEsd::new) : getBinaryColumn("fract_x_esd"));
    }

    /**
     * The y coordinate of the atom-site position specified as a
     * fraction of _cell.length_b.
     * @return FractY
     */
    public FractY getFractY() {
        return (FractY) (isText ? textFields.computeIfAbsent("fract_y",
                FractY::new) : getBinaryColumn("fract_y"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_y.
     * @return FractYEsd
     */
    public FractYEsd getFractYEsd() {
        return (FractYEsd) (isText ? textFields.computeIfAbsent("fract_y_esd",
                FractYEsd::new) : getBinaryColumn("fract_y_esd"));
    }

    /**
     * The z coordinate of the atom-site position specified as a
     * fraction of _cell.length_c.
     * @return FractZ
     */
    public FractZ getFractZ() {
        return (FractZ) (isText ? textFields.computeIfAbsent("fract_z",
                FractZ::new) : getBinaryColumn("fract_z"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_z.
     * @return FractZEsd
     */
    public FractZEsd getFractZEsd() {
        return (FractZEsd) (isText ? textFields.computeIfAbsent("fract_z_esd",
                FractZEsd::new) : getBinaryColumn("fract_z_esd"));
    }

    /**
     * The group of atoms to which the atom site belongs. This data
     * item is provided for compatibility with the original Protein
     * Data Bank format, and only for that purpose.
     * @return GroupPDB
     */
    public GroupPDB getGroupPDB() {
        return (GroupPDB) (isText ? textFields.computeIfAbsent("group_PDB",
                GroupPDB::new) : getBinaryColumn("group_PDB"));
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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * A component of the identifier for this atom site.
     * For further details, see the definition of the ATOM_SITE_ALT
     * category.
     * 
     * This data item is a pointer to _atom_sites_alt.id in the
     * ATOM_SITES_ALT category.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * For further details, see the definition of the STRUCT_ASYM
     * category.
     * 
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return LabelAtomId
     */
    public LabelAtomId getLabelAtomId() {
        return (LabelAtomId) (isText ? textFields.computeIfAbsent("label_atom_id",
                LabelAtomId::new) : getBinaryColumn("label_atom_id"));
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return LabelEntityId
     */
    public LabelEntityId getLabelEntityId() {
        return (LabelEntityId) (isText ? textFields.computeIfAbsent("label_entity_id",
                LabelEntityId::new) : getBinaryColumn("label_entity_id"));
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not significantly exceed 1.0 unless it is a dummy site.
     * @return Occupancy
     */
    public Occupancy getOccupancy() {
        return (Occupancy) (isText ? textFields.computeIfAbsent("occupancy",
                Occupancy::new) : getBinaryColumn("occupancy"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.occupancy.
     * @return OccupancyEsd
     */
    public OccupancyEsd getOccupancyEsd() {
        return (OccupancyEsd) (isText ? textFields.computeIfAbsent("occupancy_esd",
                OccupancyEsd::new) : getBinaryColumn("occupancy_esd"));
    }

    /**
     * A description of restraints applied to specific parameters at
     * this site during refinement. See also _atom_site.refinement_flags
     * and _refine.ls_number_restraints.
     * @return Restraints
     */
    public Restraints getRestraints() {
        return (Restraints) (isText ? textFields.computeIfAbsent("restraints",
                Restraints::new) : getBinaryColumn("restraints"));
    }

    /**
     * The multiplicity of a site due to the space-group symmetry as is
     * given in International Tables for Crystallography Vol. A (2002).
     * @return SymmetryMultiplicity
     */
    public SymmetryMultiplicity getSymmetryMultiplicity() {
        return (SymmetryMultiplicity) (isText ? textFields.computeIfAbsent("symmetry_multiplicity",
                SymmetryMultiplicity::new) : getBinaryColumn("symmetry_multiplicity"));
    }

    /**
     * A standard code used to describe the type of atomic displacement
     * parameters used for the site.
     * @return ThermalDisplaceType
     */
    public ThermalDisplaceType getThermalDisplaceType() {
        return (ThermalDisplaceType) (isText ? textFields.computeIfAbsent("thermal_displace_type",
                ThermalDisplaceType::new) : getBinaryColumn("thermal_displace_type"));
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return TypeSymbol
     */
    public TypeSymbol getTypeSymbol() {
        return (TypeSymbol) (isText ? textFields.computeIfAbsent("type_symbol",
                TypeSymbol::new) : getBinaryColumn("type_symbol"));
    }

    /**
     * Equivalent isotropic atomic displacement parameter, U~eq~,
     * in angstroms squared, calculated as the geometric mean of
     * the anisotropic atomic displacement parameters.
     * 
     * U~eq~ = (U~i~ U~j~ U~k~)^1/3^
     * 
     * U~n~ = the principal components of the orthogonalized U^ij^
     * @return UEquivGeomMean
     */
    public UEquivGeomMean getUEquivGeomMean() {
        return (UEquivGeomMean) (isText ? textFields.computeIfAbsent("U_equiv_geom_mean",
                UEquivGeomMean::new) : getBinaryColumn("U_equiv_geom_mean"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.U_equiv_geom_mean.
     * @return UEquivGeomMeanEsd
     */
    public UEquivGeomMeanEsd getUEquivGeomMeanEsd() {
        return (UEquivGeomMeanEsd) (isText ? textFields.computeIfAbsent("U_equiv_geom_mean_esd",
                UEquivGeomMeanEsd::new) : getBinaryColumn("U_equiv_geom_mean_esd"));
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
     * Ref: Fischer, R. X. & Tillmanns, E. (1988). Acta Cryst. C44,
     * 775-776.
     * @return UIsoOrEquiv
     */
    public UIsoOrEquiv getUIsoOrEquiv() {
        return (UIsoOrEquiv) (isText ? textFields.computeIfAbsent("U_iso_or_equiv",
                UIsoOrEquiv::new) : getBinaryColumn("U_iso_or_equiv"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.U_iso_or_equiv.
     * @return UIsoOrEquivEsd
     */
    public UIsoOrEquivEsd getUIsoOrEquivEsd() {
        return (UIsoOrEquivEsd) (isText ? textFields.computeIfAbsent("U_iso_or_equiv_esd",
                UIsoOrEquivEsd::new) : getBinaryColumn("U_iso_or_equiv_esd"));
    }

    /**
     * The Wyckoff symbol (letter) as listed in the space-group tables
     * of International Tables for Crystallography, Vol. A (2002).
     * @return WyckoffSymbol
     */
    public WyckoffSymbol getWyckoffSymbol() {
        return (WyckoffSymbol) (isText ? textFields.computeIfAbsent("Wyckoff_symbol",
                WyckoffSymbol::new) : getBinaryColumn("Wyckoff_symbol"));
    }

    /**
     * A standard code used to describe the type of atomic displacement
     * parameters used for the site.
     * @return AdpType
     */
    public AdpType getAdpType() {
        return (AdpType) (isText ? textFields.computeIfAbsent("adp_type",
                AdpType::new) : getBinaryColumn("adp_type"));
    }

    /**
     * A concatenated series of single-letter codes which indicate the
     * refinement restraints or constraints applied to this site.  This
     * item should not be used.  It has been replaced by
     * _atom_site.refinement_flags_posn, *_adp and *_occupancy. It is
     * retained in this dictionary only to provide compatibility with
     * old CIFs.
     * @return RefinementFlags
     */
    public RefinementFlags getRefinementFlags() {
        return (RefinementFlags) (isText ? textFields.computeIfAbsent("refinement_flags",
                RefinementFlags::new) : getBinaryColumn("refinement_flags"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the atomic displacement parameters of this site.
     * @return RefinementFlagsAdp
     */
    public RefinementFlagsAdp getRefinementFlagsAdp() {
        return (RefinementFlagsAdp) (isText ? textFields.computeIfAbsent("refinement_flags_adp",
                RefinementFlagsAdp::new) : getBinaryColumn("refinement_flags_adp"));
    }

    /**
     * A code which indicates that refinement restraints or
     * constraints were applied to the occupancy of this site.
     * @return RefinementFlagsOccupancy
     */
    public RefinementFlagsOccupancy getRefinementFlagsOccupancy() {
        return (RefinementFlagsOccupancy) (isText ? textFields.computeIfAbsent("refinement_flags_occupancy",
                RefinementFlagsOccupancy::new) : getBinaryColumn("refinement_flags_occupancy"));
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the positional coordinates of this site.
     * @return RefinementFlagsPosn
     */
    public RefinementFlagsPosn getRefinementFlagsPosn() {
        return (RefinementFlagsPosn) (isText ? textFields.computeIfAbsent("refinement_flags_posn",
                RefinementFlagsPosn::new) : getBinaryColumn("refinement_flags_posn"));
    }

    /**
     * Author's alternate location identifier.
     * @return PdbxAuthAltId
     */
    public PdbxAuthAltId getPdbxAuthAltId() {
        return (PdbxAuthAltId) (isText ? textFields.computeIfAbsent("pdbx_auth_alt_id",
                PdbxAuthAltId::new) : getBinaryColumn("pdbx_auth_alt_id"));
    }

    /**
     * PDB insertion code.
     * @return PdbxPDBInsCode
     */
    public PdbxPDBInsCode getPdbxPDBInsCode() {
        return (PdbxPDBInsCode) (isText ? textFields.computeIfAbsent("pdbx_PDB_ins_code",
                PdbxPDBInsCode::new) : getBinaryColumn("pdbx_PDB_ins_code"));
    }

    /**
     * PDB model number.
     * @return PdbxPDBModelNum
     */
    public PdbxPDBModelNum getPdbxPDBModelNum() {
        return (PdbxPDBModelNum) (isText ? textFields.computeIfAbsent("pdbx_PDB_model_num",
                PdbxPDBModelNum::new) : getBinaryColumn("pdbx_PDB_model_num"));
    }

    /**
     * PDB residue number.
     * @return PdbxPDBResidueNo
     */
    public PdbxPDBResidueNo getPdbxPDBResidueNo() {
        return (PdbxPDBResidueNo) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_no",
                PdbxPDBResidueNo::new) : getBinaryColumn("pdbx_PDB_residue_no"));
    }

    /**
     * PDB residue name.
     * @return PdbxPDBResidueName
     */
    public PdbxPDBResidueName getPdbxPDBResidueName() {
        return (PdbxPDBResidueName) (isText ? textFields.computeIfAbsent("pdbx_PDB_residue_name",
                PdbxPDBResidueName::new) : getBinaryColumn("pdbx_PDB_residue_name"));
    }

    /**
     * PDB strand id.
     * @return PdbxPDBStrandId
     */
    public PdbxPDBStrandId getPdbxPDBStrandId() {
        return (PdbxPDBStrandId) (isText ? textFields.computeIfAbsent("pdbx_PDB_strand_id",
                PdbxPDBStrandId::new) : getBinaryColumn("pdbx_PDB_strand_id"));
    }

    /**
     * PDB atom name.
     * @return PdbxPDBAtomName
     */
    public PdbxPDBAtomName getPdbxPDBAtomName() {
        return (PdbxPDBAtomName) (isText ? textFields.computeIfAbsent("pdbx_PDB_atom_name",
                PdbxPDBAtomName::new) : getBinaryColumn("pdbx_PDB_atom_name"));
    }

    /**
     * Author's atom name.
     * @return PdbxAuthAtomName
     */
    public PdbxAuthAtomName getPdbxAuthAtomName() {
        return (PdbxAuthAtomName) (isText ? textFields.computeIfAbsent("pdbx_auth_atom_name",
                PdbxAuthAtomName::new) : getBinaryColumn("pdbx_auth_atom_name"));
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return PdbxFormalCharge
     */
    public PdbxFormalCharge getPdbxFormalCharge() {
        return (PdbxFormalCharge) (isText ? textFields.computeIfAbsent("pdbx_formal_charge",
                PdbxFormalCharge::new) : getBinaryColumn("pdbx_formal_charge"));
    }

    /**
     * Author's residue name.
     * @return PdbxAuthCompId
     */
    public PdbxAuthCompId getPdbxAuthCompId() {
        return (PdbxAuthCompId) (isText ? textFields.computeIfAbsent("pdbx_auth_comp_id",
                PdbxAuthCompId::new) : getBinaryColumn("pdbx_auth_comp_id"));
    }

    /**
     * Author's strand id.
     * @return PdbxAuthAsymId
     */
    public PdbxAuthAsymId getPdbxAuthAsymId() {
        return (PdbxAuthAsymId) (isText ? textFields.computeIfAbsent("pdbx_auth_asym_id",
                PdbxAuthAsymId::new) : getBinaryColumn("pdbx_auth_asym_id"));
    }

    /**
     * Author's sequence identifier.
     * @return PdbxAuthSeqId
     */
    public PdbxAuthSeqId getPdbxAuthSeqId() {
        return (PdbxAuthSeqId) (isText ? textFields.computeIfAbsent("pdbx_auth_seq_id",
                PdbxAuthSeqId::new) : getBinaryColumn("pdbx_auth_seq_id"));
    }

    /**
     * The TLS group to which the atom position is assigned.
     * 
     * The TLS group is defined in category pdbx_refine_tls.
     * This item is a reference to _pdbx_refine_tls.id.
     * @return PdbxTlsGroupId
     */
    public PdbxTlsGroupId getPdbxTlsGroupId() {
        return (PdbxTlsGroupId) (isText ? textFields.computeIfAbsent("pdbx_tls_group_id",
                PdbxTlsGroupId::new) : getBinaryColumn("pdbx_tls_group_id"));
    }

    /**
     * The NCS domain to which the atom position is assigned.
     * 
     * The NCS group is defined in category struct_ncs_dom.
     * This item is a reference to _struct_ncs_dom.id.
     * @return PdbxNcsDomId
     */
    public PdbxNcsDomId getPdbxNcsDomId() {
        return (PdbxNcsDomId) (isText ? textFields.computeIfAbsent("pdbx_ncs_dom_id",
                PdbxNcsDomId::new) : getBinaryColumn("pdbx_ncs_dom_id"));
    }

    /**
     * The value of _atom_site.pdbx_struct_group_id identifies the group or groups
     * assigned to this atom.    This is a reference to the identifier for
     * group definition in category PDBX_STRUCT_GROUP_LIST.
     * 
     * Multiple groups identifiers are encoded as a comma separated list.
     * @return PdbxStructGroupId
     */
    public PdbxStructGroupId getPdbxStructGroupId() {
        return (PdbxStructGroupId) (isText ? textFields.computeIfAbsent("pdbx_struct_group_id",
                PdbxStructGroupId::new) : getBinaryColumn("pdbx_struct_group_id"));
    }

    /**
     * The ATOM group code used by the NDB.
     * @return PdbxGroupNDB
     */
    public PdbxGroupNDB getPdbxGroupNDB() {
        return (PdbxGroupNDB) (isText ? textFields.computeIfAbsent("pdbx_group_NDB",
                PdbxGroupNDB::new) : getBinaryColumn("pdbx_group_NDB"));
    }

    /**
     * The ATOM group code used by the NDB.
     * @return PdbxAtomGroup
     */
    public PdbxAtomGroup getPdbxAtomGroup() {
        return (PdbxAtomGroup) (isText ? textFields.computeIfAbsent("pdbx_atom_group",
                PdbxAtomGroup::new) : getBinaryColumn("pdbx_atom_group"));
    }

    /**
     * Sequential residue number used by NDB.
     * @return PdbxLabelSeqNum
     */
    public PdbxLabelSeqNum getPdbxLabelSeqNum() {
        return (PdbxLabelSeqNum) (isText ? textFields.computeIfAbsent("pdbx_label_seq_num",
                PdbxLabelSeqNum::new) : getBinaryColumn("pdbx_label_seq_num"));
    }

    /**
     * Will identify with a 'Y' that this strand got generated.
     * @return PdbxNotInAsym
     */
    public PdbxNotInAsym getPdbxNotInAsym() {
        return (PdbxNotInAsym) (isText ? textFields.computeIfAbsent("pdbx_not_in_asym",
                PdbxNotInAsym::new) : getBinaryColumn("pdbx_not_in_asym"));
    }
}
