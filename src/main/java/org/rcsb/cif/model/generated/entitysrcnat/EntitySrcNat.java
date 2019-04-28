package org.rcsb.cif.model.generated.entitysrcnat;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class EntitySrcNat extends BaseCategory {
    public EntitySrcNat(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public EntitySrcNat(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public EntitySrcNat(String name) {
        super(name);
    }

    /**
     * The common name of the organism from which the entity
     * was isolated.
     * @return CommonName
     */
    public CommonName getCommonName() {
        return (CommonName) (isText ? textFields.computeIfAbsent("common_name",
                CommonName::new) : getBinaryColumn("common_name"));
    }

    /**
     * A description of special aspects of the organism from which the
     * entity was isolated.
     * @return Details
     */
    public Details getDetails() {
        return (Details) (isText ? textFields.computeIfAbsent("details",
                Details::new) : getBinaryColumn("details"));
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
     * The genus of the organism from which the entity was isolated.
     * @return Genus
     */
    public Genus getGenus() {
        return (Genus) (isText ? textFields.computeIfAbsent("genus",
                Genus::new) : getBinaryColumn("genus"));
    }

    /**
     * The species of the organism from which the entity was isolated.
     * @return Species
     */
    public Species getSpecies() {
        return (Species) (isText ? textFields.computeIfAbsent("species",
                Species::new) : getBinaryColumn("species"));
    }

    /**
     * The strain of the organism from which the entity was isolated.
     * @return Strain
     */
    public Strain getStrain() {
        return (Strain) (isText ? textFields.computeIfAbsent("strain",
                Strain::new) : getBinaryColumn("strain"));
    }

    /**
     * The tissue of the organism from which the entity was isolated.
     * @return Tissue
     */
    public Tissue getTissue() {
        return (Tissue) (isText ? textFields.computeIfAbsent("tissue",
                Tissue::new) : getBinaryColumn("tissue"));
    }

    /**
     * The subcellular fraction of the tissue of the organism from
     * which the entity was isolated.
     * @return TissueFraction
     */
    public TissueFraction getTissueFraction() {
        return (TissueFraction) (isText ? textFields.computeIfAbsent("tissue_fraction",
                TissueFraction::new) : getBinaryColumn("tissue_fraction"));
    }

    /**
     * Scientific name of the organism of the natural source.
     * @return PdbxOrganismScientific
     */
    public PdbxOrganismScientific getPdbxOrganismScientific() {
        return (PdbxOrganismScientific) (isText ? textFields.computeIfAbsent("pdbx_organism_scientific",
                PdbxOrganismScientific::new) : getBinaryColumn("pdbx_organism_scientific"));
    }

    /**
     * Identifies the secretion from which the molecule was isolated.
     * @return PdbxSecretion
     */
    public PdbxSecretion getPdbxSecretion() {
        return (PdbxSecretion) (isText ? textFields.computeIfAbsent("pdbx_secretion",
                PdbxSecretion::new) : getBinaryColumn("pdbx_secretion"));
    }

    /**
     * A domain or fragment of the molecule.
     * @return PdbxFragment
     */
    public PdbxFragment getPdbxFragment() {
        return (PdbxFragment) (isText ? textFields.computeIfAbsent("pdbx_fragment",
                PdbxFragment::new) : getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Identifies the variant.
     * @return PdbxVariant
     */
    public PdbxVariant getPdbxVariant() {
        return (PdbxVariant) (isText ? textFields.computeIfAbsent("pdbx_variant",
                PdbxVariant::new) : getBinaryColumn("pdbx_variant"));
    }

    /**
     * The specific line of cells.
     * @return PdbxCellLine
     */
    public PdbxCellLine getPdbxCellLine() {
        return (PdbxCellLine) (isText ? textFields.computeIfAbsent("pdbx_cell_line",
                PdbxCellLine::new) : getBinaryColumn("pdbx_cell_line"));
    }

    /**
     * Americal Tissue Culture Collection number.
     * @return PdbxAtcc
     */
    public PdbxAtcc getPdbxAtcc() {
        return (PdbxAtcc) (isText ? textFields.computeIfAbsent("pdbx_atcc",
                PdbxAtcc::new) : getBinaryColumn("pdbx_atcc"));
    }

    /**
     * Identifies the location inside (or outside) the cell.
     * @return PdbxCellularLocation
     */
    public PdbxCellularLocation getPdbxCellularLocation() {
        return (PdbxCellularLocation) (isText ? textFields.computeIfAbsent("pdbx_cellular_location",
                PdbxCellularLocation::new) : getBinaryColumn("pdbx_cellular_location"));
    }

    /**
     * Organized group of tissues that carries on a specialized function.
     * @return PdbxOrgan
     */
    public PdbxOrgan getPdbxOrgan() {
        return (PdbxOrgan) (isText ? textFields.computeIfAbsent("pdbx_organ",
                PdbxOrgan::new) : getBinaryColumn("pdbx_organ"));
    }

    /**
     * Organized structure within cell.
     * @return PdbxOrganelle
     */
    public PdbxOrganelle getPdbxOrganelle() {
        return (PdbxOrganelle) (isText ? textFields.computeIfAbsent("pdbx_organelle",
                PdbxOrganelle::new) : getBinaryColumn("pdbx_organelle"));
    }

    /**
     * A particular cell type.
     * @return PdbxCell
     */
    public PdbxCell getPdbxCell() {
        return (PdbxCell) (isText ? textFields.computeIfAbsent("pdbx_cell",
                PdbxCell::new) : getBinaryColumn("pdbx_cell"));
    }

    /**
     * The plasmid containing the gene.
     * @return PdbxPlasmidName
     */
    public PdbxPlasmidName getPdbxPlasmidName() {
        return (PdbxPlasmidName) (isText ? textFields.computeIfAbsent("pdbx_plasmid_name",
                PdbxPlasmidName::new) : getBinaryColumn("pdbx_plasmid_name"));
    }

    /**
     * Details about the plasmid.
     * @return PdbxPlasmidDetails
     */
    public PdbxPlasmidDetails getPdbxPlasmidDetails() {
        return (PdbxPlasmidDetails) (isText ? textFields.computeIfAbsent("pdbx_plasmid_details",
                PdbxPlasmidDetails::new) : getBinaryColumn("pdbx_plasmid_details"));
    }

    /**
     * NCBI Taxonomy identifier for the source organism.
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
     * @return PdbxNcbiTaxonomyId
     */
    public PdbxNcbiTaxonomyId getPdbxNcbiTaxonomyId() {
        return (PdbxNcbiTaxonomyId) (isText ? textFields.computeIfAbsent("pdbx_ncbi_taxonomy_id",
                PdbxNcbiTaxonomyId::new) : getBinaryColumn("pdbx_ncbi_taxonomy_id"));
    }

    /**
     * This data item is an ordinal identifier for entity_src_nat data records.
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

    /**
     * Culture Collection identifier.
     * @return PdbxCultureCollection
     */
    public PdbxCultureCollection getPdbxCultureCollection() {
        return (PdbxCultureCollection) (isText ? textFields.computeIfAbsent("pdbx_culture_collection",
                PdbxCultureCollection::new) : getBinaryColumn("pdbx_culture_collection"));
    }
}
