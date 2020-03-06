package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STARTING_COMPUTATIONAL_MODELS category records
 * additional details about computational models used as starting inputs in
 * the integrative model building process.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStartingComputationalModels extends DelegatingCategory {
    public IhmStartingComputationalModels(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "starting_model_id":
                return getStartingModelId();
            case "script_file_id":
                return getScriptFileId();
            case "software_id":
                return getSoftwareId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The identifier for the starting structural model.
     * This data item is a pointer to _ihm_starting_model_details.starting_model_id
     * in the IHM_STARTING_MODEL_DETAILS category.
     * @return StrColumn
     */
    public StrColumn getStartingModelId() {
        return delegate.getColumn("starting_model_id", DelegatingStrColumn::new);
    }

    /**
     * The file id corresponding to the script used in the computational modeling.
     * This data item is a pointer to _ihm_external_files.id in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getScriptFileId() {
        return delegate.getColumn("script_file_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to the software used in computational modeling.
     * This data item is a pointer to _software.pdbx_ordinal in the SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

}