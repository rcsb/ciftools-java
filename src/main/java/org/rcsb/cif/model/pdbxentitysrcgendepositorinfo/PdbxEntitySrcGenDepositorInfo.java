package org.rcsb.cif.model.pdbxentitysrcgendepositorinfo;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcGenDepositorInfo extends BaseCategory {
    public PdbxEntitySrcGenDepositorInfo(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcGenDepositorInfo(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcGenDepositorInfo(String name) {
        super(name);
    }

    /**
     * This data item is an ordinal identifier for entity_src_gen data records.
     * @return SrcId
     */
    public SrcId getSrcId() {
        return (SrcId) (isText ? textFields.computeIfAbsent("src_id",
                SrcId::new) : getBinaryColumn("src_id"));
    }

    /**
     * The entity id for this chimeric entity.
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return EntityId
     */
    public EntityId getEntityId() {
        return (EntityId) (isText ? textFields.computeIfAbsent("entity_id",
                EntityId::new) : getBinaryColumn("entity_id"));
    }

    /**
     * This data item povides additional information about the sequence type.
     * @return SeqType
     */
    public SeqType getSeqType() {
        return (SeqType) (isText ? textFields.computeIfAbsent("seq_type",
                SeqType::new) : getBinaryColumn("seq_type"));
    }

    /**
     * The beginning polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return BegSeqNum
     */
    public BegSeqNum getBegSeqNum() {
        return (BegSeqNum) (isText ? textFields.computeIfAbsent("beg_seq_num",
                BegSeqNum::new) : getBinaryColumn("beg_seq_num"));
    }

    /**
     * The ending polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return EndSeqNum
     */
    public EndSeqNum getEndSeqNum() {
        return (EndSeqNum) (isText ? textFields.computeIfAbsent("end_seq_num",
                EndSeqNum::new) : getBinaryColumn("end_seq_num"));
    }

    /**
     * Identifies the gene.
     * @return GeneSrcGene
     */
    public GeneSrcGene getGeneSrcGene() {
        return (GeneSrcGene) (isText ? textFields.computeIfAbsent("gene_src_gene",
                GeneSrcGene::new) : getBinaryColumn("gene_src_gene"));
    }

    /**
     * Scientific name of the organism.
     * @return GeneSrcScientificName
     */
    public GeneSrcScientificName getGeneSrcScientificName() {
        return (GeneSrcScientificName) (isText ? textFields.computeIfAbsent("gene_src_scientific_name",
                GeneSrcScientificName::new) : getBinaryColumn("gene_src_scientific_name"));
    }

    /**
     * Specific gene which expressed the molecule.
     * @return HostOrgGene
     */
    public HostOrgGene getHostOrgGene() {
        return (HostOrgGene) (isText ? textFields.computeIfAbsent("host_org_gene",
                HostOrgGene::new) : getBinaryColumn("host_org_gene"));
    }

    /**
     * The scientific name of the organism that served as host for the
     * production of the entity. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_express.host_org_scientific_name
     * or via _entity_src_gen_express.host_org_tax_id
     * @return HostOrgScientificName
     */
    public HostOrgScientificName getHostOrgScientificName() {
        return (HostOrgScientificName) (isText ? textFields.computeIfAbsent("host_org_scientific_name",
                HostOrgScientificName::new) : getBinaryColumn("host_org_scientific_name"));
    }

    /**
     * 
     * The strain of the organism in which the entity was
     * expressed.
     * @return HostOrgStrain
     */
    public HostOrgStrain getHostOrgStrain() {
        return (HostOrgStrain) (isText ? textFields.computeIfAbsent("host_org_strain",
                HostOrgStrain::new) : getBinaryColumn("host_org_strain"));
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
     * @return GeneSrcNcbiTaxonomyId
     */
    public GeneSrcNcbiTaxonomyId getGeneSrcNcbiTaxonomyId() {
        return (GeneSrcNcbiTaxonomyId) (isText ? textFields.computeIfAbsent("gene_src_ncbi_taxonomy_id",
                GeneSrcNcbiTaxonomyId::new) : getBinaryColumn("gene_src_ncbi_taxonomy_id"));
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
     * @return HostOrgNcbiTaxonomyId
     */
    public HostOrgNcbiTaxonomyId getHostOrgNcbiTaxonomyId() {
        return (HostOrgNcbiTaxonomyId) (isText ? textFields.computeIfAbsent("host_org_ncbi_taxonomy_id",
                HostOrgNcbiTaxonomyId::new) : getBinaryColumn("host_org_ncbi_taxonomy_id"));
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid).
     * Where full details of the protein production are available it
     * would be expected that this item would be derived from
     * _entity_src_gen_express.vector_type.
     * @return HostOrgVectorType
     */
    public HostOrgVectorType getHostOrgVectorType() {
        return (HostOrgVectorType) (isText ? textFields.computeIfAbsent("host_org_vector_type",
                HostOrgVectorType::new) : getBinaryColumn("host_org_vector_type"));
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
}
