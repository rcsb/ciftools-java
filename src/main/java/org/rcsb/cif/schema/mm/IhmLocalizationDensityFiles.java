package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_LOCALIZATION_DENSITY_FILES category records the
 * details of files that provide information regarding localization densities
 * of ensembles. These may be stored externally as local files or linked via
 * DOI and can be in any accepted format that provides volume information
 * (CCP4, MRC, etc.).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmLocalizationDensityFiles extends DelegatingCategory {
    public IhmLocalizationDensityFiles(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "file_id":
                return getFileId();
            case "ensemble_id":
                return getEnsembleId();
            case "entity_id":
                return getEntityId();
            case "entity_poly_segment_id":
                return getEntityPolySegmentId();
            case "asym_id":
                return getAsymId();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * A unique identifier.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The file id for the externally stored localization density file.
     * This data item is a pointer to _ihm_external_files.id
     * in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getFileId() {
        return delegate.getColumn("file_id", DelegatingIntColumn::new);
    }

    /**
     * The ensemble identifier for the ensemble, for which the localization density is provided.
     * This data item is a pointer to _ihm_ensemble_info.ensemble_id in the IHM_ENSEMBLE_INFO category.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return delegate.getColumn("ensemble_id", DelegatingIntColumn::new);
    }

    /**
     * The entity identifier corresponding to this localization density.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The identifier for the polymeric segment corresponding to this
     * localization density.
     * This data item is a pointer to _ihm_entity_poly_segment.id in the
     * IHM_ENTITY_POLY_SEGMENT category.
     * @return IntColumn
     */
    public IntColumn getEntityPolySegmentId() {
        return delegate.getColumn("entity_poly_segment_id", DelegatingIntColumn::new);
    }

    /**
     * An asym/strand identifier corresponding to this localization density.
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

}