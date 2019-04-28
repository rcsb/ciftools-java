package org.rcsb.cif.model.generated.refinehist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class RefineHist extends BaseCategory {
    public RefineHist(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public RefineHist(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public RefineHist(String name) {
        super(name);
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_hist.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return PdbxRefineId
     */
    public PdbxRefineId getPdbxRefineId() {
        return (PdbxRefineId) (isText ? textFields.computeIfAbsent("pdbx_refine_id",
                PdbxRefineId::new) : getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The value of _refine_hist.cycle_id must uniquely identify a
     * record in the REFINE_HIST list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return CycleId
     */
    public CycleId getCycleId() {
        return (CycleId) (isText ? textFields.computeIfAbsent("cycle_id",
                CycleId::new) : getBinaryColumn("cycle_id"));
    }

    /**
     * A description of special aspects of this cycle of the refinement
     * process.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is called
     * the highest resolution.
     * @return DResHigh
     */
    public DResHigh getDResHigh() {
        return (DResHigh) (isText ? textFields.computeIfAbsent("d_res_high",
                DResHigh::new) : getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is
     * called the lowest resolution.
     * @return DResLow
     */
    public DResLow getDResLow() {
        return (DResLow) (isText ? textFields.computeIfAbsent("d_res_low",
                DResLow::new) : getBinaryColumn("d_res_low"));
    }

    /**
     * The number of solvent atoms that were included in the model at
     * this cycle of the refinement.
     * @return NumberAtomsSolvent
     */
    public NumberAtomsSolvent getNumberAtomsSolvent() {
        return (NumberAtomsSolvent) (isText ? textFields.computeIfAbsent("number_atoms_solvent",
                NumberAtomsSolvent::new) : getBinaryColumn("number_atoms_solvent"));
    }

    /**
     * The total number of atoms that were included in the model at
     * this cycle of the refinement.
     * @return NumberAtomsTotal
     */
    public NumberAtomsTotal getNumberAtomsTotal() {
        return (NumberAtomsTotal) (isText ? textFields.computeIfAbsent("number_atoms_total",
                NumberAtomsTotal::new) : getBinaryColumn("number_atoms_total"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low.
     * @return NumberReflnsAll
     */
    public NumberReflnsAll getNumberReflnsAll() {
        return (NumberReflnsAll) (isText ? textFields.computeIfAbsent("number_reflns_all",
                NumberReflnsAll::new) : getBinaryColumn("number_reflns_all"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * @return NumberReflnsObs
     */
    public NumberReflnsObs getNumberReflnsObs() {
        return (NumberReflnsObs) (isText ? textFields.computeIfAbsent("number_reflns_obs",
                NumberReflnsObs::new) : getBinaryColumn("number_reflns_obs"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the test reflections (i.e. were excluded from the refinement)
     * when the refinement included the calculation of a 'free'
     * R factor. Details of how reflections were assigned to the
     * working and test sets are given in _reflns.R_free_details.
     * @return NumberReflnsRFree
     */
    public NumberReflnsRFree getNumberReflnsRFree() {
        return (NumberReflnsRFree) (isText ? textFields.computeIfAbsent("number_reflns_R_free",
                NumberReflnsRFree::new) : getBinaryColumn("number_reflns_R_free"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the working reflections (i.e. were included in the
     * refinement) when the refinement included the calculation
     * of a 'free' R factor. Details of how reflections were
     * assigned to the working and test sets are given in
     * _reflns.R_free_details.
     * @return NumberReflnsRWork
     */
    public NumberReflnsRWork getNumberReflnsRWork() {
        return (NumberReflnsRWork) (isText ? textFields.computeIfAbsent("number_reflns_R_work",
                NumberReflnsRWork::new) : getBinaryColumn("number_reflns_R_work"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return RFactorAll
     */
    public RFactorAll getRFactorAll() {
        return (RFactorAll) (isText ? textFields.computeIfAbsent("R_factor_all",
                RFactorAll::new) : getBinaryColumn("R_factor_all"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return RFactorObs
     */
    public RFactorObs getRFactorObs() {
        return (RFactorObs) (isText ? textFields.computeIfAbsent("R_factor_obs",
                RFactorObs::new) : getBinaryColumn("R_factor_obs"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the test reflections (i.e. were excluded from the refinement)
     * when the refinement included the calculation of a 'free'
     * R factor. Details of how reflections were assigned to the
     * working and test sets are given in _reflns.R_free_details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return RFactorRFree
     */
    public RFactorRFree getRFactorRFree() {
        return (RFactorRFree) (isText ? textFields.computeIfAbsent("R_factor_R_free",
                RFactorRFree::new) : getBinaryColumn("R_factor_R_free"));
    }

    /**
     * Residual factor R for reflections that satisfy the resolution
     * limits established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation limit
     * established by _reflns.observed_criterion, and that were used
     * as the working reflections (i.e. were included in the refinement)
     * when the refinement included the calculation of a 'free'
     * R factor. Details of how reflections were assigned to the
     * working and test sets are given in _reflns.R_free_details.
     * 
     * sum|F~obs~ - F~calc~|
     * R = ---------------------
     * sum|F~obs~|
     * 
     * F~obs~  = the observed structure-factor amplitudes
     * F~calc~ = the calculated structure-factor amplitudes
     * 
     * sum is taken over the specified reflections
     * @return RFactorRWork
     */
    public RFactorRWork getRFactorRWork() {
        return (RFactorRWork) (isText ? textFields.computeIfAbsent("R_factor_R_work",
                RFactorRWork::new) : getBinaryColumn("R_factor_R_work"));
    }

    /**
     * Total number of polymer residues included in refinement.
     * @return PdbxNumberResiduesTotal
     */
    public PdbxNumberResiduesTotal getPdbxNumberResiduesTotal() {
        return (PdbxNumberResiduesTotal) (isText ? textFields.computeIfAbsent("pdbx_number_residues_total",
                PdbxNumberResiduesTotal::new) : getBinaryColumn("pdbx_number_residues_total"));
    }

    /**
     * Mean isotropic B-value for ligand molecules included in refinement.
     * @return PdbxBIsoMeanLigand
     */
    public PdbxBIsoMeanLigand getPdbxBIsoMeanLigand() {
        return (PdbxBIsoMeanLigand) (isText ? textFields.computeIfAbsent("pdbx_B_iso_mean_ligand",
                PdbxBIsoMeanLigand::new) : getBinaryColumn("pdbx_B_iso_mean_ligand"));
    }

    /**
     * Mean isotropic B-value for solvent molecules included in refinement.
     * @return PdbxBIsoMeanSolvent
     */
    public PdbxBIsoMeanSolvent getPdbxBIsoMeanSolvent() {
        return (PdbxBIsoMeanSolvent) (isText ? textFields.computeIfAbsent("pdbx_B_iso_mean_solvent",
                PdbxBIsoMeanSolvent::new) : getBinaryColumn("pdbx_B_iso_mean_solvent"));
    }

    /**
     * Number of protein atoms included in refinement
     * @return PdbxNumberAtomsProtein
     */
    public PdbxNumberAtomsProtein getPdbxNumberAtomsProtein() {
        return (PdbxNumberAtomsProtein) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_protein",
                PdbxNumberAtomsProtein::new) : getBinaryColumn("pdbx_number_atoms_protein"));
    }

    /**
     * Number of nucleic atoms included in refinement
     * @return PdbxNumberAtomsNucleicAcid
     */
    public PdbxNumberAtomsNucleicAcid getPdbxNumberAtomsNucleicAcid() {
        return (PdbxNumberAtomsNucleicAcid) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_nucleic_acid",
                PdbxNumberAtomsNucleicAcid::new) : getBinaryColumn("pdbx_number_atoms_nucleic_acid"));
    }

    /**
     * Number of ligand atoms included in refinement
     * @return PdbxNumberAtomsLigand
     */
    public PdbxNumberAtomsLigand getPdbxNumberAtomsLigand() {
        return (PdbxNumberAtomsLigand) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_ligand",
                PdbxNumberAtomsLigand::new) : getBinaryColumn("pdbx_number_atoms_ligand"));
    }

    /**
     * Number of lipid atoms included in refinement
     * @return PdbxNumberAtomsLipid
     */
    public PdbxNumberAtomsLipid getPdbxNumberAtomsLipid() {
        return (PdbxNumberAtomsLipid) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_lipid",
                PdbxNumberAtomsLipid::new) : getBinaryColumn("pdbx_number_atoms_lipid"));
    }

    /**
     * Number of carbohydrate atoms included in refinement
     * @return PdbxNumberAtomsCarb
     */
    public PdbxNumberAtomsCarb getPdbxNumberAtomsCarb() {
        return (PdbxNumberAtomsCarb) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_carb",
                PdbxNumberAtomsCarb::new) : getBinaryColumn("pdbx_number_atoms_carb"));
    }

    /**
     * Details of pseduo atoms used to model unexplained density
     * @return PdbxPseudoAtomDetails
     */
    public PdbxPseudoAtomDetails getPdbxPseudoAtomDetails() {
        return (PdbxPseudoAtomDetails) (isText ? textFields.computeIfAbsent("pdbx_pseudo_atom_details",
                PdbxPseudoAtomDetails::new) : getBinaryColumn("pdbx_pseudo_atom_details"));
    }

    /**
     * Number of solvent atoms used in refinement
     * @return PdbxNumberAtomsSolvent
     */
    public PdbxNumberAtomsSolvent getPdbxNumberAtomsSolvent() {
        return (PdbxNumberAtomsSolvent) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_solvent",
                PdbxNumberAtomsSolvent::new) : getBinaryColumn("pdbx_number_atoms_solvent"));
    }

    /**
     * Number of atoms used in refinement
     * @return PdbxNumberAtomsTotal
     */
    public PdbxNumberAtomsTotal getPdbxNumberAtomsTotal() {
        return (PdbxNumberAtomsTotal) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_total",
                PdbxNumberAtomsTotal::new) : getBinaryColumn("pdbx_number_atoms_total"));
    }
}
