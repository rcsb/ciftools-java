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
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_refine_id", StrColumn::new) :
                getBinaryColumn("pdbx_refine_id"));
    }

    /**
     * The value of _refine_hist.cycle_id must uniquely identify a
     * record in the REFINE_HIST list.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getCycleId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("cycle_id", StrColumn::new) :
                getBinaryColumn("cycle_id"));
    }

    /**
     * A description of special aspects of this cycle of the refinement
     * process.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_high", FloatColumn::new) :
                getBinaryColumn("d_res_high"));
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is
     * called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("d_res_low", FloatColumn::new) :
                getBinaryColumn("d_res_low"));
    }

    /**
     * The number of solvent atoms that were included in the model at
     * this cycle of the refinement.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsSolvent() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_solvent", IntColumn::new) :
                getBinaryColumn("number_atoms_solvent"));
    }

    /**
     * The total number of atoms that were included in the model at
     * this cycle of the refinement.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_atoms_total", IntColumn::new) :
                getBinaryColumn("number_atoms_total"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsAll() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_reflns_all", IntColumn::new) :
                getBinaryColumn("number_reflns_all"));
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsObs() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_reflns_obs", IntColumn::new) :
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
     * @return IntColumn
     */
    public IntColumn getNumberReflnsRFree() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_reflns_R_free", IntColumn::new) :
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
     * @return IntColumn
     */
    public IntColumn getNumberReflnsRWork() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_reflns_R_work", IntColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getRFactorAll() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_all", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getRFactorObs() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_obs", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getRFactorRFree() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_R_free", FloatColumn::new) :
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
     * @return FloatColumn
     */
    public FloatColumn getRFactorRWork() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("R_factor_R_work", FloatColumn::new) :
                getBinaryColumn("R_factor_R_work"));
    }

    /**
     * Total number of polymer residues included in refinement.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberResiduesTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_residues_total", IntColumn::new) :
                getBinaryColumn("pdbx_number_residues_total"));
    }

    /**
     * Mean isotropic B-value for ligand molecules included in refinement.
     * @return FloatColumn
     */
    public FloatColumn getPdbxBIsoMeanLigand() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_B_iso_mean_ligand", FloatColumn::new) :
                getBinaryColumn("pdbx_B_iso_mean_ligand"));
    }

    /**
     * Mean isotropic B-value for solvent molecules included in refinement.
     * @return FloatColumn
     */
    public FloatColumn getPdbxBIsoMeanSolvent() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("pdbx_B_iso_mean_solvent", FloatColumn::new) :
                getBinaryColumn("pdbx_B_iso_mean_solvent"));
    }

    /**
     * Number of protein atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsProtein() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_protein", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_protein"));
    }

    /**
     * Number of nucleic atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsNucleicAcid() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_nucleic_acid", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_nucleic_acid"));
    }

    /**
     * Number of ligand atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsLigand() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_ligand", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_ligand"));
    }

    /**
     * Number of lipid atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsLipid() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_lipid", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_lipid"));
    }

    /**
     * Number of carbohydrate atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsCarb() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_carb", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_carb"));
    }

    /**
     * Details of pseduo atoms used to model unexplained density
     * @return StrColumn
     */
    public StrColumn getPdbxPseudoAtomDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_pseudo_atom_details", StrColumn::new) :
                getBinaryColumn("pdbx_pseudo_atom_details"));
    }

    /**
     * Number of solvent atoms used in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsSolvent() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_solvent", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_solvent"));
    }

    /**
     * Number of atoms used in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsTotal() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_number_atoms_total", IntColumn::new) :
                getBinaryColumn("pdbx_number_atoms_total"));
    }
}
