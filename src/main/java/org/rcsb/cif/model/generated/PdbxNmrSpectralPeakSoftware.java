package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * 
 * Items in the pdbx_nmr_spectral_peak_software category provide pointers to the software category
 * and methods category where descriptions of software applications and methods can be found.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("software_id", IntColumn::new) :
                getBinaryColumn("software_id"));
    }

    /**
     * 
     * Pointer to '_entry.id'
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * 
     * Pointer to '_pdbx_nmr_spectral_peak_list.id'
     * @return IntColumn
     */
    public IntColumn getSpectralPeakListId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("spectral_peak_list_id", IntColumn::new) :
                getBinaryColumn("spectral_peak_list_id"));
    }
}
