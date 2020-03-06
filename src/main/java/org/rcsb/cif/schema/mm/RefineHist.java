package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the REFINE_HIST category record details about the
 * steps during the refinement of the structure.
 * These data items are not meant to be as thorough a description
 * of the refinement as is provided for the final model in other
 * categories; rather, these data items provide a mechanism for
 * sketching out the progress of the refinement, supported by a
 * small set of representative statistics.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class RefineHist extends DelegatingCategory {
    public RefineHist(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbx_refine_id":
                return getPdbxRefineId();
            case "cycle_id":
                return getCycleId();
            case "details":
                return getDetails();
            case "d_res_high":
                return getDResHigh();
            case "d_res_low":
                return getDResLow();
            case "number_atoms_solvent":
                return getNumberAtomsSolvent();
            case "number_atoms_total":
                return getNumberAtomsTotal();
            case "number_reflns_all":
                return getNumberReflnsAll();
            case "number_reflns_obs":
                return getNumberReflnsObs();
            case "number_reflns_R_free":
                return getNumberReflnsRFree();
            case "number_reflns_R_work":
                return getNumberReflnsRWork();
            case "R_factor_all":
                return getRFactorAll();
            case "R_factor_obs":
                return getRFactorObs();
            case "R_factor_R_free":
                return getRFactorRFree();
            case "R_factor_R_work":
                return getRFactorRWork();
            case "pdbx_number_residues_total":
                return getPdbxNumberResiduesTotal();
            case "pdbx_B_iso_mean_ligand":
                return getPdbxBIsoMeanLigand();
            case "pdbx_B_iso_mean_solvent":
                return getPdbxBIsoMeanSolvent();
            case "pdbx_number_atoms_protein":
                return getPdbxNumberAtomsProtein();
            case "pdbx_number_atoms_nucleic_acid":
                return getPdbxNumberAtomsNucleicAcid();
            case "pdbx_number_atoms_ligand":
                return getPdbxNumberAtomsLigand();
            case "pdbx_number_atoms_lipid":
                return getPdbxNumberAtomsLipid();
            case "pdbx_number_atoms_carb":
                return getPdbxNumberAtomsCarb();
            case "pdbx_pseudo_atom_details":
                return getPdbxPseudoAtomDetails();
            case "pdbx_number_atoms_solvent":
                return getPdbxNumberAtomsSolvent();
            case "pdbx_number_atoms_total":
                return getPdbxNumberAtomsTotal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item uniquely identifies a refinement within an entry.
     * _refine_hist.pdbx_refine_id can be used to distinguish the results
     * of joint refinements.
     * @return StrColumn
     */
    public StrColumn getPdbxRefineId() {
        return delegate.getColumn("pdbx_refine_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("cycle_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of this cycle of the refinement
     * process.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The lowest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is called
     * the highest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResHigh() {
        return delegate.getColumn("d_res_high", DelegatingFloatColumn::new);
    }

    /**
     * The highest value for the interplanar spacings for the
     * reflection data for this cycle of refinement. This is
     * called the lowest resolution.
     * @return FloatColumn
     */
    public FloatColumn getDResLow() {
        return delegate.getColumn("d_res_low", DelegatingFloatColumn::new);
    }

    /**
     * The number of solvent atoms that were included in the model at
     * this cycle of the refinement.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsSolvent() {
        return delegate.getColumn("number_atoms_solvent", DelegatingIntColumn::new);
    }

    /**
     * The total number of atoms that were included in the model at
     * this cycle of the refinement.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsTotal() {
        return delegate.getColumn("number_atoms_total", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsAll() {
        return delegate.getColumn("number_reflns_all", DelegatingIntColumn::new);
    }

    /**
     * The number of reflections that satisfy the resolution limits
     * established by _refine_hist.d_res_high and
     * _refine_hist.d_res_low and the observation criterion
     * established by _reflns.observed_criterion.
     * @return IntColumn
     */
    public IntColumn getNumberReflnsObs() {
        return delegate.getColumn("number_reflns_obs", DelegatingIntColumn::new);
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
        return delegate.getColumn("number_reflns_R_free", DelegatingIntColumn::new);
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
        return delegate.getColumn("number_reflns_R_work", DelegatingIntColumn::new);
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
        return delegate.getColumn("R_factor_all", DelegatingFloatColumn::new);
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
        return delegate.getColumn("R_factor_obs", DelegatingFloatColumn::new);
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
        return delegate.getColumn("R_factor_R_free", DelegatingFloatColumn::new);
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
        return delegate.getColumn("R_factor_R_work", DelegatingFloatColumn::new);
    }

    /**
     * Total number of polymer residues included in refinement.
     * @return IntColumn
     */
    public IntColumn getPdbxNumberResiduesTotal() {
        return delegate.getColumn("pdbx_number_residues_total", DelegatingIntColumn::new);
    }

    /**
     * Mean isotropic B-value for ligand molecules included in refinement.
     * @return FloatColumn
     */
    public FloatColumn getPdbxBIsoMeanLigand() {
        return delegate.getColumn("pdbx_B_iso_mean_ligand", DelegatingFloatColumn::new);
    }

    /**
     * Mean isotropic B-value for solvent molecules included in refinement.
     * @return FloatColumn
     */
    public FloatColumn getPdbxBIsoMeanSolvent() {
        return delegate.getColumn("pdbx_B_iso_mean_solvent", DelegatingFloatColumn::new);
    }

    /**
     * Number of protein atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsProtein() {
        return delegate.getColumn("pdbx_number_atoms_protein", DelegatingIntColumn::new);
    }

    /**
     * Number of nucleic atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsNucleicAcid() {
        return delegate.getColumn("pdbx_number_atoms_nucleic_acid", DelegatingIntColumn::new);
    }

    /**
     * Number of ligand atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsLigand() {
        return delegate.getColumn("pdbx_number_atoms_ligand", DelegatingIntColumn::new);
    }

    /**
     * Number of lipid atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsLipid() {
        return delegate.getColumn("pdbx_number_atoms_lipid", DelegatingIntColumn::new);
    }

    /**
     * Number of carbohydrate atoms included in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsCarb() {
        return delegate.getColumn("pdbx_number_atoms_carb", DelegatingIntColumn::new);
    }

    /**
     * Details of pseduo atoms used to model unexplained density
     * @return StrColumn
     */
    public StrColumn getPdbxPseudoAtomDetails() {
        return delegate.getColumn("pdbx_pseudo_atom_details", DelegatingStrColumn::new);
    }

    /**
     * Number of solvent atoms used in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsSolvent() {
        return delegate.getColumn("pdbx_number_atoms_solvent", DelegatingIntColumn::new);
    }

    /**
     * Number of atoms used in refinement
     * @return IntColumn
     */
    public IntColumn getPdbxNumberAtomsTotal() {
        return delegate.getColumn("pdbx_number_atoms_total", DelegatingIntColumn::new);
    }

}