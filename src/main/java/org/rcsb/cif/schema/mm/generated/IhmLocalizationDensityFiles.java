package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the IHM_LOCALIZATION_DENSITY_FILES category records the
 * details of files that provide information regarding localization densities
 * of ensembles. These may be stored externally as local files or linked via
 * DOI and can be in any accepted format that provides volume information
 * (CCP4, MRC, etc.).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class IhmLocalizationDensityFiles extends BaseCategory {
    public IhmLocalizationDensityFiles(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public IhmLocalizationDensityFiles(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public IhmLocalizationDensityFiles(String name) {
        super(name);
    }

    /**
     * A unique identifier.
     * @return IntColumn
     */
    public IntColumn getId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("id", IntColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The file id for the externally stored localization density file.
     * This data item is a pointer to _ihm_external_files.id
     * in the IHM_EXTERNAL_FILES category.
     * @return IntColumn
     */
    public IntColumn getFileId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("file_id", IntColumn::new) :
                getBinaryColumn("file_id"));
    }

    /**
     * The ensemble identifier for the ensemble, for which the localization density is provided.
     * This data item is a pointer to _ihm_ensemble_info.ensemble_id in the IHM_ENSEMBLE_INFO category.
     * @return IntColumn
     */
    public IntColumn getEnsembleId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("ensemble_id", IntColumn::new) :
                getBinaryColumn("ensemble_id"));
    }

    /**
     * The entity identifier corresponding to this localization density.
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The leading sequence index corresponding to this localization density.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqIdBegin() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_begin", IntColumn::new) :
                getBinaryColumn("seq_id_begin"));
    }

    /**
     * The trailing sequence index corresponding to this localization density.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("seq_id_end", IntColumn::new) :
                getBinaryColumn("seq_id_end"));
    }

    /**
     * An asym/strand identifier corresponding to this localization density.
     * This data item is a pointer to _struct_asym.id in the STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("asym_id", StrColumn::new) :
                getBinaryColumn("asym_id"));
    }
}
