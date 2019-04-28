package org.rcsb.cif.model.generated.pdbxreferenceentitysequence;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_reference_entity_sequence.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return RefEntityId
     */
    public RefEntityId getRefEntityId() {
        return (RefEntityId) (isText ? textFields.computeIfAbsent("ref_entity_id",
                RefEntityId::new) : getBinaryColumn("ref_entity_id"));
    }

    /**
     * The monomer type for the sequence.
     * @return Type
     */
    public Type getType() {
        return (Type) (isText ? textFields.computeIfAbsent("type",
                Type::new) : getBinaryColumn("type"));
    }

    /**
     * A flag to indicate a non-ribosomal entity.
     * @return NRPFlag
     */
    public NRPFlag getNRPFlag() {
        return (NRPFlag) (isText ? textFields.computeIfAbsent("NRP_flag",
                NRPFlag::new) : getBinaryColumn("NRP_flag"));
    }

    /**
     * The one-letter-code sequence for this entity.  Non-standard monomers are represented as 'X'.
     * @return OneLetterCodes
     */
    public OneLetterCodes getOneLetterCodes() {
        return (OneLetterCodes) (isText ? textFields.computeIfAbsent("one_letter_codes",
                OneLetterCodes::new) : getBinaryColumn("one_letter_codes"));
    }
}
