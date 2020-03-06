package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_CROSS_LINK_PSEUDO_SITE category records the
 * details of the pseudo sites involved in the cross links.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmCrossLinkPseudoSite extends DelegatingCategory {
    public IhmCrossLinkPseudoSite(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "restraint_id":
                return getRestraintId();
            case "cross_link_partner":
                return getCrossLinkPartner();
            case "pseudo_site_id":
                return getPseudoSiteId();
            case "model_id":
                return getModelId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for this category.
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
     * The identity of the cross link partner corresponding to the pseudo site.
     * @return StrColumn
     */
    public StrColumn getCrossLinkPartner() {
        return delegate.getColumn("cross_link_partner", DelegatingStrColumn::new);
    }

    /**
     * The pseudo site identifier corresponding to the cross link partner.
     * This data item is a pointer to _ihm_pseudo_site.id
     * in the IHM_PSEUDO_SITE category.
     * @return IntColumn
     */
    public IntColumn getPseudoSiteId() {
        return delegate.getColumn("pseudo_site_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier to the model that the pseudo site corresponds to.
     * This data item is a pointer to _ihm_model_list.model_id
     * in the IHM_MODEL_LIST category.
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

}