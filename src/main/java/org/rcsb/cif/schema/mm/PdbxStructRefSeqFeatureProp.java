package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
 * mechanism for identifying and annotating properties of sequence features.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructRefSeqFeatureProp extends DelegatingCategory {
    public PdbxStructRefSeqFeatureProp(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "feature_id":
                return getFeatureId();
            case "property_id":
                return getPropertyId();
            case "type":
                return getType();
            case "value":
                return getValue();
            case "details":
                return getDetails();
            case "beg_db_mon_id":
                return getBegDbMonId();
            case "end_db_mon_id":
                return getEndDbMonId();
            case "beg_db_seq_id":
                return getBegDbSeqId();
            case "end_db_seq_id":
                return getEndDbSeqId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _pdbx_struct_ref_seq_feature.feature_id in
     * the STRUCT_REF_SEQ_FEATURE  category.
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return delegate.getColumn("feature_id", DelegatingIntColumn::new);
    }

    /**
     * This uniquely identifies the a property of a sequence feature in
     * the STRUCT_REF_SEQ_FEATURE_PROPx  category.
     * @return IntColumn
     */
    public IntColumn getPropertyId() {
        return delegate.getColumn("property_id", DelegatingIntColumn::new);
    }

    /**
     * Property type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Property value.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return delegate.getColumn("value", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the property value pair.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The begining monomer type found at the starting  position
     * in the referenced database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getBegDbMonId() {
        return delegate.getColumn("beg_db_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The terminal monomer type found at the ending position
     * in the referenced database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getEndDbMonId() {
        return delegate.getColumn("end_db_mon_id", DelegatingStrColumn::new);
    }

    /**
     * The begining monomer sequence  position
     * in the referenced database entry.
     * @return IntColumn
     */
    public IntColumn getBegDbSeqId() {
        return delegate.getColumn("beg_db_seq_id", DelegatingIntColumn::new);
    }

    /**
     * The terminal monomer sequence position
     * in the referenced database entry.
     * @return IntColumn
     */
    public IntColumn getEndDbSeqId() {
        return delegate.getColumn("end_db_seq_id", DelegatingIntColumn::new);
    }

}