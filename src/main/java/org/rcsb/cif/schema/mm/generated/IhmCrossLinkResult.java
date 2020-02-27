package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_CROSS_LINK_RESULT category records the
 * results of the crosslinking restraints in the IHM modeling.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmCrossLinkResult extends BaseCategory {
    public IhmCrossLinkResult(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmCrossLinkResult(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmCrossLinkResult(String name) {
        super(name);
    }

    /**
     * A unique identifier for the restraint/ensemble combination.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ordinal_id", IntColumn::new) :
                getBinaryColumn("ordinal_id"));
    }

    /**
     * An identifier for the crosslink restraint between a pair of residues.
     * This data item is a pointer to _ihm_cross_link_restraint.id in the
     * IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("restraint_id", IntColumn::new) :
                getBinaryColumn("restraint_id"));
    }

    /**
     * An identifier for the ensemble whose results are described.
     * This data item is a pointer to _ihm_ensemble_info.ensemble_id in the
     * IHM_ENSEMBLE_INFO category.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ensemble_id", IntColumn::new) :
                getBinaryColumn("ensemble_id"));
    }

    /**
     * Number of models sampled in the integrative modeling task, for which
     * the crosslinking distance is provided.
     * @return IntColumn
     */
    public IntColumn getNumModels() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_models", IntColumn::new) :
                getBinaryColumn("num_models"));
    }

    /**
     * The distance threshold applied to this crosslink in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceThreshold() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("distance_threshold", FloatColumn::new) :
                getBinaryColumn("distance_threshold"));
    }

    /**
     * The median distance between the crosslinked residues in the sampled models.
     * @return FloatColumn
     */
    public FloatColumn getMedianDistance() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("median_distance", FloatColumn::new) :
                getBinaryColumn("median_distance"));
    }

    /**
     * This records holds any associated details of the results of the particular
     * crosslink restraint in the integrative modeling task.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
