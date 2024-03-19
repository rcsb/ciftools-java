package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_RELAXATION_TIME category records the details
 * of the relaxation times obtained from biophysical experiments.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmRelaxationTime extends DelegatingCategory {
    public IhmRelaxationTime(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "value":
                return getValue();
            case "unit":
                return getUnit();
            case "amplitude":
                return getAmplitude();
            case "dataset_group_id":
                return getDatasetGroupId();
            case "external_file_id":
                return getExternalFileId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the relaxation time.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Relaxation time value.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * Relaxation time unit.
     * @return StrColumn
     */
    public StrColumn getUnit() {
        return delegate.getColumn("unit", DelegatingStrColumn::new);
    }

    /**
     * Relaxation time amplitude.
     * @return FloatColumn
     */
    public FloatColumn getAmplitude() {
        return delegate.getColumn("amplitude", DelegatingFloatColumn::new);
    }

    /**
     * Identifier for the dataset group from which the relaxation time is obtained.
     * This data item is a pointer to _ihm_dataset_group.id in the
     * IHM_DATASET_GROUP data category.
     * @return IntColumn
     */
    public IntColumn getDatasetGroupId() {
        return delegate.getColumn("dataset_group_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier for the external file corresponding to the relaxation time measurement.
     * This data item is a pointer to _ihm_external_files.id in the
     * IHM_EXTERNAL_FILES data category.
     * @return IntColumn
     */
    public IntColumn getExternalFileId() {
        return delegate.getColumn("external_file_id", DelegatingIntColumn::new);
    }

    /**
     * Additional details regarding the relaxation time.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}