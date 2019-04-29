package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the category record residual map properties such as
 * Real Space electron density Correlation Coefficient (RSCC), real space R
 * factors (RSR) and the Zscores for each residue, the main/side chains.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDccMap extends BaseCategory {
    public PdbxDccMap(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccMap(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccMap(String name) {
        super(name);
    }

    /**
     * The ordered number of residue in the output list.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The component model identifier for this analysis.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("model_id", StrColumn::new) :
                getBinaryColumn("model_id"));
    }

    /**
     * The  PDB id code (four characters).
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_id", StrColumn::new) :
                getBinaryColumn("pdb_id"));
    }

    /**
     * The author provided chain id.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * The author provided compound ID (residue name).
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_comp_id", StrColumn::new) :
                getBinaryColumn("auth_comp_id"));
    }

    /**
     * The author provided residue number.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_seq_id", StrColumn::new) :
                getBinaryColumn("auth_seq_id"));
    }

    /**
     * Author provided alternate location identifier.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * The PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getLabelInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_ins_code", StrColumn::new) :
                getBinaryColumn("label_ins_code"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the
     * residue. It is defined as
     * RSCC=(<xy>-<x><y>)/[sqrt(<x**2>-<x>**2)*sqrt(<y**2>-<y>**2)]
     * where x is the observed density from the (2mFo-DFc) map and y is the
     * calculated density from the Fc map
     * @return FloatColumn
     */
    public FloatColumn getRSCC() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC", FloatColumn::new) :
                getBinaryColumn("RSCC"));
    }

    /**
     * The Real space Rfactor (RSR) for the residue. It is defined as
     * RSR=sum(|x-y|/x+y|) which is the summation over all grid points
     * around the residue, where x is the observed density from the
     * (2mFo-DFc) map and y is the calculated density from the Fc map.
     * @return FloatColumn
     */
    public FloatColumn getRSR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR", FloatColumn::new) :
                getBinaryColumn("RSR"));
    }

    /**
     * The weighted Real Space Rfactor (defined as RSR/RSCC) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getWeightedRSR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weighted_RSR", FloatColumn::new) :
                getBinaryColumn("weighted_RSR"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the residue. It is defined
     * as (RSR-<RSR>)/sigma_RSR, where <RSR> and sigma_RSR are for the whole map,
     * RSR is for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRSRZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSRZ", FloatColumn::new) :
                getBinaryColumn("RSRZ"));
    }

    /**
     * Zscore of weighted Real Space Rfactor for the residue. It is defined as
     * (wRSR-<wRSR>)/sigma_wRSR,  where <wRSR> and sigma_wRSR are for the whole map,
     * wRSR is for the residue.
     * @return FloatColumn
     */
    public FloatColumn getWeightedRSRZ() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weighted_RSRZ", FloatColumn::new) :
                getBinaryColumn("weighted_RSRZ"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the residue.
     * It is defined as (SUM B*Q)/(SUM Q), where B is the isotropic B factor
     * for each atom and Q is the occupancy.
     * @return FloatColumn
     */
    public FloatColumn getBisoMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_mean", FloatColumn::new) :
                getBinaryColumn("Biso_mean"));
    }

    /**
     * The averaged occupancy for the residue.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_mean", FloatColumn::new) :
                getBinaryColumn("occupancy_mean"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSCCMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_main_chain", FloatColumn::new) :
                getBinaryColumn("RSCC_main_chain"));
    }

    /**
     * The Real space Rfactor (RSR) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_main_chain", FloatColumn::new) :
                getBinaryColumn("RSR_main_chain"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wRSR_main_chain", FloatColumn::new) :
                getBinaryColumn("wRSR_main_chain"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRZMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSRZ_main_chain", FloatColumn::new) :
                getBinaryColumn("RSRZ_main_chain"));
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRZMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wRSRZ_main_chain", FloatColumn::new) :
                getBinaryColumn("wRSRZ_main_chain"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getBisoMeanMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_mean_main_chain", FloatColumn::new) :
                getBinaryColumn("Biso_mean_main_chain"));
    }

    /**
     * The averaged occupancy forthe main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMeanMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_mean_main_chain", FloatColumn::new) :
                getBinaryColumn("occupancy_mean_main_chain"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSCCSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_side_chain", FloatColumn::new) :
                getBinaryColumn("RSCC_side_chain"));
    }

    /**
     * The Real space Rfactor (RSR) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_side_chain", FloatColumn::new) :
                getBinaryColumn("RSR_side_chain"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wRSR_side_chain", FloatColumn::new) :
                getBinaryColumn("wRSR_side_chain"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRZSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSRZ_side_chain", FloatColumn::new) :
                getBinaryColumn("RSRZ_side_chain"));
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRZSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wRSRZ_side_chain", FloatColumn::new) :
                getBinaryColumn("wRSRZ_side_chain"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getBisoMeanSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_mean_side_chain", FloatColumn::new) :
                getBinaryColumn("Biso_mean_side_chain"));
    }

    /**
     * The averaged occupancy forthe side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMeanSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_mean_side_chain", FloatColumn::new) :
                getBinaryColumn("occupancy_mean_side_chain"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSCCPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSCC_phosphate_group", FloatColumn::new) :
                getBinaryColumn("RSCC_phosphate_group"));
    }

    /**
     * The Real space Rfactor (RSR) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSR_phosphate_group", FloatColumn::new) :
                getBinaryColumn("RSR_phosphate_group"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wRSR_phosphate_group", FloatColumn::new) :
                getBinaryColumn("wRSR_phosphate_group"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRZPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSRZ_phosphate_group", FloatColumn::new) :
                getBinaryColumn("RSRZ_phosphate_group"));
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRZPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("wRSRZ_phosphate_group", FloatColumn::new) :
                getBinaryColumn("wRSRZ_phosphate_group"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getBisoMeanPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_mean_phosphate_group", FloatColumn::new) :
                getBinaryColumn("Biso_mean_phosphate_group"));
    }

    /**
     * The averaged occupancy forthe phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMeanPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_mean_phosphate_group", FloatColumn::new) :
                getBinaryColumn("occupancy_mean_phosphate_group"));
    }

    /**
     * Defined in sfcheck (displacement/sigma_of_displacement).
     * Displacement of atoms from electron density is estimated from the
     * difference (Fobs - Fcal) map. The displacement vector is the ratio
     * of the gradient of difference density to the curvature. The amplitude
     * of the displacement vector is an indicator of the positional error.
     * @return FloatColumn
     */
    public FloatColumn getShift() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift", FloatColumn::new) :
                getBinaryColumn("shift"));
    }

    /**
     * The same as _pdbx_dcc_map.density_shift, but it is for main chain.
     * @return FloatColumn
     */
    public FloatColumn getShiftMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift_main_chain", FloatColumn::new) :
                getBinaryColumn("shift_main_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.density_shift, but it is for side chain.
     * @return FloatColumn
     */
    public FloatColumn getShiftSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("shift_side_chain", FloatColumn::new) :
                getBinaryColumn("shift_side_chain"));
    }

    /**
     * Defined in sfcheck. It is the product of the (2Fobs-Fcal) electron
     * density values for the backbone atoms N, CA and C, and in the case of
     * RNA/DNA, for P, O5', C5', C3', O3'. Low values of this index indicate
     * breaks in the backbone electron density which may be due to flexibility
     * of the chain or incorrect tracing.
     * @return FloatColumn
     */
    public FloatColumn getDensityConnectivity() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_connectivity", FloatColumn::new) :
                getBinaryColumn("density_connectivity"));
    }

    /**
     * Defined in sfcheck. It is the mean density of the main chain atoms
     * divided by the mean density of the map.
     * @return FloatColumn
     */
    public FloatColumn getDensityIndexMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_index_main_chain", FloatColumn::new) :
                getBinaryColumn("density_index_main_chain"));
    }

    /**
     * Defined in sfcheck. It is the mean density of the side chain atoms
     * divided by the mean density of the map.
     * @return FloatColumn
     */
    public FloatColumn getDensityIndexSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("density_index_side_chain", FloatColumn::new) :
                getBinaryColumn("density_index_side_chain"));
    }

    /**
     * The real space difference density Z score
     * (defined as Delta_rho/sigma(Delta_rho)) from Tickle (2012). It is
     * related to the model accuracy. RSZD>3, significant extra positive
     * density around the residue; RSZD<-3, significant extra negative
     * density around the residue.
     * @return FloatColumn
     */
    public FloatColumn getRSZD() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZD", FloatColumn::new) :
                getBinaryColumn("RSZD"));
    }

    /**
     * The real space observed density Z score (defined as <rho_obs>/sigma(Delta_rho))
     * from Tickle (2012). It is related to the model precision (B factors).
     * Small or large value means weak or strong density for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRSZO() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZO", FloatColumn::new) :
                getBinaryColumn("RSZO"));
    }

    /**
     * The Zscore of RSZO (or the Zscore of <rho_obs>/sigma(Delta_rho)).
     * @return FloatColumn
     */
    public FloatColumn getRSZOZscore() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZO_Zscore", FloatColumn::new) :
                getBinaryColumn("RSZO_Zscore"));
    }

    /**
     * It is the Ligand Local Density Function defined as the
     * (<RsR>_local - RsR_Ligand)/sigma_RsR, where <RsR>_local is the
     * mean RSR of polymer residues in 5 Angstrom (including the
     * crystallographic symmetry) surrounding the ligand, and sigma_RsR
     * is sigma value calculated from the surrounding residues.
     * @return FloatColumn
     */
    public FloatColumn getLLDF() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("LLDF", FloatColumn::new) :
                getBinaryColumn("LLDF"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZDMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZD_main_chain", FloatColumn::new) :
                getBinaryColumn("RSZD_main_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZOMainChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZO_main_chain", FloatColumn::new) :
                getBinaryColumn("RSZO_main_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZDSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZD_side_chain", FloatColumn::new) :
                getBinaryColumn("RSZD_side_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZOSideChain() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZO_side_chain", FloatColumn::new) :
                getBinaryColumn("RSZO_side_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the phosphate atoms of
     * nucleic acids.
     * @return FloatColumn
     */
    public FloatColumn getRSZDPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZD_phosphate_group", FloatColumn::new) :
                getBinaryColumn("RSZD_phosphate_group"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the phosphate atoms of
     * nucleic acids.
     * @return FloatColumn
     */
    public FloatColumn getRSZOPhosphateGroup() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("RSZO_phosphate_group", FloatColumn::new) :
                getBinaryColumn("RSZO_phosphate_group"));
    }

    /**
     * The value indicates any problems with this group of atoms. If given
     * as 'd', it means there is problem of local model accuracy. If given
     * as 'w', it means weak density (there is problem of local model
     * precision). If given as 'dw', both then problems exist.
     * @return StrColumn
     */
    public StrColumn getQualityIndicator() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("quality_indicator", StrColumn::new) :
                getBinaryColumn("quality_indicator"));
    }
}
