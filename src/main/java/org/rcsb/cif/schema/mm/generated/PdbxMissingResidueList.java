package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Provides a place-holder for PDB REMARK 465 data.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getPdbModelId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdb_model_id", IntColumn::new) :
                getBinaryColumn("pdb_model_id"));
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_chain_id", StrColumn::new) :
                getBinaryColumn("pdb_chain_id"));
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbResidueName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_residue_name", StrColumn::new) :
                getBinaryColumn("pdb_residue_name"));
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbResidueNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_residue_number", StrColumn::new) :
                getBinaryColumn("pdb_residue_number"));
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbInsertionCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdb_insertion_code", StrColumn::new) :
                getBinaryColumn("pdb_insertion_code"));
    }

    /**
     * An index in the sequence specified in category ENTITY_POLY_SEQ.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("label_seq_id", IntColumn::new) :
                getBinaryColumn("label_seq_id"));
    }
}
