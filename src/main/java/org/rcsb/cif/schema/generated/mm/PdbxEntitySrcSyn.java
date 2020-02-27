package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * The data items in category PDBX_ENTITY_SRC_SYN record the source details
 * about chemically synthesized molecules.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntitySrcSyn extends DelegatingCategory {
    public PdbxEntitySrcSyn(Category delegate) {
        super(delegate);
    }

    /**
     * A description of special aspects of the source for the
     * synthetic entity.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The scientific name of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return StrColumn
     */
    public StrColumn getOrganismScientific() {
        return delegate.getColumn("organism_scientific", DelegatingStrColumn::new);
    }

    /**
     * The common name of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return StrColumn
     */
    public StrColumn getOrganismCommonName() {
        return delegate.getColumn("organism_common_name", DelegatingStrColumn::new);
    }

    /**
     * The strain of the organism from which the sequence of
     * the synthetic entity was derived.
     * @return StrColumn
     */
    public StrColumn getStrain() {
        return delegate.getColumn("strain", DelegatingStrColumn::new);
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
        return delegate.getColumn("ncbi_taxonomy_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is an ordinal identifier for pdbx_entity_src_syn data records.
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
}
