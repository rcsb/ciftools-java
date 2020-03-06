package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Provides a place-holder for PDB REMARK 465 data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxMissingResidueList extends DelegatingCategory {
    public PdbxMissingResidueList(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdb_model_id":
                return getPdbModelId();
            case "pdb_chain_id":
                return getPdbChainId();
            case "pdb_residue_name":
                return getPdbResidueName();
            case "pdb_residue_number":
                return getPdbResidueNumber();
            case "pdb_insertion_code":
                return getPdbInsertionCode();
            case "label_seq_id":
                return getLabelSeqId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * PDB model ID.
     * @return IntColumn
     */
    public IntColumn getPdbModelId() {
        return delegate.getColumn("pdb_model_id", DelegatingIntColumn::new);
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return delegate.getColumn("pdb_chain_id", DelegatingStrColumn::new);
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbResidueName() {
        return delegate.getColumn("pdb_residue_name", DelegatingStrColumn::new);
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbResidueNumber() {
        return delegate.getColumn("pdb_residue_number", DelegatingStrColumn::new);
    }

    /**
     * PDB chain ID.
     * @return StrColumn
     */
    public StrColumn getPdbInsertionCode() {
        return delegate.getColumn("pdb_insertion_code", DelegatingStrColumn::new);
    }

    /**
     * An index in the sequence specified in category ENTITY_POLY_SEQ.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

}