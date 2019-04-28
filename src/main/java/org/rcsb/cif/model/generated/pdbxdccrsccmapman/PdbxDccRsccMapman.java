package org.rcsb.cif.model.generated.pdbxdccrsccmapman;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDccRsccMapman extends BaseCategory {
    public PdbxDccRsccMapman(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccRsccMapman(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccRsccMapman(String name) {
        super(name);
    }

    /**
     * The ordered number in the output list.
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
     * The PDB id code.
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
     * The author provided alternate location identifier.
     * @return LabelAltId
     */
    public LabelAltId getLabelAltId() {
        return (LabelAltId) (isText ? textFields.computeIfAbsent("label_alt_id",
                LabelAltId::new) : getBinaryColumn("label_alt_id"));
    }

    /**
     * PDB insertion code.
     * @return LabelInsCode
     */
    public LabelInsCode getLabelInsCode() {
        return (LabelInsCode) (isText ? textFields.computeIfAbsent("label_ins_code",
                LabelInsCode::new) : getBinaryColumn("label_ins_code"));
    }

    /**
     * The real space electron density correlation coefficient (RSCC)
     * for the residue.
     * @return Correlation
     */
    public Correlation getCorrelation() {
        return (Correlation) (isText ? textFields.computeIfAbsent("correlation",
                Correlation::new) : getBinaryColumn("correlation"));
    }

    /**
     * The Real Space Rfactor (RSR) for the residue.
     * @return RealSpaceR
     */
    public RealSpaceR getRealSpaceR() {
        return (RealSpaceR) (isText ? textFields.computeIfAbsent("real_space_R",
                RealSpaceR::new) : getBinaryColumn("real_space_R"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the residue.
     * @return WeightedRealSpaceR
     */
    public WeightedRealSpaceR getWeightedRealSpaceR() {
        return (WeightedRealSpaceR) (isText ? textFields.computeIfAbsent("weighted_real_space_R",
                WeightedRealSpaceR::new) : getBinaryColumn("weighted_real_space_R"));
    }

    /**
     * The Zscore of the Real Space Rfactor (RSRZ) for the residue.
     * @return RealSpaceZscore
     */
    public RealSpaceZscore getRealSpaceZscore() {
        return (RealSpaceZscore) (isText ? textFields.computeIfAbsent("real_space_Zscore",
                RealSpaceZscore::new) : getBinaryColumn("real_space_Zscore"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the residue.
     * @return BisoMean
     */
    public BisoMean getBisoMean() {
        return (BisoMean) (isText ? textFields.computeIfAbsent("Biso_mean",
                BisoMean::new) : getBinaryColumn("Biso_mean"));
    }

    /**
     * The average occupancy for the residue.
     * @return OccupancyMean
     */
    public OccupancyMean getOccupancyMean() {
        return (OccupancyMean) (isText ? textFields.computeIfAbsent("occupancy_mean",
                OccupancyMean::new) : getBinaryColumn("occupancy_mean"));
    }

    /**
     * Residue with density problem will be flagged as P.
     * @return Flag
     */
    public Flag getFlag() {
        return (Flag) (isText ? textFields.computeIfAbsent("flag",
                Flag::new) : getBinaryColumn("flag"));
    }
}
