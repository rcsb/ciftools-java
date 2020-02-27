package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in this category record residual map properties such as
 * correlation, real space Rfactors and the Zscore calculated from
 * refmac and mapman.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * The PDB id code.
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
     * The author provided alternate location identifier.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_alt_id", StrColumn::new) :
                getBinaryColumn("label_alt_id"));
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getLabelInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("label_ins_code", StrColumn::new) :
                getBinaryColumn("label_ins_code"));
    }

    /**
     * The real space electron density correlation coefficient (RSCC)
     * for the residue.
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("correlation", FloatColumn::new) :
                getBinaryColumn("correlation"));
    }

    /**
     * The Real Space Rfactor (RSR) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_R", FloatColumn::new) :
                getBinaryColumn("real_space_R"));
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getWeightedRealSpaceR() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("weighted_real_space_R", FloatColumn::new) :
                getBinaryColumn("weighted_real_space_R"));
    }

    /**
     * The Zscore of the Real Space Rfactor (RSRZ) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceZscore() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("real_space_Zscore", FloatColumn::new) :
                getBinaryColumn("real_space_Zscore"));
    }

    /**
     * The occupancy weighted average isotropic B factors for the residue.
     * @return FloatColumn
     */
    public FloatColumn getBisoMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("Biso_mean", FloatColumn::new) :
                getBinaryColumn("Biso_mean"));
    }

    /**
     * The average occupancy for the residue.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMean() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("occupancy_mean", FloatColumn::new) :
                getBinaryColumn("occupancy_mean"));
    }

    /**
     * Residue with density problem will be flagged as P.
     * @return StrColumn
     */
    public StrColumn getFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("flag", StrColumn::new) :
                getBinaryColumn("flag"));
    }
}
