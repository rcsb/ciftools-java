package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the category record overall map properties such
 * as correlation, real space Rfactors and the Zscore calculated
 * from refmac and mapman.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxDccRsccMapmanOverall extends DelegatingCategory {
    public PdbxDccRsccMapmanOverall(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "pdbid":
                return getPdbid();
            case "correlation":
                return getCorrelation();
            case "correlation_sigma":
                return getCorrelationSigma();
            case "real_space_R":
                return getRealSpaceR();
            case "real_space_R_sigma":
                return getRealSpaceRSigma();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The PDB id code.
     * @return StrColumn
     */
    public StrColumn getPdbid() {
        return delegate.getColumn("pdbid", DelegatingStrColumn::new);
    }

    /**
     * The overall real space electron density correlation coefficient
     * (RSCC) for the structure.
     * @return FloatColumn
     */
    public FloatColumn getCorrelation() {
        return delegate.getColumn("correlation", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard deviation of the real space electron density
     * correlation coefficient (RSCC) for the structure.
     * @return FloatColumn
     */
    public FloatColumn getCorrelationSigma() {
        return delegate.getColumn("correlation_sigma", DelegatingFloatColumn::new);
    }

    /**
     * The overall Real Space Rfactor (RSR) for the structure.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceR() {
        return delegate.getColumn("real_space_R", DelegatingFloatColumn::new);
    }

    /**
     * The overall standard deviation of the Real Space Rfactor (RSR)
     * for the structure.
     * @return FloatColumn
     */
    public FloatColumn getRealSpaceRSigma() {
        return delegate.getColumn("real_space_R_sigma", DelegatingFloatColumn::new);
    }

}