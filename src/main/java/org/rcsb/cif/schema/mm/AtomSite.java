package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ATOM_SITE category record details about
 * the atom sites in a macromolecular crystal structure, such as
 * the positional coordinates, atomic displacement parameters,
 * magnetic moments and directions.
 * 
 * The data items for describing anisotropic atomic
 * displacement factors are only used if the corresponding items
 * are not given in the ATOM_SITE_ANISOTROP category.
 * 
 * wwPDB recommends wwPDB-assigned residue number, residue ID,
 * and chain ID, _atom_site.auth_seq_id _atom_site.auth_comp_id, and
 * _atom_site.auth_asym_id, respectively, to be used for publication
 * materials.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class AtomSite extends DelegatingCategory {
    public AtomSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "aniso_B[1][1]":
                return getAnisoB11();
            case "aniso_B[1][1]_esd":
                return getAnisoB11Esd();
            case "aniso_B[1][2]":
                return getAnisoB12();
            case "aniso_B[1][2]_esd":
                return getAnisoB12Esd();
            case "aniso_B[1][3]":
                return getAnisoB13();
            case "aniso_B[1][3]_esd":
                return getAnisoB13Esd();
            case "aniso_B[2][2]":
                return getAnisoB22();
            case "aniso_B[2][2]_esd":
                return getAnisoB22Esd();
            case "aniso_B[2][3]":
                return getAnisoB23();
            case "aniso_B[2][3]_esd":
                return getAnisoB23Esd();
            case "aniso_B[3][3]":
                return getAnisoB33();
            case "aniso_B[3][3]_esd":
                return getAnisoB33Esd();
            case "aniso_ratio":
                return getAnisoRatio();
            case "aniso_U[1][1]":
                return getAnisoU11();
            case "aniso_U[1][1]_esd":
                return getAnisoU11Esd();
            case "aniso_U[1][2]":
                return getAnisoU12();
            case "aniso_U[1][2]_esd":
                return getAnisoU12Esd();
            case "aniso_U[1][3]":
                return getAnisoU13();
            case "aniso_U[1][3]_esd":
                return getAnisoU13Esd();
            case "aniso_U[2][2]":
                return getAnisoU22();
            case "aniso_U[2][2]_esd":
                return getAnisoU22Esd();
            case "aniso_U[2][3]":
                return getAnisoU23();
            case "aniso_U[2][3]_esd":
                return getAnisoU23Esd();
            case "aniso_U[3][3]":
                return getAnisoU33();
            case "aniso_U[3][3]_esd":
                return getAnisoU33Esd();
            case "attached_hydrogens":
                return getAttachedHydrogens();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_atom_id":
                return getAuthAtomId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "B_equiv_geom_mean":
                return getBEquivGeomMean();
            case "B_equiv_geom_mean_esd":
                return getBEquivGeomMeanEsd();
            case "B_iso_or_equiv":
                return getBIsoOrEquiv();
            case "B_iso_or_equiv_esd":
                return getBIsoOrEquivEsd();
            case "calc_attached_atom":
                return getCalcAttachedAtom();
            case "calc_flag":
                return getCalcFlag();
            case "Cartn_x":
                return getCartnX();
            case "Cartn_x_esd":
                return getCartnXEsd();
            case "Cartn_y":
                return getCartnY();
            case "Cartn_y_esd":
                return getCartnYEsd();
            case "Cartn_z":
                return getCartnZ();
            case "Cartn_z_esd":
                return getCartnZEsd();
            case "chemical_conn_number":
                return getChemicalConnNumber();
            case "constraints":
                return getConstraints();
            case "details":
                return getDetails();
            case "disorder_assembly":
                return getDisorderAssembly();
            case "disorder_group":
                return getDisorderGroup();
            case "footnote_id":
                return getFootnoteId();
            case "fract_x":
                return getFractX();
            case "fract_x_esd":
                return getFractXEsd();
            case "fract_y":
                return getFractY();
            case "fract_y_esd":
                return getFractYEsd();
            case "fract_z":
                return getFractZ();
            case "fract_z_esd":
                return getFractZEsd();
            case "group_PDB":
                return getGroupPDB();
            case "id":
                return getId();
            case "label_alt_id":
                return getLabelAltId();
            case "label_asym_id":
                return getLabelAsymId();
            case "label_atom_id":
                return getLabelAtomId();
            case "label_comp_id":
                return getLabelCompId();
            case "label_entity_id":
                return getLabelEntityId();
            case "label_seq_id":
                return getLabelSeqId();
            case "occupancy":
                return getOccupancy();
            case "occupancy_esd":
                return getOccupancyEsd();
            case "restraints":
                return getRestraints();
            case "symmetry_multiplicity":
                return getSymmetryMultiplicity();
            case "thermal_displace_type":
                return getThermalDisplaceType();
            case "type_symbol":
                return getTypeSymbol();
            case "U_equiv_geom_mean":
                return getUEquivGeomMean();
            case "U_equiv_geom_mean_esd":
                return getUEquivGeomMeanEsd();
            case "U_iso_or_equiv":
                return getUIsoOrEquiv();
            case "U_iso_or_equiv_esd":
                return getUIsoOrEquivEsd();
            case "Wyckoff_symbol":
                return getWyckoffSymbol();
            case "pdbx_atom_ambiguity":
                return getPdbxAtomAmbiguity();
            case "adp_type":
                return getAdpType();
            case "refinement_flags":
                return getRefinementFlags();
            case "refinement_flags_adp":
                return getRefinementFlagsAdp();
            case "refinement_flags_occupancy":
                return getRefinementFlagsOccupancy();
            case "refinement_flags_posn":
                return getRefinementFlagsPosn();
            case "pdbx_auth_alt_id":
                return getPdbxAuthAltId();
            case "pdbx_PDB_ins_code":
                return getPdbxPDBInsCode();
            case "pdbx_PDB_model_num":
                return getPdbxPDBModelNum();
            case "pdbx_PDB_residue_no":
                return getPdbxPDBResidueNo();
            case "pdbx_PDB_residue_name":
                return getPdbxPDBResidueName();
            case "pdbx_PDB_strand_id":
                return getPdbxPDBStrandId();
            case "pdbx_PDB_atom_name":
                return getPdbxPDBAtomName();
            case "pdbx_auth_atom_name":
                return getPdbxAuthAtomName();
            case "pdbx_formal_charge":
                return getPdbxFormalCharge();
            case "pdbx_auth_comp_id":
                return getPdbxAuthCompId();
            case "pdbx_auth_asym_id":
                return getPdbxAuthAsymId();
            case "pdbx_auth_seq_id":
                return getPdbxAuthSeqId();
            case "pdbx_tls_group_id":
                return getPdbxTlsGroupId();
            case "pdbx_ncs_dom_id":
                return getPdbxNcsDomId();
            case "pdbx_struct_group_id":
                return getPdbxStructGroupId();
            case "pdbx_group_NDB":
                return getPdbxGroupNDB();
            case "pdbx_atom_group":
                return getPdbxAtomGroup();
            case "pdbx_label_seq_num":
                return getPdbxLabelSeqNum();
            case "pdbx_not_in_asym":
                return getPdbxNotInAsym();
            case "pdbx_label_index":
                return getPdbxLabelIndex();
            case "pdbx_sifts_xref_db_name":
                return getPdbxSiftsXrefDbName();
            case "pdbx_sifts_xref_db_acc":
                return getPdbxSiftsXrefDbAcc();
            case "pdbx_sifts_xref_db_num":
                return getPdbxSiftsXrefDbNum();
            case "pdbx_sifts_xref_db_res":
                return getPdbxSiftsXrefDbRes();
            case "ihm_model_id":
                return getIhmModelId();
            default:
                return new DelegatingColumn(column);
        }
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
        return delegate.getColumn("aniso_B[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB11Esd() {
        return delegate.getColumn("aniso_B[1][1]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_B[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB12Esd() {
        return delegate.getColumn("aniso_B[1][2]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_B[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB13Esd() {
        return delegate.getColumn("aniso_B[1][3]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_B[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB22Esd() {
        return delegate.getColumn("aniso_B[2][2]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_B[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB23Esd() {
        return delegate.getColumn("aniso_B[2][3]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_B[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_B.
     * @return FloatColumn
     */
    public FloatColumn getAnisoB33Esd() {
        return delegate.getColumn("aniso_B[3][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * Ratio of the maximum to minimum principal axes of
     * displacement (thermal) ellipsoids.
     * @return FloatColumn
     */
    public FloatColumn getAnisoRatio() {
        return delegate.getColumn("aniso_ratio", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_U[1][1]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU11Esd() {
        return delegate.getColumn("aniso_U[1][1]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_U[1][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU12Esd() {
        return delegate.getColumn("aniso_U[1][2]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_U[1][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU13Esd() {
        return delegate.getColumn("aniso_U[1][3]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_U[2][2]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU22Esd() {
        return delegate.getColumn("aniso_U[2][2]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_U[2][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU23Esd() {
        return delegate.getColumn("aniso_U[2][3]_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("aniso_U[3][3]", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.aniso_U.
     * @return FloatColumn
     */
    public FloatColumn getAnisoU33Esd() {
        return delegate.getColumn("aniso_U[3][3]_esd", DelegatingFloatColumn::new);
    }

    /**
     * The number of hydrogen atoms attached to the atom at this site
     * excluding any hydrogen atoms for which coordinates (measured or
     * calculated) are given.
     * @return IntColumn
     */
    public IntColumn getAttachedHydrogens() {
        return delegate.getColumn("attached_hydrogens", DelegatingIntColumn::new);
    }

    /**
     * An alternative identifier for _atom_site.label_asym_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative identifier for _atom_site.label_atom_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId() {
        return delegate.getColumn("auth_atom_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative identifier for _atom_site.label_comp_id that
     * may be provided by an author in order to match the identification
     * used in the publication that describes the structure.
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("auth_seq_id", DelegatingIntColumn::new);
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
        return delegate.getColumn("B_equiv_geom_mean", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.B_equiv_geom_mean.
     * @return FloatColumn
     */
    public FloatColumn getBEquivGeomMeanEsd() {
        return delegate.getColumn("B_equiv_geom_mean_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("B_iso_or_equiv", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.B_iso_or_equiv.
     * @return FloatColumn
     */
    public FloatColumn getBIsoOrEquivEsd() {
        return delegate.getColumn("B_iso_or_equiv_esd", DelegatingFloatColumn::new);
    }

    /**
     * The _atom_site.id of the atom site to which the
     * 'geometry-calculated' atom site is attached.
     * @return StrColumn
     */
    public StrColumn getCalcAttachedAtom() {
        return delegate.getColumn("calc_attached_atom", DelegatingStrColumn::new);
    }

    /**
     * A standard code to signal whether the site coordinates have been
     * determined from the intensities or calculated from the geometry
     * of surrounding sites, or have been assigned dummy values. The
     * abbreviation 'c' may be used in place of 'calc'.
     * @return StrColumn
     */
    public StrColumn getCalcFlag() {
        return delegate.getColumn("calc_flag", DelegatingStrColumn::new);
    }

    /**
     * The x atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnX() {
        return delegate.getColumn("Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_x.
     * @return FloatColumn
     */
    public FloatColumn getCartnXEsd() {
        return delegate.getColumn("Cartn_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * The y atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnY() {
        return delegate.getColumn("Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_y.
     * @return FloatColumn
     */
    public FloatColumn getCartnYEsd() {
        return delegate.getColumn("Cartn_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * The z atom-site coordinate in angstroms specified according to
     * a set of orthogonal Cartesian axes related to the cell axes as
     * specified by the description given in
     * _atom_sites.Cartn_transform_axes.
     * @return FloatColumn
     */
    public FloatColumn getCartnZ() {
        return delegate.getColumn("Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.Cartn_z.
     * @return FloatColumn
     */
    public FloatColumn getCartnZEsd() {
        return delegate.getColumn("Cartn_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _chemical_conn_atom.number in the
     * CHEMICAL_CONN_ATOM category.
     * @return IntColumn
     */
    public IntColumn getChemicalConnNumber() {
        return delegate.getColumn("chemical_conn_number", DelegatingIntColumn::new);
    }

    /**
     * A description of the constraints applied to parameters at this
     * site during refinement. See also _atom_site.refinement_flags
     * and _refine.ls_number_constraints.
     * @return StrColumn
     */
    public StrColumn getConstraints() {
        return delegate.getColumn("constraints", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of this site. See also
     * _atom_site.refinement_flags.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
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
        return delegate.getColumn("disorder_assembly", DelegatingStrColumn::new);
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
        return delegate.getColumn("disorder_group", DelegatingStrColumn::new);
    }

    /**
     * The value of _atom_site.footnote_id must match an ID
     * specified by _atom_sites_footnote.id in the
     * ATOM_SITES_FOOTNOTE list.
     * @return StrColumn
     */
    public StrColumn getFootnoteId() {
        return delegate.getColumn("footnote_id", DelegatingStrColumn::new);
    }

    /**
     * The x coordinate of the atom-site position specified as a
     * fraction of _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getFractX() {
        return delegate.getColumn("fract_x", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_x.
     * @return FloatColumn
     */
    public FloatColumn getFractXEsd() {
        return delegate.getColumn("fract_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * The y coordinate of the atom-site position specified as a
     * fraction of _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getFractY() {
        return delegate.getColumn("fract_y", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_y.
     * @return FloatColumn
     */
    public FloatColumn getFractYEsd() {
        return delegate.getColumn("fract_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * The z coordinate of the atom-site position specified as a
     * fraction of _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getFractZ() {
        return delegate.getColumn("fract_z", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.fract_z.
     * @return FloatColumn
     */
    public FloatColumn getFractZEsd() {
        return delegate.getColumn("fract_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * The group of atoms to which the atom site belongs. This data
     * item is provided for compatibility with the original Protein
     * Data Bank format, and only for that purpose.
     * @return StrColumn
     */
    public StrColumn getGroupPDB() {
        return delegate.getColumn("group_PDB", DelegatingStrColumn::new);
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
     * 
     * In general, this aggregate identifier does not uniquely
     * identify an atom site as for non-polymers _atom_site.label_seq_id
     * is '.'.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A place holder to indicate alternate conformation. The alternate conformation
     * can be an entire polymer chain, or several residues or
     * partial residue (several atoms within one residue). If
     * an atom is provided in more than one position, then a
     * non-blank alternate location indicator must be used for
     * each of the atomic positions.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getLabelAtomId() {
        return delegate.getColumn("label_atom_id", DelegatingStrColumn::new);
    }

    /**
     * A component of the identifier for this atom site.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getLabelCompId() {
        return delegate.getColumn("label_comp_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getLabelEntityId() {
        return delegate.getColumn("label_entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The fraction of the atom type present at this site.
     * The sum of the occupancies of all the atom types at this site
     * may not exceed 1.0 unless it is a dummy site.
     * @return FloatColumn
     */
    public FloatColumn getOccupancy() {
        return delegate.getColumn("occupancy", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.occupancy.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyEsd() {
        return delegate.getColumn("occupancy_esd", DelegatingFloatColumn::new);
    }

    /**
     * A description of restraints applied to specific parameters at
     * this site during refinement. See also _atom_site.refinement_flags
     * and _refine.ls_number_restraints.
     * @return StrColumn
     */
    public StrColumn getRestraints() {
        return delegate.getColumn("restraints", DelegatingStrColumn::new);
    }

    /**
     * The multiplicity of a site due to the space-group symmetry as is
     * given in International Tables for Crystallography Vol. A (2002).
     * @return IntColumn
     */
    public IntColumn getSymmetryMultiplicity() {
        return delegate.getColumn("symmetry_multiplicity", DelegatingIntColumn::new);
    }

    /**
     * A standard code used to describe the type of atomic displacement
     * parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getThermalDisplaceType() {
        return delegate.getColumn("thermal_displace_type", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_type.symbol in the
     * ATOM_TYPE category.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
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
        return delegate.getColumn("U_equiv_geom_mean", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.U_equiv_geom_mean.
     * @return FloatColumn
     */
    public FloatColumn getUEquivGeomMeanEsd() {
        return delegate.getColumn("U_equiv_geom_mean_esd", DelegatingFloatColumn::new);
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
        return delegate.getColumn("U_iso_or_equiv", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _atom_site.U_iso_or_equiv.
     * @return FloatColumn
     */
    public FloatColumn getUIsoOrEquivEsd() {
        return delegate.getColumn("U_iso_or_equiv_esd", DelegatingFloatColumn::new);
    }

    /**
     * The Wyckoff symbol (letter) as listed in the space-group tables
     * of International Tables for Crystallography, Vol. A (2002).
     * @return StrColumn
     */
    public StrColumn getWyckoffSymbol() {
        return delegate.getColumn("Wyckoff_symbol", DelegatingStrColumn::new);
    }

    /**
     * The optional value of _atom_site.pdbx_atom_ambiguity atoms that differ only by stereochemistry but
     * are not stereospecifically assigned by the experiment.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomAmbiguity() {
        return delegate.getColumn("pdbx_atom_ambiguity", DelegatingStrColumn::new);
    }

    /**
     * A standard code used to describe the type of atomic displacement
     * parameters used for the site.
     * @return StrColumn
     */
    public StrColumn getAdpType() {
        return delegate.getColumn("adp_type", DelegatingStrColumn::new);
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
        return delegate.getColumn("refinement_flags", DelegatingStrColumn::new);
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the atomic displacement parameters of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsAdp() {
        return delegate.getColumn("refinement_flags_adp", DelegatingStrColumn::new);
    }

    /**
     * A code which indicates that refinement restraints or
     * constraints were applied to the occupancy of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsOccupancy() {
        return delegate.getColumn("refinement_flags_occupancy", DelegatingStrColumn::new);
    }

    /**
     * A code which indicates the refinement restraints or constraints
     * applied to the positional coordinates of this site.
     * @return StrColumn
     */
    public StrColumn getRefinementFlagsPosn() {
        return delegate.getColumn("refinement_flags_posn", DelegatingStrColumn::new);
    }

    /**
     * Author's alternate location identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAltId() {
        return delegate.getColumn("pdbx_auth_alt_id", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBInsCode() {
        return delegate.getColumn("pdbx_PDB_ins_code", DelegatingStrColumn::new);
    }

    /**
     * PDB model number.
     * @return IntColumn
     */
    public IntColumn getPdbxPDBModelNum() {
        return delegate.getColumn("pdbx_PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * PDB residue number.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueNo() {
        return delegate.getColumn("pdbx_PDB_residue_no", DelegatingStrColumn::new);
    }

    /**
     * PDB residue name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBResidueName() {
        return delegate.getColumn("pdbx_PDB_residue_name", DelegatingStrColumn::new);
    }

    /**
     * PDB strand id.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBStrandId() {
        return delegate.getColumn("pdbx_PDB_strand_id", DelegatingStrColumn::new);
    }

    /**
     * PDB atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxPDBAtomName() {
        return delegate.getColumn("pdbx_PDB_atom_name", DelegatingStrColumn::new);
    }

    /**
     * Author's atom name.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAtomName() {
        return delegate.getColumn("pdbx_auth_atom_name", DelegatingStrColumn::new);
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getPdbxFormalCharge() {
        return delegate.getColumn("pdbx_formal_charge", DelegatingIntColumn::new);
    }

    /**
     * Author's residue name.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthCompId() {
        return delegate.getColumn("pdbx_auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * Author's strand id.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthAsymId() {
        return delegate.getColumn("pdbx_auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Author's sequence identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxAuthSeqId() {
        return delegate.getColumn("pdbx_auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * The TLS group to which the atom position is assigned.
     * 
     * The TLS group is defined in category pdbx_refine_tls.
     * This item is a reference to _pdbx_refine_tls.id.
     * @return StrColumn
     */
    public StrColumn getPdbxTlsGroupId() {
        return delegate.getColumn("pdbx_tls_group_id", DelegatingStrColumn::new);
    }

    /**
     * The NCS domain to which the atom position is assigned.
     * 
     * The NCS group is defined in category struct_ncs_dom.
     * This item is a reference to _struct_ncs_dom.id.
     * @return StrColumn
     */
    public StrColumn getPdbxNcsDomId() {
        return delegate.getColumn("pdbx_ncs_dom_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("pdbx_struct_group_id", DelegatingStrColumn::new);
    }

    /**
     * The ATOM group code used by the NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxGroupNDB() {
        return delegate.getColumn("pdbx_group_NDB", DelegatingStrColumn::new);
    }

    /**
     * The ATOM group code used by the NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxAtomGroup() {
        return delegate.getColumn("pdbx_atom_group", DelegatingStrColumn::new);
    }

    /**
     * Sequential residue number used by NDB.
     * @return StrColumn
     */
    public StrColumn getPdbxLabelSeqNum() {
        return delegate.getColumn("pdbx_label_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Will identify with a 'Y' that this strand got generated.
     * @return StrColumn
     */
    public StrColumn getPdbxNotInAsym() {
        return delegate.getColumn("pdbx_not_in_asym", DelegatingStrColumn::new);
    }

    /**
     * This data item is an ordinal which identifies distinct chemical components in the atom_site category, both
     * polymeric and non-polymeric.
     * @return IntColumn
     */
    public IntColumn getPdbxLabelIndex() {
        return delegate.getColumn("pdbx_label_index", DelegatingIntColumn::new);
    }

    /**
     * The name of additional external databases with residue level mapping.
     * @return StrColumn
     */
    public StrColumn getPdbxSiftsXrefDbName() {
        return delegate.getColumn("pdbx_sifts_xref_db_name", DelegatingStrColumn::new);
    }

    /**
     * The accession code related to the additional external database entry.
     * @return StrColumn
     */
    public StrColumn getPdbxSiftsXrefDbAcc() {
        return delegate.getColumn("pdbx_sifts_xref_db_acc", DelegatingStrColumn::new);
    }

    /**
     * The sequence position of the external database entry that corresponds
     * to the residue mapping defined by the SIFTS process.
     * @return StrColumn
     */
    public StrColumn getPdbxSiftsXrefDbNum() {
        return delegate.getColumn("pdbx_sifts_xref_db_num", DelegatingStrColumn::new);
    }

    /**
     * Describes the residue type of the given UniProt match
     * @return StrColumn
     */
    public StrColumn getPdbxSiftsXrefDbRes() {
        return delegate.getColumn("pdbx_sifts_xref_db_res", DelegatingStrColumn::new);
    }

    /**
     * The model id corresponding to the atom site.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getIhmModelId() {
        return delegate.getColumn("ihm_model_id", DelegatingIntColumn::new);
    }

}