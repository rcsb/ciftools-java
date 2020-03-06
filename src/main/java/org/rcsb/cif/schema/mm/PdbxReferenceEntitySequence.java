package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Additional features associated with the reference entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxReferenceEntitySequence extends DelegatingCategory {
    public PdbxReferenceEntitySequence(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "prd_id":
                return getPrdId();
            case "ref_entity_id":
                return getRefEntityId();
            case "type":
                return getType();
            case "NRP_flag":
                return getNRPFlag();
            case "one_letter_codes":
                return getOneLetterCodes();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_reference_entity_sequence.prd_id is a reference
     * _pdbx_reference_entity_list.prd_id in the  PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getPrdId() {
        return delegate.getColumn("prd_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_reference_entity_sequence.ref_entity_id is a reference
     * to _pdbx_reference_entity_list.ref_entity_id in PDBX_REFERENCE_ENTITY_LIST category.
     * @return StrColumn
     */
    public StrColumn getRefEntityId() {
        return delegate.getColumn("ref_entity_id", DelegatingStrColumn::new);
    }

    /**
     * The monomer type for the sequence.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * A flag to indicate a non-ribosomal entity.
     * @return StrColumn
     */
    public StrColumn getNRPFlag() {
        return delegate.getColumn("NRP_flag", DelegatingStrColumn::new);
    }

    /**
     * The one-letter-code sequence for this entity.  Non-standard monomers are represented as 'X'.
     * @return StrColumn
     */
    public StrColumn getOneLetterCodes() {
        return delegate.getColumn("one_letter_codes", DelegatingStrColumn::new);
    }

}