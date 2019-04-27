package org.rcsb.cif.model.pdbxentitysrcsyn;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxEntitySrcSyn extends BaseCategory {
    public PdbxEntitySrcSyn(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxEntitySrcSyn(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxEntitySrcSyn(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the source for the
     * synthetic entity.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
    }

    /**
     * The scientific name of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return OrganismScientific
     */
    public OrganismScientific getOrganismScientific() {
        return (OrganismScientific) (isText ? textFields.computeIfAbsent("organism_scientific",
                OrganismScientific::new) : getBinaryColumn("organism_scientific"));
    }

    /**
     * The common name of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return OrganismCommonName
     */
    public OrganismCommonName getOrganismCommonName() {
        return (OrganismCommonName) (isText ? textFields.computeIfAbsent("organism_common_name",
                OrganismCommonName::new) : getBinaryColumn("organism_common_name"));
    }

    /**
     * The strain of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return Strain
     */
    public Strain getStrain() {
        return (Strain) (isText ? textFields.computeIfAbsent("strain",
                Strain::new) : getBinaryColumn("strain"));
    }

    /**
     * NCBI Taxonomy identifier of the organism from which the sequence of
     * the synthetic entity was derived.
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
     * @return NcbiTaxonomyId
     */
    public NcbiTaxonomyId getNcbiTaxonomyId() {
        return (NcbiTaxonomyId) (isText ? textFields.computeIfAbsent("ncbi_taxonomy_id",
                NcbiTaxonomyId::new) : getBinaryColumn("ncbi_taxonomy_id"));
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
     * This data item is an ordinal identifier for pdbx_entity_src_syn data records.
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
}
