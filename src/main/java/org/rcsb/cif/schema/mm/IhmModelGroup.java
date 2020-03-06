package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * IHM_MODEL_GROUP category defines collections or groups of integrative
 * structural models.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmModelGroup extends DelegatingCategory {
    public IhmModelGroup(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "name":
                return getName();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for a collection or group of structural models.
     * This data item can be used to group models into structural clusters
     * or using other criteria based on experimental data or other
     * relationships such as those belonging to the same state or time stamp.
     * An ensemble of models and its representative can either be grouped together
     * or can be separate groups in the ihm_model_group table. The choice between
     * the two options should be decided based on how the modeling was carried out
     * and how the representative was chosen. If the representative is a member of
     * the ensemble (i.e., best scoring model), then it is recommended that the
     * representative and the ensemble belong to the same model group. If the
     * representative is calculated from the ensemble (i.e., centroid), then it is
     * recommended that the representative be separated into a different group.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * A name for the collection of models.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Additional details about the collection of models.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}