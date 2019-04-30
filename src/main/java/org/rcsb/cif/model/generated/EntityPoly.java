package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_POLY category record details about the
 * polymer, such as the type of the polymer, the number of
 * monomers and whether it has nonstandard features.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer unit with chirality different from that specified in
     * _entity_poly.type.
     * @return StrColumn
     */
    public StrColumn getNstdChirality() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nstd_chirality", StrColumn::new) :
                getBinaryColumn("nstd_chirality"));
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer-to-monomer link different from that implied by
     * _entity_poly.type.
     * @return StrColumn
     */
    public StrColumn getNstdLinkage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nstd_linkage", StrColumn::new) :
                getBinaryColumn("nstd_linkage"));
    }

    /**
     * A flag to indicate whether the polymer contains at least
     * one monomer that is not considered standard.
     * @return StrColumn
     */
    public StrColumn getNstdMonomer() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("nstd_monomer", StrColumn::new) :
                getBinaryColumn("nstd_monomer"));
    }

    /**
     * The number of monomers in the polymer.
     * @return IntColumn
     */
    public IntColumn getNumberOfMonomers() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("number_of_monomers", IntColumn::new) :
                getBinaryColumn("number_of_monomers"));
    }

    /**
     * The type of the polymer.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A description of special aspects of the polymer type.
     * @return StrColumn
     */
    public StrColumn getTypeDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type_details", StrColumn::new) :
                getBinaryColumn("type_details"));
    }

    /**
     * The PDB strand/chain id(s) corresponding to this polymer entity.
     * @return StrColumn
     */
    public StrColumn getPdbxStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_strand_id", StrColumn::new) :
                getBinaryColumn("pdbx_strand_id"));
    }

    /**
     * Chemical sequence expressed as string of one-letter
     * amino acid codes. Modifications and non-standard
     * amino acids are coded as X.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code", StrColumn::new) :
                getBinaryColumn("pdbx_seq_one_letter_code"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code_can", StrColumn::new) :
                getBinaryColumn("pdbx_seq_one_letter_code_can"));
    }

    /**
     * For Structural Genomics entries, the sequence's target identifier registered at the TargetTrack database.
     * @return StrColumn
     */
    public StrColumn getPdbxTargetIdentifier() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_target_identifier", StrColumn::new) :
                getBinaryColumn("pdbx_target_identifier"));
    }

    /**
     * For cases in which the sample and model sequence differ this item contains
     * the sample chemical sequence expressed as string of one-letter amino acid codes.
     * 
     * Modified may be include as 'X' or with their 3-letter codes in parentheses.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqOneLetterCodeSample() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_one_letter_code_sample", StrColumn::new) :
                getBinaryColumn("pdbx_seq_one_letter_code_sample"));
    }

    /**
     * A flag to indicate that linking data is explicitly provided for this polymer
     * in the PDBX_ENTITY_POLY_COMP_LINK_LIST category
     * @return StrColumn
     */
    public StrColumn getPdbxExplicitLinkingFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_explicit_linking_flag", StrColumn::new) :
                getBinaryColumn("pdbx_explicit_linking_flag"));
    }

    /**
     * Evidence for the assignment of the polymer sequence.
     * @return StrColumn
     */
    public StrColumn getPdbxSequenceEvidenceCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_sequence_evidence_code", StrColumn::new) :
                getBinaryColumn("pdbx_sequence_evidence_code"));
    }

    /**
     * A code to indicate that this sequence should be assigned
     * a PDB sequence reference.
     * @return StrColumn
     */
    public StrColumn getPdbxBuildSelfReference() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_build_self_reference", StrColumn::new) :
                getBinaryColumn("pdbx_build_self_reference"));
    }

    /**
     * N-terminal cloning artifacts and/or HIS tag.
     * @return StrColumn
     */
    public StrColumn getPdbxNTerminalSeqOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_N_terminal_seq_one_letter_code", StrColumn::new) :
                getBinaryColumn("pdbx_N_terminal_seq_one_letter_code"));
    }

    /**
     * C-terminal cloning artifacts and/or HIS tag.
     * @return StrColumn
     */
    public StrColumn getPdbxCTerminalSeqOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_C_terminal_seq_one_letter_code", StrColumn::new) :
                getBinaryColumn("pdbx_C_terminal_seq_one_letter_code"));
    }

    /**
     * Chemical sequence expressed as string of three-letter
     * amino acid codes.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqThreeLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_three_letter_code", StrColumn::new) :
                getBinaryColumn("pdbx_seq_three_letter_code"));
    }

    /**
     * The name of the sequence data base containing a database entry
     * for this sequence.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_name", StrColumn::new) :
                getBinaryColumn("pdbx_seq_db_name"));
    }

    /**
     * The identifier for this sequence in the sequence data base.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqDbId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_db_id", StrColumn::new) :
                getBinaryColumn("pdbx_seq_db_id"));
    }

    /**
     * The sequence position in the database sequence at which the
     * alignment with your sequence begins.
     * @return IntColumn
     */
    public IntColumn getPdbxSeqAlignBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_align_begin", IntColumn::new) :
                getBinaryColumn("pdbx_seq_align_begin"));
    }

    /**
     * The sequence position in the database sequence at which the
     * alignment with your sequence ends.
     * @return IntColumn
     */
    public IntColumn getPdbxSeqAlignEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_align_end", IntColumn::new) :
                getBinaryColumn("pdbx_seq_align_end"));
    }
}
