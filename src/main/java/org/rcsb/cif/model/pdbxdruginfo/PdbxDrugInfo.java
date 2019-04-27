package org.rcsb.cif.model.pdbxdruginfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxDrugInfo extends BaseCategory {
    public PdbxDrugInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxDrugInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxDrugInfo(String name) {
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
     * Common name of drug.
     * @return Name
     */
    public Name getName() {
        return (Name) (isText ? textFields.computeIfAbsent("name",
                Name::new) : getBinaryColumn("name"));
    }

    /**
     * Number of drug molecules per asymmetric unit.
     * @return NumPerAsymUnit
     */
    public NumPerAsymUnit getNumPerAsymUnit() {
        return (NumPerAsymUnit) (isText ? textFields.computeIfAbsent("num_per_asym_unit",
                NumPerAsymUnit::new) : getBinaryColumn("num_per_asym_unit"));
    }

    /**
     * Number of drug molecules per biological unit.
     * @return NumOfWholeMolecule
     */
    public NumOfWholeMolecule getNumOfWholeMolecule() {
        return (NumOfWholeMolecule) (isText ? textFields.computeIfAbsent("num_of_whole_molecule",
                NumOfWholeMolecule::new) : getBinaryColumn("num_of_whole_molecule"));
    }

    /**
     * Size of drug molecules per asymmetric unit.
     * @return SizeOfMoleculePerAsymUnit
     */
    public SizeOfMoleculePerAsymUnit getSizeOfMoleculePerAsymUnit() {
        return (SizeOfMoleculePerAsymUnit) (isText ? textFields.computeIfAbsent("size_of_molecule_per_asym_unit",
                SizeOfMoleculePerAsymUnit::new) : getBinaryColumn("size_of_molecule_per_asym_unit"));
    }
}
