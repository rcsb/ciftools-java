package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the MA_ATOM_FEATURE category provides the definitions
 * required to select specific atoms independent of entity type.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class MaAtomFeature extends DelegatingCategory {
    public MaAtomFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "ordinal_id":
                return getOrdinalId();
            case "feature_id":
                return getFeatureId();
            case "atom_id":
                return getAtomId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier for the category.
     * @return IntColumn
     */
    public IntColumn getOrdinalId() {
        return delegate.getColumn("ordinal_id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for the selected atom feature.
     * This data item is a pointer to _ma_feature_list.feature_id in the
     * MA_FEATURE_LIST category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the atom.
     * This data item is a pointer to _atom_site.id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

}