package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_PROTEIN_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * information is repeated.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxProteinInfo extends BaseCategory {
    public PdbxProteinInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxProteinInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxProteinInfo(String name) {
        super(name);
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Name of protein.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Number of protein molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_per_asym_unit", IntColumn::new) :
                getBinaryColumn("num_per_asym_unit"));
    }
}
