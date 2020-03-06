package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_HYDROXYL_RADICAL_FP_RESTRAINT category records the
 * restraints derived from hydroxyl radical footprinting experiment.
 * These restraints provide information regarding solvent accessible surface
 * area of residues.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmHydroxylRadicalFpRestraint extends DelegatingCategory {
    public IhmHydroxylRadicalFpRestraint(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "group_id":
                return getGroupId();
            case "entity_description":
                return getEntityDescription();
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "comp_id":
                return getCompId();
            case "seq_id":
                return getSeqId();
            case "fp_rate":
                return getFpRate();
            case "fp_rate_error":
                return getFpRateError();
            case "log_pf":
                return getLogPf();
            case "log_pf_error":
                return getLogPfError();
            case "predicted_sasa":
                return getPredictedSasa();
            case "dataset_list_id":
                return getDatasetListId();
            case "software_id":
                return getSoftwareId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the hydroxyl radical footprinting restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to group the hydroxyl radical footprinting restraints.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * A text description of the molecular entity.
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return delegate.getColumn("entity_description", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier.
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the residue.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the residue.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * The footprinting rate.
     * @return FloatColumn
     */
    public FloatColumn getFpRate() {
        return delegate.getColumn("fp_rate", DelegatingFloatColumn::new);
    }

    /**
     * The footprinting rate error.
     * @return FloatColumn
     */
    public FloatColumn getFpRateError() {
        return delegate.getColumn("fp_rate_error", DelegatingFloatColumn::new);
    }

    /**
     * Log (base 10) protection factor.
     * @return FloatColumn
     */
    public FloatColumn getLogPf() {
        return delegate.getColumn("log_pf", DelegatingFloatColumn::new);
    }

    /**
     * Error of Log (base 10) protection factor.
     * @return FloatColumn
     */
    public FloatColumn getLogPfError() {
        return delegate.getColumn("log_pf_error", DelegatingFloatColumn::new);
    }

    /**
     * The predicted solvent accessible surface area.
     * @return FloatColumn
     */
    public FloatColumn getPredictedSasa() {
        return delegate.getColumn("predicted_sasa", DelegatingFloatColumn::new);
    }

    /**
     * Identifier to the hydroxyl radical footprinting dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the software used to obtain the restraint.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

}