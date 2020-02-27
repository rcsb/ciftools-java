package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_SEQ_MAP_DEPOSITOR_INFO record the
 * details about the mapping sample and coordinate sequences.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item is a pointer to _atom_site.auth_asym_id in the ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("auth_asym_id", StrColumn::new) :
                getBinaryColumn("auth_asym_id"));
    }

    /**
     * Coordinate sequence expressed as string of one-letter residue codes.
     * @return StrColumn
     */
    public StrColumn getOneLetterCode() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("one_letter_code", StrColumn::new) :
                getBinaryColumn("one_letter_code"));
    }

    /**
     * Coordinate sequence expressed as string of one-letter residue codes with
     * nonstandard residues expressed as 3-letter codes in parentheses.
     * @return StrColumn
     */
    public StrColumn getOneLetterCodeMod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("one_letter_code_mod", StrColumn::new) :
                getBinaryColumn("one_letter_code_mod"));
    }
}
