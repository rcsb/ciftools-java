package org.rcsb.cif.model.entitypoly;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.schema.Schema")
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
     * The type of the polymer.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
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
}
