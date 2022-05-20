package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the category record residual map properties such as
 * Real Space electron density Correlation Coefficient (RSCC), real space R
 * factors (RSR) and the Zscores for each residue, the main/side chains.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccMap extends DelegatingCategory {
    public PdbxDccMap(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "model_id":
                return getModelId();
            case "pdb_id":
                return getPdbId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "auth_comp_id":
                return getAuthCompId();
            case "auth_seq_id":
                return getAuthSeqId();
            case "label_alt_id":
                return getLabelAltId();
            case "label_ins_code":
                return getLabelInsCode();
            case "RSCC":
                return getRSCC();
            case "RSR":
                return getRSR();
            case "weighted_RSR":
                return getWeightedRSR();
            case "RSRZ":
                return getRSRZ();
            case "weighted_RSRZ":
                return getWeightedRSRZ();
            case "Biso_mean":
                return getBisoMean();
            case "occupancy_mean":
                return getOccupancyMean();
            case "RSCC_main_chain":
                return getRSCCMainChain();
            case "RSR_main_chain":
                return getRSRMainChain();
            case "wRSR_main_chain":
                return getWRSRMainChain();
            case "RSRZ_main_chain":
                return getRSRZMainChain();
            case "wRSRZ_main_chain":
                return getWRSRZMainChain();
            case "Biso_mean_main_chain":
                return getBisoMeanMainChain();
            case "occupancy_mean_main_chain":
                return getOccupancyMeanMainChain();
            case "RSCC_side_chain":
                return getRSCCSideChain();
            case "RSR_side_chain":
                return getRSRSideChain();
            case "wRSR_side_chain":
                return getWRSRSideChain();
            case "RSRZ_side_chain":
                return getRSRZSideChain();
            case "wRSRZ_side_chain":
                return getWRSRZSideChain();
            case "Biso_mean_side_chain":
                return getBisoMeanSideChain();
            case "occupancy_mean_side_chain":
                return getOccupancyMeanSideChain();
            case "RSCC_phosphate_group":
                return getRSCCPhosphateGroup();
            case "RSR_phosphate_group":
                return getRSRPhosphateGroup();
            case "wRSR_phosphate_group":
                return getWRSRPhosphateGroup();
            case "RSRZ_phosphate_group":
                return getRSRZPhosphateGroup();
            case "wRSRZ_phosphate_group":
                return getWRSRZPhosphateGroup();
            case "Biso_mean_phosphate_group":
                return getBisoMeanPhosphateGroup();
            case "occupancy_mean_phosphate_group":
                return getOccupancyMeanPhosphateGroup();
            case "shift":
                return getShift();
            case "shift_main_chain":
                return getShiftMainChain();
            case "shift_side_chain":
                return getShiftSideChain();
            case "density_connectivity":
                return getDensityConnectivity();
            case "density_index_main_chain":
                return getDensityIndexMainChain();
            case "density_index_side_chain":
                return getDensityIndexSideChain();
            case "RSZD":
                return getRSZD();
            case "RSZO":
                return getRSZO();
            case "RSZO_Zscore":
                return getRSZOZscore();
            case "LLDF":
                return getLLDF();
            case "RSZD_main_chain":
                return getRSZDMainChain();
            case "RSZO_main_chain":
                return getRSZOMainChain();
            case "RSZD_side_chain":
                return getRSZDSideChain();
            case "RSZO_side_chain":
                return getRSZOSideChain();
            case "RSZD_phosphate_group":
                return getRSZDPhosphateGroup();
            case "RSZO_phosphate_group":
                return getRSZOPhosphateGroup();
            case "quality_indicator":
                return getQualityIndicator();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ordered number of residue in the output list.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The component model identifier for this analysis.
     * @return StrColumn
     */
    public StrColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingStrColumn::new);
    }

    /**
     * The  PDB id code (four characters).
     * @return StrColumn
     */
    public StrColumn getPdbId() {
        return delegate.getColumn("pdb_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided chain id.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided compound ID (residue name).
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided residue number.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Author provided alternate location identifier.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * The PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getLabelInsCode() {
        return delegate.getColumn("label_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The Real Space electron density Correlation Coefficient for the
     * residue. It is defined as
     * RSCC=(&lt;xy&gt;-&lt;x&gt;&lt;y&gt;)/[sqrt(&lt;x**2&gt;-&lt;x&gt;**2)*sqrt(&lt;y**2&gt;-&lt;y&gt;**2)]
     * where x is the observed density from the (2mFo-DFc) map and y is the
     * calculated density from the Fc map
     * @return FloatColumn
     */
    public FloatColumn getRSCC() {
        return delegate.getColumn("RSCC", DelegatingFloatColumn::new);
    }

    /**
     * The Real space Rfactor (RSR) for the residue. It is defined as
     * RSR=sum(|x-y|/x+y|) which is the summation over all grid points
     * around the residue, where x is the observed density from the
     * (2mFo-DFc) map and y is the calculated density from the Fc map.
     * @return FloatColumn
     */
    public FloatColumn getRSR() {
        return delegate.getColumn("RSR", DelegatingFloatColumn::new);
    }

    /**
     * The weighted Real Space Rfactor (defined as RSR/RSCC) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getWeightedRSR() {
        return delegate.getColumn("weighted_RSR", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the residue. It is defined
     * as (RSR-&lt;RSR&gt;)/sigma_RSR, where &lt;RSR&gt; and sigma_RSR are for the whole map,
     * RSR is for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRSRZ() {
        return delegate.getColumn("RSRZ", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of weighted Real Space Rfactor for the residue. It is defined as
     * (wRSR-&lt;wRSR&gt;)/sigma_wRSR,  where &lt;wRSR&gt; and sigma_wRSR are for the whole map,
     * wRSR is for the residue.
     * @return FloatColumn
     */
    public FloatColumn getWeightedRSRZ() {
        return delegate.getColumn("weighted_RSRZ", DelegatingFloatColumn::new);
    }

    /**
     * The occupancy weighted average isotropic B factors for the residue.
     * It is defined as (SUM B*Q)/(SUM Q), where B is the isotropic B factor
     * for each atom and Q is the occupancy.
     * @return FloatColumn
     */
    public FloatColumn getBisoMean() {
        return delegate.getColumn("Biso_mean", DelegatingFloatColumn::new);
    }

    /**
     * The averaged occupancy for the residue.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMean() {
        return delegate.getColumn("occupancy_mean", DelegatingFloatColumn::new);
    }

    /**
     * The Real Space electron density Correlation Coefficient for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSCCMainChain() {
        return delegate.getColumn("RSCC_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The Real space Rfactor (RSR) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRMainChain() {
        return delegate.getColumn("RSR_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRMainChain() {
        return delegate.getColumn("wRSR_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRZMainChain() {
        return delegate.getColumn("RSRZ_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRZMainChain() {
        return delegate.getColumn("wRSRZ_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The occupancy weighted average isotropic B factors for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getBisoMeanMainChain() {
        return delegate.getColumn("Biso_mean_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The averaged occupancy forthe main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMeanMainChain() {
        return delegate.getColumn("occupancy_mean_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The Real Space electron density Correlation Coefficient for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSCCSideChain() {
        return delegate.getColumn("RSCC_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The Real space Rfactor (RSR) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRSideChain() {
        return delegate.getColumn("RSR_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRSideChain() {
        return delegate.getColumn("wRSR_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRZSideChain() {
        return delegate.getColumn("RSRZ_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRZSideChain() {
        return delegate.getColumn("wRSRZ_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The occupancy weighted average isotropic B factors for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getBisoMeanSideChain() {
        return delegate.getColumn("Biso_mean_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The averaged occupancy forthe side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMeanSideChain() {
        return delegate.getColumn("occupancy_mean_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The Real Space electron density Correlation Coefficient for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSCCPhosphateGroup() {
        return delegate.getColumn("RSCC_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * The Real space Rfactor (RSR) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRPhosphateGroup() {
        return delegate.getColumn("RSR_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRPhosphateGroup() {
        return delegate.getColumn("wRSR_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of the Real Space Rfactor (RSRZ) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSRZPhosphateGroup() {
        return delegate.getColumn("RSRZ_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * Zscore of weighted Real Space Rfactor (RSR/RSCC) for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getWRSRZPhosphateGroup() {
        return delegate.getColumn("wRSRZ_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * The occupancy weighted average isotropic B factors for the phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getBisoMeanPhosphateGroup() {
        return delegate.getColumn("Biso_mean_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * The averaged occupancy forthe phosphate atoms.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMeanPhosphateGroup() {
        return delegate.getColumn("occupancy_mean_phosphate_group", DelegatingFloatColumn::new);
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
        return delegate.getColumn("shift", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.density_shift, but it is for main chain.
     * @return FloatColumn
     */
    public FloatColumn getShiftMainChain() {
        return delegate.getColumn("shift_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.density_shift, but it is for side chain.
     * @return FloatColumn
     */
    public FloatColumn getShiftSideChain() {
        return delegate.getColumn("shift_side_chain", DelegatingFloatColumn::new);
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
        return delegate.getColumn("density_connectivity", DelegatingFloatColumn::new);
    }

    /**
     * Defined in sfcheck. It is the mean density of the main chain atoms
     * divided by the mean density of the map.
     * @return FloatColumn
     */
    public FloatColumn getDensityIndexMainChain() {
        return delegate.getColumn("density_index_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * Defined in sfcheck. It is the mean density of the side chain atoms
     * divided by the mean density of the map.
     * @return FloatColumn
     */
    public FloatColumn getDensityIndexSideChain() {
        return delegate.getColumn("density_index_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The real space difference density Z score
     * (defined as Delta_rho/sigma(Delta_rho)) from Tickle (2012). It is
     * related to the model accuracy. RSZD&gt;3, significant extra positive
     * density around the residue; RSZD&lt;-3, significant extra negative
     * density around the residue.
     * @return FloatColumn
     */
    public FloatColumn getRSZD() {
        return delegate.getColumn("RSZD", DelegatingFloatColumn::new);
    }

    /**
     * The real space observed density Z score (defined as &lt;rho_obs&gt;/sigma(Delta_rho))
     * from Tickle (2012). It is related to the model precision (B factors).
     * Small or large value means weak or strong density for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRSZO() {
        return delegate.getColumn("RSZO", DelegatingFloatColumn::new);
    }

    /**
     * The Zscore of RSZO (or the Zscore of &lt;rho_obs&gt;/sigma(Delta_rho)).
     * @return FloatColumn
     */
    public FloatColumn getRSZOZscore() {
        return delegate.getColumn("RSZO_Zscore", DelegatingFloatColumn::new);
    }

    /**
     * It is the Ligand Local Density Function defined as the
     * (&lt;RsR&gt;_local - RsR_Ligand)/sigma_RsR, where &lt;RsR&gt;_local is the
     * mean RSR of polymer residues in 5 angstroms (including the
     * crystallographic symmetry) surrounding the ligand, and sigma_RsR
     * is sigma value calculated from the surrounding residues.
     * @return FloatColumn
     */
    public FloatColumn getLLDF() {
        return delegate.getColumn("LLDF", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZDMainChain() {
        return delegate.getColumn("RSZD_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the main chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZOMainChain() {
        return delegate.getColumn("RSZO_main_chain", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZDSideChain() {
        return delegate.getColumn("RSZD_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the side chain atoms.
     * @return FloatColumn
     */
    public FloatColumn getRSZOSideChain() {
        return delegate.getColumn("RSZO_side_chain", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.RSZD, use for the phosphate atoms of
     * nucleic acids.
     * @return FloatColumn
     */
    public FloatColumn getRSZDPhosphateGroup() {
        return delegate.getColumn("RSZD_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * The same as _pdbx_dcc_map.RSZO, use for the phosphate atoms of
     * nucleic acids.
     * @return FloatColumn
     */
    public FloatColumn getRSZOPhosphateGroup() {
        return delegate.getColumn("RSZO_phosphate_group", DelegatingFloatColumn::new);
    }

    /**
     * The value indicates any problems with this group of atoms. If given
     * as 'd', it means there is problem of local model accuracy. If given
     * as 'w', it means weak density (there is problem of local model
     * precision). If given as 'dw', both then problems exist.
     * @return StrColumn
     */
    public StrColumn getQualityIndicator() {
        return delegate.getColumn("quality_indicator", DelegatingStrColumn::new);
    }

}