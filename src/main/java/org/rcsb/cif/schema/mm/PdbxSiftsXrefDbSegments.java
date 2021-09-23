package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * pdbx_sifts_xref_db_segments describes residue-range based cross-references to external databases.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSiftsXrefDbSegments extends DelegatingCategory {
    public PdbxSiftsXrefDbSegments(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "xref_db":
                return getXrefDb();
            case "xref_db_acc":
                return getXrefDbAcc();
            case "domain_name":
                return getDomainName();
            case "segment_id":
                return getSegmentId();
            case "instance_id":
                return getInstanceId();
            case "seq_id_start":
                return getSeqIdStart();
            case "seq_id_end":
                return getSeqIdEnd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * This data item is a pointer to _entity.id in the ENTITY category.
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
     * The name of additional external databases with range level mapping.
     * @return StrColumn
     */
    public StrColumn getXrefDb() {
        return delegate.getColumn("xref_db", DelegatingStrColumn::new);
    }

    /**
     * The accession code related to the external database entry.
     * @return StrColumn
     */
    public StrColumn getXrefDbAcc() {
        return delegate.getColumn("xref_db_acc", DelegatingStrColumn::new);
    }

    /**
     * The domain name defined by the external database.
     * @return StrColumn
     */
    public StrColumn getDomainName() {
        return delegate.getColumn("domain_name", DelegatingStrColumn::new);
    }

    /**
     * The segment identifier defined by the external database.
     * @return IntColumn
     */
    public IntColumn getSegmentId() {
        return delegate.getColumn("segment_id", DelegatingIntColumn::new);
    }

    /**
     * The instance identifier defined by the external database.
     * @return IntColumn
     */
    public IntColumn getInstanceId() {
        return delegate.getColumn("instance_id", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the segment alignment begins.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdStart() {
        return delegate.getColumn("seq_id_start", DelegatingIntColumn::new);
    }

    /**
     * The sequence position in the entity or biological unit described
     * in the data block at which the segment alignment ends.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqIdEnd() {
        return delegate.getColumn("seq_id_end", DelegatingIntColumn::new);
    }

}