package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_HYBRID category are used to describe the chimeric
 * characteristics of a DNA/RNA structure.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxHybrid extends BaseCategory {
    public PdbxHybrid(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxHybrid(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxHybrid(String name) {
        super(name);
    }

    /**
     * ID code.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Name of sugar group of residue.
     * @return StrColumn
     */
    public StrColumn getSugarName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("sugar_name", StrColumn::new) :
                getBinaryColumn("sugar_name"));
    }

    /**
     * Strand id.
     * @return StrColumn
     */
    public StrColumn getStrandId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strand_id", StrColumn::new) :
                getBinaryColumn("strand_id"));
    }

    /**
     * List of residues + number (see example) which have the same sugar
     * group in a particular strand.
     * @return StrColumn
     */
    public StrColumn getResidueNames() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("residue_names", StrColumn::new) :
                getBinaryColumn("residue_names"));
    }
}
