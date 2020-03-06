package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_NA_STRAND_INFO category are still used until
 * the 'entity' categories are entered into the database, even though
 * the information is repeated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNaStrandInfo extends DelegatingCategory {
    public PdbxNaStrandInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "num_of_NA_strands_per_asym_unit":
                return getNumOfNAStrandsPerAsymUnit();
            case "num_of_NA_strands_per_biol_unit":
                return getNumOfNAStrandsPerBiolUnit();
            case "fract_NA_strand_per_asym_unit":
                return getFractNAStrandPerAsymUnit();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Number of na strands per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumOfNAStrandsPerAsymUnit() {
        return delegate.getColumn("num_of_NA_strands_per_asym_unit", DelegatingIntColumn::new);
    }

    /**
     * Number of na strands per biological unit.
     * @return IntColumn
     */
    public IntColumn getNumOfNAStrandsPerBiolUnit() {
        return delegate.getColumn("num_of_NA_strands_per_biol_unit", DelegatingIntColumn::new);
    }

    /**
     * Size of drug molecules per asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getFractNAStrandPerAsymUnit() {
        return delegate.getColumn("fract_NA_strand_per_asym_unit", DelegatingStrColumn::new);
    }

}