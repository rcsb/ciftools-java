package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * These records give information about residues which do not pair
 * (h-bond) in the asymmetric unit.
 * 
 * The records about Watson-Crick base pairing depend on these
 * records.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxUnpair extends BaseCategory {
    public PdbxUnpair(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxUnpair(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxUnpair(String name) {
        super(name);
    }

    /**
     * Strand id.
     * @return StrColumn
     */
    public StrColumn getChainId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("chain_id", StrColumn::new) :
                getBinaryColumn("chain_id"));
    }

    /**
     * Name of residue which does not pair.
     * @return StrColumn
     */
    public StrColumn getResidueName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("residue_name", StrColumn::new) :
                getBinaryColumn("residue_name"));
    }

    /**
     * Number of residue which does not pair.
     * @return StrColumn
     */
    public StrColumn getResidueNumber() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("residue_number", StrColumn::new) :
                getBinaryColumn("residue_number"));
    }
}
