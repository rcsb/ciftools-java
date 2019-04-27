package org.rcsb.cif.model.pdbxstructrefseqfeature;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return FeatureId
     */
    public FeatureId getFeatureId() {
        return (FeatureId) (isText ? textFields.computeIfAbsent("feature_id",
                FeatureId::new) : getBinaryColumn("feature_id"));
    }

    /**
     * This data item is a pointer to _struct_ref_seq.align_id in
     * the STRUCT_REF_SEQ  category.
     * @return AlignId
     */
    public AlignId getAlignId() {
        return (AlignId) (isText ? textFields.computeIfAbsent("align_id",
                AlignId::new) : getBinaryColumn("align_id"));
    }

    /**
     * A classification of the feature
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A description of special aspects of the feature
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * PDB strand/chain id.
     * @return PdbStrandId
     */
    public PdbStrandId getPdbStrandId() {
        return (PdbStrandId) (isText ? textFields.computeIfAbsent("pdb_strand_id",
                PdbStrandId::new) : getBinaryColumn("pdb_strand_id"));
    }

    /**
     * Instance identifier for the polymer molecule.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }

    /**
     * 
     * Initial position in the PDB sequence segment.
     * @return BegAuthSeqId
     */
    public BegAuthSeqId getBegAuthSeqId() {
        return (BegAuthSeqId) (isText ? textFields.computeIfAbsent("beg_auth_seq_id",
                BegAuthSeqId::new) : getBinaryColumn("beg_auth_seq_id"));
    }

    /**
     * 
     * Ending position in the PDB sequence segment
     * @return EndAuthSeqId
     */
    public EndAuthSeqId getEndAuthSeqId() {
        return (EndAuthSeqId) (isText ? textFields.computeIfAbsent("end_auth_seq_id",
                EndAuthSeqId::new) : getBinaryColumn("end_auth_seq_id"));
    }

    /**
     * 
     * Initial position in the sequence segment.
     * @return BegSeqNum
     */
    public BegSeqNum getBegSeqNum() {
        return (BegSeqNum) (isText ? textFields.computeIfAbsent("beg_seq_num",
                BegSeqNum::new) : getBinaryColumn("beg_seq_num"));
    }

    /**
     * 
     * Ending position in the sequence segment
     * @return EndSeqNum
     */
    public EndSeqNum getEndSeqNum() {
        return (EndSeqNum) (isText ? textFields.computeIfAbsent("end_seq_num",
                EndSeqNum::new) : getBinaryColumn("end_seq_num"));
    }

    /**
     * 
     * Monomer ID at the initial position in the PDB sequence segment.
     * @return BegAuthMonId
     */
    public BegAuthMonId getBegAuthMonId() {
        return (BegAuthMonId) (isText ? textFields.computeIfAbsent("beg_auth_mon_id",
                BegAuthMonId::new) : getBinaryColumn("beg_auth_mon_id"));
    }

    /**
     * 
     * Monomer ID at the terminal position in the PDB sequence segment
     * @return EndAuthMonId
     */
    public EndAuthMonId getEndAuthMonId() {
        return (EndAuthMonId) (isText ? textFields.computeIfAbsent("end_auth_mon_id",
                EndAuthMonId::new) : getBinaryColumn("end_auth_mon_id"));
    }

    /**
     * 
     * Initial insertion code of the PDB sequence segment.
     * @return BegPdbInsCode
     */
    public BegPdbInsCode getBegPdbInsCode() {
        return (BegPdbInsCode) (isText ? textFields.computeIfAbsent("beg_pdb_ins_code",
                BegPdbInsCode::new) : getBinaryColumn("beg_pdb_ins_code"));
    }

    /**
     * 
     * Terminal insertion code of the PDB sequence segment.
     * @return EndPdbInsCode
     */
    public EndPdbInsCode getEndPdbInsCode() {
        return (EndPdbInsCode) (isText ? textFields.computeIfAbsent("end_pdb_ins_code",
                EndPdbInsCode::new) : getBinaryColumn("end_pdb_ins_code"));
    }
}
