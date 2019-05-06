package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category holds the list of all datasets used in the IHM modeling.
 * These can be datasets archived in other related databases such as
 * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc., or can be hosted in other
 * places such as the authors website, github etc. These datasets are
 * elaborated in detail in the IHM_DATASET_RELATED_DB_REFERENCE and/or
 * the IHM_DATASET_EXTERNAL_REFERENCE categories. This category
 * holds the list of all datasets used.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmDatasetList extends BaseCategory {
    public IhmDatasetList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmDatasetList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmDatasetList(String name) {
        super(name);
    }

    /**
     * A unique identifier for the dataset.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The type of data held in the dataset.
     * @return StrColumn
     */
    public StrColumn getDataType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("data_type", StrColumn::new) :
                getBinaryColumn("data_type"));
    }

    /**
     * Details regarding the dataset, especially those types not listed in
     * _ihm_dataset_list.data_type.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * A flag that indicates whether the dataset is archived in
     * an IHM related database or elsewhere.
     * @return StrColumn
     */
    public StrColumn getDatabaseHosted() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("database_hosted", StrColumn::new) :
                getBinaryColumn("database_hosted"));
    }
}
