package org.rcsb.cif.model.pdbxseqmapdepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxSeqMapDepositorInfo extends BaseCategory {
    public PdbxSeqMapDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxSeqMapDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxSeqMapDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity_poly.entity_id in the ENTITY_POLY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the ATOM_SITE category.
     * @return AuthAsymId
     */
    public AuthAsymId getAuthAsymId() {
        return (AuthAsymId) (isText ? textFields.computeIfAbsent("auth_asym_id",
                AuthAsymId::new) : getBinaryColumn("auth_asym_id"));
    }

    /**
     * Coordinate sequence expressed as string of one-letter residue codes.
     * @return OneLetterCode
     */
    public OneLetterCode getOneLetterCode() {
        return (OneLetterCode) (isText ? textFields.computeIfAbsent("one_letter_code",
                OneLetterCode::new) : getBinaryColumn("one_letter_code"));
    }

    /**
     * Coordinate sequence expressed as string of one-letter residue codes with
     * nonstandard residues expressed as 3-letter codes in parentheses.
     * @return OneLetterCodeMod
     */
    public OneLetterCodeMod getOneLetterCodeMod() {
        return (OneLetterCodeMod) (isText ? textFields.computeIfAbsent("one_letter_code_mod",
                OneLetterCodeMod::new) : getBinaryColumn("one_letter_code_mod"));
    }
}
