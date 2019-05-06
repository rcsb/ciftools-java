package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Category holds information related to data sources for the entry.
 * These can be datasets archived in other related databases such as
 * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmDatasetRelatedDbReference extends BaseCategory {
    public IhmDatasetRelatedDbReference(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmDatasetRelatedDbReference(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmDatasetRelatedDbReference(String name) {
        super(name);
    }

    /**
     * A unique identifier for the related database entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Identifier to the dataset list used in the IHM modeling.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("dataset_list_id", IntColumn::new) :
                getBinaryColumn("dataset_list_id"));
    }

    /**
     * The name of the database containing the dataset entry.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("db_name", StrColumn::new) :
                getBinaryColumn("db_name"));
    }

    /**
     * The accession code for the database entry.
     * @return StrColumn
     */
    public StrColumn getAccessionCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("accession_code", StrColumn::new) :
                getBinaryColumn("accession_code"));
    }

    /**
     * Version of the database entry, if the database allows versioning.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("version", StrColumn::new) :
                getBinaryColumn("version"));
    }

    /**
     * Details regarding the dataset entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
