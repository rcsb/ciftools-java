package org.rcsb.cif.model.generated.emsamplepreparation;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _em_sample_preparation.id must
     * uniquely identify the sample preparation.
     * @return Id
     */
    public Id getId() {
        return (Id) (isText ? textFields.computeIfAbsent("id",
                Id::new) : getBinaryColumn("id"));
    }

    /**
     * The pH value of the observed sample buffer.
     * @return Ph
     */
    public Ph getPh() {
        return (Ph) (isText ? textFields.computeIfAbsent("ph",
                Ph::new) : getBinaryColumn("ph"));
    }

    /**
     * This data item is a pointer to _em_buffer.id in the
     * BUFFER category.
     * @return BufferId
     */
    public BufferId getBufferId() {
        return (BufferId) (isText ? textFields.computeIfAbsent("buffer_id",
                BufferId::new) : getBinaryColumn("buffer_id"));
    }

    /**
     * The value of the concentration (mg per milliliter)
     * of the complex in the sample.
     * @return SampleConcentration
     */
    public SampleConcentration getSampleConcentration() {
        return (SampleConcentration) (isText ? textFields.computeIfAbsent("sample_concentration",
                SampleConcentration::new) : getBinaryColumn("sample_concentration"));
    }

    /**
     * This data item is a pointer to _em_2d_crystal_grow.id
     * in the 2D_CRYSTAL_GROW category.
     * @return _2dCrystalGrowId
     */
    public _2dCrystalGrowId get_2dCrystalGrowId() {
        return (_2dCrystalGrowId) (isText ? textFields.computeIfAbsent("2d_crystal_grow_id",
                _2dCrystalGrowId::new) : getBinaryColumn("2d_crystal_grow_id"));
    }

    /**
     * This data item is a pointer to _em_sample_support.id  in the EM_SAMPLE_SUPPORT category.
     * @return SupportId
     */
    public SupportId getSupportId() {
        return (SupportId) (isText ? textFields.computeIfAbsent("support_id",
                SupportId::new) : getBinaryColumn("support_id"));
    }

    /**
     * This data item is a pointer to _entity_assembly.id in the   em_entity_assembly category.
     * @return EntityAssemblyId
     */
    public EntityAssemblyId getEntityAssemblyId() {
        return (EntityAssemblyId) (isText ? textFields.computeIfAbsent("entity_assembly_id",
                EntityAssemblyId::new) : getBinaryColumn("entity_assembly_id"));
    }

    /**
     * Details of the specimen preparation
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }
}
