package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_POLY category record details about the
 * polymer, such as the type of the polymer, the number of
 * monomers and whether it has nonstandard features.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntityPoly extends DelegatingCategory {
    public EntityPoly(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "nstd_chirality":
                return getNstdChirality();
            case "nstd_linkage":
                return getNstdLinkage();
            case "nstd_monomer":
                return getNstdMonomer();
            case "number_of_monomers":
                return getNumberOfMonomers();
            case "type":
                return getType();
            case "type_details":
                return getTypeDetails();
            case "pdbx_strand_id":
                return getPdbxStrandId();
            case "pdbx_seq_one_letter_code":
                return getPdbxSeqOneLetterCode();
            case "pdbx_seq_one_letter_code_can":
                return getPdbxSeqOneLetterCodeCan();
            case "pdbx_target_identifier":
                return getPdbxTargetIdentifier();
            case "pdbx_seq_one_letter_code_sample":
                return getPdbxSeqOneLetterCodeSample();
            case "pdbx_explicit_linking_flag":
                return getPdbxExplicitLinkingFlag();
            case "pdbx_sequence_evidence_code":
                return getPdbxSequenceEvidenceCode();
            case "pdbx_build_self_reference":
                return getPdbxBuildSelfReference();
            case "pdbx_N_terminal_seq_one_letter_code":
                return getPdbxNTerminalSeqOneLetterCode();
            case "pdbx_C_terminal_seq_one_letter_code":
                return getPdbxCTerminalSeqOneLetterCode();
            case "pdbx_seq_three_letter_code":
                return getPdbxSeqThreeLetterCode();
            case "pdbx_seq_db_name":
                return getPdbxSeqDbName();
            case "pdbx_seq_db_id":
                return getPdbxSeqDbId();
            case "pdbx_seq_align_begin":
                return getPdbxSeqAlignBegin();
            case "pdbx_seq_align_end":
                return getPdbxSeqAlignEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer unit with chirality different from that specified in
     * _entity_poly.type.
     * @return StrColumn
     */
    public StrColumn getNstdChirality() {
        return delegate.getColumn("nstd_chirality", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer-to-monomer link different from that implied by
     * _entity_poly.type.
     * @return StrColumn
     */
    public StrColumn getNstdLinkage() {
        return delegate.getColumn("nstd_linkage", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer that is not considered standard.
     * @return StrColumn
     */
    public StrColumn getNstdMonomer() {
        return delegate.getColumn("nstd_monomer", DelegatingStrColumn::new);
    }

    /**
     * The number of monomers in the polymer.
     * @return IntColumn
     */
    public IntColumn getNumberOfMonomers() {
        return delegate.getColumn("number_of_monomers", DelegatingIntColumn::new);
    }

    /**
     * The type of the polymer.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the polymer type.
     * @return StrColumn
     */
    public StrColumn getTypeDetails() {
        return delegate.getColumn("type_details", DelegatingStrColumn::new);
    }

    /**
     * The PDB strand/chain id(s) corresponding to this polymer entity.
     * @return StrColumn
     */
    public StrColumn getPdbxStrandId() {
        return delegate.getColumn("pdbx_strand_id", DelegatingStrColumn::new);
    }

    /**
     * Chemical sequence expressed as string of one-letter
     * amino acid codes. Modifications and non-standard
     * amino acids are coded as X.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCode() {
        return delegate.getColumn("pdbx_seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Cannonical chemical sequence expressed as string of
     * one-letter amino acid codes. Modifications are coded
     * as the parent amino acid where possible.
     * 
     * A  for alanine or adenine
     * B  for ambiguous asparagine/aspartic-acid
     * R  for arginine
     * N  for asparagine
     * D  for aspartic-acid
     * C  for cysteine or cystine or cytosine
     * Q  for glutamine
     * E  for glutamic-acid
     * Z  for ambiguous glutamine/glutamic acid
     * G  for glycine or guanine
     * H  for histidine
     * I  for isoleucine
     * L  for leucine
     * K  for lysine
     * M  for methionine
     * F  for phenylalanine
     * P  for proline
     * S  for serine
     * T  for threonine or thymine
     * W  for tryptophan
     * Y  for tyrosine
     * V  for valine
     * U  for uracil
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCodeCan() {
        return delegate.getColumn("pdbx_seq_one_letter_code_can", DelegatingStrColumn::new);
    }

    /**
     * For Structural Genomics entries, the sequence's target identifier registered at the TargetTrack database.
     * @return StrColumn
     */
    public StrColumn getPdbxTargetIdentifier() {
        return delegate.getColumn("pdbx_target_identifier", DelegatingStrColumn::new);
    }

    /**
     * For cases in which the sample and model sequence differ this item contains
     * the sample chemical sequence expressed as string of one-letter amino acid codes.
     * 
     * Modified may be include as 'X' or with their 3-letter codes in parentheses.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCodeSample() {
        return delegate.getColumn("pdbx_seq_one_letter_code_sample", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate that linking data is explicitly provided for this polymer
     * in the PDBX_ENTITY_POLY_COMP_LINK_LIST category
     * @return StrColumn
     */
    public StrColumn getPdbxExplicitLinkingFlag() {
        return delegate.getColumn("pdbx_explicit_linking_flag", DelegatingStrColumn::new);
    }

    /**
     * Evidence for the assignment of the polymer sequence.
     * @return StrColumn
     */
    public StrColumn getPdbxSequenceEvidenceCode() {
        return delegate.getColumn("pdbx_sequence_evidence_code", DelegatingStrColumn::new);
    }

    /**
     * A code to indicate that this sequence should be assigned
     * a PDB sequence reference.
     * @return StrColumn
     */
    public StrColumn getPdbxBuildSelfReference() {
        return delegate.getColumn("pdbx_build_self_reference", DelegatingStrColumn::new);
    }

    /**
     * N-terminal cloning artifacts and/or HIS tag.
     * @return StrColumn
     */
    public StrColumn getPdbxNTerminalSeqOneLetterCode() {
        return delegate.getColumn("pdbx_N_terminal_seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * C-terminal cloning artifacts and/or HIS tag.
     * @return StrColumn
     */
    public StrColumn getPdbxCTerminalSeqOneLetterCode() {
        return delegate.getColumn("pdbx_C_terminal_seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Chemical sequence expressed as string of three-letter
     * amino acid codes.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqThreeLetterCode() {
        return delegate.getColumn("pdbx_seq_three_letter_code", DelegatingStrColumn::new);
    }

    /**
     * The name of the sequence data base containing a database entry
     * for this sequence.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbName() {
        return delegate.getColumn("pdbx_seq_db_name", DelegatingStrColumn::new);
    }

    /**
     * The identifier for this sequence in the sequence data base.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbId() {
        return delegate.getColumn("pdbx_seq_db_id", DelegatingStrColumn::new);
    }

    /**
     * The sequence position in the database sequence at which the
     * alignment with your sequence begins.
     * @return IntColumn
     */
    public IntColumn getPdbxSeqAlignBegin() {
        return delegate.getColumn("pdbx_seq_align_begin", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the database sequence at which the
     * alignment with your sequence ends.
     * @return IntColumn
     */
    public IntColumn getPdbxSeqAlignEnd() {
        return delegate.getColumn("pdbx_seq_align_end", DelegatingIntColumn::new);
    }

}