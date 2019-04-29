package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_NA_STRAND_INFO category are still used until
 * the 'entity' categories are entered into the database, even though
 * the information is repeated.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNaStrandInfo extends BaseCategory {
    public PdbxNaStrandInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNaStrandInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNaStrandInfo(String name) {
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
     * Number of na strands per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumOfNAStrandsPerAsymUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_of_NA_strands_per_asym_unit", IntColumn::new) :
                getBinaryColumn("num_of_NA_strands_per_asym_unit"));
    }

    /**
     * Number of na strands per biological unit.
     * @return IntColumn
     */
    public IntColumn getNumOfNAStrandsPerBiolUnit() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("num_of_NA_strands_per_biol_unit", IntColumn::new) :
                getBinaryColumn("num_of_NA_strands_per_biol_unit"));
    }

    /**
     * Size of drug molecules per asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getFractNAStrandPerAsymUnit() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("fract_NA_strand_per_asym_unit", StrColumn::new) :
                getBinaryColumn("fract_NA_strand_per_asym_unit"));
    }
}
