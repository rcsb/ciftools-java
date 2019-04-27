package org.rcsb.cif.model.entitysrcgen;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntitySrcGen extends BaseCategory {
    public EntitySrcGen(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntitySrcGen(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntitySrcGen(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * The common name of the natural organism from which the gene was
     * obtained.
     * @return GeneSrcCommonName
     */
    public GeneSrcCommonName getGeneSrcCommonName() {
        return (GeneSrcCommonName) (isText ? textFields.computeIfAbsent("gene_src_common_name",
                GeneSrcCommonName::new) : getBinaryColumn("gene_src_common_name"));
    }

    /**
     * A description of special aspects of the natural organism from
     * which the gene was obtained.
     * @return GeneSrcDetails
     */
    public GeneSrcDetails getGeneSrcDetails() {
        return (GeneSrcDetails) (isText ? textFields.computeIfAbsent("gene_src_details",
                GeneSrcDetails::new) : getBinaryColumn("gene_src_details"));
    }

    /**
     * The genus of the natural organism from which the gene was
     * obtained.
     * @return GeneSrcGenus
     */
    public GeneSrcGenus getGeneSrcGenus() {
        return (GeneSrcGenus) (isText ? textFields.computeIfAbsent("gene_src_genus",
                GeneSrcGenus::new) : getBinaryColumn("gene_src_genus"));
    }

    /**
     * The species of the natural organism from which the gene was
     * obtained.
     * @return GeneSrcSpecies
     */
    public GeneSrcSpecies getGeneSrcSpecies() {
        return (GeneSrcSpecies) (isText ? textFields.computeIfAbsent("gene_src_species",
                GeneSrcSpecies::new) : getBinaryColumn("gene_src_species"));
    }

    /**
     * The strain of the natural organism from which the gene was
     * obtained, if relevant.
     * @return GeneSrcStrain
     */
    public GeneSrcStrain getGeneSrcStrain() {
        return (GeneSrcStrain) (isText ? textFields.computeIfAbsent("gene_src_strain",
                GeneSrcStrain::new) : getBinaryColumn("gene_src_strain"));
    }

    /**
     * The tissue of the natural organism from which the gene was
     * obtained.
     * @return GeneSrcTissue
     */
    public GeneSrcTissue getGeneSrcTissue() {
        return (GeneSrcTissue) (isText ? textFields.computeIfAbsent("gene_src_tissue",
                GeneSrcTissue::new) : getBinaryColumn("gene_src_tissue"));
    }

    /**
     * The subcellular fraction of the tissue of the natural organism
     * from which the gene was obtained.
     * @return GeneSrcTissueFraction
     */
    public GeneSrcTissueFraction getGeneSrcTissueFraction() {
        return (GeneSrcTissueFraction) (isText ? textFields.computeIfAbsent("gene_src_tissue_fraction",
                GeneSrcTissueFraction::new) : getBinaryColumn("gene_src_tissue_fraction"));
    }

    /**
     * The genus of the organism that served as host for the production
     * of the entity.
     * @return HostOrgGenus
     */
    public HostOrgGenus getHostOrgGenus() {
        return (HostOrgGenus) (isText ? textFields.computeIfAbsent("host_org_genus",
                HostOrgGenus::new) : getBinaryColumn("host_org_genus"));
    }

    /**
     * The species of the organism that served as host for the
     * production of the entity.
     * @return HostOrgSpecies
     */
    public HostOrgSpecies getHostOrgSpecies() {
        return (HostOrgSpecies) (isText ? textFields.computeIfAbsent("host_org_species",
                HostOrgSpecies::new) : getBinaryColumn("host_org_species"));
    }

    /**
     * A domain or fragment of the molecule.
     * @return PdbxGeneSrcFragment
     */
    public PdbxGeneSrcFragment getPdbxGeneSrcFragment() {
        return (PdbxGeneSrcFragment) (isText ? textFields.computeIfAbsent("pdbx_gene_src_fragment",
                PdbxGeneSrcFragment::new) : getBinaryColumn("pdbx_gene_src_fragment"));
    }

    /**
     * Identifies the gene.
     * @return PdbxGeneSrcGene
     */
    public PdbxGeneSrcGene getPdbxGeneSrcGene() {
        return (PdbxGeneSrcGene) (isText ? textFields.computeIfAbsent("pdbx_gene_src_gene",
                PdbxGeneSrcGene::new) : getBinaryColumn("pdbx_gene_src_gene"));
    }

    /**
     * Scientific name of the organism.
     * @return PdbxGeneSrcScientificName
     */
    public PdbxGeneSrcScientificName getPdbxGeneSrcScientificName() {
        return (PdbxGeneSrcScientificName) (isText ? textFields.computeIfAbsent("pdbx_gene_src_scientific_name",
                PdbxGeneSrcScientificName::new) : getBinaryColumn("pdbx_gene_src_scientific_name"));
    }

    /**
     * Identifies the variant.
     * @return PdbxGeneSrcVariant
     */
    public PdbxGeneSrcVariant getPdbxGeneSrcVariant() {
        return (PdbxGeneSrcVariant) (isText ? textFields.computeIfAbsent("pdbx_gene_src_variant",
                PdbxGeneSrcVariant::new) : getBinaryColumn("pdbx_gene_src_variant"));
    }

    /**
     * The specific line of cells.
     * @return PdbxGeneSrcCellLine
     */
    public PdbxGeneSrcCellLine getPdbxGeneSrcCellLine() {
        return (PdbxGeneSrcCellLine) (isText ? textFields.computeIfAbsent("pdbx_gene_src_cell_line",
                PdbxGeneSrcCellLine::new) : getBinaryColumn("pdbx_gene_src_cell_line"));
    }

    /**
     * American Type Culture Collection tissue culture number.
     * @return PdbxGeneSrcAtcc
     */
    public PdbxGeneSrcAtcc getPdbxGeneSrcAtcc() {
        return (PdbxGeneSrcAtcc) (isText ? textFields.computeIfAbsent("pdbx_gene_src_atcc",
                PdbxGeneSrcAtcc::new) : getBinaryColumn("pdbx_gene_src_atcc"));
    }

    /**
     * Organized group of tissues that carries on a specialized function.
     * @return PdbxGeneSrcOrgan
     */
    public PdbxGeneSrcOrgan getPdbxGeneSrcOrgan() {
        return (PdbxGeneSrcOrgan) (isText ? textFields.computeIfAbsent("pdbx_gene_src_organ",
                PdbxGeneSrcOrgan::new) : getBinaryColumn("pdbx_gene_src_organ"));
    }

    /**
     * Organized structure within cell.
     * @return PdbxGeneSrcOrganelle
     */
    public PdbxGeneSrcOrganelle getPdbxGeneSrcOrganelle() {
        return (PdbxGeneSrcOrganelle) (isText ? textFields.computeIfAbsent("pdbx_gene_src_organelle",
                PdbxGeneSrcOrganelle::new) : getBinaryColumn("pdbx_gene_src_organelle"));
    }

    /**
     * The source plasmid.
     * @return PdbxGeneSrcPlasmid
     */
    public PdbxGeneSrcPlasmid getPdbxGeneSrcPlasmid() {
        return (PdbxGeneSrcPlasmid) (isText ? textFields.computeIfAbsent("pdbx_gene_src_plasmid",
                PdbxGeneSrcPlasmid::new) : getBinaryColumn("pdbx_gene_src_plasmid"));
    }

    /**
     * The source plasmid.
     * @return PdbxGeneSrcPlasmidName
     */
    public PdbxGeneSrcPlasmidName getPdbxGeneSrcPlasmidName() {
        return (PdbxGeneSrcPlasmidName) (isText ? textFields.computeIfAbsent("pdbx_gene_src_plasmid_name",
                PdbxGeneSrcPlasmidName::new) : getBinaryColumn("pdbx_gene_src_plasmid_name"));
    }

    /**
     * Cell type.
     * @return PdbxGeneSrcCell
     */
    public PdbxGeneSrcCell getPdbxGeneSrcCell() {
        return (PdbxGeneSrcCell) (isText ? textFields.computeIfAbsent("pdbx_gene_src_cell",
                PdbxGeneSrcCell::new) : getBinaryColumn("pdbx_gene_src_cell"));
    }

    /**
     * Identifies the location inside (or outside) the cell.
     * @return PdbxGeneSrcCellularLocation
     */
    public PdbxGeneSrcCellularLocation getPdbxGeneSrcCellularLocation() {
        return (PdbxGeneSrcCellularLocation) (isText ? textFields.computeIfAbsent("pdbx_gene_src_cellular_location",
                PdbxGeneSrcCellularLocation::new) : getBinaryColumn("pdbx_gene_src_cellular_location"));
    }

    /**
     * Specific gene which expressed the molecule.
     * @return PdbxHostOrgGene
     */
    public PdbxHostOrgGene getPdbxHostOrgGene() {
        return (PdbxHostOrgGene) (isText ? textFields.computeIfAbsent("pdbx_host_org_gene",
                PdbxHostOrgGene::new) : getBinaryColumn("pdbx_host_org_gene"));
    }

    /**
     * Specific organ which expressed the molecule.
     * @return PdbxHostOrgOrgan
     */
    public PdbxHostOrgOrgan getPdbxHostOrgOrgan() {
        return (PdbxHostOrgOrgan) (isText ? textFields.computeIfAbsent("pdbx_host_org_organ",
                PdbxHostOrgOrgan::new) : getBinaryColumn("pdbx_host_org_organ"));
    }

    /**
     * Specific organelle which expressed the molecule.
     * @return PdbxHostOrgOrganelle
     */
    public PdbxHostOrgOrganelle getPdbxHostOrgOrganelle() {
        return (PdbxHostOrgOrganelle) (isText ? textFields.computeIfAbsent("pdbx_host_org_organelle",
                PdbxHostOrgOrganelle::new) : getBinaryColumn("pdbx_host_org_organelle"));
    }

    /**
     * Identifies the location inside (or outside) the cell which
     * expressed the molecule.
     * @return PdbxHostOrgCellularLocation
     */
    public PdbxHostOrgCellularLocation getPdbxHostOrgCellularLocation() {
        return (PdbxHostOrgCellularLocation) (isText ? textFields.computeIfAbsent("pdbx_host_org_cellular_location",
                PdbxHostOrgCellularLocation::new) : getBinaryColumn("pdbx_host_org_cellular_location"));
    }

    /**
     * 
     * The strain of the organism in which the entity was
     * expressed.
     * @return PdbxHostOrgStrain
     */
    public PdbxHostOrgStrain getPdbxHostOrgStrain() {
        return (PdbxHostOrgStrain) (isText ? textFields.computeIfAbsent("pdbx_host_org_strain",
                PdbxHostOrgStrain::new) : getBinaryColumn("pdbx_host_org_strain"));
    }

    /**
     * 
     * The fraction of the tissue which expressed the
     * molecule.
     * @return PdbxHostOrgTissueFraction
     */
    public PdbxHostOrgTissueFraction getPdbxHostOrgTissueFraction() {
        return (PdbxHostOrgTissueFraction) (isText ? textFields.computeIfAbsent("pdbx_host_org_tissue_fraction",
                PdbxHostOrgTissueFraction::new) : getBinaryColumn("pdbx_host_org_tissue_fraction"));
    }

    /**
     * Information on the source which is not given elsewhere.
     * @return PdbxDescription
     */
    public PdbxDescription getPdbxDescription() {
        return (PdbxDescription) (isText ? textFields.computeIfAbsent("pdbx_description",
                PdbxDescription::new) : getBinaryColumn("pdbx_description"));
    }

    /**
     * The common name of the organism that served as host for the
     * production of the entity.  Where full details of the protein
     * production are available it would be expected that this item
     * be derived from _entity_src_gen_express.host_org_common_name
     * or via _entity_src_gen_express.host_org_tax_id
     * @return HostOrgCommonName
     */
    public HostOrgCommonName getHostOrgCommonName() {
        return (HostOrgCommonName) (isText ? textFields.computeIfAbsent("host_org_common_name",
                HostOrgCommonName::new) : getBinaryColumn("host_org_common_name"));
    }

    /**
     * A description of special aspects of the organism that served as
     * host for the production of the entity. Where full details of
     * the protein production are available it would be expected that
     * this item would derived from _entity_src_gen_express.host_org_details
     * @return HostOrgDetails
     */
    public HostOrgDetails getHostOrgDetails() {
        return (HostOrgDetails) (isText ? textFields.computeIfAbsent("host_org_details",
                HostOrgDetails::new) : getBinaryColumn("host_org_details"));
    }

    /**
     * The strain of the organism in which the entity was expressed.
     * Where full details of the protein production are available
     * it would be expected that this item be derived from
     * _entity_src_gen_express.host_org_strain or via
     * _entity_src_gen_express.host_org_tax_id
     * @return HostOrgStrain
     */
    public HostOrgStrain getHostOrgStrain() {
        return (HostOrgStrain) (isText ? textFields.computeIfAbsent("host_org_strain",
                HostOrgStrain::new) : getBinaryColumn("host_org_strain"));
    }

    /**
     * A description of special aspects of the plasmid that produced the
     * entity in the host organism. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _pdbx_construct.details of the construct
     * pointed to from _entity_src_gen_express.plasmid_id.
     * @return PlasmidDetails
     */
    public PlasmidDetails getPlasmidDetails() {
        return (PlasmidDetails) (isText ? textFields.computeIfAbsent("plasmid_details",
                PlasmidDetails::new) : getBinaryColumn("plasmid_details"));
    }

    /**
     * The name of the plasmid that produced the entity in the host
     * organism. Where full details of the protein production are available
     * it would be expected that this item would be derived from
     * _pdbx_construct.name of the construct pointed to from
     * _entity_src_gen_express.plasmid_id.
     * @return PlasmidName
     */
    public PlasmidName getPlasmidName() {
        return (PlasmidName) (isText ? textFields.computeIfAbsent("plasmid_name",
                PlasmidName::new) : getBinaryColumn("plasmid_name"));
    }

    /**
     * Variant of the organism used as the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item be derived from
     * entity_src_gen_express.host_org_variant or via
     * _entity_src_gen_express.host_org_tax_id
     * @return PdbxHostOrgVariant
     */
    public PdbxHostOrgVariant getPdbxHostOrgVariant() {
        return (PdbxHostOrgVariant) (isText ? textFields.computeIfAbsent("pdbx_host_org_variant",
                PdbxHostOrgVariant::new) : getBinaryColumn("pdbx_host_org_variant"));
    }

    /**
     * A specific line of cells used as the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item would be derived from
     * entity_src_gen_express.host_org_cell_line
     * @return PdbxHostOrgCellLine
     */
    public PdbxHostOrgCellLine getPdbxHostOrgCellLine() {
        return (PdbxHostOrgCellLine) (isText ? textFields.computeIfAbsent("pdbx_host_org_cell_line",
                PdbxHostOrgCellLine::new) : getBinaryColumn("pdbx_host_org_cell_line"));
    }

    /**
     * Americal Tissue Culture Collection of the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item  would be derived from
     * _entity_src_gen_express.host_org_culture_collection
     * @return PdbxHostOrgAtcc
     */
    public PdbxHostOrgAtcc getPdbxHostOrgAtcc() {
        return (PdbxHostOrgAtcc) (isText ? textFields.computeIfAbsent("pdbx_host_org_atcc",
                PdbxHostOrgAtcc::new) : getBinaryColumn("pdbx_host_org_atcc"));
    }

    /**
     * Culture collection of the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item  would be derived somehwere, but
     * exactly where is not clear.
     * @return PdbxHostOrgCultureCollection
     */
    public PdbxHostOrgCultureCollection getPdbxHostOrgCultureCollection() {
        return (PdbxHostOrgCultureCollection) (isText ? textFields.computeIfAbsent("pdbx_host_org_culture_collection",
                PdbxHostOrgCultureCollection::new) : getBinaryColumn("pdbx_host_org_culture_collection"));
    }

    /**
     * Cell type from which the gene is derived. Where
     * entity.target_id is provided this should be derived from
     * details of the target.
     * @return PdbxHostOrgCell
     */
    public PdbxHostOrgCell getPdbxHostOrgCell() {
        return (PdbxHostOrgCell) (isText ? textFields.computeIfAbsent("pdbx_host_org_cell",
                PdbxHostOrgCell::new) : getBinaryColumn("pdbx_host_org_cell"));
    }

    /**
     * The scientific name of the organism that served as host for the
     * production of the entity. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_express.host_org_scientific_name
     * or via _entity_src_gen_express.host_org_tax_id
     * @return PdbxHostOrgScientificName
     */
    public PdbxHostOrgScientificName getPdbxHostOrgScientificName() {
        return (PdbxHostOrgScientificName) (isText ? textFields.computeIfAbsent("pdbx_host_org_scientific_name",
                PdbxHostOrgScientificName::new) : getBinaryColumn("pdbx_host_org_scientific_name"));
    }

    /**
     * The specific tissue which expressed the molecule. Where full details
     * of the protein production are available it would be expected that this
     * item would be derived from _entity_src_gen_express.host_org_tissue
     * @return PdbxHostOrgTissue
     */
    public PdbxHostOrgTissue getPdbxHostOrgTissue() {
        return (PdbxHostOrgTissue) (isText ? textFields.computeIfAbsent("pdbx_host_org_tissue",
                PdbxHostOrgTissue::new) : getBinaryColumn("pdbx_host_org_tissue"));
    }

    /**
     * Identifies the vector used. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_clone.vector_name.
     * @return PdbxHostOrgVector
     */
    public PdbxHostOrgVector getPdbxHostOrgVector() {
        return (PdbxHostOrgVector) (isText ? textFields.computeIfAbsent("pdbx_host_org_vector",
                PdbxHostOrgVector::new) : getBinaryColumn("pdbx_host_org_vector"));
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid).
     * Where full details of the protein production are available it
     * would be expected that this item would be derived from
     * _entity_src_gen_express.vector_type.
     * @return PdbxHostOrgVectorType
     */
    public PdbxHostOrgVectorType getPdbxHostOrgVectorType() {
        return (PdbxHostOrgVectorType) (isText ? textFields.computeIfAbsent("pdbx_host_org_vector_type",
                PdbxHostOrgVectorType::new) : getBinaryColumn("pdbx_host_org_vector_type"));
    }

    /**
     * A unique identifier for the expression system. This
     * should be extracted from a local list of expression
     * systems.
     * @return ExpressionSystemId
     */
    public ExpressionSystemId getExpressionSystemId() {
        return (ExpressionSystemId) (isText ? textFields.computeIfAbsent("expression_system_id",
                ExpressionSystemId::new) : getBinaryColumn("expression_system_id"));
    }

    /**
     * A string to indicate the life-cycle or cell development
     * cycle in which the gene is expressed and the mature
     * protein is active.
     * @return GeneSrcDevStage
     */
    public GeneSrcDevStage getGeneSrcDevStage() {
        return (GeneSrcDevStage) (isText ? textFields.computeIfAbsent("gene_src_dev_stage",
                GeneSrcDevStage::new) : getBinaryColumn("gene_src_dev_stage"));
    }

    /**
     * A pointer to _pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The indentified sequence is the initial construct.
     * @return StartConstructId
     */
    public StartConstructId getStartConstructId() {
        return (StartConstructId) (isText ? textFields.computeIfAbsent("start_construct_id",
                StartConstructId::new) : getBinaryColumn("start_construct_id"));
    }

    /**
     * NCBI Taxonomy identifier for the gene source organism.
     * 
     * Reference:
     * 
     * Wheeler DL, Chappey C, Lash AE, Leipe DD, Madden TL, Schuler GD,
     * Tatusova TA, Rapp BA (2000). Database resources of the National
     * Center for Biotechnology Information. Nucleic Acids Res 2000 Jan
     * 1;28(1):10-4
     * 
     * Benson DA, Karsch-Mizrachi I, Lipman DJ, Ostell J, Rapp BA,
     * Wheeler DL (2000). GenBank. Nucleic Acids Res 2000 Jan 1;28(1):15-18.
     * @return PdbxGeneSrcNcbiTaxonomyId
     */
    public PdbxGeneSrcNcbiTaxonomyId getPdbxGeneSrcNcbiTaxonomyId() {
        return (PdbxGeneSrcNcbiTaxonomyId) (isText ? textFields.computeIfAbsent("pdbx_gene_src_ncbi_taxonomy_id",
                PdbxGeneSrcNcbiTaxonomyId::new) : getBinaryColumn("pdbx_gene_src_ncbi_taxonomy_id"));
    }

    /**
     * NCBI Taxonomy identifier for the expression system organism.
     * 
     * Reference:
     * 
     * Wheeler DL, Chappey C, Lash AE, Leipe DD, Madden TL, Schuler GD,
     * Tatusova TA, Rapp BA (2000). Database resources of the National
     * Center for Biotechnology Information. Nucleic Acids Res 2000 Jan
     * 1;28(1):10-4
     * 
     * Benson DA, Karsch-Mizrachi I, Lipman DJ, Ostell J, Rapp BA,
     * Wheeler DL (2000). GenBank. Nucleic Acids Res 2000 Jan 1;28(1):15-18.
     * @return PdbxHostOrgNcbiTaxonomyId
     */
    public PdbxHostOrgNcbiTaxonomyId getPdbxHostOrgNcbiTaxonomyId() {
        return (PdbxHostOrgNcbiTaxonomyId) (isText ? textFields.computeIfAbsent("pdbx_host_org_ncbi_taxonomy_id",
                PdbxHostOrgNcbiTaxonomyId::new) : getBinaryColumn("pdbx_host_org_ncbi_taxonomy_id"));
    }

    /**
     * This data item is an ordinal identifier for entity_src_gen data records.
     * @return PdbxSrcId
     */
    public PdbxSrcId getPdbxSrcId() {
        return (PdbxSrcId) (isText ? textFields.computeIfAbsent("pdbx_src_id",
                PdbxSrcId::new) : getBinaryColumn("pdbx_src_id"));
    }

    /**
     * This data item identifies cases in which an alternative source
     * modeled.
     * @return PdbxAltSourceFlag
     */
    public PdbxAltSourceFlag getPdbxAltSourceFlag() {
        return (PdbxAltSourceFlag) (isText ? textFields.computeIfAbsent("pdbx_alt_source_flag",
                PdbxAltSourceFlag::new) : getBinaryColumn("pdbx_alt_source_flag"));
    }

    /**
     * This data item povides additional information about the sequence type.
     * @return PdbxSeqType
     */
    public PdbxSeqType getPdbxSeqType() {
        return (PdbxSeqType) (isText ? textFields.computeIfAbsent("pdbx_seq_type",
                PdbxSeqType::new) : getBinaryColumn("pdbx_seq_type"));
    }

    /**
     * The beginning polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return PdbxBegSeqNum
     */
    public PdbxBegSeqNum getPdbxBegSeqNum() {
        return (PdbxBegSeqNum) (isText ? textFields.computeIfAbsent("pdbx_beg_seq_num",
                PdbxBegSeqNum::new) : getBinaryColumn("pdbx_beg_seq_num"));
    }

    /**
     * The ending polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return PdbxEndSeqNum
     */
    public PdbxEndSeqNum getPdbxEndSeqNum() {
        return (PdbxEndSeqNum) (isText ? textFields.computeIfAbsent("pdbx_end_seq_num",
                PdbxEndSeqNum::new) : getBinaryColumn("pdbx_end_seq_num"));
    }

    /**
     * Culture collection identifier.
     * @return PdbxGeneSrcCultureCollection
     */
    public PdbxGeneSrcCultureCollection getPdbxGeneSrcCultureCollection() {
        return (PdbxGeneSrcCultureCollection) (isText ? textFields.computeIfAbsent("pdbx_gene_src_culture_collection",
                PdbxGeneSrcCultureCollection::new) : getBinaryColumn("pdbx_gene_src_culture_collection"));
    }
}
