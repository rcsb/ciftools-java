package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the ENTITY_SRC_NAT category record details of
 * the source from which the entity was obtained in cases
 * where the entity was isolated directly from a natural tissue.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
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
     * @return StrColumn
     */
    public StrColumn getCommonName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("common_name", StrColumn::new) :
                getBinaryColumn("common_name"));
    }

    /**
     * A description of special aspects of the organism from which the
     * entity was isolated.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
     * The genus of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getGenus() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("genus", StrColumn::new) :
                getBinaryColumn("genus"));
    }

    /**
     * The species of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getSpecies() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("species", StrColumn::new) :
                getBinaryColumn("species"));
    }

    /**
     * The strain of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strain", StrColumn::new) :
                getBinaryColumn("strain"));
    }

    /**
     * The tissue of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getTissue() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tissue", StrColumn::new) :
                getBinaryColumn("tissue"));
    }

    /**
     * The subcellular fraction of the tissue of the organism from
     * which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getTissueFraction() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tissue_fraction", StrColumn::new) :
                getBinaryColumn("tissue_fraction"));
    }

    /**
     * Scientific name of the organism of the natural source.
     * @return StrColumn
     */
    public StrColumn getPdbxOrganismScientific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_organism_scientific", StrColumn::new) :
                getBinaryColumn("pdbx_organism_scientific"));
    }

    /**
     * Identifies the secretion from which the molecule was isolated.
     * @return StrColumn
     */
    public StrColumn getPdbxSecretion() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_secretion", StrColumn::new) :
                getBinaryColumn("pdbx_secretion"));
    }

    /**
     * A domain or fragment of the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxFragment() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_fragment", StrColumn::new) :
                getBinaryColumn("pdbx_fragment"));
    }

    /**
     * Identifies the variant.
     * @return StrColumn
     */
    public StrColumn getPdbxVariant() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_variant", StrColumn::new) :
                getBinaryColumn("pdbx_variant"));
    }

    /**
     * The specific line of cells.
     * @return StrColumn
     */
    public StrColumn getPdbxCellLine() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_cell_line", StrColumn::new) :
                getBinaryColumn("pdbx_cell_line"));
    }

    /**
     * Americal Tissue Culture Collection number.
     * @return StrColumn
     */
    public StrColumn getPdbxAtcc() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_atcc", StrColumn::new) :
                getBinaryColumn("pdbx_atcc"));
    }

    /**
     * Identifies the location inside (or outside) the cell.
     * @return StrColumn
     */
    public StrColumn getPdbxCellularLocation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_cellular_location", StrColumn::new) :
                getBinaryColumn("pdbx_cellular_location"));
    }

    /**
     * Organized group of tissues that carries on a specialized function.
     * @return StrColumn
     */
    public StrColumn getPdbxOrgan() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_organ", StrColumn::new) :
                getBinaryColumn("pdbx_organ"));
    }

    /**
     * Organized structure within cell.
     * @return StrColumn
     */
    public StrColumn getPdbxOrganelle() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_organelle", StrColumn::new) :
                getBinaryColumn("pdbx_organelle"));
    }

    /**
     * A particular cell type.
     * @return StrColumn
     */
    public StrColumn getPdbxCell() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_cell", StrColumn::new) :
                getBinaryColumn("pdbx_cell"));
    }

    /**
     * The plasmid containing the gene.
     * @return StrColumn
     */
    public StrColumn getPdbxPlasmidName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_plasmid_name", StrColumn::new) :
                getBinaryColumn("pdbx_plasmid_name"));
    }

    /**
     * Details about the plasmid.
     * @return StrColumn
     */
    public StrColumn getPdbxPlasmidDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_plasmid_details", StrColumn::new) :
                getBinaryColumn("pdbx_plasmid_details"));
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
     * @return StrColumn
     */
    public StrColumn getPdbxNcbiTaxonomyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_ncbi_taxonomy_id", StrColumn::new) :
                getBinaryColumn("pdbx_ncbi_taxonomy_id"));
    }

    /**
     * This data item is an ordinal identifier for entity_src_nat data records.
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
     * Culture Collection identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxCultureCollection() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("pdbx_culture_collection", StrColumn::new) :
                getBinaryColumn("pdbx_culture_collection"));
    }
}
