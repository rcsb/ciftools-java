package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_TRNA_INFO category are still used until
 * the 'entity' categories are entered into the database, even though the
 * T-RNA is repeated.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxTrnaInfo extends BaseCategory {
    public PdbxTrnaInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxTrnaInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxTrnaInfo(String name) {
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
     * Name of trna.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Number of trna molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_per_asym_unit", IntColumn::new) :
                getBinaryColumn("num_per_asym_unit"));
    }
}
