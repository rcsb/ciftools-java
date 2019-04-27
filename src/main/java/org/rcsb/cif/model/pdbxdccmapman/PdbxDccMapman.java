package org.rcsb.cif.model.pdbxdccmapman;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return Pdbid
     */
    public Pdbid getPdbid() {
        return (Pdbid) (isText ? textFields.computeIfAbsent("pdbid",
                Pdbid::new) : getBinaryColumn("pdbid"));
    }

    /**
     * The details of the use of mapman by the DCC program.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
