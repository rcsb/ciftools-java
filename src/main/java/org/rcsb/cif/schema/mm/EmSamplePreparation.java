package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the EM_SAMPLE_PREPARATION category
 * record details of sample conditions prior to and upon loading
 * onto grid support.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EmSamplePreparation extends DelegatingCategory {
    public EmSamplePreparation(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "id":
                return getId();
            case "ph":
                return getPh();
            case "buffer_id":
                return getBufferId();
            case "sample_concentration":
                return getSampleConcentration();
            case "2d_crystal_grow_id":
                return get_2dCrystalGrowId();
            case "support_id":
                return getSupportId();
            case "entity_assembly_id":
                return getEntityAssemblyId();
            case "details":
                return getDetails();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _em_sample_preparation.id must
     * uniquely identify the sample preparation.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * The pH value of the observed sample buffer.
     * @return FloatColumn
     */
    public FloatColumn getPh() {
        return delegate.getColumn("ph", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _em_buffer.id in the
     * BUFFER category.
     * @return StrColumn
     */
    public StrColumn getBufferId() {
        return delegate.getColumn("buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The value of the concentration (mg per milliliter)
     * of the complex in the sample.
     * @return FloatColumn
     */
    public FloatColumn getSampleConcentration() {
        return delegate.getColumn("sample_concentration", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _em_2d_crystal_grow.id
     * in the 2D_CRYSTAL_GROW category.
     * @return StrColumn
     */
    public StrColumn get_2dCrystalGrowId() {
        return delegate.getColumn("2d_crystal_grow_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _em_sample_support.id  in the EM_SAMPLE_SUPPORT category.
     * @return StrColumn
     */
    public StrColumn getSupportId() {
        return delegate.getColumn("support_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity_assembly.id in the   em_entity_assembly category.
     * @return StrColumn
     */
    public StrColumn getEntityAssemblyId() {
        return delegate.getColumn("entity_assembly_id", DelegatingStrColumn::new);
    }

    /**
     * Details of the specimen preparation
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

}