package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the REFINE_HIST category record details about the
 * steps during the refinement of the structure.
 * These data items are not meant to be as thorough a description
 * of the refinement as is provided for the final model in other
 * categories; rather, these data items provide a mechanism for
 * sketching out the progress of the refinement, supported by a
 * small set of representative statistics.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxRefineId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The value of _refine_hist.cycle_id must uniquely identify a
     * record in the REFINE_HIST list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getCycleId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("cycle_id", SingleRowStrColumn::new) :
                getBinaryColumn("cycle_id"));
    }

    /**
     * A description of special aspects of this cycle of the refinement
     * process.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is called
     * the highest resolution.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDResHigh() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", SingleRowFloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is
     * called the lowest resolution.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getDResLow() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", SingleRowFloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The number of solvent atoms that were included in the model at
     * this cycle of the refinement.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberAtomsSolvent() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_atoms_solvent", SingleRowIntColumn::new) :
                getBinaryColumn("number_atoms_solvent"));
    }

    /**
     * The total number of atoms that were included in the model at
     * this cycle of the refinement.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberAtomsTotal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_atoms_total", SingleRowIntColumn::new) :
                getBinaryColumn("number_atoms_total"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberReflnsAll() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_reflns_all", SingleRowIntColumn::new) :
                getBinaryColumn("number_reflns_all"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberReflnsObs() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_reflns_obs", SingleRowIntColumn::new) :
                getBinaryColumn("number_reflns_obs"));
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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberReflnsRFree() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_reflns_R_free", SingleRowIntColumn::new) :
                getBinaryColumn("number_reflns_R_free"));
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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getNumberReflnsRWork() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("number_reflns_R_work", SingleRowIntColumn::new) :
                getBinaryColumn("number_reflns_R_work"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRFactorAll() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("R_factor_all", SingleRowFloatColumn::new) :
                getBinaryColumn("R_factor_all"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRFactorObs() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("R_factor_obs", SingleRowFloatColumn::new) :
                getBinaryColumn("R_factor_obs"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRFactorRFree() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("R_factor_R_free", SingleRowFloatColumn::new) :
                getBinaryColumn("R_factor_R_free"));
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
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getRFactorRWork() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("R_factor_R_work", SingleRowFloatColumn::new) :
                getBinaryColumn("R_factor_R_work"));
    }

    /**
     * Total number of polymer residues included in refinement.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberResiduesTotal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_residues_total", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_residues_total"));
    }

    /**
     * Mean isotropic B-value for ligand molecules included in refinement.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxBIsoMeanLigand() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_B_iso_mean_ligand", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_B_iso_mean_ligand"));
    }

    /**
     * Mean isotropic B-value for solvent molecules included in refinement.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPdbxBIsoMeanSolvent() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("pdbx_B_iso_mean_solvent", SingleRowFloatColumn::new) :
                getBinaryColumn("pdbx_B_iso_mean_solvent"));
    }

    /**
     * Number of protein atoms included in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsProtein() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_protein", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_protein"));
    }

    /**
     * Number of nucleic atoms included in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsNucleicAcid() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_nucleic_acid", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_nucleic_acid"));
    }

    /**
     * Number of ligand atoms included in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsLigand() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_ligand", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_ligand"));
    }

    /**
     * Number of lipid atoms included in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsLipid() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_lipid", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_lipid"));
    }

    /**
     * Number of carbohydrate atoms included in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsCarb() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_carb", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_carb"));
    }

    /**
     * Details of pseduo atoms used to model unexplained density
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbxPseudoAtomDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdbx_pseudo_atom_details", SingleRowStrColumn::new) :
                getBinaryColumn("pdbx_pseudo_atom_details"));
    }

    /**
     * Number of solvent atoms used in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsSolvent() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_solvent", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_solvent"));
    }

    /**
     * Number of atoms used in refinement
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPdbxNumberAtomsTotal() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_total", SingleRowIntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_total"));
    }
}
