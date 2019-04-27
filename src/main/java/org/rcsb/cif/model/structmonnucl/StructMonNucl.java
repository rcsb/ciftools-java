package org.rcsb.cif.model.structmonnucl;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructMonNucl extends BaseCategory {
    public StructMonNucl(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructMonNucl(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructMonNucl(String name) {
        super(name);
    }

    /**
     * The value in degrees of the backbone torsion angle alpha
     * (O3'-P-O5'-C5').
     * @return Alpha
     */
    public Alpha getAlpha() {
        return (Alpha) (isText ? textFields.computeIfAbsent("alpha",
                Alpha::new) : getBinaryColumn("alpha"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * The value in degrees of the backbone torsion angle beta
     * (P-O5'-C5'-C4').
     * @return Beta
     */
    public Beta getBeta() {
        return (Beta) (isText ? textFields.computeIfAbsent("beta",
                Beta::new) : getBinaryColumn("beta"));
    }

    /**
     * The value in degrees of the sugar-base torsion angle chi1
     * (O4'-C1'-N1-C2).
     * @return Chi1
     */
    public Chi1 getChi1() {
        return (Chi1) (isText ? textFields.computeIfAbsent("chi1",
                Chi1::new) : getBinaryColumn("chi1"));
    }

    /**
     * The value in degrees of the sugar-base torsion angle chi2
     * (O4'-C1'-N9-C4).
     * @return Chi2
     */
    public Chi2 getChi2() {
        return (Chi2) (isText ? textFields.computeIfAbsent("chi2",
                Chi2::new) : getBinaryColumn("chi2"));
    }

    /**
     * The value in degrees of the backbone torsion angle delta
     * (C5'-C4'-C3'-O3').
     * @return Delta
     */
    public Delta getDelta() {
        return (Delta) (isText ? textFields.computeIfAbsent("delta",
                Delta::new) : getBinaryColumn("delta"));
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect
     * that requires annotation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The value in degrees of the backbone torsion angle epsilon
     * (C4'-C3'-O3'-P).
     * @return Epsilon
     */
    public Epsilon getEpsilon() {
        return (Epsilon) (isText ? textFields.computeIfAbsent("epsilon",
                Epsilon::new) : getBinaryColumn("epsilon"));
    }

    /**
     * The value in degrees of the backbone torsion angle gamma
     * (O5'-C5'-C4'-C3').
     * @return Gamma
     */
    public Gamma getGamma() {
        return (Gamma) (isText ? textFields.computeIfAbsent("gamma",
                Gamma::new) : getBinaryColumn("gamma"));
    }

    /**
     * A component of the identifier for participants in the site.
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
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return LabelCompId
     */
    public LabelCompId getLabelCompId() {
        return (LabelCompId) (isText ? textFields.computeIfAbsent("label_comp_id",
                LabelCompId::new) : getBinaryColumn("label_comp_id"));
    }

    /**
     * A component of the identifier for participants in the site.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for all atoms in the monomer.
     * @return MeanBAll
     */
    public MeanBAll getMeanBAll() {
        return (MeanBAll) (isText ? textFields.computeIfAbsent("mean_B_all",
                MeanBAll::new) : getBinaryColumn("mean_B_all"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the base moiety of the nucleic acid monomer.
     * @return MeanBBase
     */
    public MeanBBase getMeanBBase() {
        return (MeanBBase) (isText ? textFields.computeIfAbsent("mean_B_base",
                MeanBBase::new) : getBinaryColumn("mean_B_base"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the phosphate moiety of the nucleic acid monomer.
     * @return MeanBPhos
     */
    public MeanBPhos getMeanBPhos() {
        return (MeanBPhos) (isText ? textFields.computeIfAbsent("mean_B_phos",
                MeanBPhos::new) : getBinaryColumn("mean_B_phos"));
    }

    /**
     * The mean value of the isotropic displacement parameter
     * for atoms in the sugar moiety of the nucleic acid monomer.
     * @return MeanBSugar
     */
    public MeanBSugar getMeanBSugar() {
        return (MeanBSugar) (isText ? textFields.computeIfAbsent("mean_B_sugar",
                MeanBSugar::new) : getBinaryColumn("mean_B_sugar"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu0
     * (C4'-O4'-C1'-C2').
     * @return Nu0
     */
    public Nu0 getNu0() {
        return (Nu0) (isText ? textFields.computeIfAbsent("nu0",
                Nu0::new) : getBinaryColumn("nu0"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu1
     * (O4'-C1'-C2'-C3').
     * @return Nu1
     */
    public Nu1 getNu1() {
        return (Nu1) (isText ? textFields.computeIfAbsent("nu1",
                Nu1::new) : getBinaryColumn("nu1"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu2
     * (C1'-C2'-C3'-C4').
     * @return Nu2
     */
    public Nu2 getNu2() {
        return (Nu2) (isText ? textFields.computeIfAbsent("nu2",
                Nu2::new) : getBinaryColumn("nu2"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu3
     * (C2'-C3'-C4'-O4').
     * @return Nu3
     */
    public Nu3 getNu3() {
        return (Nu3) (isText ? textFields.computeIfAbsent("nu3",
                Nu3::new) : getBinaryColumn("nu3"));
    }

    /**
     * The value in degrees of the sugar torsion angle nu4
     * (C3'-C4'-O4'-C1').
     * @return Nu4
     */
    public Nu4 getNu4() {
        return (Nu4) (isText ? textFields.computeIfAbsent("nu4",
                Nu4::new) : getBinaryColumn("nu4"));
    }

    /**
     * P is the phase angle of pseudorotation for five-membered rings.
     * For ribose and deoxyribose sugars in nucleic
     * acids
     * (tau4 +tau1)-(tau3+tau0)
     * P = ATAN (-------------------------)
     * 2tau2 (sin 36+sin 72)
     * 
     * If tau2 is <0, then P=P+180 degree (Altona & Sundaralingam,
     * 1972).
     * 
     * Ref: Altona, C. & Sundaralingam, M. (1972).
     * J. Am. Chem. Soc. 94, 8205-8212.
     * @return P
     */
    public P getP() {
        return (P) (isText ? textFields.computeIfAbsent("P",
                P::new) : getBinaryColumn("P"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return RSCCAll
     */
    public RSCCAll getRSCCAll() {
        return (RSCCAll) (isText ? textFields.computeIfAbsent("RSCC_all",
                RSCCAll::new) : getBinaryColumn("RSCC_all"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * base moiety of the nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return RSCCBase
     */
    public RSCCBase getRSCCBase() {
        return (RSCCBase) (isText ? textFields.computeIfAbsent("RSCC_base",
                RSCCBase::new) : getBinaryColumn("RSCC_base"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * phosphate moiety of the nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return RSCCPhos
     */
    public RSCCPhos getRSCCPhos() {
        return (RSCCPhos) (isText ? textFields.computeIfAbsent("RSCC_phos",
                RSCCPhos::new) : getBinaryColumn("RSCC_phos"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms in the
     * sugar moiety of the nucleic acid monomer.
     * 
     * sum|p~obs~ - <p~obs~>| * sum|p~calc~ - <p~calc~>|
     * RSCC = -------------------------------------------------
     * [ sum|p~obs~  - <p~obs~> |^2^
     * * sum|p~calc~ - <p~calc~>|^2^ ]^1/2^
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSCC. < > indicates an average and the
     * sums are taken over all map grid  points near the relevant atoms.
     * The radius for including grid points in the calculation should
     * also be given in _struct_mon_details.RSCC.
     * 
     * Ref: Jones, T. A., Zou, J.-Y., Cowan, S. W. & Kjeldgaard, M.
     * (1991). Acta Cryst. A47, 110-119.
     * @return RSCCSugar
     */
    public RSCCSugar getRSCCSugar() {
        return (RSCCSugar) (isText ? textFields.computeIfAbsent("RSCC_sugar",
                RSCCSugar::new) : getBinaryColumn("RSCC_sugar"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
     * (1990), evaluated over all atoms in the nucleic acid monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return RSRAll
     */
    public RSRAll getRSRAll() {
        return (RSRAll) (isText ? textFields.computeIfAbsent("RSR_all",
                RSRAll::new) : getBinaryColumn("RSR_all"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
     * (1990), evaluated over all atoms in the base moiety of the
     * nucleic acid monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return RSRBase
     */
    public RSRBase getRSRBase() {
        return (RSRBase) (isText ? textFields.computeIfAbsent("RSR_base",
                RSRBase::new) : getBinaryColumn("RSR_base"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
     * (1990), evaluated over all atoms in the phosphate moiety of the
     * nucleic acid monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return RSRPhos
     */
    public RSRPhos getRSRPhos() {
        return (RSRPhos) (isText ? textFields.computeIfAbsent("RSR_phos",
                RSRPhos::new) : getBinaryColumn("RSR_phos"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
     * (1990), evaluated over all atoms in the sugar moiety of the
     * nucleic acid monomer.
     * 
     * sum|p~obs~ - p~calc~|
     * RSR = ---------------------
     * sum|p~obs~ + p~calc~|
     * 
     * p~obs~  = the density in an 'experimental' map
     * p~calc~ = the density in a 'calculated' map
     * 
     * sum is taken over the specified grid points
     * 
     * Details of how these maps were calculated should be given
     * in _struct_mon_details.RSR. The sums are taken over all map grid
     * points near the relevant atoms. The radius for including grid
     * points in the calculation should also be given in
     * _struct_mon_details.RSR.
     * 
     * Ref: Branden, C.-I. & Jones, T. A. (1990). Nature (London), 343,
     * 687-689.
     * @return RSRSugar
     */
    public RSRSugar getRSRSugar() {
        return (RSRSugar) (isText ? textFields.computeIfAbsent("RSR_sugar",
                RSRSugar::new) : getBinaryColumn("RSR_sugar"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau0
     * (C4'-O4'-C1'-C2').
     * @return Tau0
     */
    public Tau0 getTau0() {
        return (Tau0) (isText ? textFields.computeIfAbsent("tau0",
                Tau0::new) : getBinaryColumn("tau0"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau1
     * (O4'-C1'-C2'-C3').
     * @return Tau1
     */
    public Tau1 getTau1() {
        return (Tau1) (isText ? textFields.computeIfAbsent("tau1",
                Tau1::new) : getBinaryColumn("tau1"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau2
     * (C1'-C2'-C3'-C4').
     * @return Tau2
     */
    public Tau2 getTau2() {
        return (Tau2) (isText ? textFields.computeIfAbsent("tau2",
                Tau2::new) : getBinaryColumn("tau2"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau3
     * (C2'-C3'-C4'-O4').
     * @return Tau3
     */
    public Tau3 getTau3() {
        return (Tau3) (isText ? textFields.computeIfAbsent("tau3",
                Tau3::new) : getBinaryColumn("tau3"));
    }

    /**
     * The value in degrees of the sugar torsion angle tau4
     * (C3'-C4'-O4'-C1').
     * @return Tau4
     */
    public Tau4 getTau4() {
        return (Tau4) (isText ? textFields.computeIfAbsent("tau4",
                Tau4::new) : getBinaryColumn("tau4"));
    }

    /**
     * The maximum amplitude of puckering. This is derived from the
     * pseudorotation value P and the torsion angles in the ribose
     * ring.
     * 
     * Tau2= Taum cosP
     * Tau3= Taum cos(P+144)
     * Tau4= Taum cos(P+288)
     * Tau0= Taum cos(P+ 72)
     * Tau1= Taum cos(P+216)
     * @return Taum
     */
    public Taum getTaum() {
        return (Taum) (isText ? textFields.computeIfAbsent("taum",
                Taum::new) : getBinaryColumn("taum"));
    }

    /**
     * The value in degrees of the backbone torsion angle zeta
     * (C3'-O3'-P-O5').
     * @return Zeta
     */
    public Zeta getZeta() {
        return (Zeta) (isText ? textFields.computeIfAbsent("zeta",
                Zeta::new) : getBinaryColumn("zeta"));
    }
}
