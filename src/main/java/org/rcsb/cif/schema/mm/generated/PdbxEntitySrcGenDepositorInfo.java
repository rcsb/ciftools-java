package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_ENTITY_SRC_GEN_DEPOSITOR_INFO category record details of
 * the source from which the entity was obtained in cases
 * where the source was genetically manipulated.  The
 * following are treated separately:  items pertaining to the tissue
 * from which the gene was obtained, items pertaining to the host
 * organism for gene expression and items pertaining to the actual
 * producing organism (plasmid).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return IntColumn
     */
    public IntColumn getSrcId() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("src_id", IntColumn::new) :
                getBinaryColumn("src_id"));
    }

    /**
     * The entity id for this chimeric entity.
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * This data item povides additional information about the sequence type.
     * @return StrColumn
     */
    public StrColumn getSeqType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq_type", StrColumn::new) :
                getBinaryColumn("seq_type"));
    }

    /**
     * The beginning polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getBegSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("beg_seq_num", IntColumn::new) :
                getBinaryColumn("beg_seq_num"));
    }

    /**
     * The ending polymer sequence position for the polymer section corresponding
     * to this source.
     * 
     * A reference to the sequence position in the entity_poly category.
     * @return IntColumn
     */
    public IntColumn getEndSeqNum() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_seq_num", IntColumn::new) :
                getBinaryColumn("end_seq_num"));
    }

    /**
     * Identifies the gene.
     * @return StrColumn
     */
    public StrColumn getGeneSrcGene() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_gene", StrColumn::new) :
                getBinaryColumn("gene_src_gene"));
    }

    /**
     * Scientific name of the organism.
     * @return StrColumn
     */
    public StrColumn getGeneSrcScientificName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("gene_src_scientific_name", StrColumn::new) :
                getBinaryColumn("gene_src_scientific_name"));
    }

    /**
     * Specific gene which expressed the molecule.
     * @return StrColumn
     */
    public StrColumn getHostOrgGene() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_gene", StrColumn::new) :
                getBinaryColumn("host_org_gene"));
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
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_scientific_name", StrColumn::new) :
                getBinaryColumn("host_org_scientific_name"));
    }

    /**
     * 
     * The strain of the organism in which the entity was
     * expressed.
     * @return StrColumn
     */
    public StrColumn getHostOrgStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_strain", StrColumn::new) :
                getBinaryColumn("host_org_strain"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("gene_src_ncbi_taxonomy_id", IntColumn::new) :
                getBinaryColumn("gene_src_ncbi_taxonomy_id"));
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
        return (IntColumn) (isText ? textFields.computeIfAbsent("host_org_ncbi_taxonomy_id", IntColumn::new) :
                getBinaryColumn("host_org_ncbi_taxonomy_id"));
    }

    /**
     * Identifies the type of vector used (plasmid, virus, or cosmid).
     * Where full details of the protein production are available it
     * would be expected that this item would be derived from
     * _entity_src_gen_express.vector_type.
     * @return StrColumn
     */
    public StrColumn getHostOrgVectorType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("host_org_vector_type", StrColumn::new) :
                getBinaryColumn("host_org_vector_type"));
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
}
