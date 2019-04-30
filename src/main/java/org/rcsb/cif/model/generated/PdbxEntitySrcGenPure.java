package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the final purified protein product. Note
 * that this category does not contain the amino acid sequence of the protein.
 * The sequence will be found in the ENTITY_POLY_SEQ entry with matching
 * entity_id.
 * Only one PDBX_ENTITY_SRC_GEN_PURE category is allowed per entity, hence there is
 * no step_id for this category.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_pure.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.  This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item unique identifier the production step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("product_id", StrColumn::new) :
                getBinaryColumn("product_id"));
    }

    /**
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getConcDeviceId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc_device_id", StrColumn::new) :
                getBinaryColumn("conc_device_id"));
    }

    /**
     * Details of the protein concentration procedure
     * @return StrColumn
     */
    public StrColumn getConcDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc_details", StrColumn::new) :
                getBinaryColumn("conc_details"));
    }

    /**
     * The method used to measure the protein concentration
     * @return StrColumn
     */
    public StrColumn getConcAssayMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("conc_assay_method", StrColumn::new) :
                getBinaryColumn("conc_assay_method"));
    }

    /**
     * The final concentration of the protein.
     * @return FloatColumn
     */
    public FloatColumn getProteinConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("protein_concentration", FloatColumn::new) :
                getBinaryColumn("protein_concentration"));
    }

    /**
     * The yield of protein in milligrams.
     * @return FloatColumn
     */
    public FloatColumn getProteinYield() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("protein_yield", FloatColumn::new) :
                getBinaryColumn("protein_yield"));
    }

    /**
     * The purity of the protein (percent).
     * @return FloatColumn
     */
    public FloatColumn getProteinPurity() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("protein_purity", FloatColumn::new) :
                getBinaryColumn("protein_purity"));
    }

    /**
     * The oligomeric state of the protein. Monomeric is 1, dimeric 2, etc.
     * @return IntColumn
     */
    public IntColumn getProteinOligomericState() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("protein_oligomeric_state", IntColumn::new) :
                getBinaryColumn("protein_oligomeric_state"));
    }

    /**
     * This item is a pointer to pdbx_buffer.id in the PDBX_BUFFER category.
     * The referenced buffer is that in which the protein was stored.
     * @return StrColumn
     */
    public StrColumn getStorageBufferId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("storage_buffer_id", StrColumn::new) :
                getBinaryColumn("storage_buffer_id"));
    }

    /**
     * The temperature in degrees celsius at which the protein was stored.
     * @return FloatColumn
     */
    public FloatColumn getStorageTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("storage_temperature", FloatColumn::new) :
                getBinaryColumn("storage_temperature"));
    }

    /**
     * Summary of the details of protein purification method used to obtain the final
     * protein product.  This description should include any lysis, fractionation,
     * proteolysis, refolding, chromatography used as well as the method used the
     * characterize the final product.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("summary", StrColumn::new) :
                getBinaryColumn("summary"));
    }
}
