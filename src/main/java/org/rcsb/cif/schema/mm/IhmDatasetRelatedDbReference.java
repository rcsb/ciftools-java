package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category holds information related to data sources for the entry.
 * These can be datasets archived in other related databases such as
 * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDatasetRelatedDbReference extends DelegatingCategory {
    public IhmDatasetRelatedDbReference(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "dataset_list_id":
                return getDatasetListId();
            case "db_name":
                return getDbName();
            case "accession_code":
                return getAccessionCode();
            case "version":
                return getVersion();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the related database entry.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the dataset list used in the IHM modeling.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * The name of the database containing the dataset entry.
     * @return StrColumn
     */
    public StrColumn getDbName() {
        return delegate.getColumn("db_name", DelegatingStrColumn::new);
    }

    /**
     * The accession code for the database entry.
     * @return StrColumn
     */
    public StrColumn getAccessionCode() {
        return delegate.getColumn("accession_code", DelegatingStrColumn::new);
    }

    /**
     * Version of the database entry, if the database allows versioning.
     * @return StrColumn
     */
    public StrColumn getVersion() {
        return delegate.getColumn("version", DelegatingStrColumn::new);
    }

    /**
     * Details regarding the dataset entry.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}