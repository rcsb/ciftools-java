package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the EM_SAMPLE_PREPARATION category
 * record details of sample conditions prior to and upon loading
 * onto grid support.
 */
@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntryId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entry_id", SingleRowStrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_sample_preparation.id must
     * uniquely identify the sample preparation.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("id", SingleRowStrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The pH value of the observed sample buffer.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getPh() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("ph", SingleRowFloatColumn::new) :
                getBinaryColumn("ph"));
    }

    /**
     * This data item is a pointer to _em_buffer.id in the
     * BUFFER category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getBufferId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("buffer_id", SingleRowStrColumn::new) :
                getBinaryColumn("buffer_id"));
    }

    /**
     * The value of the concentration (mg per milliliter)
     * of the complex in the sample.
     * @return SingleRowFloatColumn
     */
    public SingleRowFloatColumn getSampleConcentration() {
        return (SingleRowFloatColumn) (isText ? textFields.computeIfAbsent("sample_concentration", SingleRowFloatColumn::new) :
                getBinaryColumn("sample_concentration"));
    }

    /**
     * This data item is a pointer to _em_2d_crystal_grow.id
     * in the 2D_CRYSTAL_GROW category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn get_2dCrystalGrowId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("2d_crystal_grow_id", SingleRowStrColumn::new) :
                getBinaryColumn("2d_crystal_grow_id"));
    }

    /**
     * This data item is a pointer to _em_sample_support.id  in the EM_SAMPLE_SUPPORT category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getSupportId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("support_id", SingleRowStrColumn::new) :
                getBinaryColumn("support_id"));
    }

    /**
     * This data item is a pointer to _entity_assembly.id in the   em_entity_assembly category.
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getEntityAssemblyId() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("entity_assembly_id", SingleRowStrColumn::new) :
                getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Details of the specimen preparation
     * @return SingleRowStrColumn
     */
    public SingleRowStrColumn getDetails() {
        return (SingleRowStrColumn) (isText ? textFields.computeIfAbsent("details", SingleRowStrColumn::new) :
                getBinaryColumn("details"));
    }
}
