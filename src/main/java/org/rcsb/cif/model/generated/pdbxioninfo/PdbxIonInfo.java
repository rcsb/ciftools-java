package org.rcsb.cif.model.generated.pdbxioninfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxIonInfo extends BaseCategory {
    public PdbxIonInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxIonInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxIonInfo(String name) {
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
     * Name of ion.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Number of ion molecules per asymmetric unit.
     * @return NumbPerAsymUnit
     */
    public NumbPerAsymUnit getNumbPerAsymUnit() {
        return (NumbPerAsymUnit) (isText ? textFields.computeIfAbsent("numb_per_asym_unit",
                NumbPerAsymUnit::new) : getBinaryColumn("numb_per_asym_unit"));
    }
}
