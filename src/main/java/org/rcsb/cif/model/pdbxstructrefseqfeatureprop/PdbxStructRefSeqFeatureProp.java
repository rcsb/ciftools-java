package org.rcsb.cif.model.pdbxstructrefseqfeatureprop;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructRefSeqFeatureProp extends BaseCategory {
    public PdbxStructRefSeqFeatureProp(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructRefSeqFeatureProp(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructRefSeqFeatureProp(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _pdbx_struct_ref_seq_feature.feature_id in
     * the STRUCT_REF_SEQ_FEATURE  category.
     * @return FeatureId
     */
    public FeatureId getFeatureId() {
        return (FeatureId) (isText ? textFields.computeIfAbsent("feature_id",
                FeatureId::new) : getBinaryColumn("feature_id"));
    }

    /**
     * This uniquely identifies the a property of a sequence feature in
     * the STRUCT_REF_SEQ_FEATURE_PROPx  category.
     * @return PropertyId
     */
    public PropertyId getPropertyId() {
        return (PropertyId) (isText ? textFields.computeIfAbsent("property_id",
                PropertyId::new) : getBinaryColumn("property_id"));
    }

    /**
     * Property type.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * Property value.
     * @return Value
     */
    public Value getValue() {
        return (Value) (isText ? textFields.computeIfAbsent("value",
                Value::new) : getBinaryColumn("value"));
    }

    /**
     * A description of special aspects of the property value pair.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The begining monomer type found at the starting  position
     * in the referenced database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return BegDbMonId
     */
    public BegDbMonId getBegDbMonId() {
        return (BegDbMonId) (isText ? textFields.computeIfAbsent("beg_db_mon_id",
                BegDbMonId::new) : getBinaryColumn("beg_db_mon_id"));
    }

    /**
     * The terminal monomer type found at the ending position
     * in the referenced database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return EndDbMonId
     */
    public EndDbMonId getEndDbMonId() {
        return (EndDbMonId) (isText ? textFields.computeIfAbsent("end_db_mon_id",
                EndDbMonId::new) : getBinaryColumn("end_db_mon_id"));
    }

    /**
     * The begining monomer sequence  position
     * in the referenced database entry.
     * @return BegDbSeqId
     */
    public BegDbSeqId getBegDbSeqId() {
        return (BegDbSeqId) (isText ? textFields.computeIfAbsent("beg_db_seq_id",
                BegDbSeqId::new) : getBinaryColumn("beg_db_seq_id"));
    }

    /**
     * The terminal monomer sequence position
     * in the referenced database entry.
     * @return EndDbSeqId
     */
    public EndDbSeqId getEndDbSeqId() {
        return (EndDbSeqId) (isText ? textFields.computeIfAbsent("end_db_seq_id",
                EndDbSeqId::new) : getBinaryColumn("end_db_seq_id"));
    }
}
