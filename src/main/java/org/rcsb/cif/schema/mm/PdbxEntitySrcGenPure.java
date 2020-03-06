package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the final purified protein product. Note
 * that this category does not contain the amino acid sequence of the protein.
 * The sequence will be found in the ENTITY_POLY_SEQ entry with matching
 * entity_id.
 * Only one PDBX_ENTITY_SRC_GEN_PURE category is allowed per entity, hence there is
 * no step_id for this category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenPure extends DelegatingCategory {
    public PdbxEntitySrcGenPure(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entry_id":
                return getEntryId();
            case "entity_id":
                return getEntityId();
            case "step_id":
                return getStepId();
            case "product_id":
                return getProductId();
            case "date":
                return getDate();
            case "conc_device_id":
                return getConcDeviceId();
            case "conc_details":
                return getConcDetails();
            case "conc_assay_method":
                return getConcAssayMethod();
            case "protein_concentration":
                return getProteinConcentration();
            case "protein_yield":
                return getProteinYield();
            case "protein_purity":
                return getProteinPurity();
            case "protein_oligomeric_state":
                return getProteinOligomericState();
            case "storage_buffer_id":
                return getStorageBufferId();
            case "storage_temperature":
                return getStorageTemperature();
            case "summary":
                return getSummary();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_pure.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _pdbx_entity_src_gen_pure.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item unique identifier the production step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * When present, this item should be a globally unique identifier
     * that identifies the final product. It is envisaged that this
     * should be the same as and product code associated with the
     * sample and would provide the key by which information about
     * the production process may be extracted from the protein
     * production facility. For files describing the protein
     * production process (i.e. where _entity.type is 'P' or 'E')
     * this should have the same value as _entry.id
     * @return StrColumn
     */
    public StrColumn getProductId() {
        return delegate.getColumn("product_id", DelegatingStrColumn::new);
    }

    /**
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getConcDeviceId() {
        return delegate.getColumn("conc_device_id", DelegatingStrColumn::new);
    }

    /**
     * Details of the protein concentration procedure
     * @return StrColumn
     */
    public StrColumn getConcDetails() {
        return delegate.getColumn("conc_details", DelegatingStrColumn::new);
    }

    /**
     * The method used to measure the protein concentration
     * @return StrColumn
     */
    public StrColumn getConcAssayMethod() {
        return delegate.getColumn("conc_assay_method", DelegatingStrColumn::new);
    }

    /**
     * The final concentration of the protein.
     * @return FloatColumn
     */
    public FloatColumn getProteinConcentration() {
        return delegate.getColumn("protein_concentration", DelegatingFloatColumn::new);
    }

    /**
     * The yield of protein in milligrams.
     * @return FloatColumn
     */
    public FloatColumn getProteinYield() {
        return delegate.getColumn("protein_yield", DelegatingFloatColumn::new);
    }

    /**
     * The purity of the protein (percent).
     * @return FloatColumn
     */
    public FloatColumn getProteinPurity() {
        return delegate.getColumn("protein_purity", DelegatingFloatColumn::new);
    }

    /**
     * The oligomeric state of the protein. Monomeric is 1, dimeric 2, etc.
     * @return IntColumn
     */
    public IntColumn getProteinOligomericState() {
        return delegate.getColumn("protein_oligomeric_state", DelegatingIntColumn::new);
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was stored.
     * @return StrColumn
     */
    public StrColumn getStorageBufferId() {
        return delegate.getColumn("storage_buffer_id", DelegatingStrColumn::new);
    }

    /**
     * The temperature in degrees celsius at which the protein was stored.
     * @return FloatColumn
     */
    public FloatColumn getStorageTemperature() {
        return delegate.getColumn("storage_temperature", DelegatingFloatColumn::new);
    }

    /**
     * Summary of the details of protein purification method used to obtain the final
     * protein product.  This description should include any lysis, fractionation,
     * proteolysis, refolding, chromatography used as well as the method used the
     * characterize the final product.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return delegate.getColumn("summary", DelegatingStrColumn::new);
    }

}