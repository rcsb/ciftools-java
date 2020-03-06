package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the pdbx_exptl_pd record information about
 * powder sample preparations.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxExptlPd extends DelegatingCategory {
    public PdbxExptlPd(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "spec_preparation_pH":
                return getSpecPreparationPH();
            case "spec_preparation_pH_range":
                return getSpecPreparationPHRange();
            case "spec_preparation":
                return getSpecPreparation();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_exptl_pd.entry_id uniquely identifies a
     * record in the PDBX_EXPTL_PD category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The pH at which the powder sample was prepared.
     * @return FloatColumn
     */
    public FloatColumn getSpecPreparationPH() {
        return delegate.getColumn("spec_preparation_pH", DelegatingFloatColumn::new);
    }

    /**
     * The range of pH values at which the sample was prepared.   Used when
     * a point estimate of pH is not appropriate.
     * @return StrColumn
     */
    public StrColumn getSpecPreparationPHRange() {
        return delegate.getColumn("spec_preparation_pH_range", DelegatingStrColumn::new);
    }

    /**
     * A description of preparation steps for producing the
     * diffraction specimen from the sample. Include any procedures
     * related to grinding, sieving, spray drying, etc.
     * @return StrColumn
     */
    public StrColumn getSpecPreparation() {
        return delegate.getColumn("spec_preparation", DelegatingStrColumn::new);
    }

}