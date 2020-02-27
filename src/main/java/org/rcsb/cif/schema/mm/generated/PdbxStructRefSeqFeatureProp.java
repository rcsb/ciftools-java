package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE_PROP category provide a
 * mechanism for identifying and annotating properties of sequence features.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * This uniquely identifies the a property of a sequence feature in
     * the STRUCT_REF_SEQ_FEATURE_PROPx  category.
     * @return IntColumn
     */
    public IntColumn getPropertyId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("property_id", IntColumn::new) :
                getBinaryColumn("property_id"));
    }

    /**
     * Property type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Property value.
     * @return StrColumn
     */
    public StrColumn getValue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("value", StrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * A description of special aspects of the property value pair.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_db_mon_id", StrColumn::new) :
                getBinaryColumn("beg_db_mon_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_db_mon_id", StrColumn::new) :
                getBinaryColumn("end_db_mon_id"));
    }

    /**
     * The begining monomer sequence  position
     * in the referenced database entry.
     * @return IntColumn
     */
    public IntColumn getBegDbSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_db_seq_id", IntColumn::new) :
                getBinaryColumn("beg_db_seq_id"));
    }

    /**
     * The terminal monomer sequence position
     * in the referenced database entry.
     * @return IntColumn
     */
    public IntColumn getEndDbSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_db_seq_id", IntColumn::new) :
                getBinaryColumn("end_db_seq_id"));
    }
}
