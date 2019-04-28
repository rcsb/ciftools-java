package org.rcsb.cif.model.generated.pdbxentitysrcgenexpress;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
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
     * @return EntryId
     */
    public EntryId getEntryId() {
        return (EntryId) (isText ? textFields.computeIfAbsent("entry_id",
                EntryId::new) : getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_entity_src_gen_express.entity_id uniquely identifies
     * each protein contained in the project target complex proteins whose
     * structure is to be determined. This data item is a pointer to _entity.id
     * in the ENTITY category.
     * This item may be a site dependent bar code.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This item is the unique identifier for this expression step.
     * @return StepId
     */
    public StepId getStepId() {
        return (StepId) (isText ? textFields.computeIfAbsent("step_id",
                StepId::new) : getBinaryColumn("step_id"));
    }

    /**
     * This item unique identifier for the next production step. This allows
     * a workflow to have multiple entry points leading to a single product.
     * @return NextStepId
     */
    public NextStepId getNextStepId() {
        return (NextStepId) (isText ? textFields.computeIfAbsent("next_step_id",
                NextStepId::new) : getBinaryColumn("next_step_id"));
    }

    /**
     * This item is a pointer to pdbx_construct.id in the PDBX_CONSTRUCT
     * category. The referenced sequence is expected to be the amino
     * acid sequence of the expressed product.
     * @return EndConstructId
     */
    public EndConstructId getEndConstructId() {
        return (EndConstructId) (isText ? textFields.computeIfAbsent("end_construct_id",
                EndConstructId::new) : getBinaryColumn("end_construct_id"));
    }

    /**
     * This data item is a pointer to pdbx_robot_system.id
     * in the PDBX_ROBOT_SYSTEM category.
     * @return RobotId
     */
    public RobotId getRobotId() {
        return (RobotId) (isText ? textFields.computeIfAbsent("robot_id",
                RobotId::new) : getBinaryColumn("robot_id"));
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
     * The nature of the promoter controlling expression of the gene.
     * @return PromoterType
     */
    public PromoterType getPromoterType() {
        return (PromoterType) (isText ? textFields.computeIfAbsent("promoter_type",
                PromoterType::new) : getBinaryColumn("promoter_type"));
    }

    /**
     * This item is a pointer to _pdbx_construct.id in the
     * PDBX_CONSTRUCT category. The referenced entry will contain
     * the nucleotide sequence that is to be expressed, including tags.
     * @return PlasmidId
     */
    public PlasmidId getPlasmidId() {
        return (PlasmidId) (isText ? textFields.computeIfAbsent("plasmid_id",
                PlasmidId::new) : getBinaryColumn("plasmid_id"));
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid)
     * in the expression system.
     * @return VectorType
     */
    public VectorType getVectorType() {
        return (VectorType) (isText ? textFields.computeIfAbsent("vector_type",
                VectorType::new) : getBinaryColumn("vector_type"));
    }

    /**
     * Any N-terminal sequence tag as a string of one letter amino acid codes.
     * @return NTerminalSeqTag
     */
    public NTerminalSeqTag getNTerminalSeqTag() {
        return (NTerminalSeqTag) (isText ? textFields.computeIfAbsent("N_terminal_seq_tag",
                NTerminalSeqTag::new) : getBinaryColumn("N_terminal_seq_tag"));
    }

    /**
     * Any C-terminal sequence tag as a string of one letter amino acid codes
     * @return CTerminalSeqTag
     */
    public CTerminalSeqTag getCTerminalSeqTag() {
        return (CTerminalSeqTag) (isText ? textFields.computeIfAbsent("C_terminal_seq_tag",
                CTerminalSeqTag::new) : getBinaryColumn("C_terminal_seq_tag"));
    }

    /**
     * The scientific name of the organism that served as host for the
     * expression system. It is expected that either this item or
     * _pdbx_entity_src_gen_express.host_org_tax_id should be populated.
     * @return HostOrgScientificName
     */
    public HostOrgScientificName getHostOrgScientificName() {
        return (HostOrgScientificName) (isText ? textFields.computeIfAbsent("host_org_scientific_name",
                HostOrgScientificName::new) : getBinaryColumn("host_org_scientific_name"));
    }

    /**
     * The common name of the organism that served as host for the
     * expression system. Where _pdbx_entity_src_gen_express.host_org_tax_id
     * is populated it is expected that this item may be derived by
     * look up against the taxonomy database.
     * @return HostOrgCommonName
     */
    public HostOrgCommonName getHostOrgCommonName() {
        return (HostOrgCommonName) (isText ? textFields.computeIfAbsent("host_org_common_name",
                HostOrgCommonName::new) : getBinaryColumn("host_org_common_name"));
    }

    /**
     * The vairant of the organism that served as host for the expression
     * system. Where _pdbx_entity_src_gen_express.host_org_tax_id is
     * populated it is expected that this item may be derived by a
     * look up against the taxonomy database.
     * @return HostOrgVariant
     */
    public HostOrgVariant getHostOrgVariant() {
        return (HostOrgVariant) (isText ? textFields.computeIfAbsent("host_org_variant",
                HostOrgVariant::new) : getBinaryColumn("host_org_variant"));
    }

    /**
     * The strain of the organism that served as host for the expression
     * system. Where _pdbx_entity_src_gen_express.host_org_tax_id is
     * populated it is expected that this item may be derived by a
     * look up against the taxonomy database.
     * @return HostOrgStrain
     */
    public HostOrgStrain getHostOrgStrain() {
        return (HostOrgStrain) (isText ? textFields.computeIfAbsent("host_org_strain",
                HostOrgStrain::new) : getBinaryColumn("host_org_strain"));
    }

    /**
     * The specific tissue which expressed the molecule.
     * @return HostOrgTissue
     */
    public HostOrgTissue getHostOrgTissue() {
        return (HostOrgTissue) (isText ? textFields.computeIfAbsent("host_org_tissue",
                HostOrgTissue::new) : getBinaryColumn("host_org_tissue"));
    }

    /**
     * Culture collection of the expression system
     * @return HostOrgCultureCollection
     */
    public HostOrgCultureCollection getHostOrgCultureCollection() {
        return (HostOrgCultureCollection) (isText ? textFields.computeIfAbsent("host_org_culture_collection",
                HostOrgCultureCollection::new) : getBinaryColumn("host_org_culture_collection"));
    }

    /**
     * A specific line of cells used as the expression system
     * @return HostOrgCellLine
     */
    public HostOrgCellLine getHostOrgCellLine() {
        return (HostOrgCellLine) (isText ? textFields.computeIfAbsent("host_org_cell_line",
                HostOrgCellLine::new) : getBinaryColumn("host_org_cell_line"));
    }

    /**
     * The id for the NCBI taxonomy node corresponding to the organism that
     * served as host for the expression system.
     * @return HostOrgTaxId
     */
    public HostOrgTaxId getHostOrgTaxId() {
        return (HostOrgTaxId) (isText ? textFields.computeIfAbsent("host_org_tax_id",
                HostOrgTaxId::new) : getBinaryColumn("host_org_tax_id"));
    }

    /**
     * A description of special aspects of the organism that served as
     * host for the  expression system.
     * @return HostOrgDetails
     */
    public HostOrgDetails getHostOrgDetails() {
        return (HostOrgDetails) (isText ? textFields.computeIfAbsent("host_org_details",
                HostOrgDetails::new) : getBinaryColumn("host_org_details"));
    }

    /**
     * The name of the base media in which the expression host was grown.
     * @return CultureBaseMedia
     */
    public CultureBaseMedia getCultureBaseMedia() {
        return (CultureBaseMedia) (isText ? textFields.computeIfAbsent("culture_base_media",
                CultureBaseMedia::new) : getBinaryColumn("culture_base_media"));
    }

    /**
     * Any additives to the base media in which the expression host was grown.
     * @return CultureAdditives
     */
    public CultureAdditives getCultureAdditives() {
        return (CultureAdditives) (isText ? textFields.computeIfAbsent("culture_additives",
                CultureAdditives::new) : getBinaryColumn("culture_additives"));
    }

    /**
     * The volume of media in milliliters in which the expression host was grown.
     * @return CultureVolume
     */
    public CultureVolume getCultureVolume() {
        return (CultureVolume) (isText ? textFields.computeIfAbsent("culture_volume",
                CultureVolume::new) : getBinaryColumn("culture_volume"));
    }

    /**
     * The time in hours for which the expression host was allowed to grow
     * prior to induction/transformation/transfection.
     * @return CultureTime
     */
    public CultureTime getCultureTime() {
        return (CultureTime) (isText ? textFields.computeIfAbsent("culture_time",
                CultureTime::new) : getBinaryColumn("culture_time"));
    }

    /**
     * The temperature in degrees celsius at which the expression host was allowed
     * to grow prior to induction/transformation/transfection.
     * @return CultureTemperature
     */
    public CultureTemperature getCultureTemperature() {
        return (CultureTemperature) (isText ? textFields.computeIfAbsent("culture_temperature",
                CultureTemperature::new) : getBinaryColumn("culture_temperature"));
    }

    /**
     * The chemical name of the inducing agent.
     * @return Inducer
     */
    public Inducer getInducer() {
        return (Inducer) (isText ? textFields.computeIfAbsent("inducer",
                Inducer::new) : getBinaryColumn("inducer"));
    }

    /**
     * Concentration of the inducing agent.
     * @return InducerConcentration
     */
    public InducerConcentration getInducerConcentration() {
        return (InducerConcentration) (isText ? textFields.computeIfAbsent("inducer_concentration",
                InducerConcentration::new) : getBinaryColumn("inducer_concentration"));
    }

    /**
     * Details of induction/transformation/transfection.
     * @return InductionDetails
     */
    public InductionDetails getInductionDetails() {
        return (InductionDetails) (isText ? textFields.computeIfAbsent("induction_details",
                InductionDetails::new) : getBinaryColumn("induction_details"));
    }

    /**
     * The multiplicity of infection for genes introduced by transfection, eg.
     * for baculovirus-based expression.
     * @return MultiplicityOfInfection
     */
    public MultiplicityOfInfection getMultiplicityOfInfection() {
        return (MultiplicityOfInfection) (isText ? textFields.computeIfAbsent("multiplicity_of_infection",
                MultiplicityOfInfection::new) : getBinaryColumn("multiplicity_of_infection"));
    }

    /**
     * The time in hours after induction/transformation/transfection at which
     * the optical density of the culture was measured.
     * @return InductionTimepoint
     */
    public InductionTimepoint getInductionTimepoint() {
        return (InductionTimepoint) (isText ? textFields.computeIfAbsent("induction_timepoint",
                InductionTimepoint::new) : getBinaryColumn("induction_timepoint"));
    }

    /**
     * The temperature in celsius at which the induced/transformed/transfected
     * cells were grown.
     * @return InductionTemperature
     */
    public InductionTemperature getInductionTemperature() {
        return (InductionTemperature) (isText ? textFields.computeIfAbsent("induction_temperature",
                InductionTemperature::new) : getBinaryColumn("induction_temperature"));
    }

    /**
     * Details of the harvesting protocol.
     * @return HarvestingDetails
     */
    public HarvestingDetails getHarvestingDetails() {
        return (HarvestingDetails) (isText ? textFields.computeIfAbsent("harvesting_details",
                HarvestingDetails::new) : getBinaryColumn("harvesting_details"));
    }

    /**
     * Details of how the harvested culture was stored.
     * @return StorageDetails
     */
    public StorageDetails getStorageDetails() {
        return (StorageDetails) (isText ? textFields.computeIfAbsent("storage_details",
                StorageDetails::new) : getBinaryColumn("storage_details"));
    }

    /**
     * Summary of the details of the expression steps used in protein production.
     * @return Summary
     */
    public Summary getSummary() {
        return (Summary) (isText ? textFields.computeIfAbsent("summary",
                Summary::new) : getBinaryColumn("summary"));
    }
}
