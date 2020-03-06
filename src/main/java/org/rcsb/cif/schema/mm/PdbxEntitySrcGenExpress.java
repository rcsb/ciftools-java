package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * This category contains details for the EXPRESSION steps used in
 * the overall protein production process. It is hoped that this category
 * will cover all forms of cell-based expression by reading induction as
 * induction/transformation/transfection.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenExpress extends DelegatingCategory {
    public PdbxEntitySrcGenExpress(Category delegate) {
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
            case "next_step_id":
                return getNextStepId();
            case "end_construct_id":
                return getEndConstructId();
            case "robot_id":
                return getRobotId();
            case "date":
                return getDate();
            case "promoter_type":
                return getPromoterType();
            case "plasmid_id":
                return getPlasmidId();
            case "vector_type":
                return getVectorType();
            case "N_terminal_seq_tag":
                return getNTerminalSeqTag();
            case "C_terminal_seq_tag":
                return getCTerminalSeqTag();
            case "host_org_scientific_name":
                return getHostOrgScientificName();
            case "host_org_common_name":
                return getHostOrgCommonName();
            case "host_org_variant":
                return getHostOrgVariant();
            case "host_org_strain":
                return getHostOrgStrain();
            case "host_org_tissue":
                return getHostOrgTissue();
            case "host_org_culture_collection":
                return getHostOrgCultureCollection();
            case "host_org_cell_line":
                return getHostOrgCellLine();
            case "host_org_tax_id":
                return getHostOrgTaxId();
            case "host_org_details":
                return getHostOrgDetails();
            case "culture_base_media":
                return getCultureBaseMedia();
            case "culture_additives":
                return getCultureAdditives();
            case "culture_volume":
                return getCultureVolume();
            case "culture_time":
                return getCultureTime();
            case "culture_temperature":
                return getCultureTemperature();
            case "inducer":
                return getInducer();
            case "inducer_concentration":
                return getInducerConcentration();
            case "induction_details":
                return getInductionDetails();
            case "multiplicity_of_infection":
                return getMultiplicityOfInfection();
            case "induction_timepoint":
                return getInductionTimepoint();
            case "induction_temperature":
                return getInductionTemperature();
            case "harvesting_details":
                return getHarvestingDetails();
            case "storage_details":
                return getStorageDetails();
            case "summary":
                return getSummary();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_entity_src_gen_express.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
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
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This item is the unique identifier for this expression step.
     * @return IntColumn
     */
    public IntColumn getStepId() {
        return delegate.getColumn("step_id", DelegatingIntColumn::new);
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return IntColumn
     */
    public IntColumn getNextStepId() {
        return delegate.getColumn("next_step_id", DelegatingIntColumn::new);
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product.
     * @return StrColumn
     */
    public StrColumn getEndConstructId() {
        return delegate.getColumn("end_construct_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return delegate.getColumn("robot_id", DelegatingStrColumn::new);
    }

    /**
     * The date of production step.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return delegate.getColumn("date", DelegatingStrColumn::new);
    }

    /**
     * The nature of the promoter controlling expression of the gene.
     * @return StrColumn
     */
    public StrColumn getPromoterType() {
        return delegate.getColumn("promoter_type", DelegatingStrColumn::new);
    }

    /**
     * This item is a pointer to _pdbx_construct.id in the
     * PDBX_CONSTRUCT category. The referenced entry will contain
     * the nucleotide sequence that is to be expressed, including tags.
     * @return StrColumn
     */
    public StrColumn getPlasmidId() {
        return delegate.getColumn("plasmid_id", DelegatingStrColumn::new);
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid)
     * in the expression system.
     * @return StrColumn
     */
    public StrColumn getVectorType() {
        return delegate.getColumn("vector_type", DelegatingStrColumn::new);
    }

    /**
     * Any N-terminal sequence tag as a string of one letter amino acid codes.
     * @return StrColumn
     */
    public StrColumn getNTerminalSeqTag() {
        return delegate.getColumn("N_terminal_seq_tag", DelegatingStrColumn::new);
    }

    /**
     * Any C-terminal sequence tag as a string of one letter amino acid codes
     * @return StrColumn
     */
    public StrColumn getCTerminalSeqTag() {
        return delegate.getColumn("C_terminal_seq_tag", DelegatingStrColumn::new);
    }

    /**
     * The scientific name of the organism that served as host for the
     * expression system. It is expected that either this item or
     * _pdbx_entity_src_gen_express.host_org_tax_id should be populated.
     * @return StrColumn
     */
    public StrColumn getHostOrgScientificName() {
        return delegate.getColumn("host_org_scientific_name", DelegatingStrColumn::new);
    }

    /**
     * The common name of the organism that served as host for the
     * expression system. Where _pdbx_entity_src_gen_express.host_org_tax_id
     * is populated it is expected that this item may be derived by
     * look up against the taxonomy database.
     * @return StrColumn
     */
    public StrColumn getHostOrgCommonName() {
        return delegate.getColumn("host_org_common_name", DelegatingStrColumn::new);
    }

    /**
     * The vairant of the organism that served as host for the expression
     * system. Where _pdbx_entity_src_gen_express.host_org_tax_id is
     * populated it is expected that this item may be derived by a
     * look up against the taxonomy database.
     * @return StrColumn
     */
    public StrColumn getHostOrgVariant() {
        return delegate.getColumn("host_org_variant", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism that served as host for the expression
     * system. Where _pdbx_entity_src_gen_express.host_org_tax_id is
     * populated it is expected that this item may be derived by a
     * look up against the taxonomy database.
     * @return StrColumn
     */
    public StrColumn getHostOrgStrain() {
        return delegate.getColumn("host_org_strain", DelegatingStrColumn::new);
    }

    /**
     * The specific tissue which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getHostOrgTissue() {
        return delegate.getColumn("host_org_tissue", DelegatingStrColumn::new);
    }

    /**
     * Culture collection of the expression system
     * @return StrColumn
     */
    public StrColumn getHostOrgCultureCollection() {
        return delegate.getColumn("host_org_culture_collection", DelegatingStrColumn::new);
    }

    /**
     * A specific line of cells used as the expression system
     * @return StrColumn
     */
    public StrColumn getHostOrgCellLine() {
        return delegate.getColumn("host_org_cell_line", DelegatingStrColumn::new);
    }

    /**
     * The id for the NCBI taxonomy node corresponding to the organism that
     * served as host for the expression system.
     * @return StrColumn
     */
    public StrColumn getHostOrgTaxId() {
        return delegate.getColumn("host_org_tax_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the organism that served as
     * host for the  expression system.
     * @return StrColumn
     */
    public StrColumn getHostOrgDetails() {
        return delegate.getColumn("host_org_details", DelegatingStrColumn::new);
    }

    /**
     * The name of the base media in which the expression host was grown.
     * @return StrColumn
     */
    public StrColumn getCultureBaseMedia() {
        return delegate.getColumn("culture_base_media", DelegatingStrColumn::new);
    }

    /**
     * Any additives to the base media in which the expression host was grown.
     * @return StrColumn
     */
    public StrColumn getCultureAdditives() {
        return delegate.getColumn("culture_additives", DelegatingStrColumn::new);
    }

    /**
     * The volume of media in milliliters in which the expression host was grown.
     * @return FloatColumn
     */
    public FloatColumn getCultureVolume() {
        return delegate.getColumn("culture_volume", DelegatingFloatColumn::new);
    }

    /**
     * The time in hours for which the expression host was allowed to grow
     * prior to induction/transformation/transfection.
     * @return FloatColumn
     */
    public FloatColumn getCultureTime() {
        return delegate.getColumn("culture_time", DelegatingFloatColumn::new);
    }

    /**
     * The temperature in degrees celsius at which the expression host was allowed
     * to grow prior to induction/transformation/transfection.
     * @return FloatColumn
     */
    public FloatColumn getCultureTemperature() {
        return delegate.getColumn("culture_temperature", DelegatingFloatColumn::new);
    }

    /**
     * The chemical name of the inducing agent.
     * @return StrColumn
     */
    public StrColumn getInducer() {
        return delegate.getColumn("inducer", DelegatingStrColumn::new);
    }

    /**
     * Concentration of the inducing agent.
     * @return FloatColumn
     */
    public FloatColumn getInducerConcentration() {
        return delegate.getColumn("inducer_concentration", DelegatingFloatColumn::new);
    }

    /**
     * Details of induction/transformation/transfection.
     * @return StrColumn
     */
    public StrColumn getInductionDetails() {
        return delegate.getColumn("induction_details", DelegatingStrColumn::new);
    }

    /**
     * The multiplicity of infection for genes introduced by transfection, eg.
     * for baculovirus-based expression.
     * @return FloatColumn
     */
    public FloatColumn getMultiplicityOfInfection() {
        return delegate.getColumn("multiplicity_of_infection", DelegatingFloatColumn::new);
    }

    /**
     * The time in hours after induction/transformation/transfection at which
     * the optical density of the culture was measured.
     * @return FloatColumn
     */
    public FloatColumn getInductionTimepoint() {
        return delegate.getColumn("induction_timepoint", DelegatingFloatColumn::new);
    }

    /**
     * The temperature in celsius at which the induced/transformed/transfected
     * cells were grown.
     * @return FloatColumn
     */
    public FloatColumn getInductionTemperature() {
        return delegate.getColumn("induction_temperature", DelegatingFloatColumn::new);
    }

    /**
     * Details of the harvesting protocol.
     * @return StrColumn
     */
    public StrColumn getHarvestingDetails() {
        return delegate.getColumn("harvesting_details", DelegatingStrColumn::new);
    }

    /**
     * Details of how the harvested culture was stored.
     * @return StrColumn
     */
    public StrColumn getStorageDetails() {
        return delegate.getColumn("storage_details", DelegatingStrColumn::new);
    }

    /**
     * Summary of the details of the expression steps used in protein production.
     * @return StrColumn
     */
    public StrColumn getSummary() {
        return delegate.getColumn("summary", DelegatingStrColumn::new);
    }

}