package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_DRUG_INFO category are still used until
 * the 'entity' categories are entered into the database, even
 * though the information is repeated.
 */
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
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * Common name of drug.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * Number of drug molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_per_asym_unit", IntColumn::new) :
                getBinaryColumn("num_per_asym_unit"));
    }

    /**
     * Number of drug molecules per biological unit.
     * @return IntColumn
     */
    public IntColumn getNumOfWholeMolecule() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_of_whole_molecule", IntColumn::new) :
                getBinaryColumn("num_of_whole_molecule"));
    }

    /**
     * Size of drug molecules per asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getSizeOfMoleculePerAsymUnit() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("size_of_molecule_per_asym_unit", StrColumn::new) :
                getBinaryColumn("size_of_molecule_per_asym_unit"));
    }
}
