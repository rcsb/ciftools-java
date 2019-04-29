package org.rcsb.cif.model.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * The data items in category PDBX_ENTITY_SRC_SYN record the source details
 * about chemically synthesized molecules.
 */
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
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The scientific name of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return StrColumn
     */
    public StrColumn getOrganismScientific() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organism_scientific", StrColumn::new) :
                getBinaryColumn("organism_scientific"));
    }

    /**
     * The common name of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return StrColumn
     */
    public StrColumn getOrganismCommonName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organism_common_name", StrColumn::new) :
                getBinaryColumn("organism_common_name"));
    }

    /**
     * The strain of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("strain", StrColumn::new) :
                getBinaryColumn("strain"));
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
     * @return StrColumn
     */
    public StrColumn getNcbiTaxonomyId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("ncbi_taxonomy_id", StrColumn::new) :
                getBinaryColumn("ncbi_taxonomy_id"));
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
     * This data item is an ordinal identifier for pdbx_entity_src_syn data records.
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
}
