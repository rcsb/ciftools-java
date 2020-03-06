package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_SRC_GEN_DEPOSITOR_INFO category record details of
 * the source from which the entity was obtained in cases
 * where the source was genetically manipulated.  The
 * following are treated separately:  items pertaining to the tissue
 * from which the gene was obtained, items pertaining to the host
 * organism for gene expression and items pertaining to the actual
 * producing organism (plasmid).
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcGenDepositorInfo extends DelegatingCategory {
    public PdbxEntitySrcGenDepositorInfo(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "src_id":
                return getSrcId();
            case "entity_id":
                return getEntityId();
            case "seq_type":
                return getSeqType();
            case "beg_seq_num":
                return getBegSeqNum();
            case "end_seq_num":
                return getEndSeqNum();
            case "gene_src_gene":
                return getGeneSrcGene();
            case "gene_src_scientific_name":
                return getGeneSrcScientificName();
            case "host_org_gene":
                return getHostOrgGene();
            case "host_org_scientific_name":
                return getHostOrgScientificName();
            case "host_org_strain":
                return getHostOrgStrain();
            case "gene_src_ncbi_taxonomy_id":
                return getGeneSrcNcbiTaxonomyId();
            case "host_org_ncbi_taxonomy_id":
                return getHostOrgNcbiTaxonomyId();
            case "host_org_vector_type":
                return getHostOrgVectorType();
            case "plasmid_name":
                return getPlasmidName();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is an ordinal identifier for entity_src_gen data records.
     * @return IntColumn
     */
    public IntColumn getSrcId() {
        return delegate.getColumn("src_id", DelegatingIntColumn::new);
    }

    /**
     * The entity id for this chimeric entity.
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item povides additional information about the sequence type.
     * @return StrColumn
     */
    public StrColumn getSeqType() {
        return delegate.getColumn("seq_type", DelegatingStrColumn::new);
    }

    /**
     * The beginning polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getBegSeqNum() {
        return delegate.getColumn("beg_seq_num", DelegatingIntColumn::new);
    }

    /**
     * The ending polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getEndSeqNum() {
        return delegate.getColumn("end_seq_num", DelegatingIntColumn::new);
    }

    /**
     * Identifies the gene.
     * @return StrColumn
     */
    public StrColumn getGeneSrcGene() {
        return delegate.getColumn("gene_src_gene", DelegatingStrColumn::new);
    }

    /**
     * Scientific name of the organism.
     * @return StrColumn
     */
    public StrColumn getGeneSrcScientificName() {
        return delegate.getColumn("gene_src_scientific_name", DelegatingStrColumn::new);
    }

    /**
     * Specific gene which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getHostOrgGene() {
        return delegate.getColumn("host_org_gene", DelegatingStrColumn::new);
    }

    /**
     * The scientific name of the organism that served as host for the
     * production of the entity. Where full details of the protein
     * production are available it would be expected that this item
     * would be derived from _entity_src_gen_express.host_org_scientific_name
     * or via _entity_src_gen_express.host_org_tax_id
     * @return StrColumn
     */
    public StrColumn getHostOrgScientificName() {
        return delegate.getColumn("host_org_scientific_name", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism in which the entity was
     * expressed.
     * @return StrColumn
     */
    public StrColumn getHostOrgStrain() {
        return delegate.getColumn("host_org_strain", DelegatingStrColumn::new);
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
     * @return IntColumn
     */
    public IntColumn getGeneSrcNcbiTaxonomyId() {
        return delegate.getColumn("gene_src_ncbi_taxonomy_id", DelegatingIntColumn::new);
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
     * @return IntColumn
     */
    public IntColumn getHostOrgNcbiTaxonomyId() {
        return delegate.getColumn("host_org_ncbi_taxonomy_id", DelegatingIntColumn::new);
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid).
     * Where full details of the protein production are available it
     * would be expected that this item would be derived from
     * _entity_src_gen_express.vector_type.
     * @return StrColumn
     */
    public StrColumn getHostOrgVectorType() {
        return delegate.getColumn("host_org_vector_type", DelegatingStrColumn::new);
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

}