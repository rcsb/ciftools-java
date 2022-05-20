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
     * Sequence of protein or nucleic acid polymer in standard one-letter
     * codes of amino acids or nucleotides. Non-standard amino
     * acids/nucleotides are represented by their Chemical
     * Component Dictionary (CCD) codes in
     * parenthesis. Deoxynucleotides are represented by the
     * specially-assigned 2-letter CCD codes in parenthesis,
     * with 'D' prefix added to their ribonucleotide
     * counterparts. For hybrid polymer, each residue is
     * represented by the code of its individual type. A
     * cyclic polymer is represented in linear sequence from
     * the chosen start to end.
     * 
     * A for Alanine or Adenosine-5'-monophosphate
     * C for Cysteine or Cytidine-5'-monophosphate
     * D for Aspartic acid
     * E for Glutamic acid
     * F for Phenylalanine
     * G for Glycine or Guanosine-5'-monophosphate
     * H for Histidine
     * I for Isoleucine or Inosinic Acid
     * L for Leucine
     * K for Lysine
     * M for Methionine
     * N for Asparagine  or Unknown ribonucleotide
     * O for Pyrrolysine
     * P for Proline
     * Q for Glutamine
     * R for Arginine
     * S for Serine
     * T for Threonine
     * U for Selenocysteine or Uridine-5'-monophosphate
     * V for Valine
     * W for Tryptophan
     * Y for Tyrosine
     * (DA) for 2'-deoxyadenosine-5'-monophosphate
     * (DC) for 2'-deoxycytidine-5'-monophosphate
     * (DG) for 2'-deoxyguanosine-5'-monophosphate
     * (DT) for Thymidine-5'-monophosphate
     * (MSE) for Selenomethionine
     * (SEP) for Phosphoserine
     * (PTO) for Phosphothreonine
     * (PTR) for Phosphotyrosine
     * (PCA) for Pyroglutamic acid
     * (UNK) for Unknown amino acid
     * (ACE) for Acetylation cap
     * (NH2) for Amidation cap
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCode() {
        return delegate.getColumn("pdbx_seq_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Canonical sequence of protein or nucleic acid polymer in standard
     * one-letter codes of amino acids or nucleotides,
     * corresponding to the sequence in
     * _entity_poly.pdbx_seq_one_letter_code. Non-standard
     * amino acids/nucleotides are represented by the codes of
     * their parents if parent is specified in
     * _chem_comp.mon_nstd_parent_comp_id, or by letter 'X' if
     * parent is not specified. Deoxynucleotides are
     * represented by their canonical one-letter codes of A,
     * C, G, or T.
     * 
     * For modifications with several parent amino acids,
     * all corresponding parent amino acid codes will be listed
     * (ex. chromophores).
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