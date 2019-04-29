package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
 * mechanism for identifying and annotating sequence features.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxStructRefSeqFeature extends BaseCategory {
    public PdbxStructRefSeqFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxStructRefSeqFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxStructRefSeqFeature(String name) {
        super(name);
    }

    /**
     * Uniquely identfies a sequence feature in
     * the STRUCT_REF_SEQ_FEATURE  category.
     * @return SingleRowIntColumn
     */
    public SingleRowIntColumn getFeatureId() {
        return (SingleRowIntColumn) (isText ? textFields.computeIfAbsent("feature_id", SingleRowIntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * This data item is a pointer to _struct_ref_seq.align_id in
     * the STRUCT_REF_SEQ  category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAlignId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("align_id", SingleRowStrColumn::new) :
                getBinaryColumn("align_id"));
    }

    /**
     * A classification of the feature
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getType() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("type", SingleRowStrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A description of special aspects of the feature
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * PDB strand/chain id.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getPdbStrandId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("pdb_strand_id", SingleRowStrColumn::new) :
                getBinaryColumn("pdb_strand_id"));
    }

    /**
     * Instance identifier for the polymer molecule.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getAsymId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("asym_id", SingleRowStrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * 
     * Initial position in the PDB sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBegAuthSeqId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", SingleRowStrColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * 
     * Ending position in the PDB sequence segment
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEndAuthSeqId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", SingleRowStrColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * 
     * Initial position in the sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBegSeqNum() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("beg_seq_num", SingleRowStrColumn::new) :
                getBinaryColumn("beg_seq_num"));
    }

    /**
     * 
     * Ending position in the sequence segment
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEndSeqNum() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("end_seq_num", SingleRowStrColumn::new) :
                getBinaryColumn("end_seq_num"));
    }

    /**
     * 
     * Monomer ID at the initial position in the PDB sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBegAuthMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("beg_auth_mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("beg_auth_mon_id"));
    }

    /**
     * 
     * Monomer ID at the terminal position in the PDB sequence segment
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEndAuthMonId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("end_auth_mon_id", SingleRowStrColumn::new) :
                getBinaryColumn("end_auth_mon_id"));
    }

    /**
     * 
     * Initial insertion code of the PDB sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBegPdbInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("beg_pdb_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("beg_pdb_ins_code"));
    }

    /**
     * 
     * Terminal insertion code of the PDB sequence segment.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEndPdbInsCode() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("end_pdb_ins_code", SingleRowStrColumn::new) :
                getBinaryColumn("end_pdb_ins_code"));
    }
}
