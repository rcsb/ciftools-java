package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_STRUCT_REF_SEQ_FEATURE category provide a
 * mechanism for identifying and annotating sequence features.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getFeatureId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("feature_id", IntColumn::new) :
                getBinaryColumn("feature_id"));
    }

    /**
     * This data item is a pointer to _struct_ref_seq.align_id in
     * the STRUCT_REF_SEQ  category.
     * @return StrColumn
     */
    public StrColumn getAlignId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("align_id", StrColumn::new) :
                getBinaryColumn("align_id"));
    }

    /**
     * A classification of the feature
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A description of special aspects of the feature
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * PDB strand/chain id.
     * @return StrColumn
     */
    public StrColumn getPdbStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_strand_id", StrColumn::new) :
                getBinaryColumn("pdb_strand_id"));
    }

    /**
     * Instance identifier for the polymer molecule.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }

    /**
     * 
     * Initial position in the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_seq_id", StrColumn::new) :
                getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * 
     * Ending position in the PDB sequence segment
     * @return StrColumn
     */
    public StrColumn getEndAuthSeqId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_seq_id", StrColumn::new) :
                getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * 
     * Initial position in the sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_seq_num", StrColumn::new) :
                getBinaryColumn("beg_seq_num"));
    }

    /**
     * 
     * Ending position in the sequence segment
     * @return StrColumn
     */
    public StrColumn getEndSeqNum() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_seq_num", StrColumn::new) :
                getBinaryColumn("end_seq_num"));
    }

    /**
     * 
     * Monomer ID at the initial position in the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegAuthMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_auth_mon_id", StrColumn::new) :
                getBinaryColumn("beg_auth_mon_id"));
    }

    /**
     * 
     * Monomer ID at the terminal position in the PDB sequence segment
     * @return StrColumn
     */
    public StrColumn getEndAuthMonId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_auth_mon_id", StrColumn::new) :
                getBinaryColumn("end_auth_mon_id"));
    }

    /**
     * 
     * Initial insertion code of the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getBegPdbInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("beg_pdb_ins_code", StrColumn::new) :
                getBinaryColumn("beg_pdb_ins_code"));
    }

    /**
     * 
     * Terminal insertion code of the PDB sequence segment.
     * @return StrColumn
     */
    public StrColumn getEndPdbInsCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_pdb_ins_code", StrColumn::new) :
                getBinaryColumn("end_pdb_ins_code"));
    }
}
