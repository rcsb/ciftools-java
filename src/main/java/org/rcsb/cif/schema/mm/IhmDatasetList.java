package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Category holds the list of all datasets used in the IHM modeling.
 * These can be datasets archived in other related databases such as
 * BMRB, EMDB, EMPIAR, SASBDB, PRIDE etc., or can be hosted in other
 * places such as the authors website, github etc. These datasets are
 * elaborated in detail in the IHM_DATASET_RELATED_DB_REFERENCE and/or
 * the IHM_DATASET_EXTERNAL_REFERENCE categories. This category
 * holds the list of all datasets used.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmDatasetList extends DelegatingCategory {
    public IhmDatasetList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "data_type":
                return getDataType();
            case "details":
                return getDetails();
            case "database_hosted":
                return getDatabaseHosted();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the dataset.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The type of data held in the dataset.
     * @return StrColumn
     */
    public StrColumn getDataType() {
        return delegate.getColumn("data_type", DelegatingStrColumn::new);
    }

    /**
     * Details regarding the dataset, especially those types not listed in
     * _ihm_dataset_list.data_type.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A flag that indicates whether the dataset is archived in
     * an IHM related database or elsewhere.
     * @return StrColumn
     */
    public StrColumn getDatabaseHosted() {
        return delegate.getColumn("database_hosted", DelegatingStrColumn::new);
    }

}