package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_INHIBITOR_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * inhibitor is repeated.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxInhibitorInfo extends BaseCategory {
    public PdbxInhibitorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxInhibitorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxInhibitorInfo(String name) {
        super(name);
    }

    /**
     * Serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Name of inhibitor.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Number of inhibitor molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_per_asym_unit", IntColumn::new) :
                getBinaryColumn("num_per_asym_unit"));
    }
}
