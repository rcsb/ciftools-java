package org.rcsb.cif.model.pdbxnmrspectralpeaksoftware;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxNmrSpectralPeakSoftware extends BaseCategory {
    public PdbxNmrSpectralPeakSoftware(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxNmrSpectralPeakSoftware(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxNmrSpectralPeakSoftware(String name) {
        super(name);
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_software.ordinal'
     * @return SoftwareId
     */
    public SoftwareId getSoftwareId() {
        return (SoftwareId) (isText ? textFields.computeIfAbsent("software_id",
                SoftwareId::new) : getBinaryColumn("software_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectral_peak_list.id'
     * @return SpectralPeakListId
     */
    public SpectralPeakListId getSpectralPeakListId() {
        return (SpectralPeakListId) (isText ? textFields.computeIfAbsent("spectral_peak_list_id",
                SpectralPeakListId::new) : getBinaryColumn("spectral_peak_list_id"));
    }
}
