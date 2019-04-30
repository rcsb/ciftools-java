package org.rcsb.cif.model.generated;

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
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFeatureId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("feature_id", SingleRowIntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * This uniquely identifies the a property of a sequence feature in
     * the STRUCT_REF_SEQ_FEATURE_PROPx  category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getPropertyId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("property_id", SingleRowIntColumn::new) :
                getBinaryColumn("property_id"));
    }

    /**
     * Property type.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Property value.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getValue() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("value", SingleRowStrColumn::new) :
                getBinaryColumn("value"));
    }

    /**
     * A description of special aspects of the property value pair.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The begining monomer type found at the starting  position
     * in the referenced database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBegDbMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("beg_db_mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("beg_db_mon_id"));
    }

    /**
     * The terminal monomer type found at the ending position
     * in the referenced database entry.
     * 
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEndDbMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("end_db_mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("end_db_mon_id"));
    }

    /**
     * The begining monomer sequence  position
     * in the referenced database entry.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getBegDbSeqId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("beg_db_seq_id", SingleRowIntColumn::new) :
                getBinaryColumn("beg_db_seq_id"));
    }

    /**
     * The terminal monomer sequence position
     * in the referenced database entry.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getEndDbSeqId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("end_db_seq_id", SingleRowIntColumn::new) :
                getBinaryColumn("end_db_seq_id"));
    }
}
