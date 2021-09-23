package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * pdbx_sifts_xref_db describes residue-level cross-references to external databases.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxSiftsXrefDb extends DelegatingCategory {
    public PdbxSiftsXrefDb(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "entity_id":
                return getEntityId();
            case "asym_id":
                return getAsymId();
            case "seq_id_ordinal":
                return getSeqIdOrdinal();
            case "seq_id":
                return getSeqId();
            case "mon_id":
                return getMonId();
            case "mon_id_one_letter_code":
                return getMonIdOneLetterCode();
            case "unp_res":
                return getUnpRes();
            case "unp_num":
                return getUnpNum();
            case "unp_acc":
                return getUnpAcc();
            case "unp_segment_id":
                return getUnpSegmentId();
            case "unp_instance_id":
                return getUnpInstanceId();
            case "res_type":
                return getResType();
            case "observed":
                return getObserved();
            case "mh_id":
                return getMhId();
            case "xref_db_name":
                return getXrefDbName();
            case "xref_db_acc":
                return getXrefDbAcc();
            case "xref_domain_name":
                return getXrefDomainName();
            case "xref_db_segment_id":
                return getXrefDbSegmentId();
            case "xref_db_instance_id":
                return getXrefDbInstanceId();
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
     * The value of pdbx_sifts_xref_db.seq_id_ordinal identifies a distinct residue specific cross-reference record
     * in the _pdbx_sifts_xref_db category.
     * @return IntColumn
     */
    public IntColumn getSeqIdOrdinal() {
        return delegate.getColumn("seq_id_ordinal", DelegatingIntColumn::new);
    }

    /**
     * This data item is an effective pointer to _entity_poly_seq.num in the
     * ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId() {
        return delegate.getColumn("seq_id", DelegatingIntColumn::new);
    }

    /**
     * This data item is an effective pointer to _entity_poly_seq.mon_id.
     * @return StrColumn
     */
    public StrColumn getMonId() {
        return delegate.getColumn("mon_id", DelegatingStrColumn::new);
    }

    /**
     * Describes the standard polymer component of _pdbx_sifts_xref_db.mon_id as one-letter code
     * @return StrColumn
     */
    public StrColumn getMonIdOneLetterCode() {
        return delegate.getColumn("mon_id_one_letter_code", DelegatingStrColumn::new);
    }

    /**
     * Describes the residue type, in one-letter code, at the corresponding residue position
     * of the related UniProt match
     * @return StrColumn
     */
    public StrColumn getUnpRes() {
        return delegate.getColumn("unp_res", DelegatingStrColumn::new);
    }

    /**
     * The sequence position of the UniProt entry that corresponds
     * to the residue mapping.
     * @return IntColumn
     */
    public IntColumn getUnpNum() {
        return delegate.getColumn("unp_num", DelegatingIntColumn::new);
    }

    /**
     * The UniProt accession code for the mapped entry
     * @return StrColumn
     */
    public StrColumn getUnpAcc() {
        return delegate.getColumn("unp_acc", DelegatingStrColumn::new);
    }

    /**
     * The pdbx_sifts_xref_db UniProt segment ID refers to the distinct contiguous residue-range segments with a
     * UniProt residue mapping.
     * @return IntColumn
     */
    public IntColumn getUnpSegmentId() {
        return delegate.getColumn("unp_segment_id", DelegatingIntColumn::new);
    }

    /**
     * The pdbx_sifts_xref_db UniProt instance ID refers to distinct UniProt residue mappings for a given
     * position (i.e. the same segment, residue, asym, &amp; entity).
     * @return IntColumn
     */
    public IntColumn getUnpInstanceId() {
        return delegate.getColumn("unp_instance_id", DelegatingIntColumn::new);
    }

    /**
     * A description of the difference between the entity sequence position
     * residue type and that in the mapped UniProt entry.
     * @return StrColumn
     */
    public StrColumn getResType() {
        return delegate.getColumn("res_type", DelegatingStrColumn::new);
    }

    /**
     * Describes whether or not a reside has atomic coordinates in the corresponding model.
     * @return StrColumn
     */
    public StrColumn getObserved() {
        return delegate.getColumn("observed", DelegatingStrColumn::new);
    }

    /**
     * An index value corresponding to the instance of microheterogeneity per residue
     * @return IntColumn
     */
    public IntColumn getMhId() {
        return delegate.getColumn("mh_id", DelegatingIntColumn::new);
    }

    /**
     * The name of additional external databases with residue level mapping.
     * @return StrColumn
     */
    public StrColumn getXrefDbName() {
        return delegate.getColumn("xref_db_name", DelegatingStrColumn::new);
    }

    /**
     * The accession code related to the additional external database entry.
     * @return StrColumn
     */
    public StrColumn getXrefDbAcc() {
        return delegate.getColumn("xref_db_acc", DelegatingStrColumn::new);
    }

    /**
     * The domain name defined by the external database.
     * @return StrColumn
     */
    public StrColumn getXrefDomainName() {
        return delegate.getColumn("xref_domain_name", DelegatingStrColumn::new);
    }

    /**
     * The pdbx_sifts_xref_db xref segment ID refers to a distinct contiguous residue-range segment for a
     * mapping to a specific external database.
     * @return IntColumn
     */
    public IntColumn getXrefDbSegmentId() {
        return delegate.getColumn("xref_db_segment_id", DelegatingIntColumn::new);
    }

    /**
     * The instance identifier defined by the external database.
     * @return IntColumn
     */
    public IntColumn getXrefDbInstanceId() {
        return delegate.getColumn("xref_db_instance_id", DelegatingIntColumn::new);
    }

}