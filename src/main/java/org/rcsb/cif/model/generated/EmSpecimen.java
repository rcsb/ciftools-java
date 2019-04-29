package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EMD_SPECIMEN category record details
 * about specimens prepared for imaging by electron microscopy.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmSpecimen extends BaseCategory {
    public EmSpecimen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSpecimen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSpecimen(String name) {
        super(name);
    }

    /**
     * The concentration (in milligrams per milliliter, mg/ml)
     * of the complex in the sample.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getConcentration() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("concentration", SingleRowFloatColumn::new) :
                getBinaryColumn("concentration"));
    }

    /**
     * A description of any additional details of the specimen preparation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 'YES' indicates that the specimen has been embedded.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEmbeddingApplied() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("embedding_applied", SingleRowStrColumn::new) :
                getBinaryColumn("embedding_applied"));
    }

    /**
     * Pointer to _em_experiment.id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getExperimentId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("experiment_id", SingleRowStrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The item  _em_specimen.id uniquely identifies a specimen along with
     * its preparation methods.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 'YES' indicates that the specimen has been shadowed.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getShadowingApplied() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("shadowing_applied", SingleRowStrColumn::new) :
                getBinaryColumn("shadowing_applied"));
    }

    /**
     * 'YES' indicates that the specimen has been stained.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getStainingApplied() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("staining_applied", SingleRowStrColumn::new) :
                getBinaryColumn("staining_applied"));
    }

    /**
     * 'YES' indicates that the specimen was vitrified by cryopreservation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getVitrificationApplied() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("vitrification_applied", SingleRowStrColumn::new) :
                getBinaryColumn("vitrification_applied"));
    }
}
