package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category
 * and methods category where descriptions of software applications and methods can be found.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSpectralPeakSoftware extends DelegatingCategory {
    public PdbxNmrSpectralPeakSoftware(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "software_id":
                return getSoftwareId();
            case "entry_id":
                return getEntryId();
            case "spectral_peak_list_id":
                return getSpectralPeakListId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * Pointer to '_pdbx_nmr_software.ordinal'
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }

    /**
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * Pointer to '_pdbx_nmr_spectral_peak_list.id'
     * @return IntColumn
     */
    public IntColumn getSpectralPeakListId() {
        return delegate.getColumn("spectral_peak_list_id", DelegatingIntColumn::new);
    }

}