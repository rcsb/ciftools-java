package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the category record details from the output of mapman
 * used by the DCC program.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxDccMapman extends BaseCategory {
    public PdbxDccMapman(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDccMapman(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDccMapman(String name) {
        super(name);
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbid", StrColumn::new) :
                getBinaryColumn("pdbid"));
    }

    /**
     * The details of the use of mapman by the DCC program.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
