package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in this category record residual map properties such as
 * correlation, real space Rfactors and the Zscore calculated from
 * refmac and mapman.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccRsccMapman extends DelegatingCategory {
    public PdbxDccRsccMapman(Category delegate) {
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
            case "correlation":
                return getCorrelation();
            case "real_space_R":
                return getRealSpaceR();
            case "weighted_real_space_R":
                return getWeightedRealSpaceR();
            case "real_space_Zscore":
                return getRealSpaceZscore();
            case "Biso_mean":
                return getBisoMean();
            case "occupancy_mean":
                return getOccupancyMean();
            case "flag":
                return getFlag();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The ordered number in the output list.
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
     * The PDB id code.
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
     * The author provided alternate location identifier.
     * @return StrColumn
     */
    public StrColumn getLabelAltId() {
        return delegate.getColumn("label_alt_id", DelegatingStrColumn::new);
    }

    /**
     * PDB insertion code.
     * @return StrColumn
     */
    public StrColumn getLabelInsCode() {
        return delegate.getColumn("label_ins_code", DelegatingStrColumn::new);
    }

    /**
     * The real space electron density correlation coefficient (RSCC)
     * for the residue.
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return delegate.getColumn("correlation", DelegatingFloatColumn::new);
    }

    /**
     * The Real Space Rfactor (RSR) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return delegate.getColumn("real_space_R", DelegatingFloatColumn::new);
    }

    /**
     * The weighted Real Space Rfactor (RSR/RSCC) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getWeightedRealSpaceR() {
        return delegate.getColumn("weighted_real_space_R", DelegatingFloatColumn::new);
    }

    /**
     * The Zscore of the Real Space Rfactor (RSRZ) for the residue.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceZscore() {
        return delegate.getColumn("real_space_Zscore", DelegatingFloatColumn::new);
    }

    /**
     * The occupancy weighted average isotropic B factors for the residue.
     * @return FloatColumn
     */
    public FloatColumn getBisoMean() {
        return delegate.getColumn("Biso_mean", DelegatingFloatColumn::new);
    }

    /**
     * The average occupancy for the residue.
     * @return FloatColumn
     */
    public FloatColumn getOccupancyMean() {
        return delegate.getColumn("occupancy_mean", DelegatingFloatColumn::new);
    }

    /**
     * Residue with density problem will be flagged as P.
     * @return StrColumn
     */
    public StrColumn getFlag() {
        return delegate.getColumn("flag", DelegatingStrColumn::new);
    }

}