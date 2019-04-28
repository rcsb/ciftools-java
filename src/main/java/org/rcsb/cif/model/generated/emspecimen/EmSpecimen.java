package org.rcsb.cif.model.generated.emspecimen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Concentration
     */
    public Concentration getConcentration() {
        return (Concentration) (isText ? textFields.computeIfAbsent("concentration",
                Concentration::new) : getBinaryColumn("concentration"));
    }

    /**
     * A description of any additional details of the specimen preparation.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * 'YES' indicates that the specimen has been embedded.
     * @return EmbeddingApplied
     */
    public EmbeddingApplied getEmbeddingApplied() {
        return (EmbeddingApplied) (isText ? textFields.computeIfAbsent("embedding_applied",
                EmbeddingApplied::new) : getBinaryColumn("embedding_applied"));
    }

    /**
     * Pointer to _em_experiment.id.
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * The item  _em_specimen.id uniquely identifies a specimen along with
     * its preparation methods.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 'YES' indicates that the specimen has been shadowed.
     * @return ShadowingApplied
     */
    public ShadowingApplied getShadowingApplied() {
        return (ShadowingApplied) (isText ? textFields.computeIfAbsent("shadowing_applied",
                ShadowingApplied::new) : getBinaryColumn("shadowing_applied"));
    }

    /**
     * 'YES' indicates that the specimen has been stained.
     * @return StainingApplied
     */
    public StainingApplied getStainingApplied() {
        return (StainingApplied) (isText ? textFields.computeIfAbsent("staining_applied",
                StainingApplied::new) : getBinaryColumn("staining_applied"));
    }

    /**
     * 'YES' indicates that the specimen was vitrified by cryopreservation.
     * @return VitrificationApplied
     */
    public VitrificationApplied getVitrificationApplied() {
        return (VitrificationApplied) (isText ? textFields.computeIfAbsent("vitrification_applied",
                VitrificationApplied::new) : getBinaryColumn("vitrification_applied"));
    }
}
