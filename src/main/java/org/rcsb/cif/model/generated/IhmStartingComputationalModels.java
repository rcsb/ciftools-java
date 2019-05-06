package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_STARTING_COMPUTATIONAL_MODELS category records
 * additional details about computational models used as starting inputs in
 * the integrative model building process.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmStartingComputationalModels extends BaseCategory {
    public IhmStartingComputationalModels(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmStartingComputationalModels(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmStartingComputationalModels(String name) {
        super(name);
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("starting_model_id", StrColumn::new) :
                getBinaryColumn("starting_model_id"));
    }

    /**
     * The file id corresponding to the script used in the computational modeling.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getScriptFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("script_file_id", IntColumn::new) :
                getBinaryColumn("script_file_id"));
    }

    /**
     * An identifier to the software used in computational modeling.
     * This data item is a pointer to _software.pdbx_ordinal in the SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }
}
