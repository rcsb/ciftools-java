package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_DRUG_INFO category are still used until
 * the 'entity' categories are entered into the database, even
 * though the information is repeated.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDrugInfo extends DelegatingCategory {
    public PdbxDrugInfo(Category delegate) {
        super(delegate);
    }

    /**
     * Serial number.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Common name of drug.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }

    /**
     * Number of drug molecules per asymmetric unit.
     * @return IntColumn
     */
    public IntColumn getNumPerAsymUnit() {
        return delegate.getColumn("num_per_asym_unit", DelegatingIntColumn::new);
    }

    /**
     * Number of drug molecules per biological unit.
     * @return IntColumn
     */
    public IntColumn getNumOfWholeMolecule() {
        return delegate.getColumn("num_of_whole_molecule", DelegatingIntColumn::new);
    }

    /**
     * Size of drug molecules per asymmetric unit.
     * @return StrColumn
     */
    public StrColumn getSizeOfMoleculePerAsymUnit() {
        return delegate.getColumn("size_of_molecule_per_asym_unit", DelegatingStrColumn::new);
    }
}
