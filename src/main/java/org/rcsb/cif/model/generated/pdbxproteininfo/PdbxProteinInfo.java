package org.rcsb.cif.model.generated.pdbxproteininfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Name of protein.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Number of protein molecules per asymmetric unit.
     * @return NumPerAsymUnit
     */
    public NumPerAsymUnit getNumPerAsymUnit() {
        return (NumPerAsymUnit) (isText ? textFields.computeIfAbsent("num_per_asym_unit",
                NumPerAsymUnit::new) : getBinaryColumn("num_per_asym_unit"));
    }
}
