package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * pdbx_sifts_unp_segments describes residue-range based cross-references specific to UniProt.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSiftsUnpSegments extends DelegatingCategory {
    public PdbxSiftsUnpSegments(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "unp_acc":
                return getUnpAcc();
            case "segment_id":
                return getSegmentId();
            case "instance_id":
                return getInstanceId();
            case "unp_start":
                return getUnpStart();
            case "unp_end":
                return getUnpEnd();
            case "seq_id_start":
                return getSeqIdStart();
            case "seq_id_end":
                return getSeqIdEnd();
            case "best_mapping":
                return getBestMapping();
            case "identity":
                return getIdentity();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity_poly_seq.entity_id in the
     * ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The UniProt accession code related to the SIFTS segment mapping.
     * @return StrColumn
     */
    public StrColumn getUnpAcc() {
        return delegate.getColumn("unp_acc", DelegatingStrColumn::new);
    }

    /**
     * The UniProt segment defined by the external database.
     * @return IntColumn
     */
    public IntColumn getSegmentId() {
        return delegate.getColumn("segment_id", DelegatingIntColumn::new);
    }

    /**
     * The UniProt instance identifier.
     * @return IntColumn
     */
    public IntColumn getInstanceId() {
        return delegate.getColumn("instance_id", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the related UniProt entry
     * at which the mapping alignment begins.
     * @return IntColumn
     */
    public IntColumn getUnpStart() {
        return delegate.getColumn("unp_start", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the related UniProt entry
     * at which the mapping alignment ends.
     * @return IntColumn
     */
    public IntColumn getUnpEnd() {
        return delegate.getColumn("unp_end", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the UniProt alignment begins.
     * @return IntColumn
     */
    public IntColumn getSeqIdStart() {
        return delegate.getColumn("seq_id_start", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the UniProt alignment ends.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

    /**
     * This code indicates whether the SIFTS UniProt accession and residue range was the best-scoring
     * sequence match.
     * @return StrColumn
     */
    public StrColumn getBestMapping() {
        return delegate.getColumn("best_mapping", DelegatingStrColumn::new);
    }

    /**
     * The identity score reports on the sequence identity for the sequence defined by the entity start and end range
     * compared to the sequence defined by start and end range of the related UniProt accession.
     * @return FloatColumn
     */
    public FloatColumn getIdentity() {
        return delegate.getColumn("identity", DelegatingFloatColumn::new);
    }

}