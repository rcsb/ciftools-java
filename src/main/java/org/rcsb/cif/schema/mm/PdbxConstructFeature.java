package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
 * specify various properties of a nucleic acid sequence used during
 * protein production.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxConstructFeature extends DelegatingCategory {
    public PdbxConstructFeature(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "construct_id":
                return getConstructId();
            case "entry_id":
                return getEntryId();
            case "start_seq":
                return getStartSeq();
            case "end_seq":
                return getEndSeq();
            case "type":
                return getType();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_construct_feature.id must uniquely
     * identify a record in the PDBX_CONSTRUCT_FEATURE list.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_construct_feature.construct_id uniquely
     * identifies the construct with which the feature is
     * associated. This is a pointer to _pdbx_construct.id
     * This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getConstructId() {
        return delegate.getColumn("construct_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_construct_feature.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence position at which the feature begins
     * @return IntColumn
     */
    public IntColumn getStartSeq() {
        return delegate.getColumn("start_seq", DelegatingIntColumn::new);
    }

    /**
     * The sequence position at which the feature ends
     * @return IntColumn
     */
    public IntColumn getEndSeq() {
        return delegate.getColumn("end_seq", DelegatingIntColumn::new);
    }

    /**
     * The type of the feature
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Details that describe the feature
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}