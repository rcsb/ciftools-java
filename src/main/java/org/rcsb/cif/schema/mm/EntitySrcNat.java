package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the ENTITY_SRC_NAT category record details of
 * the source from which the entity was obtained in cases
 * where the entity was isolated directly from a natural tissue.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class EntitySrcNat extends DelegatingCategory {
    public EntitySrcNat(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "common_name":
                return getCommonName();
            case "details":
                return getDetails();
            case "entity_id":
                return getEntityId();
            case "genus":
                return getGenus();
            case "species":
                return getSpecies();
            case "strain":
                return getStrain();
            case "tissue":
                return getTissue();
            case "tissue_fraction":
                return getTissueFraction();
            case "pdbx_organism_scientific":
                return getPdbxOrganismScientific();
            case "pdbx_secretion":
                return getPdbxSecretion();
            case "pdbx_fragment":
                return getPdbxFragment();
            case "pdbx_variant":
                return getPdbxVariant();
            case "pdbx_cell_line":
                return getPdbxCellLine();
            case "pdbx_atcc":
                return getPdbxAtcc();
            case "pdbx_cellular_location":
                return getPdbxCellularLocation();
            case "pdbx_organ":
                return getPdbxOrgan();
            case "pdbx_organelle":
                return getPdbxOrganelle();
            case "pdbx_cell":
                return getPdbxCell();
            case "pdbx_plasmid_name":
                return getPdbxPlasmidName();
            case "pdbx_plasmid_details":
                return getPdbxPlasmidDetails();
            case "pdbx_ncbi_taxonomy_id":
                return getPdbxNcbiTaxonomyId();
            case "pdbx_src_id":
                return getPdbxSrcId();
            case "pdbx_alt_source_flag":
                return getPdbxAltSourceFlag();
            case "pdbx_beg_seq_num":
                return getPdbxBegSeqNum();
            case "pdbx_end_seq_num":
                return getPdbxEndSeqNum();
            case "pdbx_culture_collection":
                return getPdbxCultureCollection();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The common name of the organism from which the entity
     * was isolated.
     * @return StrColumn
     */
    public StrColumn getCommonName() {
        return delegate.getColumn("common_name", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the organism from which the
     * entity was isolated.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The genus of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getGenus() {
        return delegate.getColumn("genus", DelegatingStrColumn::new);
    }

    /**
     * The species of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getSpecies() {
        return delegate.getColumn("species", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return delegate.getColumn("strain", DelegatingStrColumn::new);
    }

    /**
     * The tissue of the organism from which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getTissue() {
        return delegate.getColumn("tissue", DelegatingStrColumn::new);
    }

    /**
     * The subcellular fraction of the tissue of the organism from
     * which the entity was isolated.
     * @return StrColumn
     */
    public StrColumn getTissueFraction() {
        return delegate.getColumn("tissue_fraction", DelegatingStrColumn::new);
    }

    /**
     * Scientific name of the organism of the natural source.
     * @return StrColumn
     */
    public StrColumn getPdbxOrganismScientific() {
        return delegate.getColumn("pdbx_organism_scientific", DelegatingStrColumn::new);
    }

    /**
     * Identifies the secretion from which the molecule was isolated.
     * @return StrColumn
     */
    public StrColumn getPdbxSecretion() {
        return delegate.getColumn("pdbx_secretion", DelegatingStrColumn::new);
    }

    /**
     * A domain or fragment of the molecule.
     * @return StrColumn
     */
    public StrColumn getPdbxFragment() {
        return delegate.getColumn("pdbx_fragment", DelegatingStrColumn::new);
    }

    /**
     * Identifies the variant.
     * @return StrColumn
     */
    public StrColumn getPdbxVariant() {
        return delegate.getColumn("pdbx_variant", DelegatingStrColumn::new);
    }

    /**
     * The specific line of cells.
     * @return StrColumn
     */
    public StrColumn getPdbxCellLine() {
        return delegate.getColumn("pdbx_cell_line", DelegatingStrColumn::new);
    }

    /**
     * Americal Tissue Culture Collection number.
     * @return StrColumn
     */
    public StrColumn getPdbxAtcc() {
        return delegate.getColumn("pdbx_atcc", DelegatingStrColumn::new);
    }

    /**
     * Identifies the location inside (or outside) the cell.
     * @return StrColumn
     */
    public StrColumn getPdbxCellularLocation() {
        return delegate.getColumn("pdbx_cellular_location", DelegatingStrColumn::new);
    }

    /**
     * Organized group of tissues that carries on a specialized function.
     * @return StrColumn
     */
    public StrColumn getPdbxOrgan() {
        return delegate.getColumn("pdbx_organ", DelegatingStrColumn::new);
    }

    /**
     * Organized structure within cell.
     * @return StrColumn
     */
    public StrColumn getPdbxOrganelle() {
        return delegate.getColumn("pdbx_organelle", DelegatingStrColumn::new);
    }

    /**
     * A particular cell type.
     * @return StrColumn
     */
    public StrColumn getPdbxCell() {
        return delegate.getColumn("pdbx_cell", DelegatingStrColumn::new);
    }

    /**
     * The plasmid containing the gene.
     * @return StrColumn
     */
    public StrColumn getPdbxPlasmidName() {
        return delegate.getColumn("pdbx_plasmid_name", DelegatingStrColumn::new);
    }

    /**
     * Details about the plasmid.
     * @return StrColumn
     */
    public StrColumn getPdbxPlasmidDetails() {
        return delegate.getColumn("pdbx_plasmid_details", DelegatingStrColumn::new);
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
        return delegate.getColumn("pdbx_ncbi_taxonomy_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is an ordinal identifier for entity_src_nat data records.
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
     * Culture Collection identifier.
     * @return StrColumn
     */
    public StrColumn getPdbxCultureCollection() {
        return delegate.getColumn("pdbx_culture_collection", DelegatingStrColumn::new);
    }

}