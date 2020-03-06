package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_CROSS_LINK_RESULT_PARAMETERS category records the
 * results of the crosslinking restraint parameters in the IHM modeling.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmCrossLinkResultParameters extends DelegatingCategory {
    public IhmCrossLinkResultParameters(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "restraint_id":
                return getRestraintId();
            case "model_id":
                return getModelId();
            case "psi":
                return getPsi();
            case "sigma_1":
                return getSigma1();
            case "sigma_2":
                return getSigma2();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the restraint/model combination.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the crosslink restraint between a pair of residues.
     * This data item is a pointer to _ihm_cross_link_restraint.id in the
     * IHM_CROSS_LINK_RESTRAINT category.
     * @return IntColumn
     */
    public IntColumn getRestraintId() {
        return delegate.getColumn("restraint_id", DelegatingIntColumn::new);
    }

    /**
     * The model number corresponding to the cross link result presented.
     * This data item is a pointer to _ihm_model_list.model_id in the
     * IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The uncertainty in the crosslinking experimental data;
     * May be approximated to the false positive rate.
     * @return FloatColumn
     */
    public FloatColumn getPsi() {
        return delegate.getColumn("psi", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the position of residue 1 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma1() {
        return delegate.getColumn("sigma_1", DelegatingFloatColumn::new);
    }

    /**
     * The uncertainty in the position of residue 2 in the crosslink
     * arising due to the multi-scale nature of the model represention.
     * @return FloatColumn
     */
    public FloatColumn getSigma2() {
        return delegate.getColumn("sigma_2", DelegatingFloatColumn::new);
    }

}