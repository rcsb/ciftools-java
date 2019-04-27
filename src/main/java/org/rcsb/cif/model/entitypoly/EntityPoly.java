package org.rcsb.cif.model.entitypoly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntityPoly extends BaseCategory {
    public EntityPoly(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntityPoly(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntityPoly(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer unit with chirality different from that specified in
     * _entity_poly.type.
     * @return NstdChirality
     */
    public NstdChirality getNstdChirality() {
        return (NstdChirality) (isText ? textFields.computeIfAbsent("nstd_chirality",
                NstdChirality::new) : getBinaryColumn("nstd_chirality"));
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer-to-monomer link different from that implied by
     * _entity_poly.type.
     * @return NstdLinkage
     */
    public NstdLinkage getNstdLinkage() {
        return (NstdLinkage) (isText ? textFields.computeIfAbsent("nstd_linkage",
                NstdLinkage::new) : getBinaryColumn("nstd_linkage"));
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer that is not considered standard.
     * @return NstdMonomer
     */
    public NstdMonomer getNstdMonomer() {
        return (NstdMonomer) (isText ? textFields.computeIfAbsent("nstd_monomer",
                NstdMonomer::new) : getBinaryColumn("nstd_monomer"));
    }

    /**
     * The number of monomers in the polymer.
     * @return NumberOfMonomers
     */
    public NumberOfMonomers getNumberOfMonomers() {
        return (NumberOfMonomers) (isText ? textFields.computeIfAbsent("number_of_monomers",
                NumberOfMonomers::new) : getBinaryColumn("number_of_monomers"));
    }

    /**
     * The type of the polymer.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A description of special aspects of the polymer type.
     * @return TypeDetails
     */
    public TypeDetails getTypeDetails() {
        return (TypeDetails) (isText ? textFields.computeIfAbsent("type_details",
                TypeDetails::new) : getBinaryColumn("type_details"));
    }

    /**
     * The PDB strand/chain id(s) corresponding to this polymer entity.
     * @return PdbxStrandId
     */
    public PdbxStrandId getPdbxStrandId() {
        return (PdbxStrandId) (isText ? textFields.computeIfAbsent("pdbx_strand_id",
                PdbxStrandId::new) : getBinaryColumn("pdbx_strand_id"));
    }

    /**
     * Chemical sequence expressed as string of one-letter
     * amino acid codes. Modifications and non-standard
     * amino acids are coded as X.
     * @return PdbxSeqOneLetterCode
     */
    public PdbxSeqOneLetterCode getPdbxSeqOneLetterCode() {
        return (PdbxSeqOneLetterCode) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code",
                PdbxSeqOneLetterCode::new) : getBinaryColumn("pdbx_seq_one_letter_code"));
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
     * @return PdbxSeqOneLetterCodeCan
     */
    public PdbxSeqOneLetterCodeCan getPdbxSeqOneLetterCodeCan() {
        return (PdbxSeqOneLetterCodeCan) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code_can",
                PdbxSeqOneLetterCodeCan::new) : getBinaryColumn("pdbx_seq_one_letter_code_can"));
    }

    /**
     * For Structural Genomics entries, the sequence's target identifier registered at the TargetTrack database.
     * @return PdbxTargetIdentifier
     */
    public PdbxTargetIdentifier getPdbxTargetIdentifier() {
        return (PdbxTargetIdentifier) (isText ? textFields.computeIfAbsent("pdbx_target_identifier",
                PdbxTargetIdentifier::new) : getBinaryColumn("pdbx_target_identifier"));
    }

    /**
     * For cases in which the sample and model sequence differ this item contains
     * the sample chemical sequence expressed as string of one-letter amino acid codes.
     * 
     * Modified may be include as 'X' or with their 3-letter codes in parentheses.
     * @return PdbxSeqOneLetterCodeSample
     */
    public PdbxSeqOneLetterCodeSample getPdbxSeqOneLetterCodeSample() {
        return (PdbxSeqOneLetterCodeSample) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code_sample",
                PdbxSeqOneLetterCodeSample::new) : getBinaryColumn("pdbx_seq_one_letter_code_sample"));
    }

    /**
     * A flag to indicate that linking data is explicitly provided for this polymer
     * in the PDBX_ENTITY_POLY_COMP_LINK_LIST category
     * @return PdbxExplicitLinkingFlag
     */
    public PdbxExplicitLinkingFlag getPdbxExplicitLinkingFlag() {
        return (PdbxExplicitLinkingFlag) (isText ? textFields.computeIfAbsent("pdbx_explicit_linking_flag",
                PdbxExplicitLinkingFlag::new) : getBinaryColumn("pdbx_explicit_linking_flag"));
    }

    /**
     * Evidence for the assignment of the polymer sequence.
     * @return PdbxSequenceEvidenceCode
     */
    public PdbxSequenceEvidenceCode getPdbxSequenceEvidenceCode() {
        return (PdbxSequenceEvidenceCode) (isText ? textFields.computeIfAbsent("pdbx_sequence_evidence_code",
                PdbxSequenceEvidenceCode::new) : getBinaryColumn("pdbx_sequence_evidence_code"));
    }

    /**
     * A code to indicate that this sequence should be assigned
     * a PDB sequence reference.
     * @return PdbxBuildSelfReference
     */
    public PdbxBuildSelfReference getPdbxBuildSelfReference() {
        return (PdbxBuildSelfReference) (isText ? textFields.computeIfAbsent("pdbx_build_self_reference",
                PdbxBuildSelfReference::new) : getBinaryColumn("pdbx_build_self_reference"));
    }

    /**
     * N-terminal cloning artifacts and/or HIS tag.
     * @return PdbxNTerminalSeqOneLetterCode
     */
    public PdbxNTerminalSeqOneLetterCode getPdbxNTerminalSeqOneLetterCode() {
        return (PdbxNTerminalSeqOneLetterCode) (isText ? textFields.computeIfAbsent("pdbx_N_terminal_seq_one_letter_code",
                PdbxNTerminalSeqOneLetterCode::new) : getBinaryColumn("pdbx_N_terminal_seq_one_letter_code"));
    }

    /**
     * C-terminal cloning artifacts and/or HIS tag.
     * @return PdbxCTerminalSeqOneLetterCode
     */
    public PdbxCTerminalSeqOneLetterCode getPdbxCTerminalSeqOneLetterCode() {
        return (PdbxCTerminalSeqOneLetterCode) (isText ? textFields.computeIfAbsent("pdbx_C_terminal_seq_one_letter_code",
                PdbxCTerminalSeqOneLetterCode::new) : getBinaryColumn("pdbx_C_terminal_seq_one_letter_code"));
    }

    /**
     * Chemical sequence expressed as string of three-letter
     * amino acid codes.
     * @return PdbxSeqThreeLetterCode
     */
    public PdbxSeqThreeLetterCode getPdbxSeqThreeLetterCode() {
        return (PdbxSeqThreeLetterCode) (isText ? textFields.computeIfAbsent("pdbx_seq_three_letter_code",
                PdbxSeqThreeLetterCode::new) : getBinaryColumn("pdbx_seq_three_letter_code"));
    }

    /**
     * The name of the sequence data base containing a database entry
     * for this sequence.
     * @return PdbxSeqDbName
     */
    public PdbxSeqDbName getPdbxSeqDbName() {
        return (PdbxSeqDbName) (isText ? textFields.computeIfAbsent("pdbx_seq_db_name",
                PdbxSeqDbName::new) : getBinaryColumn("pdbx_seq_db_name"));
    }

    /**
     * The identifier for this sequence in the sequence data base.
     * @return PdbxSeqDbId
     */
    public PdbxSeqDbId getPdbxSeqDbId() {
        return (PdbxSeqDbId) (isText ? textFields.computeIfAbsent("pdbx_seq_db_id",
                PdbxSeqDbId::new) : getBinaryColumn("pdbx_seq_db_id"));
    }

    /**
     * The sequence position in the database sequence at which the
     * alignment with your sequence begins.
     * @return PdbxSeqAlignBegin
     */
    public PdbxSeqAlignBegin getPdbxSeqAlignBegin() {
        return (PdbxSeqAlignBegin) (isText ? textFields.computeIfAbsent("pdbx_seq_align_begin",
                PdbxSeqAlignBegin::new) : getBinaryColumn("pdbx_seq_align_begin"));
    }

    /**
     * The sequence position in the database sequence at which the
     * alignment with your sequence ends.
     * @return PdbxSeqAlignEnd
     */
    public PdbxSeqAlignEnd getPdbxSeqAlignEnd() {
        return (PdbxSeqAlignEnd) (isText ? textFields.computeIfAbsent("pdbx_seq_align_end",
                PdbxSeqAlignEnd::new) : getBinaryColumn("pdbx_seq_align_end"));
    }
}
