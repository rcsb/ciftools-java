package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_entity_instance_feature category records
 * special features of selected entity instances.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityInstanceFeature extends DelegatingCategory {
    public PdbxEntityInstanceFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "details":
                return getDetails();
            case "feature_type":
                return getFeatureType();
            case "auth_asym_id":
                return getAuthAsymId();
            case "asym_id":
                return getAsymId();
            case "auth_seq_num":
                return getAuthSeqNum();
            case "seq_num":
                return getSeqNum();
            case "comp_id":
                return getCompId();
            case "auth_comp_id":
                return getAuthCompId();
            case "ordinal":
                return getOrdinal();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Special structural details about this entity instance.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A feature type associated with entity instance.
     * @return StrColumn
     */
    public StrColumn getFeatureType() {
        return delegate.getColumn("feature_type", DelegatingStrColumn::new);
    }

    /**
     * Author instance identifier (formerly PDB Chain ID)
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Instance identifier for this entity.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * Author provided residue number.
     * @return StrColumn
     */
    public StrColumn getAuthSeqNum() {
        return delegate.getColumn("auth_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Position in the sequence.
     * @return IntColumn
     */
    public IntColumn getSeqNum() {
        return delegate.getColumn("seq_num", DelegatingIntColumn::new);
    }

    /**
     * Chemical component identifier
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The author provided chemical component identifier
     * @return StrColumn
     */
    public StrColumn getAuthCompId() {
        return delegate.getColumn("auth_comp_id", DelegatingStrColumn::new);
    }

    /**
     * An ordinal index for this category
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

}