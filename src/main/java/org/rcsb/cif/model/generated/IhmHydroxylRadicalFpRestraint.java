package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_HYDROXYL_RADICAL_FP_RESTRAINT category records the
 * restraints derived from hydroxyl radical footprinting experiment.
 * These restraints provide information regarding solvent accessible surface
 * area of residues.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmHydroxylRadicalFpRestraint extends BaseCategory {
    public IhmHydroxylRadicalFpRestraint(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmHydroxylRadicalFpRestraint(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmHydroxylRadicalFpRestraint(String name) {
        super(name);
    }

    /**
     * A unique identifier for the hydroxyl radical footprinting restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * An identifier to group the hydroxyl radical footprinting restraints.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("group_id", IntColumn::new) :
                getBinaryColumn("group_id"));
    }

    /**
     * A text description of the molecular entity.
     * @return StrColumn
     */
    public StrColumn getEntityDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_description", StrColumn::new) :
                getBinaryColumn("entity_description"));
    }

    /**
     * The entity identifier.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * An asym/strand identifier.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * The component identifier for the residue.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("comp_id", StrColumn::new) :
                getBinaryColumn("comp_id"));
    }

    /**
     * The sequence index for the residue.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id", IntColumn::new) :
                getBinaryColumn("seq_id"));
    }

    /**
     * The footprinting rate.
     * @return FloatColumn
     */
    public FloatColumn getFpRate() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fp_rate", FloatColumn::new) :
                getBinaryColumn("fp_rate"));
    }

    /**
     * The footprinting rate error.
     * @return FloatColumn
     */
    public FloatColumn getFpRateError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("fp_rate_error", FloatColumn::new) :
                getBinaryColumn("fp_rate_error"));
    }

    /**
     * Log (base 10) protection factor.
     * @return FloatColumn
     */
    public FloatColumn getLogPf() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("log_pf", FloatColumn::new) :
                getBinaryColumn("log_pf"));
    }

    /**
     * Error of Log (base 10) protection factor.
     * @return FloatColumn
     */
    public FloatColumn getLogPfError() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("log_pf_error", FloatColumn::new) :
                getBinaryColumn("log_pf_error"));
    }

    /**
     * The predicted solvent accessible surface area.
     * @return FloatColumn
     */
    public FloatColumn getPredictedSasa() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("predicted_sasa", FloatColumn::new) :
                getBinaryColumn("predicted_sasa"));
    }

    /**
     * Identifier to the hydroxyl radical footprinting dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * Identifier to the software used to obtain the restraint.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }
}
