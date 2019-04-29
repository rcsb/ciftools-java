package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_SRC_GEN category record details of
 * the source from which the entity was obtained in cases
 * where the source was genetically manipulated.  The
 * following are treated separately:  items pertaining to the tissue
 * from which the gene was obtained, items pertaining to the host
 * organism for gene expression and items pertaining to the actual
 * producing organism (plasmid).
 */
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
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * The common name of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcCommonName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_common_name", StrColumn::new) :
                getBinaryColumn("gene_src_common_name"));
    }

    /**
     * A description of special aspects of the natural organism from
     * which the gene was obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_details", StrColumn::new) :
                getBinaryColumn("gene_src_details"));
    }

    /**
     * The genus of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcGenus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_genus", StrColumn::new) :
                getBinaryColumn("gene_src_genus"));
    }

    /**
     * The species of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcSpecies() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_species", StrColumn::new) :
                getBinaryColumn("gene_src_species"));
    }

    /**
     * The strain of the natural organism from which the gene was
     * obtained, if relevant.
     * @return StrColumn
     */
    public StrColumn getGeneSrcStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_strain", StrColumn::new) :
                getBinaryColumn("gene_src_strain"));
    }

    /**
     * The tissue of the natural organism from which the gene was
     * obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcTissue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_tissue", StrColumn::new) :
                getBinaryColumn("gene_src_tissue"));
    }

    /**
     * The subcellular fraction of the tissue of the natural organism
     * from which the gene was obtained.
     * @return StrColumn
     */
    public StrColumn getGeneSrcTissueFraction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_tissue_fraction", StrColumn::new) :
                getBinaryColumn("gene_src_tissue_fraction"));
    }

    /**
     * The genus of the organism that served as host for the production
     * of the entity.
     * @return StrColumn
     */
    public StrColumn getHostOrgGenus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_genus", StrColumn::new) :
                getBinaryColumn("host_org_genus"));
    }

    /**
     * The species of the organism that served as host for the
     * production of the entity.
     * @return StrColumn
     */
    public StrColumn getHostOrgSpecies() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_species", StrColumn::new) :
                getBinaryColumn("host_org_species"));
    }

    /**
     * A domain or fragment of the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcFragment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_fragment", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_fragment"));
    }

    /**
     * Identifies the gene.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcGene() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_gene", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_gene"));
    }

    /**
     * Scientific name of the organism.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcScientificName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_scientific_name", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_scientific_name"));
    }

    /**
     * Identifies the variant.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcVariant() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_variant", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_variant"));
    }

    /**
     * The specific line of cells.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCellLine() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_cell_line", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_cell_line"));
    }

    /**
     * American Type Culture Collection tissue culture number.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcAtcc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_atcc", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_atcc"));
    }

    /**
     * Organized group of tissues that carries on a specialized function.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcOrgan() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_organ", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_organ"));
    }

    /**
     * Organized structure within cell.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcOrganelle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_organelle", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_organelle"));
    }

    /**
     * The source plasmid.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcPlasmid() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_plasmid", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_plasmid"));
    }

    /**
     * The source plasmid.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcPlasmidName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_plasmid_name", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_plasmid_name"));
    }

    /**
     * Cell type.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_cell", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_cell"));
    }

    /**
     * Identifies the location inside (or outside) the cell.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCellularLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_cellular_location", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_cellular_location"));
    }

    /**
     * Specific gene which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgGene() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_gene", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_gene"));
    }

    /**
     * Specific organ which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgOrgan() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_organ", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_organ"));
    }

    /**
     * Specific organelle which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgOrganelle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_organelle", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_organelle"));
    }

    /**
     * Identifies the location inside (or outside) the cell which
     * expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCellularLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_cellular_location", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_cellular_location"));
    }

    /**
     * 
     * The strain of the organism in which the entity was
     * expressed.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_strain", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_strain"));
    }

    /**
     * 
     * The fraction of the tissue which expressed the
     * molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgTissueFraction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_tissue_fraction", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_tissue_fraction"));
    }

    /**
     * Information on the source which is not given elsewhere.
     * @return StrColumn
     */
    public StrColumn getPdbxDescription() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_description", StrColumn::new) :
                getBinaryColumn("pdbx_description"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_common_name", StrColumn::new) :
                getBinaryColumn("host_org_common_name"));
    }

    /**
     * A description of special aspects of the organism that served as
     * host for the production of the entity. Where full details of
     * the protein production are available it would be expected that
     * this item would derived from _entity_src_gen_express.host_org_details
     * @return StrColumn
     */
    public StrColumn getHostOrgDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_details", StrColumn::new) :
                getBinaryColumn("host_org_details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_strain", StrColumn::new) :
                getBinaryColumn("host_org_strain"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("plasmid_details", StrColumn::new) :
                getBinaryColumn("plasmid_details"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("plasmid_name", StrColumn::new) :
                getBinaryColumn("plasmid_name"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_variant", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_variant"));
    }

    /**
     * A specific line of cells used as the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item would be derived from
     * entity_src_gen_express.host_org_cell_line
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCellLine() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_cell_line", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_cell_line"));
    }

    /**
     * Americal Tissue Culture Collection of the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item  would be derived from
     * _entity_src_gen_express.host_org_culture_collection
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgAtcc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_atcc", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_atcc"));
    }

    /**
     * Culture collection of the expression system. Where
     * full details of the protein production are available it would
     * be expected that this item  would be derived somehwere, but
     * exactly where is not clear.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCultureCollection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_culture_collection", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_culture_collection"));
    }

    /**
     * Cell type from which the gene is derived. Where
     * entity.target_id is provided this should be derived from
     * details of the target.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_cell", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_cell"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_scientific_name", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_scientific_name"));
    }

    /**
     * The specific tissue which expressed the molecule. Where full details
     * of the protein production are available it would be expected that this
     * item would be derived from _entity_src_gen_express.host_org_tissue
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgTissue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_tissue", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_tissue"));
    }

    /**
     * Identifies the vector used. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_clone.vector_name.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgVector() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_vector", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_vector"));
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid).
     * Where full details of the protein production are available it
     * would be expected that this item would be derived from
     * _entity_src_gen_express.vector_type.
     * @return StrColumn
     */
    public StrColumn getPdbxHostOrgVectorType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_vector_type", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_vector_type"));
    }

    /**
     * A unique identifier for the expression system. This
     * should be extracted from a local list of expression
     * systems.
     * @return StrColumn
     */
    public StrColumn getExpressionSystemId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("expression_system_id", StrColumn::new) :
                getBinaryColumn("expression_system_id"));
    }

    /**
     * A string to indicate the life-cycle or cell development
     * cycle in which the gene is expressed and the mature
     * protein is active.
     * @return StrColumn
     */
    public StrColumn getGeneSrcDevStage() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_dev_stage", StrColumn::new) :
                getBinaryColumn("gene_src_dev_stage"));
    }

    /**
     * A pointer to _pdbx_construct.id in the PDBX_CONSTRUCT category.
     * The indentified sequence is the initial construct.
     * @return StrColumn
     */
    public StrColumn getStartConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("start_construct_id", StrColumn::new) :
                getBinaryColumn("start_construct_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_ncbi_taxonomy_id", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_ncbi_taxonomy_id"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_host_org_ncbi_taxonomy_id", StrColumn::new) :
                getBinaryColumn("pdbx_host_org_ncbi_taxonomy_id"));
    }

    /**
     * This data item is an ordinal identifier for entity_src_gen data records.
     * @return IntColumn
     */
    public IntColumn getPdbxSrcId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_src_id", IntColumn::new) :
                getBinaryColumn("pdbx_src_id"));
    }

    /**
     * This data item identifies cases in which an alternative source
     * modeled.
     * @return StrColumn
     */
    public StrColumn getPdbxAltSourceFlag() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_alt_source_flag", StrColumn::new) :
                getBinaryColumn("pdbx_alt_source_flag"));
    }

    /**
     * This data item povides additional information about the sequence type.
     * @return StrColumn
     */
    public StrColumn getPdbxSeqType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_seq_type", StrColumn::new) :
                getBinaryColumn("pdbx_seq_type"));
    }

    /**
     * The beginning polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getPdbxBegSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_beg_seq_num", IntColumn::new) :
                getBinaryColumn("pdbx_beg_seq_num"));
    }

    /**
     * The ending polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getPdbxEndSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("pdbx_end_seq_num", IntColumn::new) :
                getBinaryColumn("pdbx_end_seq_num"));
    }

    /**
     * Culture collection identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxGeneSrcCultureCollection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_gene_src_culture_collection", StrColumn::new) :
                getBinaryColumn("pdbx_gene_src_culture_collection"));
    }
}
