package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category provides a placeholder for pre-release
 * sequence information.  After release this category
 * should be discarded.
 */
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
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
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
     * @return StrColumn
     */
    public StrColumn getSeqOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_one_letter_code", StrColumn::new) :
                getBinaryColumn("seq_one_letter_code"));
    }
}
