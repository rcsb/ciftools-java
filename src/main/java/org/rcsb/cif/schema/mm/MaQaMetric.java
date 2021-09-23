package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_QA_METRIC category record the
 * details of the metrics use to assess model quality.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaQaMetric extends DelegatingCategory {
    public MaQaMetric(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "name":
                return getName();
            case "description":
                return getDescription();
            case "type":
                return getType();
            case "type_other_details":
                return getTypeOtherDetails();
            case "mode":
                return getMode();
            case "software_group_id":
                return getSoftwareGroupId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * An identifier for the QA metric.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * Name of the QA metric.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Description of the QA metric.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }

    /**
     * The type of QA metric.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Details for other type of QA metric.
     * @return StrColumn
     */
    public StrColumn getTypeOtherDetails() {
        return delegate.getColumn("type_other_details", DelegatingStrColumn::new);
    }

    /**
     * The mode of calculation of the QA metric.
     * @return StrColumn
     */
    public StrColumn getMode() {
        return delegate.getColumn("mode", DelegatingStrColumn::new);
    }

    /**
     * Identifier to the set of software used to calculate the QA metric.
     * This data item is a pointer to the _ma_software_group.group_id in the
     * MA_SOFTWARE_GROUP category.
     * @return IntColumn
     */
    public IntColumn getSoftwareGroupId() {
        return delegate.getColumn("software_group_id", DelegatingIntColumn::new);
    }

}