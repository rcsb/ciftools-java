package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EMD_SPECIMEN category record details
 * about specimens prepared for imaging by electron microscopy.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return FloatColumn
     */
    public FloatColumn getConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("concentration", FloatColumn::new) :
                getBinaryColumn("concentration"));
    }

    /**
     * A description of any additional details of the specimen preparation.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * 'YES' indicates that the specimen has been embedded.
     * @return StrColumn
     */
    public StrColumn getEmbeddingApplied() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("embedding_applied", StrColumn::new) :
                getBinaryColumn("embedding_applied"));
    }

    /**
     * Pointer to _em_experiment.id.
     * @return StrColumn
     */
    public StrColumn getExperimentId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("experiment_id", StrColumn::new) :
                getBinaryColumn("experiment_id"));
    }

    /**
     * The item  _em_specimen.id uniquely identifies a specimen along with
     * its preparation methods.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * 'YES' indicates that the specimen has been shadowed.
     * @return StrColumn
     */
    public StrColumn getShadowingApplied() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("shadowing_applied", StrColumn::new) :
                getBinaryColumn("shadowing_applied"));
    }

    /**
     * 'YES' indicates that the specimen has been stained.
     * @return StrColumn
     */
    public StrColumn getStainingApplied() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("staining_applied", StrColumn::new) :
                getBinaryColumn("staining_applied"));
    }

    /**
     * 'YES' indicates that the specimen was vitrified by cryopreservation.
     * @return StrColumn
     */
    public StrColumn getVitrificationApplied() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("vitrification_applied", StrColumn::new) :
                getBinaryColumn("vitrification_applied"));
    }
}
