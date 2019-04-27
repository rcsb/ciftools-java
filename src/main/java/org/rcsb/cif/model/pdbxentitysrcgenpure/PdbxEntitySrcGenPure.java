package org.rcsb.cif.model.pdbxentitysrcgenpure;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenPure extends BaseCategory {
    public PdbxEntitySrcGenPure(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenPure(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenPure(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_pure.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_pure.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item unique identifier the production step.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
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
     * @return ProductId
     */
    public ProductId getProductId() {
        return (ProductId) (isText ? textFields.computeIfAbsent("product_id",
                ProductId::new) : getBinaryColumn("product_id"));
    }

    /**
     * The date of production step.
     * @return Date
     */
    public Date getDate() {
        return (Date) (isText ? textFields.computeIfAbsent("date",
                Date::new) : getBinaryColumn("date"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return ConcDeviceId
     */
    public ConcDeviceId getConcDeviceId() {
        return (ConcDeviceId) (isText ? textFields.computeIfAbsent("conc_device_id",
                ConcDeviceId::new) : getBinaryColumn("conc_device_id"));
    }

    /**
     * Details of the protein concentration procedure
     * @return ConcDetails
     */
    public ConcDetails getConcDetails() {
        return (ConcDetails) (isText ? textFields.computeIfAbsent("conc_details",
                ConcDetails::new) : getBinaryColumn("conc_details"));
    }

    /**
     * The method used to measure the protein concentration
     * @return ConcAssayMethod
     */
    public ConcAssayMethod getConcAssayMethod() {
        return (ConcAssayMethod) (isText ? textFields.computeIfAbsent("conc_assay_method",
                ConcAssayMethod::new) : getBinaryColumn("conc_assay_method"));
    }

    /**
     * The final concentration of the protein.
     * @return ProteinConcentration
     */
    public ProteinConcentration getProteinConcentration() {
        return (ProteinConcentration) (isText ? textFields.computeIfAbsent("protein_concentration",
                ProteinConcentration::new) : getBinaryColumn("protein_concentration"));
    }

    /**
     * The yield of protein in milligrams.
     * @return ProteinYield
     */
    public ProteinYield getProteinYield() {
        return (ProteinYield) (isText ? textFields.computeIfAbsent("protein_yield",
                ProteinYield::new) : getBinaryColumn("protein_yield"));
    }

    /**
     * The purity of the protein (percent).
     * @return ProteinPurity
     */
    public ProteinPurity getProteinPurity() {
        return (ProteinPurity) (isText ? textFields.computeIfAbsent("protein_purity",
                ProteinPurity::new) : getBinaryColumn("protein_purity"));
    }

    /**
     * The oligomeric state of the protein. Monomeric is 1, dimeric 2, etc.
     * @return ProteinOligomericState
     */
    public ProteinOligomericState getProteinOligomericState() {
        return (ProteinOligomericState) (isText ? textFields.computeIfAbsent("protein_oligomeric_state",
                ProteinOligomericState::new) : getBinaryColumn("protein_oligomeric_state"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was stored.
     * @return StorageBufferId
     */
    public StorageBufferId getStorageBufferId() {
        return (StorageBufferId) (isText ? textFields.computeIfAbsent("storage_buffer_id",
                StorageBufferId::new) : getBinaryColumn("storage_buffer_id"));
    }

    /**
     * The temperature in degrees celsius at which the protein was stored.
     * @return StorageTemperature
     */
    public StorageTemperature getStorageTemperature() {
        return (StorageTemperature) (isText ? textFields.computeIfAbsent("storage_temperature",
                StorageTemperature::new) : getBinaryColumn("storage_temperature"));
    }

    /**
     * Summary of the details of protein purification method used to obtain the final
     * protein product.  This description should include any lysis, fractionation,
     * proteolysis, refolding, chromatography used as well as the method used the
     * characterize the final product.
     * @return Summary
     */
    public Summary getSummary() {
        return (Summary) (isText ? textFields.computeIfAbsent("summary",
                Summary::new) : getBinaryColumn("summary"));
    }
}
