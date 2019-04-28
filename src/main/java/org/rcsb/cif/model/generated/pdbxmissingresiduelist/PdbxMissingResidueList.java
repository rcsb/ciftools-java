package org.rcsb.cif.model.generated.pdbxmissingresiduelist;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxMissingResidueList extends BaseCategory {
    public PdbxMissingResidueList(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxMissingResidueList(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxMissingResidueList(String name) {
        super(name);
    }

    /**
     * PDB model ID.
     * @return PdbModelId
     */
    public PdbModelId getPdbModelId() {
        return (PdbModelId) (isText ? textFields.computeIfAbsent("pdb_model_id",
                PdbModelId::new) : getBinaryColumn("pdb_model_id"));
    }

    /**
     * PDB chain ID.
     * @return PdbChainId
     */
    public PdbChainId getPdbChainId() {
        return (PdbChainId) (isText ? textFields.computeIfAbsent("pdb_chain_id",
                PdbChainId::new) : getBinaryColumn("pdb_chain_id"));
    }

    /**
     * PDB chain ID.
     * @return PdbResidueName
     */
    public PdbResidueName getPdbResidueName() {
        return (PdbResidueName) (isText ? textFields.computeIfAbsent("pdb_residue_name",
                PdbResidueName::new) : getBinaryColumn("pdb_residue_name"));
    }

    /**
     * PDB chain ID.
     * @return PdbResidueNumber
     */
    public PdbResidueNumber getPdbResidueNumber() {
        return (PdbResidueNumber) (isText ? textFields.computeIfAbsent("pdb_residue_number",
                PdbResidueNumber::new) : getBinaryColumn("pdb_residue_number"));
    }

    /**
     * PDB chain ID.
     * @return PdbInsertionCode
     */
    public PdbInsertionCode getPdbInsertionCode() {
        return (PdbInsertionCode) (isText ? textFields.computeIfAbsent("pdb_insertion_code",
                PdbInsertionCode::new) : getBinaryColumn("pdb_insertion_code"));
    }

    /**
     * An index in the sequence specified in category ENTITY_POLY_SEQ.
     * @return LabelSeqId
     */
    public LabelSeqId getLabelSeqId() {
        return (LabelSeqId) (isText ? textFields.computeIfAbsent("label_seq_id",
                LabelSeqId::new) : getBinaryColumn("label_seq_id"));
    }
}
