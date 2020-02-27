package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * This category contains details for the EXPRESSION steps used in
 * the overall protein production process. It is hoped that this category
 * will cover all forms of cell-based expression by reading induction as
 * induction/transformation/transfection.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxEntitySrcGenExpress extends BaseCategory {
    public PdbxEntitySrcGenExpress(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenExpress(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenExpress(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_entity_src_gen_express.entry_id uniquely identifies
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
     * The value of _pdbx_entity_src_gen_express.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.
     * This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this expression step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("step_id", IntColumn::new) :
                getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("next_step_id", IntColumn::new) :
                getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("end_construct_id", StrColumn::new) :
                getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("robot_id", StrColumn::new) :
                getBinaryColumn("robot_id"));
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
     * The nature of the promoter controlling expression of the gene.
     * @return StrColumn
     */
    public StrColumn getPromoterType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("promoter_type", StrColumn::new) :
                getBinaryColumn("promoter_type"));
    }

    /**
     * This item is a pointer to _pdbx_construct.id in the
     * PDBX_CONSTRUCT category. The referenced entry will contain
     * the nucleotide sequence that is to be expressed, including tags.
     * @return StrColumn
     */
    public StrColumn getPlasmidId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("plasmid_id", StrColumn::new) :
                getBinaryColumn("plasmid_id"));
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid)
     * in the expression system.
     * @return StrColumn
     */
    public StrColumn getVectorType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("vector_type", StrColumn::new) :
                getBinaryColumn("vector_type"));
    }

    /**
     * Any N-terminal sequence tag as a string of one letter amino acid codes.
     * @return StrColumn
     */
    public StrColumn getNTerminalSeqTag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("N_terminal_seq_tag", StrColumn::new) :
                getBinaryColumn("N_terminal_seq_tag"));
    }

    /**
     * Any C-terminal sequence tag as a string of one letter amino acid codes
     * @return StrColumn
     */
    public StrColumn getCTerminalSeqTag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("C_terminal_seq_tag", StrColumn::new) :
                getBinaryColumn("C_terminal_seq_tag"));
    }

    /**
     * The scientific name of the organism that served as host for the
     * expression system. It is expected that either this item or
     * _pdbx_entity_src_gen_express.host_org_tax_id should be populated.
     * @return StrColumn
     */
    public StrColumn getHostOrgScientificName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_scientific_name", StrColumn::new) :
                getBinaryColumn("host_org_scientific_name"));
    }

    /**
     * The common name of the organism that served as host for the
     * expression system. Where _pdbx_entity_src_gen_express.host_org_tax_id
     * is populated it is expected that this item may be derived by
     * look up against the taxonomy database.
     * @return StrColumn
     */
    public StrColumn getHostOrgCommonName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_common_name", StrColumn::new) :
                getBinaryColumn("host_org_common_name"));
    }

    /**
     * The vairant of the organism that served as host for the expression
     * system. Where _pdbx_entity_src_gen_express.host_org_tax_id is
     * populated it is expected that this item may be derived by a
     * look up against the taxonomy database.
     * @return StrColumn
     */
    public StrColumn getHostOrgVariant() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_variant", StrColumn::new) :
                getBinaryColumn("host_org_variant"));
    }

    /**
     * The strain of the organism that served as host for the expression
     * system. Where _pdbx_entity_src_gen_express.host_org_tax_id is
     * populated it is expected that this item may be derived by a
     * look up against the taxonomy database.
     * @return StrColumn
     */
    public StrColumn getHostOrgStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_strain", StrColumn::new) :
                getBinaryColumn("host_org_strain"));
    }

    /**
     * The specific tissue which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getHostOrgTissue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_tissue", StrColumn::new) :
                getBinaryColumn("host_org_tissue"));
    }

    /**
     * Culture collection of the expression system
     * @return StrColumn
     */
    public StrColumn getHostOrgCultureCollection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_culture_collection", StrColumn::new) :
                getBinaryColumn("host_org_culture_collection"));
    }

    /**
     * A specific line of cells used as the expression system
     * @return StrColumn
     */
    public StrColumn getHostOrgCellLine() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_cell_line", StrColumn::new) :
                getBinaryColumn("host_org_cell_line"));
    }

    /**
     * The id for the NCBI taxonomy node corresponding to the organism that
     * served as host for the expression system.
     * @return StrColumn
     */
    public StrColumn getHostOrgTaxId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_tax_id", StrColumn::new) :
                getBinaryColumn("host_org_tax_id"));
    }

    /**
     * A description of special aspects of the organism that served as
     * host for the  expression system.
     * @return StrColumn
     */
    public StrColumn getHostOrgDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_details", StrColumn::new) :
                getBinaryColumn("host_org_details"));
    }

    /**
     * The name of the base media in which the expression host was grown.
     * @return StrColumn
     */
    public StrColumn getCultureBaseMedia() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("culture_base_media", StrColumn::new) :
                getBinaryColumn("culture_base_media"));
    }

    /**
     * Any additives to the base media in which the expression host was grown.
     * @return StrColumn
     */
    public StrColumn getCultureAdditives() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("culture_additives", StrColumn::new) :
                getBinaryColumn("culture_additives"));
    }

    /**
     * The volume of media in milliliters in which the expression host was grown.
     * @return FloatColumn
     */
    public FloatColumn getCultureVolume() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("culture_volume", FloatColumn::new) :
                getBinaryColumn("culture_volume"));
    }

    /**
     * The time in hours for which the expression host was allowed to grow
     * prior to induction/transformation/transfection.
     * @return FloatColumn
     */
    public FloatColumn getCultureTime() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("culture_time", FloatColumn::new) :
                getBinaryColumn("culture_time"));
    }

    /**
     * The temperature in degrees celsius at which the expression host was allowed
     * to grow prior to induction/transformation/transfection.
     * @return FloatColumn
     */
    public FloatColumn getCultureTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("culture_temperature", FloatColumn::new) :
                getBinaryColumn("culture_temperature"));
    }

    /**
     * The chemical name of the inducing agent.
     * @return StrColumn
     */
    public StrColumn getInducer() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("inducer", StrColumn::new) :
                getBinaryColumn("inducer"));
    }

    /**
     * Concentration of the inducing agent.
     * @return FloatColumn
     */
    public FloatColumn getInducerConcentration() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("inducer_concentration", FloatColumn::new) :
                getBinaryColumn("inducer_concentration"));
    }

    /**
     * Details of induction/transformation/transfection.
     * @return StrColumn
     */
    public StrColumn getInductionDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("induction_details", StrColumn::new) :
                getBinaryColumn("induction_details"));
    }

    /**
     * The multiplicity of infection for genes introduced by transfection, eg.
     * for baculovirus-based expression.
     * @return FloatColumn
     */
    public FloatColumn getMultiplicityOfInfection() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("multiplicity_of_infection", FloatColumn::new) :
                getBinaryColumn("multiplicity_of_infection"));
    }

    /**
     * The time in hours after induction/transformation/transfection at which
     * the optical density of the culture was measured.
     * @return FloatColumn
     */
    public FloatColumn getInductionTimepoint() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("induction_timepoint", FloatColumn::new) :
                getBinaryColumn("induction_timepoint"));
    }

    /**
     * The temperature in celsius at which the induced/transformed/transfected
     * cells were grown.
     * @return FloatColumn
     */
    public FloatColumn getInductionTemperature() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("induction_temperature", FloatColumn::new) :
                getBinaryColumn("induction_temperature"));
    }

    /**
     * Details of the harvesting protocol.
     * @return StrColumn
     */
    public StrColumn getHarvestingDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("harvesting_details", StrColumn::new) :
                getBinaryColumn("harvesting_details"));
    }

    /**
     * Details of how the harvested culture was stored.
     * @return StrColumn
     */
    public StrColumn getStorageDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("storage_details", StrColumn::new) :
                getBinaryColumn("storage_details"));
    }

    /**
     * Summary of the details of the expression steps used in protein production.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("summary", StrColumn::new) :
                getBinaryColumn("summary"));
    }
}
