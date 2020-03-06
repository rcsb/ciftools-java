package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_SRC_GEN category record details of
 * the source from which the entity was obtained in cases
 * where the source was genetically manipulated.  The
 * following are treated separately:  items pertaining to the tissue
 * from which the gene was obtained, items pertaining to the host
 * organism for gene expression and items pertaining to the actual
 * producing organism (plasmid).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntitySrcGen extends DelegatingCategory {
    public EntitySrcGen(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "gene_src_common_name":
                return getGeneSrcCommonName();
            case "gene_src_details":
                return getGeneSrcDetails();
            case "gene_src_genus":
                return getGeneSrcGenus();
            case "gene_src_species":
                return getGeneSrcSpecies();
            case "gene_src_strain":
                return getGeneSrcStrain();
            case "gene_src_tissue":
                return getGeneSrcTissue();
            case "gene_src_tissue_fraction":
                return getGeneSrcTissueFraction();
            case "host_org_genus":
                return getHostOrgGenus();
            case "host_org_species":
                return getHostOrgSpecies();
            case "pdbx_gene_src_fragment":
                return getPdbxGeneSrcFragment();
            case "pdbx_gene_src_gene":
                return getPdbxGeneSrcGene();
            case "pdbx_gene_src_scientific_name":
                return getPdbxGeneSrcScientificName();
            case "pdbx_gene_src_variant":
                return getPdbxGeneSrcVariant();
            case "pdbx_gene_src_cell_line":
                return getPdbxGeneSrcCellLine();
            case "pdbx_gene_src_atcc":
                return getPdbxGeneSrcAtcc();
            case "pdbx_gene_src_organ":
                return getPdbxGeneSrcOrgan();
            case "pdbx_gene_src_organelle":
                return getPdbxGeneSrcOrganelle();
            case "pdbx_gene_src_plasmid":
                return getPdbxGeneSrcPlasmid();
            case "pdbx_gene_src_plasmid_name":
                return getPdbxGeneSrcPlasmidName();
            case "pdbx_gene_src_cell":
                return getPdbxGeneSrcCell();
            case "pdbx_gene_src_cellular_location":
                return getPdbxGeneSrcCellularLocation();
            case "pdbx_host_org_gene":
                return getPdbxHostOrgGene();
            case "pdbx_host_org_organ":
                return getPdbxHostOrgOrgan();
            case "pdbx_host_org_organelle":
                return getPdbxHostOrgOrganelle();
            case "pdbx_host_org_cellular_location":
                return getPdbxHostOrgCellularLocation();
            case "pdbx_host_org_strain":
                return getPdbxHostOrgStrain();
            case "pdbx_host_org_tissue_fraction":
                return getPdbxHostOrgTissueFraction();
            case "pdbx_description":
                return getPdbxDescription();
            case "host_org_common_name":
                return getHostOrgCommonName();
            case "host_org_details":
                return getHostOrgDetails();
            case "host_org_strain":
                return getHostOrgStrain();
            case "plasmid_details":
                return getPlasmidDetails();
            case "plasmid_name":
                return getPlasmidName();
            case "pdbx_host_org_variant":
                return getPdbxHostOrgVariant();
            case "pdbx_host_org_cell_line":
                return getPdbxHostOrgCellLine();
            case "pdbx_host_org_atcc":
                return getPdbxHostOrgAtcc();
            case "pdbx_host_org_culture_collection":
                return getPdbxHostOrgCultureCollection();
            case "pdbx_host_org_cell":
                return getPdbxHostOrgCell();
            case "pdbx_host_org_scientific_name":
                return getPdbxHostOrgScientificName();
            case "pdbx_host_org_tissue":
                return getPdbxHostOrgTissue();
            case "pdbx_host_org_vector":
                return getPdbxHostOrgVector();
            case "pdbx_host_org_vector_type":
                return getPdbxHostOrgVectorType();
            case "expression_system_id":
                return getExpressionSystemId();
            case "gene_src_dev_stage":
                return getGeneSrcDevStage();
            case "start_construct_id":
                return getStartConstructId();
            case "pdbx_gene_src_ncbi_taxonomy_id":
                return getPdbxGeneSrcNcbiTaxonomyId();
            case "pdbx_host_org_ncbi_taxonomy_id":
                return getPdbxHostOrgNcbiTaxonomyId();
            case "pdbx_src_id":
                return getPdbxSrcId();
            case "pdbx_alt_source_flag":
                return getPdbxAltSourceFlag();
            case "pdbx_seq_type":
                return getPdbxSeqType();
            case "pdbx_beg_seq_num":
                return getPdbxBegSeqNum();
            case "pdbx_end_seq_num":
                return getPdbxEndSeqNum();
            case "pdbx_gene_src_culture_collection":
                return getPdbxGeneSrcCultureCollection();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The common name of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcCommonName() {
        return delegate.getColumn("gene_src_common_name", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the natural organism from
     * which the gene was obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcDetails() {
        return delegate.getColumn("gene_src_details", DelegatingStrColumn::new);
    }

    /**
     * The genus of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcGenus() {
        return delegate.getColumn("gene_src_genus", DelegatingStrColumn::new);
    }

    /**
     * The species of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcSpecies() {
        return delegate.getColumn("gene_src_species", DelegatingStrColumn::new);
    }

    /**
     * The strain of the natural organism from which the gene was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getGeneSrcStrain() {
        return delegate.getColumn("gene_src_strain", DelegatingStrColumn::new);
    }

    /**
     * The tissue of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcTissue() {
        return delegate.getColumn("gene_src_tissue", DelegatingStrColumn::new);
    }

    /**
     * The subcellular fraction of the tissue of the natural organism
     * from which the gene was obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcTissueFraction() {
        return delegate.getColumn("gene_src_tissue_fraction", DelegatingStrColumn::new);
    }

    /**
     * The genus of the organism that served as host for the production
     * of the entity.
     * @return StrColumn
     */
    public StrColumn getHostOrgGenus() {
        return delegate.getColumn("host_org_genus", DelegatingStrColumn::new);
    }

    /**
     * The species of the organism that served as host for the
     * production of the entity.
     * @return StrColumn
     */
    public StrColumn getHostOrgSpecies() {
        return delegate.getColumn("host_org_species", DelegatingStrColumn::new);
    }

    /**
     * A domain or fragment of the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcFragment() {
        return delegate.getColumn("pdbx_gene_src_fragment", DelegatingStrColumn::new);
    }

    /**
     * Identifies the gene.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcGene() {
        return delegate.getColumn("pdbx_gene_src_gene", DelegatingStrColumn::new);
    }

    /**
     * Scientific name of the organism.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcScientificName() {
        return delegate.getColumn("pdbx_gene_src_scientific_name", DelegatingStrColumn::new);
    }

    /**
     * Identifies the variant.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcVariant() {
        return delegate.getColumn("pdbx_gene_src_variant", DelegatingStrColumn::new);
    }

    /**
     * The specific line of cells.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCellLine() {
        return delegate.getColumn("pdbx_gene_src_cell_line", DelegatingStrColumn::new);
    }

    /**
     * American Type Culture Collection tissue culture number.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcAtcc() {
        return delegate.getColumn("pdbx_gene_src_atcc", DelegatingStrColumn::new);
    }

    /**
     * Organized group of tissues that carries on a specialized function.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcOrgan() {
        return delegate.getColumn("pdbx_gene_src_organ", DelegatingStrColumn::new);
    }

    /**
     * Organized structure within cell.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcOrganelle() {
        return delegate.getColumn("pdbx_gene_src_organelle", DelegatingStrColumn::new);
    }

    /**
     * The source plasmid.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcPlasmid() {
        return delegate.getColumn("pdbx_gene_src_plasmid", DelegatingStrColumn::new);
    }

    /**
     * The source plasmid.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcPlasmidName() {
        return delegate.getColumn("pdbx_gene_src_plasmid_name", DelegatingStrColumn::new);
    }

    /**
     * Cell type.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCell() {
        return delegate.getColumn("pdbx_gene_src_cell", DelegatingStrColumn::new);
    }

    /**
     * Identifies the location inside (or outside) the cell.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCellularLocation() {
        return delegate.getColumn("pdbx_gene_src_cellular_location", DelegatingStrColumn::new);
    }

    /**
     * Specific gene which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgGene() {
        return delegate.getColumn("pdbx_host_org_gene", DelegatingStrColumn::new);
    }

    /**
     * Specific organ which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgOrgan() {
        return delegate.getColumn("pdbx_host_org_organ", DelegatingStrColumn::new);
    }

    /**
     * Specific organelle which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgOrganelle() {
        return delegate.getColumn("pdbx_host_org_organelle", DelegatingStrColumn::new);
    }

    /**
     * Identifies the location inside (or outside) the cell which
     * expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCellularLocation() {
        return delegate.getColumn("pdbx_host_org_cellular_location", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism in which the entity was
     * expressed.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgStrain() {
        return delegate.getColumn("pdbx_host_org_strain", DelegatingStrColumn::new);
    }

    /**
     * The fraction of the tissue which expressed the
     * molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgTissueFraction() {
        return delegate.getColumn("pdbx_host_org_tissue_fraction", DelegatingStrColumn::new);
    }

    /**
     * Information on the source which is not given elsewhere.
     * @return StrColumn
     */
    public StrColumn getPdbxDescription() {
        return delegate.getColumn("pdbx_description", DelegatingStrColumn::new);
    }

    /**
     * The common name of the organism that served as host for the
     * production of the entity.  Where full details of the protein
     * production are available it would be expected that this item
     * be derived from _entity_src_gen_express.host_org_common_name
     * or via _entity_src_gen_express.host_org_tax_id
     * @return StrColumn
     */
    public StrColumn getHostOrgCommonName() {
        return delegate.getColumn("host_org_common_name", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the organism that served as
     * host for the production of the entity. Where full details of
     * the protein production are available it would be expected that
     * this item would derived from _entity_src_gen_express.host_org_details
     * @return StrColumn
     */
    public StrColumn getHostOrgDetails() {
        return delegate.getColumn("host_org_details", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism in which the entity was expressed.
     * Where full details of the protein production are available
     * it would be expected that this item be derived from
     * _entity_src_gen_express.host_org_strain or via
     * _entity_src_gen_express.host_org_tax_id
     * @return StrColumn
     */
    public StrColumn getHostOrgStrain() {
        return delegate.getColumn("host_org_strain", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the plasmid that produced the
     * entity in the host organism. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _pdbx_construct.details of the construct
     * pointed to from _entity_src_gen_express.plasmid_id.
     * @return StrColumn
     */
    public StrColumn getPlasmidDetails() {
        return delegate.getColumn("plasmid_details", DelegatingStrColumn::new);
    }

    /**
     * The name of the plasmid that produced the entity in the host
     * organism. Where full details of the protein production are available
     * it would be expected that this item would be derived from
     * _pdbx_construct.name of the construct pointed to from
     * _entity_src_gen_express.plasmid_id.
     * @return StrColumn
     */
    public StrColumn getPlasmidName() {
        return delegate.getColumn("plasmid_name", DelegatingStrColumn::new);
    }

    /**
     * Variant of the organism used as the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item be derived from
     * entity_src_gen_express.host_org_variant or via
     * _entity_src_gen_express.host_org_tax_id
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgVariant() {
        return delegate.getColumn("pdbx_host_org_variant", DelegatingStrColumn::new);
    }

    /**
     * A specific line of cells used as the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item would be derived from
     * entity_src_gen_express.host_org_cell_line
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCellLine() {
        return delegate.getColumn("pdbx_host_org_cell_line", DelegatingStrColumn::new);
    }

    /**
     * Americal Tissue Culture Collection of the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item  would be derived from
     * _entity_src_gen_express.host_org_culture_collection
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgAtcc() {
        return delegate.getColumn("pdbx_host_org_atcc", DelegatingStrColumn::new);
    }

    /**
     * Culture collection of the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item  would be derived somehwere, but
     * exactly where is not clear.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCultureCollection() {
        return delegate.getColumn("pdbx_host_org_culture_collection", DelegatingStrColumn::new);
    }

    /**
     * Cell type from which the gene is derived. Where
     * entity.target_id is provided this should be derived from
     * details of the target.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCell() {
        return delegate.getColumn("pdbx_host_org_cell", DelegatingStrColumn::new);
    }

    /**
     * The scientific name of the organism that served as host for the
     * production of the entity. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_express.host_org_scientific_name
     * or via _entity_src_gen_express.host_org_tax_id
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgScientificName() {
        return delegate.getColumn("pdbx_host_org_scientific_name", DelegatingStrColumn::new);
    }

    /**
     * The specific tissue which expressed the molecule. Where full details
     * of the protein production are available it would be expected that this
     * item would be derived from _entity_src_gen_express.host_org_tissue
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgTissue() {
        return delegate.getColumn("pdbx_host_org_tissue", DelegatingStrColumn::new);
    }

    /**
     * Identifies the vector used. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_clone.vector_name.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgVector() {
        return delegate.getColumn("pdbx_host_org_vector", DelegatingStrColumn::new);
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid).
     * Where full details of the protein production are available it
     * would be expected that this item would be derived from
     * _entity_src_gen_express.vector_type.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgVectorType() {
        return delegate.getColumn("pdbx_host_org_vector_type", DelegatingStrColumn::new);
    }

    /**
     * A unique identifier for the expression system. This
     * should be extracted from a local list of expression
     * systems.
     * @return StrColumn
     */
    public StrColumn getExpressionSystemId() {
        return delegate.getColumn("expression_system_id", DelegatingStrColumn::new);
    }

    /**
     * A string to indicate the life-cycle or cell development
     * cycle in which the gene is expressed and the mature
     * protein is active.
     * @return StrColumn
     */
    public StrColumn getGeneSrcDevStage() {
        return delegate.getColumn("gene_src_dev_stage", DelegatingStrColumn::new);
    }

    /**
     * A pointer to _pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The indentified sequence is the initial construct.
     * @return StrColumn
     */
    public StrColumn getStartConstructId() {
        return delegate.getColumn("start_construct_id", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcNcbiTaxonomyId() {
        return delegate.getColumn("pdbx_gene_src_ncbi_taxonomy_id", DelegatingStrColumn::new);
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
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgNcbiTaxonomyId() {
        return delegate.getColumn("pdbx_host_org_ncbi_taxonomy_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is an ordinal identifier for entity_src_gen data records.
     * @return IntColumn
     */
    public IntColumn getPdbxSrcId() {
        return delegate.getColumn("pdbx_src_id", DelegatingIntColumn::new);
    }

    /**
     * This data item identifies cases in which an alternative source
     * modeled.
     * @return StrColumn
     */
    public StrColumn getPdbxAltSourceFlag() {
        return delegate.getColumn("pdbx_alt_source_flag", DelegatingStrColumn::new);
    }

    /**
     * This data item povides additional information about the sequence type.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqType() {
        return delegate.getColumn("pdbx_seq_type", DelegatingStrColumn::new);
    }

    /**
     * The beginning polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getPdbxBegSeqNum() {
        return delegate.getColumn("pdbx_beg_seq_num", DelegatingIntColumn::new);
    }

    /**
     * The ending polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getPdbxEndSeqNum() {
        return delegate.getColumn("pdbx_end_seq_num", DelegatingIntColumn::new);
    }

    /**
     * Culture collection identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCultureCollection() {
        return delegate.getColumn("pdbx_gene_src_culture_collection", DelegatingStrColumn::new);
    }

}