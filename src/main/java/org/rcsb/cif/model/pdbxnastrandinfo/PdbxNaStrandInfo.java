package org.rcsb.cif.model.pdbxnastrandinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * Number of na strands per asymmetric unit.
     * @return NumOfNAStrandsPerAsymUnit
     */
    public NumOfNAStrandsPerAsymUnit getNumOfNAStrandsPerAsymUnit() {
        return (NumOfNAStrandsPerAsymUnit) (isText ? textFields.computeIfAbsent("num_of_NA_strands_per_asym_unit",
                NumOfNAStrandsPerAsymUnit::new) : getBinaryColumn("num_of_NA_strands_per_asym_unit"));
    }

    /**
     * Number of na strands per biological unit.
     * @return NumOfNAStrandsPerBiolUnit
     */
    public NumOfNAStrandsPerBiolUnit getNumOfNAStrandsPerBiolUnit() {
        return (NumOfNAStrandsPerBiolUnit) (isText ? textFields.computeIfAbsent("num_of_NA_strands_per_biol_unit",
                NumOfNAStrandsPerBiolUnit::new) : getBinaryColumn("num_of_NA_strands_per_biol_unit"));
    }

    /**
     * Size of drug molecules per asymmetric unit.
     * @return FractNAStrandPerAsymUnit
     */
    public FractNAStrandPerAsymUnit getFractNAStrandPerAsymUnit() {
        return (FractNAStrandPerAsymUnit) (isText ? textFields.computeIfAbsent("fract_NA_strand_per_asym_unit",
                FractNAStrandPerAsymUnit::new) : getBinaryColumn("fract_NA_strand_per_asym_unit"));
    }
}
