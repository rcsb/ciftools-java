package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_SEQ_MAP_DEPOSITOR_INFO record the
 * details about the mapping sample and coordinate sequences.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSeqMapDepositorInfo extends DelegatingCategory {
    public PdbxSeqMapDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "auth_asym_id":
                return getAuthAsymId();
            case "one_letter_code":
                return getOneLetterCode();
            case "one_letter_code_mod":
                return getOneLetterCodeMod();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity_poly.entity_id in the ENTITY_POLY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return delegate.getColumn("auth_asym_id", DelegatingStrColumn::new);
    }

    /**
     * Coordinate sequence expressed as string of one-letter residue codes.
     * @return StrColumn
     */
    public StrColumn getOneLetterCode() {
        return delegate.getColumn("one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Coordinate sequence expressed as string of one-letter residue codes with
     * nonstandard residues expressed as 3-letter codes in parentheses.
     * @return StrColumn
     */
    public StrColumn getOneLetterCodeMod() {
        return delegate.getColumn("one_letter_code_mod", DelegatingStrColumn::new);
    }

}