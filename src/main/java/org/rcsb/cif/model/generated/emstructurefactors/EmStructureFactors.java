package org.rcsb.cif.model.generated.emstructurefactors;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EmStructureFactors extends BaseCategory {
    public EmStructureFactors(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmStructureFactors(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmStructureFactors(String name) {
        super(name);
    }

    /**
     * Details about the structure factor file.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * This data item is a pointer to the EM EXPERIMENT category.
     * @return ExperimentId
     */
    public ExperimentId getExperimentId() {
        return (ExperimentId) (isText ? textFields.computeIfAbsent("experiment_id",
                ExperimentId::new) : getBinaryColumn("experiment_id"));
    }

    /**
     * The name of the structure factor file associated with the map entry
     * @return File
     */
    public File getFile() {
        return (File) (isText ? textFields.computeIfAbsent("file",
                File::new) : getBinaryColumn("file"));
    }

    /**
     * This data item is the unique identifier for the structure factor file.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }
}
