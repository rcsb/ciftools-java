package org.rcsb.cif.model.structmonprot;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class StructMonProt extends BaseCategory {
    public StructMonProt(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public StructMonProt(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public StructMonProt(String name) {
        super(name);
    }

    /**
     * The value in degrees of the side-chain torsion angle chi1, for
     * those residues containing such an angle.
     * @return Chi1
     */
    public Chi1 getChi1() {
        return (Chi1) (isText ? textFields.computeIfAbsent("chi1",
                Chi1::new) : getBinaryColumn("chi1"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi2, for
     * those residues containing such an angle.
     * @return Chi2
     */
    public Chi2 getChi2() {
        return (Chi2) (isText ? textFields.computeIfAbsent("chi2",
                Chi2::new) : getBinaryColumn("chi2"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi3, for
     * those residues containing such an angle.
     * @return Chi3
     */
    public Chi3 getChi3() {
        return (Chi3) (isText ? textFields.computeIfAbsent("chi3",
                Chi3::new) : getBinaryColumn("chi3"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi4, for
     * those residues containing such an angle.
     * @return Chi4
     */
    public Chi4 getChi4() {
        return (Chi4) (isText ? textFields.computeIfAbsent("chi4",
                Chi4::new) : getBinaryColumn("chi4"));
    }

    /**
     * The value in degrees of the side-chain torsion angle chi5, for
     * those residues containing such an angle.
     * @return Chi5
     */
    public Chi5 getChi5() {
        return (Chi5) (isText ? textFields.computeIfAbsent("chi5",
                Chi5::new) : getBinaryColumn("chi5"));
    }

    /**
     * A description of special aspects of the residue, its
     * conformation, behaviour in refinement, or any other aspect that
     * requires annotation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * A component of the identifier for the monomer.
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
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991),  evaluated over all atoms
     * in the monomer.
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
     * described by Jones et al. (1991), evaluated over all atoms
     * in the main chain of the monomer.
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
     * @return RSCCMain
     */
    public RSCCMain getRSCCMain() {
        return (RSCCMain) (isText ? textFields.computeIfAbsent("RSCC_main",
                RSCCMain::new) : getBinaryColumn("RSCC_main"));
    }

    /**
     * The real-space (linear) correlation coefficient RSCC, as
     * described by Jones et al. (1991), evaluated over all atoms
     * in the side chain of the monomer.
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
     * @return RSCCSide
     */
    public RSCCSide getRSCCSide() {
        return (RSCCSide) (isText ? textFields.computeIfAbsent("RSCC_side",
                RSCCSide::new) : getBinaryColumn("RSCC_side"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
     * (1990), evaluated over all atoms in the monomer.
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
     * (1990), evaluated over all atoms in the main chain of the
     * monomer.
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
     * @return RSRMain
     */
    public RSRMain getRSRMain() {
        return (RSRMain) (isText ? textFields.computeIfAbsent("RSR_main",
                RSRMain::new) : getBinaryColumn("RSR_main"));
    }

    /**
     * The real-space residual RSR, as described by Branden & Jones
     * (1990), evaluated over all atoms in the side chain of the
     * monomer.
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
     * @return RSRSide
     */
    public RSRSide getRSRSide() {
        return (RSRSide) (isText ? textFields.computeIfAbsent("RSR_side",
                RSRSide::new) : getBinaryColumn("RSR_side"));
    }

    /**
     * The mean value of the isotropic displacement parameter for all
     * atoms in the monomer.
     * @return MeanBAll
     */
    public MeanBAll getMeanBAll() {
        return (MeanBAll) (isText ? textFields.computeIfAbsent("mean_B_all",
                MeanBAll::new) : getBinaryColumn("mean_B_all"));
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the main chain of the monomer.
     * @return MeanBMain
     */
    public MeanBMain getMeanBMain() {
        return (MeanBMain) (isText ? textFields.computeIfAbsent("mean_B_main",
                MeanBMain::new) : getBinaryColumn("mean_B_main"));
    }

    /**
     * The mean value of the isotropic displacement parameter for atoms
     * in the side chain of the monomer.
     * @return MeanBSide
     */
    public MeanBSide getMeanBSide() {
        return (MeanBSide) (isText ? textFields.computeIfAbsent("mean_B_side",
                MeanBSide::new) : getBinaryColumn("mean_B_side"));
    }

    /**
     * The value in degrees of the main-chain torsion angle omega.
     * @return Omega
     */
    public Omega getOmega() {
        return (Omega) (isText ? textFields.computeIfAbsent("omega",
                Omega::new) : getBinaryColumn("omega"));
    }

    /**
     * The value in degrees of the main-chain torsion angle phi.
     * @return Phi
     */
    public Phi getPhi() {
        return (Phi) (isText ? textFields.computeIfAbsent("phi",
                Phi::new) : getBinaryColumn("phi"));
    }

    /**
     * The value in degrees of the main-chain torsion angle psi.
     * @return Psi
     */
    public Psi getPsi() {
        return (Psi) (isText ? textFields.computeIfAbsent("psi",
                Psi::new) : getBinaryColumn("psi"));
    }
}
