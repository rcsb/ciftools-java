package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Additional features associated with the reference entity.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxReferenceEntitySequence extends BaseCategory {
    public PdbxReferenceEntitySequence(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxReferenceEntitySequence(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxReferenceEntitySequence(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_reference_entity_sequence.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the  PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("prd_id", StrColumn::new) :
                getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_sequence.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ref_entity_id", StrColumn::new) :
                getBinaryColumn("ref_entity_id"));
    }

    /**
     * The monomer type for the sequence.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * A flag to indicate a non-ribosomal entity.
     * @return StrColumn
     */
    public StrColumn getNRPFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("NRP_flag", StrColumn::new) :
                getBinaryColumn("NRP_flag"));
    }

    /**
     * The one-letter-code sequence for this entity.  Non-standard monomers are represented as 'X'.
     * @return StrColumn
     */
    public StrColumn getOneLetterCodes() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("one_letter_codes", StrColumn::new) :
                getBinaryColumn("one_letter_codes"));
    }
}
