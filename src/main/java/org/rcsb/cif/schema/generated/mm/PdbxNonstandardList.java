package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The information in this category is exclusively used to store
 * the HET records of a PDB file.  This record will be generated
 * by the PROGRAM.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNonstandardList extends DelegatingCategory {
    public PdbxNonstandardList(Category delegate) {
        super(delegate);
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * 
     * Chain id of the nonstandard group used by the author.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * 
     * Residue number of the nonstandard group used by the
     * author.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId() {
        return delegate.getColumn("auth_seq_id", DelegatingStrColumn::new);
    }

    /**
     * Chain ID of het group.
     * @return StrColumn
     */
    public StrColumn getLabelAsymId() {
        return delegate.getColumn("label_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Residue number of het group.
     * @return StrColumn
     */
    public StrColumn getLabelSeqNum() {
        return delegate.getColumn("label_seq_num", DelegatingStrColumn::new);
    }

    /**
     * Residue id of het group.
     * @return IntColumn
     */
    public IntColumn getLabelSeqId() {
        return delegate.getColumn("label_seq_id", DelegatingIntColumn::new);
    }

    /**
     * Insertion code of het group.
     * @return StrColumn
     */
    public StrColumn getInsCode() {
        return delegate.getColumn("ins_code", DelegatingStrColumn::new);
    }

    /**
     * The number of non-hydrogen atoms in the het group.
     * @return IntColumn
     */
    public IntColumn getNumberAtomsNh() {
        return delegate.getColumn("number_atoms_nh", DelegatingIntColumn::new);
    }
}
