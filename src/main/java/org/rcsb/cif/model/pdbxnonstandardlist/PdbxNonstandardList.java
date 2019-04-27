package org.rcsb.cif.model.pdbxnonstandardlist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNonstandardList extends BaseCategory {
    public PdbxNonstandardList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNonstandardList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNonstandardList(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_nonstandard_list.id must uniquely identify each item in
     * the PDBX_NONSTANDARD_LIST list.
     * 
     * For protein polymer entities, this is the three-letter code for
     * amino acids.
     * 
     * For nucleic acid polymer entities, this is the one-letter code
     * for the bases.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * 
     * Chain id of the nonstandard group used by the author.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * 
     * Residue number of the nonstandard group used by the
     * author.
     * @return AuthSeqId
     */
    public AuthSeqId getAuthSeqId() {
        return (AuthSeqId) (isText ? textFields.computeIfAbsent("auth_seq_id",
                AuthSeqId::new) : getBinaryColumn("auth_seq_id"));
    }

    /**
     * Chain ID of het group.
     * @return LabelAsymId
     */
    public LabelAsymId getLabelAsymId() {
        return (LabelAsymId) (isText ? textFields.computeIfAbsent("label_asym_id",
                LabelAsymId::new) : getBinaryColumn("label_asym_id"));
    }

    /**
     * Residue number of het group.
     * @return LabelSeqNum
     */
    public LabelSeqNum getLabelSeqNum() {
        return (LabelSeqNum) (isText ? textFields.computeIfAbsent("label_seq_num",
                LabelSeqNum::new) : getBinaryColumn("label_seq_num"));
    }

    /**
     * Residue id of het group.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }

    /**
     * Insertion code of het group.
     * @return InsCode
     */
    public InsCode getInsCode() {
        return (InsCode) (isText ? textFields.computeIfAbsent("ins_code",
                InsCode::new) : getBinaryColumn("ins_code"));
    }

    /**
     * The number of non-hydrogen atoms in the het group.
     * @return NumberAtomsNh
     */
    public NumberAtomsNh getNumberAtomsNh() {
        return (NumberAtomsNh) (isText ? textFields.computeIfAbsent("number_atoms_nh",
                NumberAtomsNh::new) : getBinaryColumn("number_atoms_nh"));
    }
}
