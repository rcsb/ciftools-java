package org.rcsb.cif.model.generated.pdbxdccmap;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The component model identifier for this analysis.
     * @return ModelId
     */
    public ModelId getModelId() {
        return (ModelId) (isText ? textFields.computeIfAbsent("model_id",
                ModelId::new) : getBinaryColumn("model_id"));
    }

    /**
     * The  PDB id code (four characters).
     * @return PdbId
     */
    public PdbId getPdbId() {
        return (PdbId) (isText ? textFields.computeIfAbsent("pdb_id",
                PdbId::new) : getBinaryColumn("pdb_id"));
    }

    /**
     * The author provided chain id.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * The author provided compound ID (residue name).
     * @return AuthCompId
     */
    public AuthCompId getAuthCompId() {
        return (AuthCompId) (isText ? textFields.computeIfAbsent("auth_comp_id",
                AuthCompId::new) : getBinaryColumn("auth_comp_id"));
    }

    /**
     * The author provided residue number.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Author provided alternate location identifier.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * The PDB insertion code.
     * @return LabelInsCode
     */
    public LabelInsCode getLabelInsCode() {
        return (LabelInsCode) (isText ? textFields.computeIfAbsent("label_ins_code",
                LabelInsCode::new) : getBinaryColumn("label_ins_code"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the
     * residue. It is defined as
     * RSCC=(<xy>-<x><y>)/[sqrt(<x**2>-<x>**2)*sqrt(<y**2>-<y>**2)]
     * where x is the observed density from the (2mFo-DFc) map and y is the
     * calculated density from the Fc map
     * @return RSCC
     */
    public RSCC getRSCC() {
        return (RSCC) (isText ? textFields.computeIfAbsent("RSCC",
                RSCC::new) : getBinaryColumn("RSCC"));
    }

    /**
     * The Real space Rfactor (RSR) for the residue. It is defined as
     * RSR=sum(|x-y|/x+y|) which is the summation over all grid points
     * around the residue, where x is the observed density from the
     * (2mFo-DFc) map and y is the calculated density from the Fc map.
     * @return RSR
     */
    public RSR getRSR() {
        return (RSR) (isText ? textFields.computeIfAbsent("RSR",
                RSR::new) : getBinaryColumn("RSR"));
    }

    /**
     * The weighted Real Space Rfactor (defined as RSR/RSCC) for the residue.
     * @return WeightedRSR
     */
    public WeightedRSR getWeightedRSR() {
        return (WeightedRSR) (isText ? textFields.computeIfAbsent("weighted_RSR",
                WeightedRSR::new) : getBinaryColumn("weighted_RSR"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the residue. It is defined
     * as (RSR-<RSR>)/sigma_RSR, where <RSR> and sigma_RSR are for the whole map,
     * RSR is for the residue.
     * @return RSRZ
     */
    public RSRZ getRSRZ() {
        return (RSRZ) (isText ? textFields.computeIfAbsent("RSRZ",
                RSRZ::new) : getBinaryColumn("RSRZ"));
    }

    /**
     * Zscore of weighted Real Space Rfactor for the residue. It is defined as
     * (wRSR-<wRSR>)/sigma_wRSR,  where <wRSR> and sigma_wRSR are for the whole map,
     * wRSR is for the residue.
     * @return WeightedRSRZ
     */
    public WeightedRSRZ getWeightedRSRZ() {
        return (WeightedRSRZ) (isText ? textFields.computeIfAbsent("weighted_RSRZ",
                WeightedRSRZ::new) : getBinaryColumn("weighted_RSRZ"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the residue.
     * It is defined as (SUM B*Q)/(SUM Q), where B is the isotropic B factor
     * for each atom and Q is the occupancy.
     * @return BisoMean
     */
    public BisoMean getBisoMean() {
        return (BisoMean) (isText ? textFields.computeIfAbsent("Biso_mean",
                BisoMean::new) : getBinaryColumn("Biso_mean"));
    }

    /**
     * The averaged occupancy for the residue.
     * @return OccupancyMean
     */
    public OccupancyMean getOccupancyMean() {
        return (OccupancyMean) (isText ? textFields.computeIfAbsent("occupancy_mean",
                OccupancyMean::new) : getBinaryColumn("occupancy_mean"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the main chain atoms.
     * @return RSCCMainChain
     */
    public RSCCMainChain getRSCCMainChain() {
        return (RSCCMainChain) (isText ? textFields.computeIfAbsent("RSCC_main_chain",
                RSCCMainChain::new) : getBinaryColumn("RSCC_main_chain"));
    }

    /**
     * The Real space Rfactor (RSR) for the main chain atoms.
     * @return RSRMainChain
     */
    public RSRMainChain getRSRMainChain() {
        return (RSRMainChain) (isText ? textFields.computeIfAbsent("RSR_main_chain",
                RSRMainChain::new) : getBinaryColumn("RSR_main_chain"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the main chain atoms.
     * @return WRSRMainChain
     */
    public WRSRMainChain getWRSRMainChain() {
        return (WRSRMainChain) (isText ? textFields.computeIfAbsent("wRSR_main_chain",
                WRSRMainChain::new) : getBinaryColumn("wRSR_main_chain"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the main chain atoms.
     * @return RSRZMainChain
     */
    public RSRZMainChain getRSRZMainChain() {
        return (RSRZMainChain) (isText ? textFields.computeIfAbsent("RSRZ_main_chain",
                RSRZMainChain::new) : getBinaryColumn("RSRZ_main_chain"));
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the main chain atoms.
     * @return WRSRZMainChain
     */
    public WRSRZMainChain getWRSRZMainChain() {
        return (WRSRZMainChain) (isText ? textFields.computeIfAbsent("wRSRZ_main_chain",
                WRSRZMainChain::new) : getBinaryColumn("wRSRZ_main_chain"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the main chain atoms.
     * @return BisoMeanMainChain
     */
    public BisoMeanMainChain getBisoMeanMainChain() {
        return (BisoMeanMainChain) (isText ? textFields.computeIfAbsent("Biso_mean_main_chain",
                BisoMeanMainChain::new) : getBinaryColumn("Biso_mean_main_chain"));
    }

    /**
     * The averaged occupancy forthe main chain atoms.
     * @return OccupancyMeanMainChain
     */
    public OccupancyMeanMainChain getOccupancyMeanMainChain() {
        return (OccupancyMeanMainChain) (isText ? textFields.computeIfAbsent("occupancy_mean_main_chain",
                OccupancyMeanMainChain::new) : getBinaryColumn("occupancy_mean_main_chain"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the side chain atoms.
     * @return RSCCSideChain
     */
    public RSCCSideChain getRSCCSideChain() {
        return (RSCCSideChain) (isText ? textFields.computeIfAbsent("RSCC_side_chain",
                RSCCSideChain::new) : getBinaryColumn("RSCC_side_chain"));
    }

    /**
     * The Real space Rfactor (RSR) for the side chain atoms.
     * @return RSRSideChain
     */
    public RSRSideChain getRSRSideChain() {
        return (RSRSideChain) (isText ? textFields.computeIfAbsent("RSR_side_chain",
                RSRSideChain::new) : getBinaryColumn("RSR_side_chain"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the side chain atoms.
     * @return WRSRSideChain
     */
    public WRSRSideChain getWRSRSideChain() {
        return (WRSRSideChain) (isText ? textFields.computeIfAbsent("wRSR_side_chain",
                WRSRSideChain::new) : getBinaryColumn("wRSR_side_chain"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the side chain atoms.
     * @return RSRZSideChain
     */
    public RSRZSideChain getRSRZSideChain() {
        return (RSRZSideChain) (isText ? textFields.computeIfAbsent("RSRZ_side_chain",
                RSRZSideChain::new) : getBinaryColumn("RSRZ_side_chain"));
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the side chain atoms.
     * @return WRSRZSideChain
     */
    public WRSRZSideChain getWRSRZSideChain() {
        return (WRSRZSideChain) (isText ? textFields.computeIfAbsent("wRSRZ_side_chain",
                WRSRZSideChain::new) : getBinaryColumn("wRSRZ_side_chain"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the side chain atoms.
     * @return BisoMeanSideChain
     */
    public BisoMeanSideChain getBisoMeanSideChain() {
        return (BisoMeanSideChain) (isText ? textFields.computeIfAbsent("Biso_mean_side_chain",
                BisoMeanSideChain::new) : getBinaryColumn("Biso_mean_side_chain"));
    }

    /**
     * The averaged occupancy forthe side chain atoms.
     * @return OccupancyMeanSideChain
     */
    public OccupancyMeanSideChain getOccupancyMeanSideChain() {
        return (OccupancyMeanSideChain) (isText ? textFields.computeIfAbsent("occupancy_mean_side_chain",
                OccupancyMeanSideChain::new) : getBinaryColumn("occupancy_mean_side_chain"));
    }

    /**
     * The Real Space electron density Correlation Coefficient for the phosphate atoms.
     * @return RSCCPhosphateGroup
     */
    public RSCCPhosphateGroup getRSCCPhosphateGroup() {
        return (RSCCPhosphateGroup) (isText ? textFields.computeIfAbsent("RSCC_phosphate_group",
                RSCCPhosphateGroup::new) : getBinaryColumn("RSCC_phosphate_group"));
    }

    /**
     * The Real space Rfactor (RSR) for the phosphate atoms.
     * @return RSRPhosphateGroup
     */
    public RSRPhosphateGroup getRSRPhosphateGroup() {
        return (RSRPhosphateGroup) (isText ? textFields.computeIfAbsent("RSR_phosphate_group",
                RSRPhosphateGroup::new) : getBinaryColumn("RSR_phosphate_group"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the phosphate atoms.
     * @return WRSRPhosphateGroup
     */
    public WRSRPhosphateGroup getWRSRPhosphateGroup() {
        return (WRSRPhosphateGroup) (isText ? textFields.computeIfAbsent("wRSR_phosphate_group",
                WRSRPhosphateGroup::new) : getBinaryColumn("wRSR_phosphate_group"));
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the phosphate atoms.
     * @return RSRZPhosphateGroup
     */
    public RSRZPhosphateGroup getRSRZPhosphateGroup() {
        return (RSRZPhosphateGroup) (isText ? textFields.computeIfAbsent("RSRZ_phosphate_group",
                RSRZPhosphateGroup::new) : getBinaryColumn("RSRZ_phosphate_group"));
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the phosphate atoms.
     * @return WRSRZPhosphateGroup
     */
    public WRSRZPhosphateGroup getWRSRZPhosphateGroup() {
        return (WRSRZPhosphateGroup) (isText ? textFields.computeIfAbsent("wRSRZ_phosphate_group",
                WRSRZPhosphateGroup::new) : getBinaryColumn("wRSRZ_phosphate_group"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the phosphate atoms.
     * @return BisoMeanPhosphateGroup
     */
    public BisoMeanPhosphateGroup getBisoMeanPhosphateGroup() {
        return (BisoMeanPhosphateGroup) (isText ? textFields.computeIfAbsent("Biso_mean_phosphate_group",
                BisoMeanPhosphateGroup::new) : getBinaryColumn("Biso_mean_phosphate_group"));
    }

    /**
     * The averaged occupancy forthe phosphate atoms.
     * @return OccupancyMeanPhosphateGroup
     */
    public OccupancyMeanPhosphateGroup getOccupancyMeanPhosphateGroup() {
        return (OccupancyMeanPhosphateGroup) (isText ? textFields.computeIfAbsent("occupancy_mean_phosphate_group",
                OccupancyMeanPhosphateGroup::new) : getBinaryColumn("occupancy_mean_phosphate_group"));
    }

    /**
     * Defined in sfcheck (displacement/sigma_of_displacement).
     * Displacement of atoms from electron density is estimated from the
     * difference (Fobs - Fcal) map. The displacement vector is the ratio
     * of the gradient of difference density to the curvature. The amplitude
     * of the displacement vector is an indicator of the positional error.
     * @return Shift
     */
    public Shift getShift() {
        return (Shift) (isText ? textFields.computeIfAbsent("shift",
                Shift::new) : getBinaryColumn("shift"));
    }

    /**
     * The same as _pdbx_dcc_map.density_shift, but it is for main chain.
     * @return ShiftMainChain
     */
    public ShiftMainChain getShiftMainChain() {
        return (ShiftMainChain) (isText ? textFields.computeIfAbsent("shift_main_chain",
                ShiftMainChain::new) : getBinaryColumn("shift_main_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.density_shift, but it is for side chain.
     * @return ShiftSideChain
     */
    public ShiftSideChain getShiftSideChain() {
        return (ShiftSideChain) (isText ? textFields.computeIfAbsent("shift_side_chain",
                ShiftSideChain::new) : getBinaryColumn("shift_side_chain"));
    }

    /**
     * Defined in sfcheck. It is the product of the (2Fobs-Fcal) electron
     * density values for the backbone atoms N, CA and C, and in the case of
     * RNA/DNA, for P, O5', C5', C3', O3'. Low values of this index indicate
     * breaks in the backbone electron density which may be due to flexibility
     * of the chain or incorrect tracing.
     * @return DensityConnectivity
     */
    public DensityConnectivity getDensityConnectivity() {
        return (DensityConnectivity) (isText ? textFields.computeIfAbsent("density_connectivity",
                DensityConnectivity::new) : getBinaryColumn("density_connectivity"));
    }

    /**
     * Defined in sfcheck. It is the mean density of the main chain atoms
     * divided by the mean density of the map.
     * @return DensityIndexMainChain
     */
    public DensityIndexMainChain getDensityIndexMainChain() {
        return (DensityIndexMainChain) (isText ? textFields.computeIfAbsent("density_index_main_chain",
                DensityIndexMainChain::new) : getBinaryColumn("density_index_main_chain"));
    }

    /**
     * Defined in sfcheck. It is the mean density of the side chain atoms
     * divided by the mean density of the map.
     * @return DensityIndexSideChain
     */
    public DensityIndexSideChain getDensityIndexSideChain() {
        return (DensityIndexSideChain) (isText ? textFields.computeIfAbsent("density_index_side_chain",
                DensityIndexSideChain::new) : getBinaryColumn("density_index_side_chain"));
    }

    /**
     * The real space difference density Z score
     * (defined as Delta_rho/sigma(Delta_rho)) from Tickle (2012). It is
     * related to the model accuracy. RSZD>3, significant extra positive
     * density around the residue; RSZD<-3, significant extra negative
     * density around the residue.
     * @return RSZD
     */
    public RSZD getRSZD() {
        return (RSZD) (isText ? textFields.computeIfAbsent("RSZD",
                RSZD::new) : getBinaryColumn("RSZD"));
    }

    /**
     * The real space observed density Z score (defined as <rho_obs>/sigma(Delta_rho))
     * from Tickle (2012). It is related to the model precision (B factors).
     * Small or large value means weak or strong density for the residue.
     * @return RSZO
     */
    public RSZO getRSZO() {
        return (RSZO) (isText ? textFields.computeIfAbsent("RSZO",
                RSZO::new) : getBinaryColumn("RSZO"));
    }

    /**
     * The Zscore of RSZO (or the Zscore of <rho_obs>/sigma(Delta_rho)).
     * @return RSZOZscore
     */
    public RSZOZscore getRSZOZscore() {
        return (RSZOZscore) (isText ? textFields.computeIfAbsent("RSZO_Zscore",
                RSZOZscore::new) : getBinaryColumn("RSZO_Zscore"));
    }

    /**
     * It is the Ligand Local Density Function defined as the
     * (<RsR>_local - RsR_Ligand)/sigma_RsR, where <RsR>_local is the
     * mean RSR of polymer residues in 5 Angstrom (including the
     * crystallographic symmetry) surrounding the ligand, and sigma_RsR
     * is sigma value calculated from the surrounding residues.
     * @return LLDF
     */
    public LLDF getLLDF() {
        return (LLDF) (isText ? textFields.computeIfAbsent("LLDF",
                LLDF::new) : getBinaryColumn("LLDF"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the main chain atoms.
     * @return RSZDMainChain
     */
    public RSZDMainChain getRSZDMainChain() {
        return (RSZDMainChain) (isText ? textFields.computeIfAbsent("RSZD_main_chain",
                RSZDMainChain::new) : getBinaryColumn("RSZD_main_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the main chain atoms.
     * @return RSZOMainChain
     */
    public RSZOMainChain getRSZOMainChain() {
        return (RSZOMainChain) (isText ? textFields.computeIfAbsent("RSZO_main_chain",
                RSZOMainChain::new) : getBinaryColumn("RSZO_main_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the side chain atoms.
     * @return RSZDSideChain
     */
    public RSZDSideChain getRSZDSideChain() {
        return (RSZDSideChain) (isText ? textFields.computeIfAbsent("RSZD_side_chain",
                RSZDSideChain::new) : getBinaryColumn("RSZD_side_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the side chain atoms.
     * @return RSZOSideChain
     */
    public RSZOSideChain getRSZOSideChain() {
        return (RSZOSideChain) (isText ? textFields.computeIfAbsent("RSZO_side_chain",
                RSZOSideChain::new) : getBinaryColumn("RSZO_side_chain"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the phosphate atoms of
     * nucleic acids.
     * @return RSZDPhosphateGroup
     */
    public RSZDPhosphateGroup getRSZDPhosphateGroup() {
        return (RSZDPhosphateGroup) (isText ? textFields.computeIfAbsent("RSZD_phosphate_group",
                RSZDPhosphateGroup::new) : getBinaryColumn("RSZD_phosphate_group"));
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the phosphate atoms of
     * nucleic acids.
     * @return RSZOPhosphateGroup
     */
    public RSZOPhosphateGroup getRSZOPhosphateGroup() {
        return (RSZOPhosphateGroup) (isText ? textFields.computeIfAbsent("RSZO_phosphate_group",
                RSZOPhosphateGroup::new) : getBinaryColumn("RSZO_phosphate_group"));
    }

    /**
     * The value indicates any problems with this group of atoms. If given
     * as 'd', it means there is problem of local model accuracy. If given
     * as 'w', it means weak density (there is problem of local model
     * precision). If given as 'dw', both then problems exist.
     * @return QualityIndicator
     */
    public QualityIndicator getQualityIndicator() {
        return (QualityIndicator) (isText ? textFields.computeIfAbsent("quality_indicator",
                QualityIndicator::new) : getBinaryColumn("quality_indicator"));
    }
}
