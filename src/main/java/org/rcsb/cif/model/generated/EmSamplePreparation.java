package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SAMPLE_PREPARATION category
 * record details of sample conditions prior to and upon loading
 * onto grid support.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class EmSamplePreparation extends BaseCategory {
    public EmSamplePreparation(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EmSamplePreparation(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EmSamplePreparation(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_sample_preparation.id must
     * uniquely identify the sample preparation.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The pH value of the observed sample buffer.
     * @return FloatColumn
     */
    public FloatColumn getPh() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("ph", FloatColumn::new) :
                getBinaryColumn("ph"));
    }

    /**
     * This data item is a pointer to _em_buffer.id in the
     * BUFFER category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("buffer_id", StrColumn::new) :
                getBinaryColumn("buffer_id"));
    }

    /**
     * The value of the concentration (mg per milliliter)
     * of the complex in the sample.
     * @return FloatColumn
     */
    public FloatColumn getSampleConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("sample_concentration", FloatColumn::new) :
                getBinaryColumn("sample_concentration"));
    }

    /**
     * This data item is a pointer to _em_2d_crystal_grow.id
     * in the 2D_CRYSTAL_GROW category.
     * @return StrColumn
     */
    public StrColumn get_2dCrystalGrowId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("2d_crystal_grow_id", StrColumn::new) :
                getBinaryColumn("2d_crystal_grow_id"));
    }

    /**
     * This data item is a pointer to _em_sample_support.id  in the EM_SAMPLE_SUPPORT category.
     * @return StrColumn
     */
    public StrColumn getSupportId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("support_id", StrColumn::new) :
                getBinaryColumn("support_id"));
    }

    /**
     * This data item is a pointer to _entity_assembly.id in the   em_entity_assembly category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", StrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Details of the specimen preparation
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
