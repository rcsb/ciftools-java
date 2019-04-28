package org.rcsb.cif.model.generated.pdbxprereleaseseq;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPrereleaseSeq extends BaseCategory {
    public PdbxPrereleaseSeq(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPrereleaseSeq(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPrereleaseSeq(String name) {
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
     * Chemical sequence expressed as string of one-letter
     * amino acid codes.
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
     * @return SeqOneLetterCode
     */
    public SeqOneLetterCode getSeqOneLetterCode() {
        return (SeqOneLetterCode) (isText ? textFields.computeIfAbsent("seq_one_letter_code",
                SeqOneLetterCode::new) : getBinaryColumn("seq_one_letter_code"));
    }
}
